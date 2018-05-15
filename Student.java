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
import java.io.Serializable;  

class Student implements Serializable{
	String name;
	transient int age;
	int id;
	
	public Student(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
        
        @Override
        public String toString(){
            return name+" " + age + " " + id;
        }
}
