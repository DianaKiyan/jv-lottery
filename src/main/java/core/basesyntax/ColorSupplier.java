package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    final String getRandomColor() {
        int ballId;
        ballId = new Random().nextInt(Colors.values().length);
        return Colors.values()[ballId].name();
    }
}
