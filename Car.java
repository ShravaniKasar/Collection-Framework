//Learn Constructor
public class Car {
String Model ;
int Year ;
double price;

public Car()
{
Model= "Unknown";
Year = 0;
price=0.0;
}

Car(String Model , int Year)
{
this.Model = Model;
this.Year = Year;
}
Car(String Model , int Year , double price)
{
System.out.println("This is Parameterized Constructor");
this.Model = Model;
this.Year = Year;
this.price = price;
}

public void display()
{
System.out.println("Model :" + Model + " , Year :" +Year + "Price :" +price );
}

public static void main(String[] args) {
Car C = new Car();
Car C1 = new Car("Mahindra" , 2000);
Car C2 =new Car("Verna" , 1989 , 98000);
Car C3 =new Car("ABc" , 1988 , 99000);

C.display();
System.out.println(" This is Default Constructor");

C1.display();
System.out.println("This is Parameterized Constructor With 2 Parameter");

C2.display();
System.out.println("This is Parameterized Constructor With 3 Parameter");


C3.display();

}
}

