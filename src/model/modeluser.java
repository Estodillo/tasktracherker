
package model;

public class modeluser {

    /**
     * @return the userID
     */
    public String getIdNumber() {
        return idnumber;
    }

    /**
     * @param userID the userID to set
     */
    public void setIdNumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
   
    /**
     *
     * @param username
     * @param name
     * @param username1
     * @param password
     */
  
    public modeluser (String username,String name, String idnumber, char[] password) {
       
        this.idnumber = idnumber;
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public modeluser() {
    }
        public enum UserRole {
        TEACHER,
        STUDENT
    }
        
    private String idnumber;
    private String name;
    private String username;
    private char[] password;
    private UserRole role;
    
    
}