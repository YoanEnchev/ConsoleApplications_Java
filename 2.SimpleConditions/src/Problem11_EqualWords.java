import java.util.Scanner;

public class Problem11_EqualWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String text2 = console.nextLine();
        String LowerText = text.toLowerCase();
        String LowerText2 = text2.toLowerCase();
        boolean check = (LowerText.equals(LowerText2));
        if (check) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
