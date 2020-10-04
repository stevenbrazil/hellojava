import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int password = 2975429;
        String userName = "Steve";

        System.out.println("Enter your user name: ");
        String name = input.next();
        System.out.println("Enter your password: ");
        int pw = input.nextInt();



        if(name.equals(userName) && pw == password)
        {
            System.out.println("Hello, " + userName + ". Nice to see you today!");
        }

        else
        {
            System.out.println("Credentials are invalid. Please try again");
        }

        input.close();
    }
}
