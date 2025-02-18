import java.util.Scanner;

public class ifels {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter digit");
        int num1 = Sc.nextInt();

        if(num1%5==0 || num1%3==0){
            if(num1%15!=0){
                System.out.println("Condition Satisfied");
            }
        }
    }
}
