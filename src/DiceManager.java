import java.util.ArrayList;

 class DiceManager {

    public static ArrayList<Dice> getBones(int n){

        ArrayList<Dice> bones = new ArrayList<>();
        bones.clear();
        for(int i=0;i<n;i++){
            bones.add(Dice.randomBone());
        }
        return bones;

    }

}
