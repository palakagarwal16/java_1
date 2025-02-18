import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter");
//        int num1 = sc.nextInt();
//        while( num1>10){
//            System.out.println(num1);
//            num1++;
//
//        }

        System.out.println("enter");
        int num3 = sc.nextInt();
        while( num3 <= 500){
            System.out.println(num3);
            num3 = num3 *5;
        }

    }
}
