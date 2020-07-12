package com.vincentmegia;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        var app = new App();
        var result = app.process("banana");
        assertTrue( true );
    }
}
