package item2;

import java.util.ArrayList;
import java.util.List;

public class BlogImpl implements Blog {
    private Blog blog;
    private List<String> entries = new ArrayList<String>();

    public BlogImpl(Blog blog){
        this.blog = blog;
    }

    public void postNewEntry(String entry){
        blog.postNewEntry(entry);
    }

    @Override
    public void deleteEntry(String entry) {
        blog.deleteEntry(entry);
    }

    @Override
    public List<String> showRecentEntries() {
        return entries.subList(0,9);
    }

}
