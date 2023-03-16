package websearchTest;

public class FriendQueryFilter implements QueryFilter{

	public boolean filter(String query) {
        return query.toLowerCase().contains("friend");
    }
	
}
