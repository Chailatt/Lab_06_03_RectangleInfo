import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";

        System.out.println("Enter length of rectangle: ");
        if (scan.hasNextDouble())
        {
            length = scan.nextDouble();
            scan.nextLine();
        }

        else
        {
            trash = scan.nextLine();
            System.out.println("You said the temperature was " + trash );
            System.out.println("Run the program again and enter a valid temperature! " + trash );
        }
        System.out.println("Enter width of rectangle: ");
        if (scan.hasNextDouble())
        {
            area = length * width;
            perimeter = (length*2) + width*2;
            System.out.println("Your area is " + area);
            System.out.println("Your perimeter is " + perimeter);
            width = scan.nextDouble();
            scan.nextLine();
        }
        else
        {
            trash = scan.nextLine();
            System.out.println("You said the temperature was " + trash );
            System.out.println("Run the program again and enter a valid temperature! " + trash );
        }



    }
}