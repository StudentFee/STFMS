package org.nmeict.smvdu.Beans;
// Generated Mar 30, 2013 8:32:59 PM by Hibernate Tools 3.2.1.GA


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIData;
import javax.faces.model.SelectItem;

import org.nmeict.smvdu.Beans.SpringClassFile.ExamcodeSetupService;
import org.nmeict.smvdu.Beans.SpringClassFile.IExamcodeSetupService;
import org.nmeict.smvdu.HibernateHelper.OrgProfileSessionDetails;


@ManagedBean(name="examCodeSetUp")
@RequestScoped
/**
 * ExamCodeSetUp generated by hbm2java
 */
public class ExamCodeSetUp  implements java.io.Serializable {


     private Integer seqNo;
     private OrgProfile orgProfile;
     private Date semesterBegningDate;
     private Date semesterEndingDate;
     private String semesterName;
     private String degreeName;
     private Integer ecsDegreeType;
     private Set adminFeeAdminMasters = new HashSet(0);
     private Set semesterMasters = new HashSet(0);
     private DegreeType degreeType;
     private IExamcodeSetupService iExamcodeSetupService = new ExamcodeSetupService();
     private UIData dataGrid;
     private List<ExamCodeSetUp> loadAllExamCodeSetUp = new ArrayList<ExamCodeSetUp>();
     private SelectItem[] items;
     public ExamCodeSetUp() {
     }

     public ExamCodeSetUp(OrgProfile orgProfile, DegreeType degreeType, Date semesterBegningDate, Date semesterEndingDate, String semesterName, Set adminFeeAdminMasters, Set semesterMasters) {
        this.orgProfile = orgProfile;
        this.degreeType = degreeType;
        this.semesterBegningDate = semesterBegningDate;
        this.semesterEndingDate = semesterEndingDate;
        this.semesterName = semesterName;
        this.adminFeeAdminMasters = adminFeeAdminMasters;
        this.semesterMasters = semesterMasters;
     }
    
     
    public Integer getSeqNo() {
        return this.seqNo;
    }
    
    public Set getSemesterMasters() {
		return semesterMasters;
	}

	public void setSemesterMasters(Set semesterMasters) {
		this.semesterMasters = semesterMasters;
	}

	public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }
    public OrgProfile getOrgProfile() {
        return this.orgProfile;
    }
    
    public void setOrgProfile(OrgProfile orgProfile) {
        this.orgProfile = orgProfile;
    }
    
    
    public Date getSemesterBegningDate() {
        return this.semesterBegningDate;
    }
    
    public DegreeType getDegreeType() {
		return degreeType;
	}


	public void setDegreeType(DegreeType degreeType) {
		this.degreeType = degreeType;
	}


	public void setSemesterBegningDate(Date semesterBegningDate) {
        this.semesterBegningDate = semesterBegningDate;
    }
    public Date getSemesterEndingDate() {
        return this.semesterEndingDate;
    }
    
    public void setSemesterEndingDate(Date semesterEndingDate) {
        this.semesterEndingDate = semesterEndingDate;
    }
    public String getSemesterName() {
        return this.semesterName;
    }
    
    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }
   
    
    
    public Integer getEcsDegreeType() {
		return ecsDegreeType;
	}


	public void setEcsDegreeType(Integer ecsDegreeType) {
		this.ecsDegreeType = ecsDegreeType;
	}


	public Set getAdminFeeAdminMasters() {
        return this.adminFeeAdminMasters;
    }
    
    public String getDegreeName() {
		return degreeName;
	}


	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}


	public void setAdminFeeAdminMasters(Set adminFeeAdminMasters) {
        this.adminFeeAdminMasters = adminFeeAdminMasters;
    }

	

	public IExamcodeSetupService getiExamcodeSetupService() {
		return iExamcodeSetupService;
	}


	public void setiExamcodeSetupService(IExamcodeSetupService iExamcodeSetupService) {
		this.iExamcodeSetupService = iExamcodeSetupService;
	}

	
    
	public UIData getDataGrid() {
		return dataGrid;
	}


	public void setDataGrid(UIData dataGrid) {
		this.dataGrid = dataGrid;
	}


	
	
	public List<ExamCodeSetUp> getLoadAllExamCodeSetUp() {
		loadAllExamCodeSetUp = getiExamcodeSetupService().loadAllExamcodeSetup();
		dataGrid.setValue(loadAllExamCodeSetUp);
		return loadAllExamCodeSetUp;
	}


	public void setLoadAllExamCodeSetUp(List<ExamCodeSetUp> loadAllExamCodeSetUp) {
		this.loadAllExamCodeSetUp = loadAllExamCodeSetUp;
	}

	

	public SelectItem[] getItems() {
		List<ExamCodeSetUp> examSesionCode = getiExamcodeSetupService().loadAllExamcodeSetup();
		items = new SelectItem[examSesionCode.size()];
		for(int i=0;i<examSesionCode.size();i++)
		{
			ExamCodeSetUp dt = examSesionCode.get(i);
			SelectItem si = new SelectItem(dt.getSeqNo(),dt.getSemesterName());
			items[i] = si;
		}
		return items;
	}

	public void setItems(SelectItem[] items) {
		this.items = items;
	}

	public void saveExamcode()
	{
		OrgProfile op =  new OrgProfile();
		DegreeType dt = new DegreeType();
		dt.setSeqNo(this.getEcsDegreeType());
    	op.setOrgId(new OrgProfileSessionDetails().getOrgProfileSession().getOrgId());
    	this.setOrgProfile(op);
    	this.setDegreeType(dt); 
		getiExamcodeSetupService().addExamcodeSetup(this);
	}

	
	public void update()
	{
		@SuppressWarnings("unchecked")
		List<ExamCodeSetUp> listOfExamCode = (ArrayList<ExamCodeSetUp>) dataGrid.getValue();
		getiExamcodeSetupService().update(listOfExamCode); 
	}
	
	
}

