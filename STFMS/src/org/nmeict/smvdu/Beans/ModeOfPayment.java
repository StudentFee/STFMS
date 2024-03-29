package org.nmeict.smvdu.Beans;
// Generated Apr 3, 2013 1:05:39 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ModeOfPayment generated by hbm2java
 */
public class ModeOfPayment  implements java.io.Serializable {


     private Integer seqNo;
     private OrgProfile orgProfile;
     private DegreeType degreeType;
     private String headName;
     private int headCreatorId;
     private Date headCreatorDateTime;
     private Date headModifierDateTime;
     private Set mopHeadFieldses = new HashSet(0);

    public ModeOfPayment() {
    }

	
    public ModeOfPayment(OrgProfile orgProfile, String headName, int headCreatorId, Date headCreatorDateTime, Date headModifierDateTime) {
        this.orgProfile = orgProfile;
        this.headName = headName;
        this.headCreatorId = headCreatorId;
        this.headCreatorDateTime = headCreatorDateTime;
        this.headModifierDateTime = headModifierDateTime;
    }
    public ModeOfPayment(OrgProfile orgProfile, DegreeType degreeType, String headName, int headCreatorId, Date headCreatorDateTime, Date headModifierDateTime, Set mopHeadFieldses) {
       this.orgProfile = orgProfile;
       this.degreeType = degreeType;
       this.headName = headName;
       this.headCreatorId = headCreatorId;
       this.headCreatorDateTime = headCreatorDateTime;
       this.headModifierDateTime = headModifierDateTime;
       this.mopHeadFieldses = mopHeadFieldses;
    }
   
    public Integer getSeqNo() {
        return this.seqNo;
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
    public DegreeType getDegreeType() {
        return this.degreeType;
    }
    
    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }
    public String getHeadName() {
        return this.headName;
    }
    
    public void setHeadName(String headName) {
        this.headName = headName;
    }
    public int getHeadCreatorId() {
        return this.headCreatorId;
    }
    
    public void setHeadCreatorId(int headCreatorId) {
        this.headCreatorId = headCreatorId;
    }
    public Date getHeadCreatorDateTime() {
        return this.headCreatorDateTime;
    }
    
    public void setHeadCreatorDateTime(Date headCreatorDateTime) {
        this.headCreatorDateTime = headCreatorDateTime;
    }
    public Date getHeadModifierDateTime() {
        return this.headModifierDateTime;
    }
    
    public void setHeadModifierDateTime(Date headModifierDateTime) {
        this.headModifierDateTime = headModifierDateTime;
    }
    public Set getMopHeadFieldses() {
        return this.mopHeadFieldses;
    }
    
    public void setMopHeadFieldses(Set mopHeadFieldses) {
        this.mopHeadFieldses = mopHeadFieldses;
    }




}


