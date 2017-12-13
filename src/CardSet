import java.util.ArrayList;
import java.util.Random;

public class CardSet {


    private ArrayList<Card> cards = new ArrayList<>();
    private int size = 52;
    private int ammount;


    public CardSet(){

        this.ammount = 52;
        for(int i=2;i<15;i++){
            for(int j=0;j<3;j++){
                Card card = new Card(i, j);
                cards.add(card);
            }
        }

    }

    public Card getCard(){

        Random r = new Random();
        int index = r.nextInt(ammount);
        cards.clear();
        Card c = cards.get(index);
        cards.remove(index);
        ammount -= 1;
        return c;
    }

    public void addCard(int value, int color){

        if(! isInSet(value, color)){
            cards.add(new Card(value, color));
        }

    }

    public boolean isInSet(int value, int color){

        return this.cards.contains(new Card(value, color));
    }

    public ArrayList<Card> getXCards(int n){

        ArrayList<Card> cards_to_give = new ArrayList<>();
        cards_to_give.clear();
        for(int i=0;i<n;i++){
            cards_to_give.add(getCard());
        }
        return cards_to_give;

    }



}
