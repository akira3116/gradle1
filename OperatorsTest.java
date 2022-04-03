public class OperatorsTest {

    public static void main(String[] args) {

        String s = "vinu";

        switch (s)
        {
            case "vamsi":
                System.out.println("I am Vamsi");
                break;
            case "akira":
                System.out.println("I am Akira");
                break;
            default:
                System.out.println("I am Vinu");
        }

        int numCheck = 13;

        if(numCheck%2==0)

            System.out.println("Even");
        else if(numCheck%2!=0)
            System.out.println("Odd");

    }


}
