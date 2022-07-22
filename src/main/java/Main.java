public class Main {
    private static final int EXIT_NUMBER = 100;
    private static final int MIN_NUMBER = 90;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        for (int r : new Randoms(MIN_NUMBER, MAX_NUMBER)) {
            System.out.println("Случайное число: " + r);
            if (r == EXIT_NUMBER) {
                System.out.println("Выпало число " +  EXIT_NUMBER + ", давайте на этом закончим");
                break;
            }
        }
    }
}
