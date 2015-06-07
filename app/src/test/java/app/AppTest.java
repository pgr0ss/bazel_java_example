package app;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import com.google.common.io.Resources;

import org.junit.Test;

import persistence.Repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

    @Test
    public void canReadResource() throws URISyntaxException {
        //URL url = Resources.getResource("foo.txt");
        URL url = Resources.getResource("src/test/resources/foo.txt");
        String path = new File(url.toURI()).getAbsolutePath();
        assertNotNull(path);
    }
}
