class Main {

      public static void main(String[] args) {

            Deck_of_cards card_Deck = new Deck_of_cards();
            System.out.println("Deck of cards is as follows =>");
            System.out.println(card_Deck);
            System.out.println("\nShuffling card_Deck and dealing each card\n");

            //shuffling the deck of card
            card_Deck.shuffle_Deck();

            //dealing each card

            while (card_Deck.getLeftCard() > 0) {
                  //dealing and displaying card
                  System.out.println("\nDealing with card: " + card_Deck.deal_card()+", left card: "+card_Deck.getLeftCard());
            }//end of while statement

      }//end of main() method

}//end of Main class
