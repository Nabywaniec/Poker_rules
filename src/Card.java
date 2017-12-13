
public class Card
{

    private int value;
    private int color;

    public Card(int value, int color){
        this.color = color;
        this.value = value;
    }

    public int compereTo(Card card){

        if(this.value > card.value) return 1;
        else if (this.value < card.value) return -1;
        else{
            if(this.color > card.color) return 1;
            else if(this.color == this.color) return 0;
            else  return -1;
        }
    }


    public int getValue(){
        return this.value;
    }

    public int getColor(){
        return this.color;
    }

    public double getCardValue(){

        return this.value + 0.25 * this.color;
    }

    @Override
    public String toString(){
        return "Card value : " + this.value + ", card color :  " + this.color;
    }

}
