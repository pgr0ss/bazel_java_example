package persistence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    @Test
    public void testSetAndGet() {
        Repository repository = new Repository();
        repository.set("foo", "bar");
        assertEquals("bar", repository.get("foo"));
    }
}
