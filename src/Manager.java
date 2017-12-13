import java.util.ArrayList;
import java.util.HashMap;

public class Manager {

    private CardSet cardSet = new CardSet();
    private ArrayList<Gamer> gamers;
    private HashMap<Gamer, Integer> results;


    public Manager(ArrayList<Gamer> gamers){
        this.gamers = gamers;
        this.results = new HashMap<>();
        this.results.clear();
        for(Gamer g:this.gamers){
            this.results.put(g, 0);
        }
    }



}
