package Ass7;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Ques6 {
    public static void main(String[] args) {
        String str="RathinBhai";
        HashMap<Character,Integer> mp=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch:mp.keySet()){
            System.out.println(ch+" "+mp.get(ch));
        }

                // Remove duplicate characters
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        // Construct string without duplicates
        StringBuilder noDuplicateString = new StringBuilder();
        for (char c : uniqueChars) {
            noDuplicateString.append(c);
        }

        // Print the string without duplicates
        System.out.println("String without duplicate characters: " + noDuplicateString.toString());




    }
}
