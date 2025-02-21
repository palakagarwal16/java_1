

public class sa {
    int a;
    String b ;

    sa ( int a , String b){
        this.a = a;
        this.b = b;
    }
 
    void sleep(){
        System.out.println("Sleeping:" + b);
    }
    void eat (){
        System.out.println("Eating: " + b);
    }void love(){
        System.out.println("Loving: " + b);
    }
  public static void main(String[] args) {
    sa s1 = new sa ( 10, "palak");
    s1.sleep();
    s1.eat();
    s1.love();
  }
 // public static void main(String[] args) { intia.. via method

    //     sa s1 = new sa();
    //     s1.a = 10;
    //     s1.b = "palak";
    //     s1.sleep();
    // }

    // public static void main(String[] args) {  intialise via refrebce var
    //     sa s1 = new sa();
    //     s1.a = 10;
    //     s1.b = " palak ";
    //     System.out.println("name"+ s1.b);
    // }

}
