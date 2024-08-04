public class StaticNonstatic {

static int a=5 , b=7 , addition;
int c=9, d =9 , add1;

public static void main(String[] args) {

StaticNonstatic.add();

StaticNonstatic l1 = new StaticNonstatic();
l1.add1();

}
static void add(){
addition= a+b;
System.out.println(addition);
}
void add1(){
add1 = c+d;
System.out.println(add1);
}
}

