import java.util.Scanner;

public class Main {
    public static void main(String[] ij) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name");
        String name = scanner.nextLine();
        System.out.println("hello" + name);

        System.out.println("whats your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("you are " + age);
        System.out.println("no of friends");
        int friends = scanner.nextInt();
        friends = friends / 2;
        friends = friends++;
        friends = friends--;
        System.out.println(friends);



    }}









