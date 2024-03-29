package org.nmeict.smvdu.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIData;
// Generated Apr 12, 2013 1:22:08 AM by Hibernate Tools 3.2.1.GA

import org.nmeict.smvdu.Beans.SpringClassFile.IStudentRegistrationMasterService;
import org.nmeict.smvdu.Beans.SpringClassFile.StudentRegistrationMasterService;
import org.nmeict.smvdu.HibernateHelper.OrgProfileSessionDetails;


@ManagedBean(name="studentRegMaster")
@RequestScoped
/**
 * StudentRegMaster generated by hbm2java
 */
public class StudentRegMaster  implements java.io.Serializable {


     private Integer srmSeqId;
     private OrgProfile orgProfile;
     private OrgDepartmentType orgDepartmentType;
     private SemesterMaster semesterMaster;
     private DegreeType degreeType;
     private BranchMaster branchMaster;
     private String entryNo;
     private String regNo;
     private int formNo;

     
     
     
     private Integer semCode;
     private Integer departmentCode;
     private Integer degreeCode;
     private Integer branchCode;
     private String branchName;
     private String departmentName;
     private String degreeName;
     private String semesterName;
     private Integer noOfRegistration;
     private UIData dataGrid;
     private List<StudentRegMaster> loadAllStudentRegDetails = new ArrayList<StudentRegMaster>();
     private IStudentRegistrationMasterService iStudentRegistrationMasterService = new StudentRegistrationMasterService();
    public StudentRegMaster() {
    }

	
    public StudentRegMaster(OrgProfile orgProfile, DegreeType degreeType, String entryNo, String regNo, int formNo) {
        this.orgProfile = orgProfile;
        this.degreeType = degreeType;
        this.entryNo = entryNo;
        this.regNo = regNo;
        this.formNo = formNo;
    }
    public StudentRegMaster(OrgProfile orgProfile, OrgDepartmentType orgDepartmentType, SemesterMaster semesterMaster, DegreeType degreeType, BranchMaster branchMaster, String entryNo, String regNo, int formNo) {
       this.orgProfile = orgProfile;
       this.orgDepartmentType = orgDepartmentType;
       this.semesterMaster = semesterMaster;
       this.degreeType = degreeType;
       this.branchMaster = branchMaster;
       this.entryNo = entryNo;
       this.regNo = regNo;
       this.formNo = formNo;
    }
   
    public Integer getSrmSeqId() {
        return this.srmSeqId;
    }
    
    public void setSrmSeqId(Integer srmSeqId) {
        this.srmSeqId = srmSeqId;
    }
    public OrgProfile getOrgProfile() {
        return this.orgProfile;
    }
    
    public void setOrgProfile(OrgProfile orgProfile) {
        this.orgProfile = orgProfile;
    }
    public OrgDepartmentType getOrgDepartmentType() {
        return this.orgDepartmentType;
    }
    
    public void setOrgDepartmentType(OrgDepartmentType orgDepartmentType) {
        this.orgDepartmentType = orgDepartmentType;
    }
    public SemesterMaster getSemesterMaster() {
        return this.semesterMaster;
    }
    
    public void setSemesterMaster(SemesterMaster semesterMaster) {
        this.semesterMaster = semesterMaster;
    }
    public DegreeType getDegreeType() {
        return this.degreeType;
    }
    
    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }
    public BranchMaster getBranchMaster() {
        return this.branchMaster;
    }
    
    public void setBranchMaster(BranchMaster branchMaster) {
        this.branchMaster = branchMaster;
    }
    public String getEntryNo() {
        return this.entryNo;
    }
    
    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo;
    }
    public String getRegNo() {
        return this.regNo;
    }
    
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    public int getFormNo() {
        return this.formNo;
    }
    
    public void setFormNo(int formNo) {
        this.formNo = formNo;
    }


    
	public Integer getSemCode() {
		return semCode;
	}


	public Integer getNoOfRegistration() {
		return noOfRegistration;
	}


	public void setNoOfRegistration(Integer noOfRegistration) {
		this.noOfRegistration = noOfRegistration;
	}


	public void setSemCode(Integer semCode) {
		this.semCode = semCode;
	}


	public Integer getDepartmentCode() {
		return departmentCode;
	}


	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}


	public Integer getDegreeCode() {
		return degreeCode;
	}


	public void setDegreeCode(Integer degreeCode) {
		this.degreeCode = degreeCode;
	}


	public Integer getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(Integer branchCode) {
		this.branchCode = branchCode;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDegreeName() {
		return degreeName;
	}


	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}


	public String getSemesterName() {
		return semesterName;
	}


	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}


	public UIData getDataGrid() {
		return dataGrid;
	}


	public void setDataGrid(UIData dataGrid) {
		this.dataGrid = dataGrid;
	}


	public List<StudentRegMaster> getLoadAllStudentRegDetails() {
		loadAllStudentRegDetails = getiStudentRegistrationMasterService().loadAllStudent();
		this.setNoOfRegistration(loadAllStudentRegDetails.size());
		dataGrid.setValue(loadAllStudentRegDetails);
		return loadAllStudentRegDetails;
	}


	public void setLoadAllStudentRegDetails(
			List<StudentRegMaster> loadAllStudentRegDetails) {
		this.loadAllStudentRegDetails = loadAllStudentRegDetails;
	}


	public IStudentRegistrationMasterService getiStudentRegistrationMasterService() {
		return iStudentRegistrationMasterService;
	}


	public void setiStudentRegistrationMasterService(
			IStudentRegistrationMasterService iStudentRegistrationMasterService) {
		this.iStudentRegistrationMasterService = iStudentRegistrationMasterService;
	}

	
	public void saveDetails()
	{
		OrgProfile op = new OrgProfile();
		OrgDepartmentType odt = new OrgDepartmentType();
		DegreeType dt = new DegreeType();
		SemesterMaster sm = new SemesterMaster();
		BranchMaster bm = new BranchMaster();
		op.setOrgId(new OrgProfileSessionDetails().getOrgProfileSession().getOrgId());
		odt.setOdtSeqNo(this.getDepartmentCode());
		dt.setSeqNo(this.getDegreeCode());
		sm.setSemSeqNo(this.getSemCode());
		bm.setBmSeqNo(this.getBranchCode());
		this.setOrgProfile(op);
		this.setOrgDepartmentType(odt);
		this.setDegreeType(dt);
		this.setSemesterMaster(sm);
		this.setBranchMaster(bm);
		getiStudentRegistrationMasterService().addStudentKeyDetails(this);
	}

	
	public List<StudentRegMaster> details(String query)
	{
		return getiStudentRegistrationMasterService().loadAllQueryStudent(query);
	}


}


