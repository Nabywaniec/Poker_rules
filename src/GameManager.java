import java.util.ArrayList;
import java.util.HashMap;

public class GameManager {

    private HashMap<Gamer, Integer> game_results;
    private HashMap<Gamer, Integer> round_results;
    private Algo algo;

    public GameManager(){
        this.game_results.clear();
        this.round_results.clear();
        this.algo = algo;
    }

    public HashMap<Gamer, Integer> initialize(HashMap<Gamer, Integer> results){

        for(Gamer key : results.keySet()){
            results.put(key, new Integer(0));
        }
        return results;
    }

    public void addGamer(Gamer gamer){
        this.game_results.put(gamer, new Integer(0));
        this.round_results.put(gamer, new Integer(0));
    }


    public void findWinnerRound(){

        int maxy =-1;
        int maxy_owner =-1;
        Gamer maxy_owner2 = null;
        for(Gamer gamer:game_results.keySet()){
            if(algo.getResult(gamer.getBones()) > maxy){
                maxy = algo.getResult(gamer.getBones());
                maxy_owner = gamer.getId();
                maxy_owner2 = gamer;
            }
        }
        System.out.println("Gamer " + maxy_owner + " win round!");
        int r = this.game_results.get(maxy_owner2);
        game_results.put(maxy_owner2, r +1);
    }

    public void findWinnerGame(){
        int maxy =-1;
        int maxy_owner = -1;
        for(Gamer gamer : game_results.keySet()){
            if(algo.getResult(gamer.getBones()) > maxy){
                maxy = algo.getResult(gamer.getBones());
                maxy_owner = gamer.getId();
            }
        }
        System.out.println("Gamer " + maxy_owner + " win game !");
    }

    public void deleteGamer(Gamer gamerToDelete){
        this.game_results.remove(gamerToDelete);
        this.round_results.remove(gamerToDelete);
    }


}
