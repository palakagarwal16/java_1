 class inh1 {
    int salary = 10000;
    String name = " pallavi";


    void sal ()
    {
        System.out.println(" salary of "+ name + "is "+ salary);
    }

}

class inh2 extends inh1{

    String designation = "developer";


    void info (){
        System.out.println("Designation of "+ name + " is "+ designation + " with salary "+ salary + "." + "   ok now so many ererrrr");
    }
}
 class inh {
    public static void main(String[] args) {
        inh1 i1 = new inh1();
        inh2 i2 = new inh2();
        i2.info();

        
    }
}
    
