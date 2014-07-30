package org.nmeict.smvdu.Beans.SpringClassFile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.nmeict.smvdu.Beans.OtherFeeHeadMaster;
import org.nmeict.smvdu.Beans.StudentRegMaster;
import org.nmeict.smvdu.HibernateHelper.HibernateDataSourceConnection;
import org.nmeict.smvdu.HibernateHelper.OrgProfileSessionDetails;

public class StudentRegistrationMasterDAO implements IStudentRegistrationMasterDAO{

	private HibernateDataSourceConnection hibernateSessionFactory = new HibernateDataSourceConnection();

	public HibernateDataSourceConnection getHibernateSessionFactory() {
		return hibernateSessionFactory;
	}

	public void setHibernateSessionFactory(
			HibernateDataSourceConnection hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}

	@Override
	public void addStudentKeyDetails(StudentRegMaster studentRegMaster) {
		Session s = null;
        try
        {
            s = HibernateDataSourceConnection.currentSession();
            s.beginTransaction();
            s.save(studentRegMaster);
            s.getTransaction().commit();
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
	public void update(List<StudentRegMaster> studentRegMaster) {
			
		
	}

	@Override
	public List<StudentRegMaster> loadAllStudent() {
		List<StudentRegMaster> returnAllStudent = new ArrayList<StudentRegMaster>();
		Session s=null;
		try
		{
			s = HibernateDataSourceConnection.currentSession();
			s.beginTransaction();
			ProjectionList projection  = Projections.projectionList();
            Criteria criteria = s.createCriteria(StudentRegMaster.class,"srm");
            criteria.createAlias("orgProfile","op",CriteriaSpecification.LEFT_JOIN);
            criteria.createAlias("orgDepartmentType","odt",CriteriaSpecification.LEFT_JOIN);
            criteria.createAlias("degreeType","degType",CriteriaSpecification.LEFT_JOIN);
            criteria.createAlias("branchMaster","bm",CriteriaSpecification.LEFT_JOIN);
            criteria.createAlias("semesterMaster","sem",CriteriaSpecification.LEFT_JOIN);
            projection.add(Projections.property("odt.orgDepartmentName"));
            projection.add(Projections.property("odt.odtSeqNo"));
            projection.add(Projections.property("degType.degreeName"));
            projection.add(Projections.property("degType.seqNo"));
            projection.add(Projections.property("bm.branchName"));
            projection.add(Projections.property("bm.bmSeqNo"));
            projection.add(Projections.property("srm.entryNo")); // Integer
            projection.add(Projections.property("srm.regNo")); // String
            projection.add(Projections.property("srm.formNo")); // Integer
            projection.add(Projections.property("sem.semesterName"));
            criteria.setProjection(projection);
            criteria.add(Restrictions.eq("op.orgId",new OrgProfileSessionDetails().getUserId()));
            List list = (List) criteria.list();
            
            Iterator i = list.iterator();
            while(i.hasNext())
            {
            	Object[] o = (Object[])i.next();
            	StudentRegMaster srm = new StudentRegMaster();
            	srm.setDepartmentName(o[0].toString());
            	srm.setDepartmentCode((Integer)o[1]);
            	srm.setDegreeName(o[2].toString());
            	srm.setDegreeCode((Integer)o[3]);
            	srm.setBranchName(o[4].toString());
            	srm.setBranchCode((Integer)o[5]);
            	srm.setEntryNo(o[6].toString());
            	srm.setRegNo(o[7].toString()); 
            	srm.setFormNo((Integer)o[8]);  
            	srm.setSemesterName(o[9].toString()); 
            	returnAllStudent.add(srm);
            }
            s.getTransaction().commit();
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
		return returnAllStudent;
	}

	@Override
	public List<StudentRegMaster> loadAllQueryStudent(String query) {
		List<StudentRegMaster> returnAllStudent = new ArrayList<StudentRegMaster>();
		Session s=null;
		try
		{
			s = HibernateDataSourceConnection.currentSession();
			s.beginTransaction();
			ProjectionList projection  = Projections.projectionList();
            Criteria criteria = s.createCriteria(StudentRegMaster.class,"srm");
            criteria.createAlias("orgProfile","op",CriteriaSpecification.LEFT_JOIN);
            criteria.createAlias("orgDepartmentType","odt",CriteriaSpecification.LEFT_JOIN);
            criteria.createAlias("degreeType","degType",CriteriaSpecification.LEFT_JOIN);
            criteria.createAlias("branchMaster","bm",CriteriaSpecification.LEFT_JOIN);
            criteria.createAlias("semesterMaster","sem",CriteriaSpecification.LEFT_JOIN);
            projection.add(Projections.property("odt.orgDepartmentName"));
            projection.add(Projections.property("odt.odtSeqNo"));
            projection.add(Projections.property("degType.degreeName"));
            projection.add(Projections.property("degType.seqNo"));
            projection.add(Projections.property("bm.branchName"));
            projection.add(Projections.property("bm.bmSeqNo"));
            projection.add(Projections.property("srm.entryNo")); // Integer
            projection.add(Projections.property("srm.regNo")); // String
            projection.add(Projections.property("srm.formNo")); // Integer
            projection.add(Projections.property("sem.semesterName"));
            criteria.setProjection(projection);
            criteria.add(Restrictions.eq("op.orgId",new OrgProfileSessionDetails().getUserId()));
            criteria.add(Restrictions.ilike("srm.entryNo",query.toString().trim(),MatchMode.ANYWHERE));
            List list = (List) criteria.list();
            
            Iterator i = list.iterator();
            while(i.hasNext())
            {
            	Object[] o = (Object[])i.next();
            	StudentRegMaster srm = new StudentRegMaster();
            	srm.setDepartmentName(o[0].toString());
            	srm.setDepartmentCode((Integer)o[1]);
            	srm.setDegreeName(o[2].toString());
            	srm.setDegreeCode((Integer)o[3]);
            	srm.setBranchName(o[4].toString());
            	srm.setBranchCode((Integer)o[5]);
            	srm.setEntryNo(o[6].toString());
            	srm.setRegNo(o[7].toString()); 
            	srm.setFormNo((Integer)o[8]);  
            	srm.setSemesterName(o[9].toString()); 
            	returnAllStudent.add(srm);
            }
            s.getTransaction().commit();
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
		return returnAllStudent;

	}

}
