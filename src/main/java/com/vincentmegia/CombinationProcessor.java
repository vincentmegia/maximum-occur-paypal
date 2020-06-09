package com.vincentmegia;

public class CombinationProcessor {
    private String maxText = "";
    public String getMaxText() {
        return this.maxText;
    }

    /**
     *
     * @param text1
     */
    public void process(String text1) {
        if (text1.length() <= 0) return;
        if (text1.compareTo(maxText) > 1)
            maxText = text1;
        process(text1.substring(1));
    }
}
