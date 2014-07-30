package org.nmeict.smvdu.Beans.SpringClassFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.nmeict.smvdu.Beans.DegreeType;
import org.nmeict.smvdu.Beans.ExamCodeSetUp;
import org.nmeict.smvdu.Beans.OrgDepartmentType;
import org.nmeict.smvdu.HibernateHelper.HibernateDataSourceConnection;
import org.nmeict.smvdu.HibernateHelper.OrgProfileSessionDetails;

public class ExamcodeSetupDAO implements IExamcodeSetupDAO{

	private HibernateDataSourceConnection hibernateSessionFactory;

	public HibernateDataSourceConnection getHibernateSessionFactory() {
		return hibernateSessionFactory;
	}

	public void setHibernateSessionFactory(
			HibernateDataSourceConnection hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}

	
	@Override
	public void addExamcodeSetup(ExamCodeSetUp examCodeSetup) {
		Session s = null;
        try
        {
            s = HibernateDataSourceConnection.currentSession();
            s.beginTransaction();
            s.save(examCodeSetup);
            s.getTransaction().commit();
            HibernateDataSourceConnection.closeSession();
        }
        catch(Exception ex)
        {
            s.getTransaction().rollback();
            ex.printStackTrace();
        }
        finally
        {
        	if(s.isOpen() == true)
        		HibernateDataSourceConnection.closeSession();
        }
		
	}

	@Override
	public void update(List<ExamCodeSetUp> examCodeSetup) {
		Session s=null;
		try
		{
			s = HibernateDataSourceConnection.currentSession();
			s.beginTransaction();
			int examUpdateFlush = 0;
			System.out.println("Calling "+new OrgProfileSessionDetails().getOrgProfileSession().getOrgId()+" : "+examCodeSetup.size());
			for(ExamCodeSetUp ecs : examCodeSetup)
			{
				ecs.setOrgProfile(new OrgProfileSessionDetails().getOrgProfileSession());
				DegreeType dt = new DegreeType();
				OrgDepartmentType odt = new OrgDepartmentType();
				dt.setSeqNo(ecs.getEcsDegreeType());
				odt.setOdtSeqNo(ecs.getSeqNo());
				ecs.setDegreeType(dt);
				s.update(ecs.getSeqNo().toString(),ecs);  
				examUpdateFlush++;
				if(examUpdateFlush % 50 == 0)
				{
					s.flush();
					s.clear();
				}
				System.out.println("calling update");
				//System.out.println("------> "+ecs.getEcsDegreeType()+" : "+ecs.getSemesterName()+" : "+ecs.getOrgProfile().getOrgId());
			}
            s.getTransaction().commit();
            HibernateDataSourceConnection.closeSession();
		}
		catch(Exception ex)
		{
			s.getTransaction().rollback();
		}
		finally
		{
			if(s.isOpen()==true)
	        HibernateDataSourceConnection.closeSession();
		}
		
	}

	@Override
	public List<ExamCodeSetUp> loadAllExamcodeSetup() {
		Session s = null;
		List<ExamCodeSetUp> retuECS = new ArrayList<ExamCodeSetUp>();
        try
        {
        	List kl;
            s = HibernateDataSourceConnection.currentSession();
            s.beginTransaction();
            Criteria criteria = s.createCriteria(ExamCodeSetUp.class,"ecs");
            criteria.createAlias("orgProfile","org",CriteriaSpecification.LEFT_JOIN);
            criteria.createAlias("degreeType","dType",CriteriaSpecification.LEFT_JOIN).
            setProjection(Projections.projectionList().
            		add(Projections.property("dType.degreeName")).
            		add(Projections.property("ecs.semesterBegningDate")).
            		add(Projections.property("ecs.semesterEndingDate"))
            		.add(Projections.property("ecs.semesterName")).
            		add(Projections.property("dType.seqNo")).
            		add(Projections.property("ecs.seqNo")));
            criteria.add(Restrictions.eq("org.orgId",new OrgProfileSessionDetails().getOrgProfileSession().getOrgId()));
            kl = criteria.list();
            Iterator ki = kl.iterator();
            while(ki.hasNext())
            {
            	Object[] o = (Object[]) ki.next();
            	ExamCodeSetUp ecs = new ExamCodeSetUp();
            	ecs.setDegreeName(o[0].toString());
            	ecs.setSemesterBegningDate((Date) o[1]); 
            	ecs.setSemesterEndingDate((Date) o[2]); 
            	ecs.setSemesterName(o[3].toString()); 
            	ecs.setEcsDegreeType((Integer)o[4]);
            	ecs.setSeqNo((Integer)o[5]);
            	System.out.println("Degree Name : "+o[0]+" : "+o[4]); 
            	retuECS.add(ecs); 
            }
            s.getTransaction().commit();
            HibernateDataSourceConnection.closeSession();
        }
        catch(Exception ex)
        {
            s.getTransaction().rollback();
            ex.printStackTrace();
        }
        finally
        {
        	if(s.isOpen() == true)
        		HibernateDataSourceConnection.closeSession();
        }
	
		return retuECS;
	}

}
