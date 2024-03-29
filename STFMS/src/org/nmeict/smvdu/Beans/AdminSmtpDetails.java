package org.nmeict.smvdu.Beans;
// Generated Mar 30, 2013 9:21:41 AM by Hibernate Tools 3.2.1.GA



/**
 * AdminSmtpDetails generated by hbm2java
 */
public class AdminSmtpDetails  implements java.io.Serializable {


     private String smtpName;
     private int seqId;
     private Integer smtpPort;
     private String authEmailid;
     private String authPassword;
     private Byte smtpStatus;
     private String smtpHostName;

    public AdminSmtpDetails() {
    }

	
    public AdminSmtpDetails(int seqId) {
        this.seqId = seqId;
    }
    public AdminSmtpDetails(int seqId, Integer smtpPort, String authEmailid, String authPassword, Byte smtpStatus, String smtpHostName) {
       this.seqId = seqId;
       this.smtpPort = smtpPort;
       this.authEmailid = authEmailid;
       this.authPassword = authPassword;
       this.smtpStatus = smtpStatus;
       this.smtpHostName = smtpHostName;
    }
   
    public String getSmtpName() {
        return this.smtpName;
    }
    
    public void setSmtpName(String smtpName) {
        this.smtpName = smtpName;
    }
    public int getSeqId() {
        return this.seqId;
    }
    
    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }
    public Integer getSmtpPort() {
        return this.smtpPort;
    }
    
    public void setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
    }
    public String getAuthEmailid() {
        return this.authEmailid;
    }
    
    public void setAuthEmailid(String authEmailid) {
        this.authEmailid = authEmailid;
    }
    public String getAuthPassword() {
        return this.authPassword;
    }
    
    public void setAuthPassword(String authPassword) {
        this.authPassword = authPassword;
    }
    public Byte getSmtpStatus() {
        return this.smtpStatus;
    }
    
    public void setSmtpStatus(Byte smtpStatus) {
        this.smtpStatus = smtpStatus;
    }
    public String getSmtpHostName() {
        return this.smtpHostName;
    }
    
    public void setSmtpHostName(String smtpHostName) {
        this.smtpHostName = smtpHostName;
    }




}


