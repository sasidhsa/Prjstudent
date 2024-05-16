/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author sivagamasrinivasan
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // print student details
        Student s1 = new Student();
        s1.setName("jasmeet");
        s1.setAge(19);
        Student s2= new Student();
        s2.setName("stefan");
        s2.setAge(19);
        Student s3 = new Student();
        s3.setName("zhou");
        s3.setAge(19);
       // students details heterogeneous in array
       Student[] list = new Student[3];// array of object 
       list[0]=s1;
       list[1]=s2;
       list[2]=s3;
       for(int i=0;i<list.length;i++)
       {
          System.out.println(list[i].getName()+" "+list[i].getAge()); 
       }
    }
    
}
