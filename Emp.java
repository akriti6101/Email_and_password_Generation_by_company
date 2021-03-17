package Employee;
import java.util.*;
import java.lang.*;
public class Emp
{
    private String firstName;
    private String lastName;
   private int Package;
    private String department;
    private String doj;
 
    
   public Emp(String f,String l,String d,String r)
   {
       firstName=f;
       lastName=l;department=d;doj=r;
       if(d.toLowerCase().equals("sales"))
                         { Package=36000;}
       else if(d.toLowerCase().equals("technical"))
                            { Package=42000;}
        else if(d.toLowerCase().equals("developer"))
                            {Package=50000;}
        else
                Package=22000;

   }
public String doj()
   {  return this.doj;
     }
   public String getFirstName()
   {return (this.firstName);

   }
public int Package()
{return this.Package;
}
     public String getLastName()
   {return this.lastName;

   }
     public String getDepartment()
   {return this.department;

   }
    
}