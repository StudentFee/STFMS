package org.nmeict.smvdu.Beans;
// Generated Mar 30, 2013 9:21:41 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdminRecords generated by hbm2java
 */
public class AdminRecords  implements java.io.Serializable {


     private String userId;
     private int seqId;
     private String adminPass;
     private Byte flag;
     private Date addDate;
     private Set adminEmailConfigs = new HashSet(0);

    public AdminRecords() {
    }

	
    public AdminRecords(int seqId) {
        this.seqId = seqId;
    }
    public AdminRecords(int seqId, String adminPass, Byte flag, Date addDate, Set adminEmailConfigs) {
       this.seqId = seqId;
       this.adminPass = adminPass;
       this.flag = flag;
       this.addDate = addDate;
       this.adminEmailConfigs = adminEmailConfigs;
    }
   
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public int getSeqId() {
        return this.seqId;
    }
    
    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }
    public String getAdminPass() {
        return this.adminPass;
    }
    
    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }
    public Byte getFlag() {
        return this.flag;
    }
    
    public void setFlag(Byte flag) {
        this.flag = flag;
    }
    public Date getAddDate() {
        return this.addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    public Set getAdminEmailConfigs() {
        return this.adminEmailConfigs;
    }
    
    public void setAdminEmailConfigs(Set adminEmailConfigs) {
        this.adminEmailConfigs = adminEmailConfigs;
    }




}


