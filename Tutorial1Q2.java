import java.util.*;
public class Tutorial1Q2
{
    public static void main(String arg[])
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("\nEnter Module Code: ");
        String module = myObj.nextLine();
        myObj.close();

        switch(module)
        {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Strucrture and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            default:
                System.out.println("Unknown Module");
                break;
        }
    }
}