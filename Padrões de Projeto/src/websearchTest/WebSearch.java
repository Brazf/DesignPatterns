package websearchTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a  file), notify the interested observers of each query.
 */
public class WebSearch {
	private List<QueryFilter> filters = new ArrayList<>();
    private List<QueryObserver> observers = new ArrayList<>();

    public void registerObserver(QueryObserver observer, QueryFilter filter) {
        observers.add(observer);
        filters.add(filter);
    }

    public void search(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String query;
            while ((query = reader.readLine()) != null) {
                boolean notifyObserver = false;
                for (QueryFilter filter : filters) {
                    if (filter.filter(query)) {
                        notifyObserver = true;
                        break;
                    }
                }
                if (notifyObserver) {
                    for (QueryObserver observer : observers) {
                        observer.update(query);
                    }
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
