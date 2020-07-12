package com.vincentmegia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    }

    public String process(String text) {
        var combinationProcessor = new CombinationProcessor();
        combinationProcessor.process(text);
        var maxText =combinationProcessor.getMaxText();
        return maxText;
    }
}
