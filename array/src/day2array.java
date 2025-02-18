import java.util.Scanner;

public class day2array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of elements");
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int [n];
        System.out.println("enter your n elements");
        for( int i = 0 ; i<n ; i++)
        {
             arr[i] = sc.nextInt();
        }
        System.out.println("elements are " + " ");
        for(int i = 0 ; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
