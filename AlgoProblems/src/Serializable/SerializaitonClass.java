package Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializaitonClass {
  public static void main(String[] args) {
    Employee emp = new Employee();
    emp.firstName = "Vivekanand";
    emp.lastName = "Gautam";
    emp.companyName = "JBT";
    //Below part needs to be removed in case address field is made final
    emp.address = "MUM";
    emp.companyCEO = "ME CEO";
    
    
    Employee emp1 = new Employee();
    emp1.firstName = "1Vivekanand";
    emp1.lastName = "1Gautam";
    emp1.companyName = "1JBT";
    //Below part needs to be removed in case address field is made final
    emp1.address = "1MUM";
    emp1.companyCEO = "1ME CEO";
    
    Employee emp2 = new Employee();
    emp1.firstName = "2Vivekanand";
    emp1.lastName = "2Gautam";
    emp1.companyName = "2JBT";
    //Below part needs to be removed in case address field is made final
    emp1.address = "2MUM";
    emp1.companyCEO = "2ME CEO";
    
    Employee emp3 = new Employee();
    emp3.firstName = "3Vivekanand";
    emp3.lastName = "3Gautam";
    emp3.companyName = "3JBT";
    //Below part needs to be removed in case address field is made final
    emp3.address = "3MUM";
    emp3.companyCEO = "3ME CEO";
    try {
      FileOutputStream fileOut = new FileOutputStream("./employee.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(emp);
      out.writeObject(emp1);
      out.writeObject(emp2);

      out.writeObject(emp2);


      out.close();
      fileOut.close();
      System.out.printf("Serialized data is saved in ./employee.txt file");
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}