import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        SwitchClass switchClass = new SwitchClass();

        System.out.print("Ievadi savu vecumu: ");
        int age = scanner.nextInt();

        switchClass.ageCheck(age);

        scanner.close();
    }
}
