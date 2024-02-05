import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private List<Object> allowedBark;

    public DogDoor() {
        this.open = false;
        this.allowedBark = new ArrayList<>();
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void addAllowedBark(Bark allowedBark) {
        this.allowedBark.add(allowedBark);
    }

    public List getAllowedBark() {
        return allowedBark;
    }
}
