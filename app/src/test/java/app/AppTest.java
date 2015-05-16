package app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        App app = new App();
        assertEquals("go go go", app.go());
    }
}
