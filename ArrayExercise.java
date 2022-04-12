class Calc1
{

    public void add1(int ... s)
    {
        int sum=0;


        for(int x: s)
        {
            sum= sum+x;
        }
        System.out.println("sum is :" + sum);

    }
}


public class ArrayExercise {

    public static void main(String[] args) {


        int array1[][] = {{1, 2, 3, 6}, {4, 5, 6}, {7, 8, 9, 1}, {3, 4, 5, 7}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }

            System.out.println();
        }
        int a1[] = {1,2,3,4,5};
        for (int k : a1)
        {
            System.out.print(k + " ");
        }
        System.out.println();
        for ( int l[] : array1)

        {
            for (int m : l)
            {
                System.out.print(m + " ");
            }

            System.out.println();
        }
        Calc1 cobj = new Calc1();

        cobj.add1(1,2,3,4,5);
    }
}