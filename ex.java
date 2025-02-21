public class ex {

        int age;
        String name;
        int rno;
        int dob;
    
    ex ( int age ,String name , int rno ,int dob ){
        this.age = age;
        this.dob = dob;
        this. rno = rno ;
        this.name = "palak";
    }
    public static void main(String[] args) {
     ex h1 = new ex( 20 , "palak",22 ,4);
     System.out.println("NAME:" + h1.name);
    }
    }

