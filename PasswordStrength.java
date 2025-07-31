//// 🔐 Password Strength Checker — Java / Strings
import java.util.Scanner;
public class PasswordStrength {
    public static void main(String[] args) {
        System.out.println(" Password Strength Checker — Java ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Password : ");
        String password = sc.nextLine();
        String Strength = checker(password);
        System.out.println("Password Strength : " + Strength);
    }
    public static String checker(String password){
        int length = password.length();
        boolean hasUpper = false; 
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for( int i =0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpper =  true;
            }
            else if(Character.isLowerCase(ch)){
                hasLower = true;
            }
            else if(Character.isDigit(ch)){
                hasDigit = true;
            }
            else {
                hasSpecial = true;
            }
        }
        // Final evaluation
        if(length >=8 && hasUpper && hasSpecial){
            return "Strong";
        }
        else if((hasUpper || hasLower) && length >=6 && hasDigit){
            return "Moderate";
        }
        else{
            return "Weak";
        }
    } 
}
