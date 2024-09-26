
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String ContinueCheck;
  do{  
    System.out.print("Enter any value: ");
    String value = sc.nextLine().trim();
    String reverse = "";

    int length = value.length();

    for(int i=length-1; i>=0; i--){
        reverse += value.charAt(i);
    }

    if(value.equals(reverse)){
        System.out.print("palindrome");
    }else{
        System.out.print("Not Palindrome");
    }
     
    System.out.print("\nDo you want to continue? (y/n):  ");
    ContinueCheck = sc.nextLine().trim().toLowerCase();


} 
while
    (ContinueCheck.equals("y"));

System.out.println("Program exited");
sc.close();
    }
}
