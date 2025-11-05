//0 to 52 of  array represents the card

public class deckofcards {
    public static void main(String[] args) {

        String[] suit={"spade","club","heart","diamond"};
        String[] rank={"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};

        int [] deck=new int[52];
        for (int i = 0; i <deck.length ; i++) {
            deck[i]=i;

        }

        shuffle(deck);

        for (int i = 0; i < deck.length; i++) {
            System.out.println(rank[deck[i]%13] +" of "+(suit[deck[i]/13]));

        }

    }


    static void shuffle(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * (arr.length));

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
