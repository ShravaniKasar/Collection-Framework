public class Student {  //Getter And Setter
String Name;
int rollno;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public class Main {
        public static void main(String[] args) {
        Student stud = new Student();
        stud.setName("Shravani");
        stud.setRollno(25);
        System.out.println(stud.getName());
        System.out.println(stud.getRollno());
        }
        }

}
