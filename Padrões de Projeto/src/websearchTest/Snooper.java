package websearchTest;

/**
 * Watches the search queries
 */
public class Snooper implements QueryObserver{

	@Override
    public void update(String query) {
        if (query.toLowerCase().contains("friend")) {
            System.out.println("Oh Yes! " + query);
        }
        if (query.length() > 60) {
            System.out.println("So long.... " + query);
        }
    }
	
}
