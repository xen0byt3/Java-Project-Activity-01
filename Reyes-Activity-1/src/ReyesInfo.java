import java.util.Scanner;

public class ReyesInfo {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Ask for user information
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your course: ");
        String course = input.nextLine();

        System.out.print("Enter your birthday: ");
        String birthday = input.nextLine();

        System.out.print("Enter your home town: ");
        String homeTown = input.nextLine();

        System.out.print("Enter your status: ");
        String status = input.nextLine();

        System.out.print("Enter your profession: ");
        String profession = input.nextLine();

        // Display the formatted output
        System.out.println("\n=================================");
        System.out.println("Welcome " + name + " !");
        System.out.println("Welcome to " + course + " !");
        System.out.println("We will be recording you as our birth month celebrant. Your birthday is " + birthday);
        System.out.println("Here are some of your Personal Information!");
        System.out.println("Home Town: " + homeTown);
        System.out.println("Status: " + status);
        System.out.println("Profession: " + profession);
        System.out.println("\nThank you for registering your personal information! Have a nice day!");

        // Close the scanner
        input.close();
    }
}