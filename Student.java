public class Student {
String name;
int age;

Student(){
this.age = 18;
this.name = "none";}

Student( int age){
this.age = age;
this.name = "none";
}
void display() {
    System.out.println( "Name: "+ name);
    System.out.println( " Age:  " + age);
}

  class Main  {
  public static void main (String[] args)
   {
    Student s1 = new Student();
    s1.display();

    Student s2 = new Student(28);
    s2.display();
   } 
 }
}



