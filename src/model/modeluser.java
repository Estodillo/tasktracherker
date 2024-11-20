
package model;

public class modeluser {

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
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
   
    public modeluser( String username, char[] password, int userID) {
        
        this.username = username;
        
        this.password = password;
    }
    public modeluser (String username, char[] password) {
       
        
        this.username = username;
        this.password = password;
    }

    public modeluser() {
    }
        public enum UserRole {
        TEACHER,
        STUDENT
    }
    private int userID;
    private String username;
    private char[] password;
    private UserRole role;
    
}