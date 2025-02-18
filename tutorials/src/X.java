class X

{ public void draw(int n)

{

    for(int i=1;i<=5;i++) {

        System.out.println(n*i);

        try {

            Thread.sleep(1000);
        }

catch(Exception t)

    {

        System.out.println("t");

    }

}

}

}

class k extends Thread
{

X x1;

k(X x1)

{ this.x1=x1;
} public void run()

{ x1.draw(3);

}

}

class j extends Thread

{

    X x2;

    j(X x2)

    { this.x2=x2;

    } public void run()

{

    x2.draw(5);

}

}

class z

{

    public static void main(String hjg[])

    {

        X x1=new X();

        k k1=new k(x1);

        j j1=new j(x1);

        k1.start();

        j1.start();

    }

}

