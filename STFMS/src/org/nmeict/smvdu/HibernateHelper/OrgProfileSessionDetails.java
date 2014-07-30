package org.nmeict.smvdu.HibernateHelper;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.nmeict.smvdu.Beans.OrgLoginDetails;
import org.nmeict.smvdu.Beans.OrgLogoDetails;
import org.nmeict.smvdu.Beans.OrgProfile;


@ManagedBean(name="orgProfileSessionDetails")
@SessionScoped
public class OrgProfileSessionDetails implements Serializable{

	
	
	private OrgLoginDetails old;
	
	public OrgProfileSessionDetails() {
		old = (OrgLoginDetails) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("org");
		if(old == null)
		{
			
		}
		else
		{
			userId = old.getOrgId();
			this.orgProfileSession= old.getOrgProfile(); 
//			this.orgProfileSession.setOrgAdminemailid(old.getAdminId());
		}
	}
	private String userId;
	private OrgProfile orgProfileSession;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public OrgProfile getOrgProfileSession() {
		return orgProfileSession;
	}
	public void setOrgProfileSession(OrgProfile orgProfileSession) {
		this.orgProfileSession = orgProfileSession;
	}
	
}
