import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);
    }
}