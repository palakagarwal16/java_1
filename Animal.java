

public class Animal {  // The file name must match this class name (Animal.java)
    int age;
    String name;

    void eat() {
        System.out.println("Name: " + name + " is eating.");
    }

    void sleep() {
        System.out.println("Name: " + name + " is sleeping.");
    }

    void showAge() {
        System.out.println("Age: " + age + " years old.");
    }
}
    
    
    class Dog extends Animal {
        String breed;
        
        void showBreed() {
            System.out.println("Breed of " + name + " is " + breed);
        }
    }
    









