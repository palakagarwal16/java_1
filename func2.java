import java.util.Scanner;
public class func2 { 
    public static void main(String[] args) {
    //    int result = mul();
    //    System.out.println("YOUR RESULT:" + result);
    System.out.println( mul());

    }
        

        static int mul(){
        Scanner input = new Scanner(System.in);
        System.out.println(" ENTER YOUR NUM :");
        int num =input.nextInt();
        System.out.println(" ENTER YOUR NUM :");
        int num2 =input.nextInt();
         int  Ans = num * num2;
        // System.out.println("RESULT:" + Ans);
        input.close();
        return Ans ;
    }
}
