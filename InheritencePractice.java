class Dad
{
    int dad1 = 75;
    public void dad()
    {
        System.out.println("I am Dad");
    }
    //@Override
    public int myage()
    {
        return dad1;
    }
}

class Mom extends Dad
{

    int mom1 = 65;
    public void mom()
    {

        System.out.println("I am mom");
    }
    public int myage()
    {
        return mom1;
    }
}

class Son extends Mom
{

    int son1 = 38;
    public void son()
    {
        System.out.println("I am Son");
    }

    public int myage()
    {
        return son1;
    }
}

public class InheritencePractice {

    public static void main(String[] args) {

        Dad s = new Son();
        s.dad();
        //s.mom();
        //s.son();
        int l =s.myage();
        System.out.println(l);

        s = new Mom();
        System.out.println(s.myage());

    }
}
