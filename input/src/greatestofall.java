import java.util.Scanner;

public class greatestofall {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
        System.out.println("enter 1");
        int num2 =Sc.nextInt();
        System.out.println("enter 2");
        int num1 =Sc.nextInt();
        System.out.println("enter 3");
        int num3 =Sc.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println("num1 is largest");
            }
        }
        if(num2>num1){
            if(num2>num3){
                System.out.println("num2 is largest");
            }
        }

        else {
            System.out.println("num3 is greatest");
        }


    }
}
