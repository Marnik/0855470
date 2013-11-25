import java.util.Arrays;

public class Card implements Comparable<Card> {

	String worth;
	String type;
	String worthIndex[] = new String[] { "2", "3", "4", "5", "6", "7", "8",
			"9", "10", "Boer", "Vrouw", "Heer", "Aas" };
	String typeIndex[] = new String[] { "Schoppen", "Klaver", "Ruiten", "Harten" };
	String outcome;

	public Card(String type, String worth) {
		this.worth = worth;
		this.type = type;
	}

	public String getType() {
		return type;

	}

	public String getWorth() {
		return worth;

	}

	public String compareToOther(Card card) {
		int thisCardIndex = Arrays.asList(worthIndex).indexOf(getWorth());
		int compareToCardIndex = Arrays.asList(worthIndex).indexOf(
				card.getWorth());

		if (thisCardIndex > compareToCardIndex) {
			outcome = getType() + " " + getWorth() + " is meer waard als "
					+ card.getType() + " " + card.getWorth();
		} else if (thisCardIndex == compareToCardIndex) {
			outcome = getType() + " " + getWorth() + " is even veel waard als "
					+ card.getType() + " " + card.getWorth();
		} else {
			outcome = getType() + " " + getWorth() + " is minder waard als "
					+ card.getType() + " " + card.getWorth();
		}

		return outcome;
	}

	@Override
	public int compareTo(Card crd) {
		int returnValue = 0;
		int thisTypeIndex = Arrays.asList(typeIndex).indexOf(getType());
		int crdTypeIndex = Arrays.asList(typeIndex).indexOf(crd.getType());
		
		if(thisTypeIndex < crdTypeIndex){
			returnValue = -1;
		}
		else if(thisTypeIndex > crdTypeIndex){
			returnValue = +1;
		}
		else{
			int thisWorthIndex = Arrays.asList(worthIndex).indexOf(getWorth());
			int crdWorthIndex = Arrays.asList(worthIndex).indexOf(crd.getWorth());
			
			if(thisWorthIndex < crdWorthIndex){
				returnValue = -1;
			}
			else if(thisWorthIndex == crdWorthIndex){
				returnValue = 0;
			}
			else if(thisWorthIndex > crdWorthIndex){
				returnValue = +1;
			}
		}
		return returnValue;
	}

}
