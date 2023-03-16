package websearchTest;

import java.io.File;

/**
 * Launch the web-search example
 */
public class Main {

	 public static void main(String[] args) {
	        WebSearch webSearch = new WebSearch();
	        webSearch.registerObserver(new Snooper(), new FriendQueryFilter());
	        webSearch.registerObserver(new Snooper(), new LengthQueryFilter());
	        webSearch.search("queries.txt");
	    }
	 
}
