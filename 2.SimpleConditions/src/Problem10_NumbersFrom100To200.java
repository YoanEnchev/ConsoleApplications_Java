import java.util.Scanner;

public class Problem10_NumbersFrom100To200 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number > 200) {
            System.out.println("Greater that 200");
        } else if (number != 100 && number != 200) {
            System.out.println("Between 100 and 200");
        }
    }
}
