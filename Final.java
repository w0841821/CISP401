// Erroll Abrahamian

package Main;

import java.util.Scanner;

public class Final{
	public static String state = "MAIN";
	
	public static void main(String[] args) {
		// Start the program by displaying the title of your program (you come up with a name)
		pn("Welcome to the Java Movie Database,");
		pn("...or JMDB for short!");
		
		Scanner in = new Scanner(System.in);
		String input = "";
		
		while(!input.toLowerCase().contentEquals("quit")) {
			pn("");
			// Have a primary prompt that allows you to enter commands
			input = JMDBCommand(in);
			JMDBAction(input);
		}
		
		in.close();
		pn("");
		pn("Hope you found information on the droids you were looking for!");
	}
	
	public static String JMDBCommand(Scanner in) {
		switch(state) {
		case "MAIN":
			p("Enter command: ");
			return in.nextLine();
		
			
		/*
		case "X":
			p("X: ");
			return in.nextLine();
		*/
		}
		
		return "";
	}
	
	private static void JMDBAction(String input) {
		switch(state) {
		case "MAIN":
			switch(input.toLowerCase()) {
			case "new entry":
				state = "NEW ENTRY";
				pn("Going to add new entry...");
				break;
				
			case "search by actor":
				state = "SEARCH ACTOR";
				pn("Going to search by actor...");
				break;
				
			case "search by year":
				state = "SEARCH YEAR";
				pn("Going to search by year...");
				break;
				
			case "search by runtime":
				state = "SEARCH RUNTIME";
				pn("Going to search by runtime...");
				break;
				
			case "search by director":
				state = "SEARCH DIRECTOR";
				pn("Going to search by director...");
				break;
				
			case "search by title":
				state = "SEARCH TITLE";
				pn("Going to search by title...");
				break;
				
			case "quit":
				break;
				
			default:
				pn("Not a valid command. Try again.");
				
			/*
			case "X":
				state = "X";
				pn("Going to X...");
				break;
			*/
			}
			return;
			
		case "NEW ENTRY":
			newEntry();
			state = "MAIN";
			return;

		case "SEARCH ACTOR":
			searchActor();
			state = "MAIN";
			return;
			
		case "SEARCH YEAR":
			searchYear();
			state = "MAIN";
			return;
			
		case "SEARCH RUNTIME":
			searchRuntime();
			state = "MAIN";
			return;
			
		case "SEARCH DIRECTOR":
			searchDirector();
			state = "MAIN";
			return;
			
		case "SEARCH TITLE":
			searchTitle();
			state = "MAIN";
			return;
		}
	}
	
	public static void newEntry() {
		pn("Add a new entry here.");
	}
	
	public static void searchActor() {
		pn("Search for an actor here.");
	}
	
	public static void searchYear() {
		pn("Search for a year here.");
	}
	
	public static void searchRuntime() {
		pn("Search for a runtime here.");
	}
	
	public static void searchDirector() {
		pn("Search for a director here.");
	}
	
	public static void searchTitle() {
		pn("Search for a title here.");
	}
	
	public static <E> void pn(String s) {
		System.out.println(s);
	}
	
	public static <E> void p(String s) {
		System.out.print(s);
	}
}