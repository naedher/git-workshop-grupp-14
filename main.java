import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String input = scanner.nextLine().toLowerCase();

        switch (input) {
            case "omar":
                Omar.hello();
                break;
            default:
                System.out.println("Name not recognized.");
        }
    }
}
