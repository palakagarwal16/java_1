//public class paasbyvalue {
//
//    private static String naam;
//
//    public static void main(String[] args) {
//        String name = "kunal" ;
//
//        System.out.println( name );
//        changename();
//    }
//
//    public static void changename(){
//        String naam = "palak";
//        System.out.println(naam);
//    }
//}


public class paasbyvalue {

    private static String naam;

    public static void main(String[] args) {
        String name = "kunal" ;

        changename(name);
        System.out.println(name);

    }

    static void changename(String naam){
        naam = "palak";
//        System.out.println(naam);
    }
}
