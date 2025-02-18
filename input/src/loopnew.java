import java.util.Scanner;

public class loopnew {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter");
         int m = sc.nextInt();
//        int n = 0;
//        while(m>0) {
//            m = m / 10;
//            n = n + 1;
//        }
//        System.out.println(n);
        int sum= 0;
        while(m>0){
            int lastdigit = m%10;
            sum = sum+lastdigit;
            m = m/10;

        }
        System.out.println(sum);
    }
}
