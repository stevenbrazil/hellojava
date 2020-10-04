public class hello {
    public static void main(String[] args) {

        int age = 29;
        String name = "Rob";

        if(name == "Steve" && age == 28)
        {
            System.out.println("Hello, " + name + ". You are, " + age);
        }

        else if(name == "Steve" && age >= 29)
        {
            System.out.println("Woah " + name + ", you are older from when i last spoke to you!");
        }

        else
        {
            System.out.println("Please validate program to include your information. Thank you!");
        }

    }
}
