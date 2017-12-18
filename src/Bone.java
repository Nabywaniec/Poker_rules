import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Bone {

    ONE, TWO, THREE, FOUR, FIVE, SIX;


    private static final List<Bone> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Bone randomBone()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
