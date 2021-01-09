class Deck_of_cards {

      // following member stores all the cards of the Deck
      private Card[] card_Deck;

      // following member variable stores the number of card left to deal with
      private int card_lef_to_deal;

      // constructor
      public Deck_of_cards() {
            // creating an array of 52 elements
            card_Deck = new Card[52];
            card_lef_to_deal = 52;
            // creating 52 cards for the Deck
            int cardCount=0;
            for (int cardSuit = 1; cardSuit <= 4; cardSuit++) {
                  for (int cardFace = 1; cardFace <= 13; cardFace++) {
                        Card card = new Card(cardSuit, cardFace);
                        card_Deck[cardCount] = card;
                        cardCount++;
                  }//end of inner for loop
            }//end of outer for loop

      }//end of constructor

      // following method shuffes the card_Deck of 52 cards

      public void shuffle_Deck() {

        //To shuffle the deck of card we will swap each card with a random card in the deck
            for (int i = 0; i < card_Deck.length; i++) {
                  int randomIndex = (int) (Math.random() * card_Deck.length);
                  //swapping two random card positions
                  Card tempCard = card_Deck[i];
                  card_Deck[i] = card_Deck[randomIndex];
                  card_Deck[randomIndex] = tempCard;
            }//end of for loop

      }//end of shuffle_Deck()

      // following method implements dealing of card

      public Card deal_card() {

        //base case: if no card left then return null
            if (card_lef_to_deal == 0) {
                  return null;
            }


            Card card = card_Deck[card_lef_to_deal - 1];
            card_lef_to_deal--;
            return card;
      }//end of method deal_card()

      // returns the number of cards left

      public int getLeftCard() {
            return card_lef_to_deal;

      }

      // returns a String containing all cards info

      public String toString() {
            String message = "";
            //append details of each card and return combined result.

            for (int card = 0; card < card_lef_to_deal; card++) {
                  message += card_Deck[card] + "\n";
            } //end of for loop

            return message.trim();

      }//end of method toString()

}//end of class Deck_of_cards
