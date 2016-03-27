import java.util.Scanner;

public class CheckPassword {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter password: ");
    String password = input.nextLine();
    
    if (CheckPassword(password) == true)
      System.out.println("Valid Password");
    else
      System.out.println("Invalid Password");
  }   // main
  
  static boolean CheckPassword(String password){
    String test = "^(?=.*?\\d.*\\d)[a-zA-Z0-9]{8,}$";
      if (password.matches(test))
      return true;  
    return false;  
  } // CheckPassword
}
