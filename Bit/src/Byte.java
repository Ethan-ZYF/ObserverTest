public class Byte {

    private Bit[] bits = new Bit[8];

    public Byte() {
        for (int i = 0; i != bits.length; i++) {
            bits[i] = new Bit();
        }
        for (int i = bits.length - 1; i > 0; i--) {
            bits[i].addObserver(bits[i - 1]);
        }
    }

    public void increment() {
        bits[bits.length - 1].flip();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Bit b: bits) {
            stringBuilder.append(b.toString());
        }
        return stringBuilder.append("}").toString();
    }
}
