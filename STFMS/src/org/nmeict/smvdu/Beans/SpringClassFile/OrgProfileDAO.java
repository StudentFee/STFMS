/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nmeict.smvdu.Beans.SpringClassFile;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.nmeict.smvdu.Beans.OrgProfile;

import org.nmeict.smvdu.HibernateHelper.HibernateDataSourceConnection;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author KESU
 */


/*
 * OrgProfileDAO Class is created by implementing IOrgProfileDAO Interface.
 */
@Service
@Transactional
public class OrgProfileDAO implements IOrgProfileDAO{
    
    @Autowired
    private String orgId;
    private SessionFactory sessionFactory;
    private HibernateDataSourceConnection hibernateSessionFactory = new HibernateDataSourceConnection();

    public HibernateDataSourceConnection getHibernateSessionFactory() {
        return hibernateSessionFactory;
    }

    public void setHibernateSessionFactory(HibernateDataSourceConnection hibernateSessionFactory) {
        this.hibernateSessionFactory = hibernateSessionFactory;
    }
    
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    
    @SuppressWarnings("empty-statement")
    @Override
    public void addNewOrgProfile(OrgProfile orgProfile) {
        Session s = null;
        try
        {
            s = HibernateDataSourceConnection.currentSession();
            s.beginTransaction();
            s.save(orgProfile);
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
    public void updateOrgProfile(OrgProfile orgProfile) {
    	
    	Session s = null;
        try
        {
        	System.out.println("Org Name : "+orgProfile.getOrgName());
            s = HibernateDataSourceConnection.currentSession();
            s.beginTransaction();
            s.update(orgProfile.getOrgId(),orgProfile);
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
    public List<OrgProfile> loadOrgProfile() {
        List<OrgProfile> orgList = new ArrayList<OrgProfile>();
        try
        {
            
            
        }
        catch(Exception ex)
        {
            
        }
        return orgList;
    }

    
    
    
    public OrgProfile searchOrgProfile(String orgEntity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	
    
}
