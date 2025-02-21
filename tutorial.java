import java.util.Scanner;

public class tutorial {

public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   {
     System.out.println("data enter");
     int age = input.nextInt();
     System.out.println("your age " + age);
     input.close();

     System.out.println("enter your loop length");
     int length ;
     for ( length=0; length<10; length++)
     {
        System.out.println(" your length "+ length);
     }
      
     input.close();
    }
    


}

    
}
