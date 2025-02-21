import java.util.Scanner;
public class day2
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("data enter");
            int num = input.nextInt();
            System.out.println("data entered  " + num);

        if(num==10)
        {
            System.out.println("number is 10");
        }
        if (num<= 10)
        {
            System.out.println("num is less than 10");
        }
        {
            System.out.println("num is greater"); 
        }
        input.close();
    }
    }

    
}
