public class method {
    static int add ( int a, int b) { return (a+b);}
    static int add ( int a, int b ,int c) { return (a+b + c);}

    public static void main(String[] args) {
        System.out.println( add(1,1));
        System.out.println(add( 1,23,45));
    }

}
