public class Main {
    public static void main(String[] args) {
        Byte digits = new Byte();
        for (int i = 0; i < 32; i++) {
            digits.increment();
            System.out.println(digits);
        }
    }
}
