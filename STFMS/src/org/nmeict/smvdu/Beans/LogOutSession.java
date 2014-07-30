package org.nmeict.smvdu.Beans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

  

@ManagedBean(name="logOutSession")
@RequestScoped
public class LogOutSession {

	public void logOut() throws IOException
	{
		    FacesContext fc = FacesContext.getCurrentInstance();
	        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
	        session.invalidate();
	        
	        FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml?faces-redirect=true");  
	}
	
}
