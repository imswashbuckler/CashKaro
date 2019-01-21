package Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*Process of writing State of an object to File or in network supported form is called serialization
or from java supported form into either file supported form or Netwrok supported form
we can write binary data in file but not object diectly so we use
ObjectOutPutStream
Static Variable. Static variables belong to a class and not to any individual instance.
 The concept of serialization is concerned with the object's current state. Only data 
 associated with a specific instance of a class is serialized, therefore static member fields are
  ignored during serialization.Dec 29, 2013

*/
public class SerializationExample {

    public static void main(String[] args){
        serialize();
       deserialize();
    } 

    public static void serialize(){

         Item item = new Item(1L,"Pen", 12.55);
        
         System.out.println("Before Serialization" + item);

         FileOutputStream fileOut;
         try {
             fileOut = new FileOutputStream("item.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut);
             out.writeObject(item);
             out.close();
             fileOut.close();
             System.out.println("item.ser");
                       } catch (FileNotFoundException e) {

                  e.printStackTrace();
           } catch (IOException e) {

                  e.printStackTrace();
           }
      }

    public static void deserialize(){
        Item item2;

        try {
                FileInputStream fileIn = new FileInputStream("item.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                
                 item2 = (Item) in.readObject();
                System.out.println("Serialized data is read from /tmp/item.ser");
                
                System.out.println("After Deserialization" + item2);
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
               e.printStackTrace();
        } catch (ClassNotFoundException e) {
               e.printStackTrace();
        }
     }
}