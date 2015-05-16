package app;

import org.junit.Test;
import persistence.Repository;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAppDefault() {
        App app = new App();
        assertEquals("go go go", app.go());
    }

    @Test
    public void testAppWithSpecificMessage() {
        Repository repository = new Repository();
        repository.set("message", "stop stop stop");
        App app = new App(repository);
        assertEquals("stop stop stop", app.go());
    }
}
