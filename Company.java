import  Employee.Emp;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Company
{
    public static void main(String[]args)
    {
        int i,r;



System.out.println("\t\t\t Fill up the details so that the company can generate email and password \n\n");

        Scanner sc=new Scanner(System.in);
        String firstName,lastName,department,doj;
        System.out.println("Enter your first name: ");
        firstName=sc.nextLine();
           System.out.println("Enter your last name: ");
        lastName=sc.nextLine();
           System.out.println("Choose Department: ");
            System.out.println("Sales");
              System.out.println("Technical");
               System.out.println("Assistant");
                 System.out.println("Developer");
                 System.out.println("\n\n\nEnter Department: ");
                    department=sc.nextLine();
     System.out.println("\n\n\nEnter Date of joining: ");
                    doj=sc.nextLine();
     Emp e=new Emp(firstName,lastName,department,doj);
String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz#@$0123456789";
    char list[]=s.toCharArray();
     char c[]=new char[8];
     for(i=0;i<8;i++)
     {
           r=(int)(Math.random()*list.length);
           
           c[i]=list[r];
}
   cls();
        
 
     String password=String.valueOf(c);
     String email=""+(e.getFirstName().toLowerCase())+"."+(e.getLastName().toLowerCase())+"@"+""+(e.getDepartment().toLowerCase())+".rcciit.org";
     System.out.println("\n\n\t\t\t-------Congratulations your Email is generated--------  \n\n\t");
       System.out.println("\t\t\t\tName :"+e.getFirstName()+"  "+e.getLastName());
       System.out.println("\t\t\t\tDepartment :"+e.getDepartment());
       System.out.println("\t\t\t\tDate of Joining:"+e.doj());
      System.out.println("\t\t\t\tSalary per month :"+e.Package()+"/-");
       System.out.println("\t\t\t\tPassword :"+password);
       System.out.println("\t\t\t\tEmail :"+email);





    }
public static void cls()
{
    try{new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor(); }

  catch(Exception m){}
}
}