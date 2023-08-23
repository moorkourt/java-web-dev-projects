package org.launchcode;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String testChar = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> finalCounts = new HashMap<>();

        char[] charactersInString = testChar.toCharArray();
        for (int i = 0; i < charactersInString.length; i++) {
            if (finalCounts.containsKey(charactersInString[i])) {
                finalCounts.put(charactersInString[i], finalCounts.get(charactersInString[i]) + 1);
            } else {
                finalCounts.put(charactersInString[i], 1);
            }

        }
        for (Map.Entry entry: finalCounts.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
