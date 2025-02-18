import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("print your num of elements  ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n] ;

        System.out.println("enter your elements" + " ");
        for( int i=0; i<n ; i++){
            arr[i] = scanner.nextInt();}

        System.out.println("Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        // Adds a newline after printing elements

        scanner.close();

    }
}





