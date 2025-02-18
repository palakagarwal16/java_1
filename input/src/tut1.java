import java.util.Scanner;

public class tut1 {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter digit");
        int num = Sc.nextInt();
        System.out.println("enter digit2");
        int num1 = Sc.nextInt();
        System.out.println("enter digit3");
        int num2 = Sc.nextInt();
        System.out.println("Answer " + (num/num1));
        System.out.println("Answer " + (num+num1));
        System.out.println("Answer " + (num/num1));
        System.out.println("Answer " + (num+num1/num2));
        System.out.println("Answer " + (num/num1*num2));
    }
}
