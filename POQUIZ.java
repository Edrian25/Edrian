package activity1;
import java.util.Scanner;
public class POQUIZ {

  public static void main(String[] args) {String name,address,School,Strand,mojor;
  int age;
   Scanner s = new Scanner(System.in);
  
  System.out.print("Enter your Fullname : ");
  name = s.nextLine();
  System.out.println("Fullname is : "+name);
  
  System.out.print("Enter Age : ");
  age = s.nextInt();
  System.out.println("Your age is : "+age);
  
  System.out.print("Enter your address : ");
  address  = s.next();
  System.out.println("Your address is : "+address);
  
  System.out.print("Enter School : ");
  School = s.next();
  System.out.println("Your School is : "+School);
  
  System.out.print("Enter Strand : ");
  Strand = s.next();
  System.out.println("Your strand is : "+ Strand);
  
  System.out.print("Enter your mojor subject : ");
  mojor = s.next();
  System.out.println("Your mojor subject is : " +mojor);
  
  String subject2,subject3,subject4,subject5,subject6,subject7,subject8,subject9;
  
  System.out.print("Enter 2 subject : ");
  subject2 = s.next();
  System.out.println("Your 2 subject is "+ subject2);
  System.out.print("Enter 3 subject : ");
  subject3 = s.next();
  System.out.println("Your 3 subject is "+ subject3);
  System.out.print("Enter 4 subject : ");
  subject4 = s.next();
  System.out.println("Your 4 subject is "+ subject4);
  System.out.print("Enter 5 subject : ");
  subject5 = s.next();
  System.out.println("Your 5 subject is "+ subject5);
  System.out.print("Enter 6 subject : ");
  subject6 = s.next();
  System.out.println("Your 6 subject is "+ subject6);
  System.out.print("Enter 7 subject : ");
  subject7 = s.next();
  System.out.println("Your 7 subject is "+ subject7);
  System.out.print("Enter 8 subject : ");
  subject8 = s.next();
  System.out.println("Your 8 subject is "+ subject8);
  System.out.print("Enter 9 subject : ");
  subject9 = s.next();
  System.out.println("Your 9 subject is "+ subject9);

  }

}
