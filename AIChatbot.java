import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String message;

        System.out.println("Welcome to AI Chatbot!");
        System.out.println("Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            message = sc.nextLine();

            if (message.equalsIgnoreCase("hello")) {
                System.out.println("Bot: Hi! How are you?");
            }
            else if (message.equalsIgnoreCase("how are you")) {
                System.out.println("Bot: I am fine. Thank you!");
            }
            else if (message.equalsIgnoreCase("what is your name")) {
                System.out.println("Bot: My name is AI Chatbot.");
            }
            else if (message.equalsIgnoreCase("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}