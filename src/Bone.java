import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Bone {



    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

    private  int value;

    Bone(int value){
        this.value = value;
    }

    private static final List<Bone> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public int getValue(){
        return this.value;
    }

    public static Bone randomBone()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
