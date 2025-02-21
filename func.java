import java.util.Scanner;
public class func {
    public static void main(String[] args){
    // int ans = sum();
    sum(); // call your func here no retyrn value 
}
     
        static void sum()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("enter numbers:");
            int num1 = in.nextInt();  
            int num2 = in.nextInt();
            int sum = num1+ num2;
            System.out.println( "sum is "+ sum);
            // return sum ;
            in.close();
            
            
        }

}

