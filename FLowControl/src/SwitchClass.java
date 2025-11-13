public class SwitchClass {
    // lauku nav. Ir viena metode
    public static void ageCheck(int age) {
        SwitchInterface adultSwitch = (s) -> {
            switch ((s >= 18) ? 1 : 0) {
                case 1 -> System.out.println("Jā vecīt, tu vari pirkt alu.");
                case 0 -> System.out.println("Tu esi nepilngadīgs.");
                default -> System.out.println("Kāds mistisks vecums.");
            }
        };
        adultSwitch.isAdult(age);
    }
}
