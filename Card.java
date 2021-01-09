//********************************************************************
//  Vowels.java
//
//  Mariam Rana T00664659
//  Comp 1131 Assignment 3 Question 2
//  September 7, 2020
//  Shows how nested loops & switch case can be used to perform
//  calculations based on user input.
//********************************************************************
import java.util.Random;

class Card { // class Card

	int suit;

	int face;

	public Card() { // default constructor

		Random rand = new Random();

//assingning random values in the specified range

		int suit = rand.nextInt(4) + 1;

		int face = rand.nextInt(13) + 1;

		this.suit = suit;

		this.face = face;

	}

	public Card(int face, int suit) { // parameterised constructor
//it sets the value only if the values are in the specified range
		if (suit >= 1 && suit <= 4) {
			this.suit = suit;
		}
		if (face >= 1 && face <= 13) {
			this.face = face;
		}

	}

	int getFace() {

		return face;

	}

	int getSuit() {

		return suit;

	}

	void setFace(int fac) {

		if (fac >= 1 && fac <= 13) {

			this.face = fac;

		}

	}

	void setSuit(int s) {

		if (s >= 1 && s <= 4) {
			this.suit = s;
		}

	}

	String getFaceText() { // return the text of face

		String[] faces = { " ", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };

		return faces[face];

	}

	@Override
	public String toString()

	{

		String[] faces = { " ", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };

		String[] suits = { " ", "Hearts", "Clubs", "Diamonds", "Spades" };

		String faceStr = (face != 0) ? faces[face] : "invalid";

		String suitStr = (suit != 0) ? suits[suit] : "invalid";

		return faceStr + " of " + suitStr;

	}

}
