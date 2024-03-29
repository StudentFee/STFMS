package org.nmeict.smvdu.Beans;
// Generated Mar 30, 2013 9:21:41 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * UserMaster generated by hbm2java
 */
public class UserMaster  implements java.io.Serializable {


     private Integer umSeqId;
     private OrgProfile orgProfile;
     private String userId;
     private String password;
     private Date createTime;
     private Date editTime;
     private Date date;
     private int modifierId;
     private Date loginTime;
     private Date logoutTime;

    public UserMaster() {
    }

	
    public UserMaster(OrgProfile orgProfile, String userId, String password, Date editTime, int modifierId, Date loginTime, Date logoutTime) {
        this.orgProfile = orgProfile;
        this.userId = userId;
        this.password = password;
        this.editTime = editTime;
        this.modifierId = modifierId;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
    }
    public UserMaster(OrgProfile orgProfile, String userId, String password, Date createTime, Date editTime, Date date, int modifierId, Date loginTime, Date logoutTime) {
       this.orgProfile = orgProfile;
       this.userId = userId;
       this.password = password;
       this.createTime = createTime;
       this.editTime = editTime;
       this.date = date;
       this.modifierId = modifierId;
       this.loginTime = loginTime;
       this.logoutTime = logoutTime;
    }
   
    public Integer getUmSeqId() {
        return this.umSeqId;
    }
    
    public void setUmSeqId(Integer umSeqId) {
        this.umSeqId = umSeqId;
    }
    public OrgProfile getOrgProfile() {
        return this.orgProfile;
    }
    
    public void setOrgProfile(OrgProfile orgProfile) {
        this.orgProfile = orgProfile;
    }
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getEditTime() {
        return this.editTime;
    }
    
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public int getModifierId() {
        return this.modifierId;
    }
    
    public void setModifierId(int modifierId) {
        this.modifierId = modifierId;
    }
    public Date getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
    public Date getLogoutTime() {
        return this.logoutTime;
    }
    
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }




}


