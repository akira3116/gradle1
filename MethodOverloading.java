class Calc
{
    public void sum(int i, int j)
    {
        System.out.println("Sum is: "+ (i+j));
    }
    public void sum(int i, int j, int k)
    {
        System.out.println("Sum is: "+ (i+j+k));
    }
    public void sum(double i, double j)
    {
        System.out.println("Sum is: "+ (i+j));
    }
}




public class MethodOverloading {

    public static void main(String[] args) {

        Calc obj = new Calc();
        obj.sum(5,10);
        obj.sum(2.3, 6.6);
    }
}
