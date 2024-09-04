
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public modeluser( String username, String email, char[] password, int userID) {
        
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyCode = verifyCode;
    }
    public modeluser( String username, String email, char[] password) {
       
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public modeluser() {
    }
        public enum UserRole {
        ADMIN,
        USER
    }
    private int userID;
    private String username;
    private String email;
    private char[] password;
    private String verifyCode;
    private UserRole role;
    
}