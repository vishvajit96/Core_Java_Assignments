package assignment4;

/*Q44 ::
 *Create three classes
    • Faculty with two data members facultyId and salary and two methods, 
    	one intput() method for accepting facultyId as input and another 
    	printSalary() to print salary.
    • FullTimeFaculty that inherits class Faculty with two data members’ 
    	basicSalary and allowance. Override input() method in this class 
    	that calls super class inut() method and accepts basicSalary and 
    	allowance as input. Salary should not be accepted as input but should 
    	be calculated using formula (basicSalary + allowance)
    • PartTimeFaculty that inherits class Faculty with two data members’ 
    	workingHours, ratePerHour. Override input() method in this class that 
    	calls super class inut() method and accepts workingHours and ratePerHour 
    	as input. Salary should not be accepted as input but should be calculated 
    	using formula ( workingHour * ratePerHour )
 */


import java.util.Scanner;

class Faculty{
    private int facultyID;
    private double salary;

    Faculty(){}
    // Faculty(int facultyID,double salary){
    //     this.facultyID=facultyID;
    //     this.salary=salary;
    // }
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Teacher Id :");
       this.facultyID= sc.nextInt();
    }
    public void setSalary(double salary){
        this.salary =salary;
    }
    public void printSalary(){
        System.out.println("Salary for "+this.facultyID +" : Salary = "+this.salary);
    }
}
class FullTimeFaculty extends Faculty{
    private double basicsSalary;
    private double allowance;

    FullTimeFaculty(){}
    // FullTimeFaculty(int facultyID,double basicsSalary,double allowance){
    //     super(facultyID,basicsSalary*allowance);
    //     this.allowance =allowance;
    //     this.basicsSalary =basicsSalary;
    // }

    public void input(){
        super.input();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Teacher Basic Salary :");
        this.basicsSalary= sc.nextDouble();
        System.out.println("Enter Teacher allowance :");
        this.allowance= sc.nextDouble();
        super.setSalary(basicsSalary+allowance);
    }
    public void printSalary(){
        super.printSalary();
        System.out.println("Basic Salary "+this.basicsSalary +" : "+this.allowance);
    }
}
class PartTimeFaculty extends Faculty{
    private int workingHours;
    private double ratePerHour;

    PartTimeFaculty(){

    }
    public void input(){
        super.input();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Teacher Working Hours :");
        this.workingHours= sc.nextInt();
        System.out.println("Enter Teacher rate per hour :");
        this.ratePerHour= sc.nextDouble();
        super.setSalary(workingHours*ratePerHour);
    }
    public void printSalary(){
        super.printSalary();
        System.out.println("Basic Salary "+this.workingHours +" : "+this.ratePerHour);
    }

}

public class Q44{
    public static void main(String []args){
    	// TODO Auto-generated method stub
        FullTimeFaculty f =new FullTimeFaculty();
        f.input();
        f.printSalary();
        
        PartTimeFaculty p =new PartTimeFaculty();
        p.input();
        p.printSalary();
    }
}