import java.util.Scanner;

public class PassFail {
    public static void main(String args[]) {

        int score;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Enter a  student's test score or type -1 to quit ");
            score = keyboard.nextInt();

            if (score >= 60) {
                System.out.println("Student passed.");
                System.out.println("Great job");
            } else if (score > 0)
                System.out.println("Student failed.");
        } while (score != -1);
    }
}
