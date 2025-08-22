package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int ballId;

    final String getRandomColor() {
        ballId = new Random().nextInt(Colors.values().length);
        return Colors.values()[ballId].name();
    }
}
