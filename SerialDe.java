/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serial.de;

/**
 *
 * @author vk185107
 */

import java.io.*;

public class SerialDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
		FileInputStream f = new FileInputStream("out.txt");
		ObjectInputStream in = new ObjectInputStream(f);
		
		Student s1 = (Student)in.readObject();
		in.close();
		f.close();
		
		System.out.println(s1.toString());
    }
    
}

/* serialization
Student s1 = new Student(1,"Venkat",24);
		FileOutputStream f = new FileOutputStream("out.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		
		out.writeObject(s1);
		out.flush();
		out.close();
		f.close();
		
		System.out.println("Success!");
*/

/* Deserialization


*/