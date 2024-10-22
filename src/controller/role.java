
package controller;


public class role {
    public class Role {
    private String roleName;

    public Role(String roleName) {
        // Ensure the role name is valid
        if (!roleName.equalsIgnoreCase("ADMIN") && !roleName.equalsIgnoreCase("STUDENT") && !roleName.equalsIgnoreCase("TEACHER")) {
            throw new IllegalArgumentException("Invalid role. Role must be 'ADMIN', 'STUDENT', or 'TEACHER'.");
        }
        this.roleName = roleName.toUpperCase();
    }

    // Getter
    public String getRoleName() {
        return roleName;
    }

    // Setter (optional, if you want roles to be modifiable)
    public void setRoleName(String roleName) {
        if (!roleName.equalsIgnoreCase("ADMIN") && !roleName.equalsIgnoreCase("STUDENT") && !roleName.equalsIgnoreCase("TEACHER")) {
            throw new IllegalArgumentException("Invalid role. Role must be 'ADMIN', 'STUDENT', or 'TEACHER'.");
        }
        this.roleName = roleName.toUpperCase();
    }

    // Example: Role comparison (optional)
    public boolean isAdmin() {
        return this.roleName.equals("ADMIN");
    }

    public boolean isStudent() {
        return this.roleName.equals("STUDENT");
    }

    @Override
    public String toString() {
        return "Role: " + this.roleName;
    }
}
}
