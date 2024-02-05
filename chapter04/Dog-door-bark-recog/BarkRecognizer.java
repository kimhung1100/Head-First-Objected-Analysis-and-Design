import java.util.List;
import java.util.Objects;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("    BarkRecognizer: Heard a '" + bark.getSound() + "'");
        List allowedBarks = door.getAllowedBark();
        for (Object allowedBark : allowedBarks) {
            if (allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }
        if (door.getAllowedBark().equals(bark))
            door.open();
        else {
            System.out.println("This dog is not allowed.");
        }
    }
}
