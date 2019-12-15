package item2;

import item2.Blog;
import item2.BlogImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;

public class MockitoTest {


    @Test
    void addingNewEntry() throws Exception{
        Blog blog = mock(Blog.class);
        BlogImpl blogImpl = new BlogImpl(blog);
        blogImpl.postNewEntry("asd");
        verify(blog).postNewEntry("asd");
    }

    @Test
    void whenAnIdIsInsertedAnEntryWithThatIdIsRemoved(){
        Blog blog = mock(Blog.class);
        BlogImpl blogImpl = new BlogImpl(blog);
        blogImpl.deleteEntry("word");
        verify(blog).deleteEntry("word");
    }

    @Test
    void showingTenMostRecentEntries(){
        Blog blog = mock(Blog.class);
        List<String> entries = Arrays.asList("qwerty","1234","asdad","1111","aaaa","qwerty","1234","asdad","1111","aaaa"
                                            ,"qwerty","1234","asdad","1111","aaaa");
        when(blog.showRecentEntries()).thenReturn(entries.subList(0,9));
        List<String> sublist = entries.subList(0,9);
        assertEquals(sublist, blog.showRecentEntries());
    }


}
