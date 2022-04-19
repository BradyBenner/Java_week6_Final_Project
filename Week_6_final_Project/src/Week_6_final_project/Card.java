package Week_6_final_project;

public class Card {
	//value is 2-ace.  2-10, 11=Jack, 12= queen, 13 = king, 14 = ace
	//this class merely holds, gets, and sets the values for value and name for a single card 
	//and has a method to print out its description.
	//a.	Card
//		i.	Fields
//			1.	value (contains a value from 2-14 representing cards 2-Ace)
//			2.	name (e.g. Ace of Diamonds, or Two of Hearts)
//		ii.	Methods
//			1.	Getters and Setters
//			2.	describe (prints out information about a card)

	private Integer value;
	private String name;
	public String getName() {
		return name;
	}
	public Integer getValue() {
		return value;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public Card(String name, int value) {
		//constructor with name and value
		
		this.name = name;
		this.value= value;
	}
	
	public void describe() {
		System.out.println("Card Name: "+this.name+" value= "+ this.value);
	}
	
	public Card() {
		//constructor if not passed name and value
		
	}

}
