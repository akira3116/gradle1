interface Writer
{
    void write();



    }
}

class Pen implements Writer
{
    public void write()
    {

    System.out.println("I am Pen");
}
}

class Pencil implements Writer
{
    public void write() {
        System.out.println("I am Pencil");
    }
}


public class InterfacePractice {


    public static void main(String[] args) {

        Writer w = new Pen();

        w.write();
            w=new Pencil();
    w.write();
    }
}
