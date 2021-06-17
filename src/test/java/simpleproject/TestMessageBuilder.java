package simpleproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld() {
        Assertions.assertEquals("hello world", "hello world");
    }

    @Test
    public void testNumber10() {
        Assertions.assertEquals(10, 11);
    }

}