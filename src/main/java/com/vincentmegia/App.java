package com.vincentmegia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //System.out.println( "Hello World!" );
        var combinationProcessor = new CombinationProcessor();
        combinationProcessor.process("banana");
        var maxText =combinationProcessor.getMaxText();
        System.out.println(maxText);
    }
}
