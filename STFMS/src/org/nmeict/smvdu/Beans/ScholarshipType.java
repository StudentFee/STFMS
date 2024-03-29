package org.nmeict.smvdu.Beans;
// Generated Mar 30, 2013 9:21:41 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * ScholarshipType generated by hbm2java
 */
public class ScholarshipType  implements java.io.Serializable {


     private Integer seqNo;
     private DegreeType degreeTypeByDegreeSeqNo;
     private DegreeType degreeTypeByDegreeType;
     private OtherFeeHeadMaster otherFeeHeadMaster;
     private int headCodePercentage;
     private String scholarshipName;
     private int creatorId;
     private int modifierId;
     private Date createdDateTime;
     private Date modifierDateTime;
     private String orgId;

    public ScholarshipType() {
    }

    public ScholarshipType(DegreeType degreeTypeByDegreeSeqNo, DegreeType degreeTypeByDegreeType, OtherFeeHeadMaster otherFeeHeadMaster, int headCodePercentage, String scholarshipName, int creatorId, int modifierId, Date createdDateTime, Date modifierDateTime, String orgId) {
       this.degreeTypeByDegreeSeqNo = degreeTypeByDegreeSeqNo;
       this.degreeTypeByDegreeType = degreeTypeByDegreeType;
       this.otherFeeHeadMaster = otherFeeHeadMaster;
       this.headCodePercentage = headCodePercentage;
       this.scholarshipName = scholarshipName;
       this.creatorId = creatorId;
       this.modifierId = modifierId;
       this.createdDateTime = createdDateTime;
       this.modifierDateTime = modifierDateTime;
       this.orgId = orgId;
    }
   
    public Integer getSeqNo() {
        return this.seqNo;
    }
    
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }
    public DegreeType getDegreeTypeByDegreeSeqNo() {
        return this.degreeTypeByDegreeSeqNo;
    }
    
    public void setDegreeTypeByDegreeSeqNo(DegreeType degreeTypeByDegreeSeqNo) {
        this.degreeTypeByDegreeSeqNo = degreeTypeByDegreeSeqNo;
    }
    public DegreeType getDegreeTypeByDegreeType() {
        return this.degreeTypeByDegreeType;
    }
    
    public void setDegreeTypeByDegreeType(DegreeType degreeTypeByDegreeType) {
        this.degreeTypeByDegreeType = degreeTypeByDegreeType;
    }
    public OtherFeeHeadMaster getOtherFeeHeadMaster() {
        return this.otherFeeHeadMaster;
    }
    
    public void setOtherFeeHeadMaster(OtherFeeHeadMaster otherFeeHeadMaster) {
        this.otherFeeHeadMaster = otherFeeHeadMaster;
    }
    public int getHeadCodePercentage() {
        return this.headCodePercentage;
    }
    
    public void setHeadCodePercentage(int headCodePercentage) {
        this.headCodePercentage = headCodePercentage;
    }
    public String getScholarshipName() {
        return this.scholarshipName;
    }
    
    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }
    public int getCreatorId() {
        return this.creatorId;
    }
    
    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }
    public int getModifierId() {
        return this.modifierId;
    }
    
    public void setModifierId(int modifierId) {
        this.modifierId = modifierId;
    }
    public Date getCreatedDateTime() {
        return this.createdDateTime;
    }
    
    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
    public Date getModifierDateTime() {
        return this.modifierDateTime;
    }
    
    public void setModifierDateTime(Date modifierDateTime) {
        this.modifierDateTime = modifierDateTime;
    }
    public String getOrgId() {
        return this.orgId;
    }
    
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }




}


