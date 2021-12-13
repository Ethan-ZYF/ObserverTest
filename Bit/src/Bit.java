import java.util.Observable;
import java.util.Observer;

public class Bit extends Observable implements Observer {
    private boolean isOn;

    public static void main(String[] args) {
        Bit b1 = new Bit();
        Bit b2 = new Bit();
        b2.addObserver(b1);
        b2.flip();
        b2.flip();
        System.out.println(b1 + b2.toString());
    }

    public void flip() {
        if (this.isOn) {
            this.isOn = false;
            setChanged();
            notifyObservers("bit turned off");
        } else {
            this.isOn = true;
        }
    }

    @Override
    public String toString() {
        if (this.isOn) return "1";
        else return "0";
    }

    @Override
    public void update(Observable o, Object arg) {
        this.flip();
    }
}
