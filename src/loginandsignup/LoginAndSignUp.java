
package loginandsignup;

import com.formdev.flatlaf.FlatIntelliJLaf;

public class LoginAndSignUp {


    public static void main(String[] args) {
        FlatIntelliJLaf.setup();
        LoginTeacher LoginFrame = new LoginTeacher();
        
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
    }
    
}
