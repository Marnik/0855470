import java.util.Arrays;
import java.util.Random;

public class Deck {

	Card[] cards = new Card[52];
	String cardType[] = new String[] { "Schoppen", "Klaver", "Ruiten", "Harten" };
	String worths[] = new String[] { "2", "3", "4", "5", "6", "7", "8", "9",
			"10", "Boer", "Vrouw", "Heer", "Aas" };
	int counter = 0;

	public Deck() {

		createDeck();

	}

	private void createDeck() {
		for (String type : cardType) {
			for (String worth : worths) {
				Card card = new Card(type, worth);
				cards[counter] = card;
				counter++;
			}
		}
	}

	public void printDeck() {

		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i].getType() + " " + cards[i].getWorth());
		}

	}

	public void shuffleDeck() {
		for (int i = 0; i < 1000; i++) {
			Random rnd = new Random();

			int rnd1 = rnd.nextInt(52);
			int rnd2 = rnd.nextInt(52);

			Card a = cards[rnd1];
			Card b = cards[rnd2];

			cards[rnd1] = b;
			cards[rnd2] = a;

		}
		setDeck(cards);

	}

	private void setDeck(Card[] cards) {
		this.cards = cards;
		
	}
	
	public void insertAt(Card card, int index){
		Card[] tempArr = new Card[cards.length+1];
		System.arraycopy(cards, 0, tempArr, 0, cards.length);

		for(int i = tempArr.length-1; i>index; i--){
			tempArr[i] = tempArr[i-1];
		}
		tempArr[index] = card;
		
		setDeck(tempArr);
	}
	
	public void giveCard(int amount){
		Card[] tempArr = new Card[cards.length-amount];
		System.arraycopy(cards, 0, tempArr, 0, cards.length-amount);
		
		setDeck(tempArr);
	}
	
	public void sort(){
		Arrays.sort(cards);
		setDeck(cards);
	}

}
