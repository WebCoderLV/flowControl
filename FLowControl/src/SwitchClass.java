public class SwitchClass implements SwitchInterface {
    // lauku nav. Ir viena metode
    public void ageCheck(int age) {
        isAdult(age);
    }

    @Override
    public void isAdult(int s) {
        switch ((s >= 18) ? 1 : 0) {
            case 1 -> System.out.println("Jā vecīt, tu vari pirkt alu.");
            case 0 -> System.out.println("Tu esi nepilngadīgs.");
            default -> System.out.println("Kāds mistisks vecums.");
        }
    }
}
