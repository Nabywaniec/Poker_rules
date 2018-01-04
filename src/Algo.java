import java.util.ArrayList;
import java.util.HashMap;


public class Algo {

private static HashMap<Dice, Integer> states;

private HashMap<Dice, Integer> counter =  new HashMap<>();

    public Algo(){
        counter.clear();
        counter.put(Dice.ONE, 0);
        counter.put(Dice.TWO, 0);
        counter.put(Dice.THREE,0);
        counter.put(Dice.FOUR, 0);
        counter.put(Dice.FIVE,0);
        counter.put(Dice.SIX,0);
    }

    private int sumBones(ArrayList<Dice> bones){
        int s =0;
        for(Dice b : bones){
            s += b.getValue();
        }
        return s;
    }

    public int getResult(ArrayList<Dice> bones){

        initialise_counter();
        setCounter(bones);

        if(have_5_same(bones)){
            System.out.println("Poker");
            return 500 + sumBones(bones);
        }

        if(have_4_same(bones)){
            System.out.println("Kareta");
            return 300 + sumBones(bones);
        }
        if(have_3and2_same(bones)){
            System.out.println("Full");
            return 200 + sumBones(bones);
        }
        if(have_bigStrit(bones)){
            System.out.println("Duży strit");
            return 150;
        }
        if(have_smallStrit(bones)){
            System.out.println("Mały strit");
            return 130;
        }
        if(sum3(bones) != -1){
            System.out.println("Trójka");
            return sum3(bones) +100;
        }
        if(sum2_2(bones) !=-1){
            System.out.println("2 Dwójki");
            return sum2_2(bones) +50;
        }
        if(sum2(bones) != -1){
            System.out.println("Dwójka");
            return sum2(bones) +30;
        }
        System.out.println("Nic");
        return sumBones(bones);


    }

    public boolean have_5_same(ArrayList<Dice> bones){
        initialise_counter();
        setCounter(bones);
        if(counter.keySet().contains(new Integer(5))) return true;
        return false;
    }


    public boolean have_4_same(ArrayList<Dice> bones){

        if(counter.keySet().contains(new Integer(4))) return true;
        return false;
    }

    public boolean have_3and2_same(ArrayList<Dice> bones){


       if(counter.values().contains(new Integer(3)) && counter.values().contains(new Integer(2))){
                return  true;
       }
     return false;
    }

    public boolean have_bigStrit(ArrayList<Dice> bones){
        if(! counter.values().contains(new Integer(3)) && ! counter.values().contains(new Integer(2))
                && counter.get(Dice.ONE).equals(new Integer(0))) return true;
        return false;
    }

    public boolean have_smallStrit(ArrayList<Dice> bones){
        if(! counter.values().contains(new Integer(3)) && ! counter.values().contains(new Integer(2))
                && counter.get(Dice.ONE).equals(new Integer(1))) return true;
        return false;
    }

    public int sum3(ArrayList<Dice> bones){
        if(counter.values().contains(new Integer(3))){
            for(Dice key : counter.keySet()){
                if(counter.get(key).equals(new Integer(3))) return 3 * key.getValue();
            }
        }
        return -1;
    }

    public int sum2_2(ArrayList<Dice> bones){
        System.out.println(counter);
        int s =0;
        for(Dice key : counter.keySet()){
            if(counter.get(key).equals(new Integer(2))) s+=1;
        }
        if(s == 2){
            s =0 ;
            for(Dice key : counter.keySet()){
                if(counter.get(key).equals(new Integer(2))) s+= 2*key.getValue();
            }
            return s;
        }
        return -1;
    }

    public int sum2(ArrayList<Dice> bones){
        if(counter.values().contains(new Integer(2))){
            for(Dice key:counter.keySet()){
                if(counter.get(key).equals(new Integer(2))) return 2* key.getValue();
            }
        }
        return -1;
    }


    public void initialise_counter(){
        for(Dice b : this.counter.keySet()){
            counter.put(b, 0);
        }
    }

    public void setCounter (ArrayList<Dice> bones){
        for(int i=0;i<5;i++){
            this.counter.put(bones.get(i), counter.get(bones.get(i)) + 1);
        }

    }

    public static void main(String[] args){

        Algo algo = new Algo();
        ArrayList<Dice> bones = new ArrayList<>();
        bones.add(Dice.ONE);
        bones.add(Dice.TWO);
        bones.add(Dice.ONE);
        bones.add(Dice.TWO);
        bones.add(Dice.FIVE);
        System.out.println(algo.getResult(bones));
     }

}
