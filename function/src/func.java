import java.util.*;
public class func {
    public static int calproduct( int a , int b ){
        int product = a*b ;
        return product ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num1");
        int a = sc.nextInt();
        System.out.println("num");
        int b = sc.nextInt();
        int product = calproduct(a,b);
        System.out.println("product is " + product);
    }
}
