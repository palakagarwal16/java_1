import java.util.Scanner;

public class factorial {

    public static int fact(int n ){
        if (n ==1 || n == 0)
            return 1;
        else
            return n* fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print number n ");
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println("factorial is " + fact);


        sc.close();
    }
}
