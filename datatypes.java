import java.util.Scanner;

public class datatypes {
    public static void main(String[] args) {
        //user input
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a num for x : ");
        int x = scn.nextInt();
        System.out.print("Enter a num for y : ");
        int y = scn.nextInt();

        System.out.println("the value of x+y is " + (x+y));

        scn.close();
    }
}
