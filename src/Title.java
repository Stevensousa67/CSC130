import java.util.*;

public class Title{
	// Exercise 11.2
	private char letter;
	private int value;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create scanner object
		System.out.println("Type a letter for the title: ");
		char letter = input.next().charAt(0);	// Get first char from string
		System.out.println("Type a value for the title: ");
		int value = input.nextInt();	// Get value from keyboard
		Title title = new Title(letter, value);	// create title object using char and int from keyboard
		printTitle(title);
		System.out.println(title);
		System.out.println("Char: " + title.getChar());
		System.out.println("Value: " + title.getValue());
	}
	public Title(char letter, int value){
		this.letter = letter;
		this.value = value;
	}
	public static void printTitle(Title title){
		System.out.printf("Title letter: %c Value: %d\n", title.letter, title.value);
	}
	public String toString(){
		return String.format("Title letter: %c has Value: %d\n", this.letter, this.value);
	}
	public boolean equals(Title that){
		return this.letter == that.letter && this.value == that.value;
	}
	public char getChar(){
		return this.letter;
	}
	public int getValue(){
		return this.value;
	}
	public void setLetter(char letter){
		this.letter = letter;
	}
	public void setValue(int value){
		this.value = value;
	}
}