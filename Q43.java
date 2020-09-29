package assignment4;

/*
 *	Create a class OneBHK with instance variables roomArea, hallArea and price. 
 *Then create default constructor that initializes instance variables with some 
 *values and a parameterized constructor that takes values for all instance 
 *variables and stores them in instance variables. Now create a method named show()  
 *to print OneBHK’s instance variable values.
 *	Create another class TwoBHK which has (inherites) all the properties and behaviors
 *of OneBHK and a new instance variable room2Area. Then create default constructor to 
 *initialize all 4 instance variables and a parameterized constructor to take the 
 *values for initialization of all instance variables. Override show() method to print 
 *all data member information.
 *	Write main method in another class (Say Demo) and store three TwoBHK flat’s information 
 *and print information using show method. Also print total amount of all flats. 
 */


class OneBHk{
    private int roomArea;
    private int hallArea;
    private double price;
    private static double totalAmt=0;
    OneBHk(){
        this.roomArea=0;
        this.hallArea=0;
        this.price=0.0;
    }
    OneBHk(int roomArea ,int hallArea,double price){
        this.totalAmt=this.totalAmt+price;
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    public void show(){
        System.out.println("Room Area "+ this.roomArea+ " Hall Area "
        +this.hallArea + " Price "+ this.price +" Total Amt of all flats "+ this.totalAmt);
    }
}

class TwoBHK extends OneBHk{
    private int room2Area;
    TwoBHK(){
        super();
        this.room2Area=0;
    }
    TwoBHK(int roomArea ,int hallArea,double price,int room2Area){
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }
    public void show(){
        super.show();
        System.out.println("Room 2 Area "+ this.room2Area);
    }
}
public class Q43{
    public static void main(String args[]){
    	// TODO Auto-generated method stub
        TwoBHK b1 =new TwoBHK(1,3,45000,1);
        TwoBHK b2 =new TwoBHK(2,6,80000,2);
        TwoBHK b3 =new TwoBHK(3,8,34000,3);
        b1.show();
        b2.show();
        b3.show();
    }
}


