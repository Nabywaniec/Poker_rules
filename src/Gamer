import java.util.ArrayList;

public class Gamer {


    private int id;
    private ArrayList<Card> cards = new ArrayList<>();
    private CardSet cardSet;

    public Gamer(int id){
        this.id = id;
        this.cards.clear();
    }


    public void first_give(){

        this.cards.addAll(cardSet.getXCards(5));

    }

    public void display(){

        for(Card c:cards){
            System.out.println(c.toString());
        }

    }

    public void changeXCards(ArrayList<Card> cards_to_remove){

        for(Card c:cards_to_remove){
            this.cards.remove(c);
            this.cardSet.addCard(c.getValue(), c.getColor());
        }
        this.cards.addAll(this.cardSet.getXCards(cards_to_remove.size()));

    }





}
