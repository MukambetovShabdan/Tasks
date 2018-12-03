
public class Main {

    public static void main(String[] args) {
        int card =(int) (Math.random()* 14);
        int mast = (int)(Math.random()* 5);
        String maste = "Clubs";
        String cardnum = "Ace";
        switch (mast){
            case 1: maste = "Clubs";
            break;
            case 2: maste = "Diamonds";
            break;
            case 3: maste = "Hearts";
            break;
            case 4: maste = "Spades";
            break;
        }
        switch (card){
            case 1: cardnum = "Ace";
            break;
            case 2: cardnum = "2";
            break;
            case 3: cardnum = "3";
            break;
            case 4: cardnum = "4";
            break;
            case 5: cardnum = "5";
            break;
            case 6: cardnum = "6";
            break;
            case 7: cardnum = "7";
            break;
            case 8: cardnum = "8";
            break;
            case 9: cardnum = "9";
            break;
            case 10: cardnum = "10";
            break;
            case 11: cardnum = "Jack";
            break;
            case 12: cardnum = "Queen";
            break;
            case 13: cardnum = "King";
            break;
        }
        System.out.println("The card you picked is " + cardnum + " of " + maste);
    }
}
