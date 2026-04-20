public class HelloApp {
    public static void main(String[] args) {
        // 1. & 2. Check if arguments are provided using args.length
        if (args.length == 0) {
            // 3. Default greeting if no arguments
            System.out.println("Hello, World!");
        } else {
            // 4. Use StringBuilder for efficient string construction
            StringBuilder nameBuilder = new StringBuilder();
            
            // Use Enhanced For Loop to iterate through names
            for (String name : args) {
                // 5. Always append the name followed by a comma and space
                nameBuilder.append(name).append(", ");
            }

            String greeting = nameBuilder.toString();

            // 6. Use substring() to remove the trailing comma and space (", ")
            // Check length > 0 before calling substring to avoid errors
            if (greeting.length() > 0) {
                greeting = greeting.substring(0, greeting.length() - 2);
            }

            // 7. Print the final greeting
            System.out.println("Hello, " + greeting + "!");
        }
        // 8. App terminates
    }
}