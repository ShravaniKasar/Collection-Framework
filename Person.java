

public class LearnToString {
int Person_id;
String Name ;
public String toString(int Person_id,String Name){
return  Person_id +"\n"+ Name ;
}
}

public class Person{
public static void main(String[] args) {
    LearnToString L1 = new LearnToString();
System.out.println(L1.toString(101 ,"Shravani"));
}
}