package item2;

import java.util.List;

public interface Blog {

    void postNewEntry(String entry);
    List<String> showRecentEntries();
    void deleteEntry(String entry);


}
