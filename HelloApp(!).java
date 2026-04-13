public class HelloApp {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // If arguments are present
        System.out.print("Hello, ");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);

            // Add comma only if not last element
            if (i < args.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("!");
    }
}