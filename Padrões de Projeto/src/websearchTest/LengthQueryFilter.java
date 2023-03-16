package websearchTest;

public class LengthQueryFilter implements QueryFilter {

	public boolean filter(String query) {
        return query.length() > 60;
    }
	
}
