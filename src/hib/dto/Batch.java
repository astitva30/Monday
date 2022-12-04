package hib.dto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deshp
 */
public class Batch {
    private String batchId;
    private String time;
    private String courseName;
    private String strength;
    private String coachName;
    
    public Batch(String batchId, String time, String courseName, String strength, String coachName){
        this.batchId=batchId;
        this.time=time;
        this.courseName=courseName;
        this.strength=strength;
        this.coachName=coachName;
    }
    
    public Batch(){
        
    }
    
    /*
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the strength
     */
    public String getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(String strength) {
        this.strength = strength;
    }

    /**
     * @return the coachName
     */
    public String getCoachName() {
        return coachName;
    }

    /**
     * @param coachName the coachName to set
     */
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }
}
