import java.util.ArrayList;

public class Gamer {

    private int id;
    private ArrayList<Bone> bones = new ArrayList<>();

    public Gamer(int id) {
        this.id = id;
        this.bones.clear();
    }

    public void changeBones(Bone t[], int n){

        for(int i=0;i<n;i++){
            this.bones.remove(t[i]);
        }

        this.bones.addAll(BonesManager.getBones(n));
    }

    public ArrayList<Bone> getBones() {
        return bones;
    }

    public int getId() {
        return id;
    }
}
