public class Human {
    int age;
    String name;
    int rno;
    int dob;

Human ( ){
    this.age = 20;
    this.dob = 3;
    this. rno = 22;
    this.name = "palak";
}
public static void main(String[] args) {
 Human h1 = new Human();
 System.out.println("NAME:" + h1.name);
}
}
