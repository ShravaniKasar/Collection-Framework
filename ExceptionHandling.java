public class ExceptionHandling {
public static void main(String[] args) {

int a[]= new int[5];

int c;
System.out.println("Hello Guys");

try {
System.out.println(a[8]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Exception handled");
}
finally{
System.out.println("I always Execute");
}


}
}
