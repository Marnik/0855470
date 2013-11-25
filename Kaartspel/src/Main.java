public class Main {

	public static void main(String[] args){
		Deck d = new Deck();
		Card c = new Card("Ruiten", "Aas");
		Card c2 = new Card("Ruiten", "5");
		
		
		//Print deck test
		d.printDeck();
		System.out.println("\n");
		
		//Shuffle test
		d.shuffleDeck();
		d.printDeck();
		System.out.println("\n");
		
		//Compare test
		String test = c.compareToOther(c2);
		System.out.println(test);
		System.out.println("\n");
		
		//Insert at test
		d.insertAt(c2, 2);
		d.printDeck();
		System.out.println("\n");
		
		//Givecard test
		d.giveCard(2);
		d.printDeck();
		System.out.println("\n");
		
		//Sort test
		d.sort();
		d.printDeck();
	}
	
}
