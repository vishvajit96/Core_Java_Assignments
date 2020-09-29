package assignment4;

import java.util.Scanner;

/*Q45 ::
 * Create a class Student with two members : rollno and percentage. 
 * Create default and parameterized constructors. Create method show() 
 * to display information. Create another class CollegeStudent inherits 
 * Student class. Add a new member semester to it. Create default and 
 * parameterized constructors. Also override show() method that calls super 
 * class show() method and displays semester. Create another class SchoolStudent 
 * inherits Student class. Add a new member className(eg 12th ,10th etc.) to it. 
 * Create default and parameterized constructors. Also override show() method that 
 * calls super class show() method and displays className. Create a class( say Demo) 
 * with main method that carries out the operation of the project : -- has array to 
 * store objects of any class(Student,  CollegeStudent or SchoolStudent) --create 
 * two CollegeStudent  and three SchoolStudent objects and store them inside the array
 *  -- display all records from the array -- search record on the basic of rollno and 
 *  check given rollno is of SchoolStudent or of CollegeStudent. --count how many 
 *  students are having A grade, if for A grade percentage >75. 
 */



class Student1{
    private int rollNo;
    private double percentage;

    Student1(){}
    Student1(int rollNo ,double percentage){
        this.rollNo=rollNo;
        this.percentage=percentage;
    }
    public int getRollNo(){
        return rollNo;
    }
    public double getPercentage(){
        return percentage;
    }
    public void show(){
        System.out.println("Roll No : "+this.rollNo 
        +" Percentage "+ this.percentage + "%");
    }
}
class CollegeStudent extends Student1{
    private int semester;

    CollegeStudent(){}

    CollegeStudent(int rollNo ,double percentage,int semester){
        super(rollNo,percentage);
        this.semester=semester;
    }
    public void show(){
        super.show();
        System.out.println(" Semester : "+ this.semester);
    }
}
class SchoolStudent extends Student1{
    private String className;

    SchoolStudent(){}

    SchoolStudent(int rollNo,double percentage,String className){
        super(rollNo,percentage);
        this.className=className;
    }
    public void show(){
        super.show();
        System.out.println("Class Name : "+ this.className);
    }
}

public class Q45{
    public static void main(String []args){
    	// TODO Auto-generated method stub
        Student1 arr[] =new Student1[5];
        Student1 s1 =new CollegeStudent(1,45,3);
        Student1 s2 =new CollegeStudent(2,98,8);
        Student1 s3 =new SchoolStudent(3,56,"10th");
        Student1 s4 =new SchoolStudent(4,87,"12th");
        Student1 s5 =new SchoolStudent(5,35,"8th");
        arr[0]= s1;arr[1]= s2;arr[2]= s3;arr[3]= s4; arr[4]= s5;

        for(Student1 x : arr){
            x.show();
        }

        int countCollegeStudent=0;
        int countSchoolStudent=0;
        for(Student1 x : arr){    
            if(x instanceof CollegeStudent){
                countCollegeStudent++;
            }
            if(x instanceof SchoolStudent){
                countSchoolStudent++;
            }
        }
        
        System.out.println("School Count "+ countSchoolStudent +" College Count "+ countCollegeStudent);

        System.out.println("Enter the Roll No  :");
        Scanner sc =new Scanner(System.in);
        int rollNo = sc.nextInt();
        for(Student1 x : arr){
            if(x.getRollNo()==rollNo){
                if(x instanceof CollegeStudent){
                     System.out.println("College Student");
            }
            if(x instanceof SchoolStudent){
                System.out.println("School Student");
            }
            }
        }

        int countGrade=0;
        for(Student1 x : arr){
            if(x.getPercentage() > 75){
                countGrade++;
            }
        }
        
        System.out.println("A grade Count "+ countGrade);
    }
}