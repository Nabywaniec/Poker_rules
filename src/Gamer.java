import java.util.ArrayList;

public class Gamer extends GameParticipant{

    private int id;
    private ArrayList<Dice> bones = new ArrayList<>();

    public Gamer(int id) {
        super(id);
        this.bones.clear();
    }

    public void changeBones(Dice t[], int n){

        for(int i=0;i<n;i++){
            this.bones.remove(t[i]);
        }

        this.bones.addAll(DiceManager.getBones(n));
    }

    public ArrayList<Dice> getBones() {
        return bones;
    }

    public int getId() {
        return id;
    }
}
