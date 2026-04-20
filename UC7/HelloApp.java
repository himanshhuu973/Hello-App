public class HelloApp {
    public static void main(String[] args) {
        String names = "World";
        
        // Check if command-line arguments are provided
        if (args.length > 0) {
            // Joins all arguments into a single string separated by ", "
            names = String.join(", ", args);
        }
        
        // Print the final greeting
        System.out.println("Hello, " + names + "!");
    }
}

