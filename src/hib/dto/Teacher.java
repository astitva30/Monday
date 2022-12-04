
package hib.dto;


public class Teacher {
    private String userName;
    private String password;
    private String name;
    private String contactNo;
    private int batches;

    public Teacher(){
        
    }
    public Teacher(String userName, String password, String name, String contactNo, int batches){
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.contactNo = contactNo;
        this.batches = batches;
    }
    
    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the batches
     */
    public int getBatches() {
        return batches;
    }

    /**
     * @param batches the batches to set
     */
    public void setBatches(int batches) {
        this.batches = batches;
    }
}
