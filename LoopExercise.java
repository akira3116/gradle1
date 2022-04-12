public class LoopExercise {

    public static void main(String[] args) {

        for(int i=65;i<69;i++)
        {
            for(int j=65;j<=i;j++)
            {

                char c = (char) j;
                System.out.print(c + " ");
            }
            System.out.println();
        }


       for(int x=1;x<5;x++)
       {

           for(int y=1;y<5;y++)
           {
               if(x==1 || y==1 || x==4 || y == 4)
                   System.out.print("$" );
               else
                   System.out.print(" ");
           }
           System.out.println();
       }
    }
}
