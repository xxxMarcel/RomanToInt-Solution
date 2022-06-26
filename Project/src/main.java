package org.example;
import java.util.Map;
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        System.out.println(Main.romanToInt("I"));
    }
    public static int romanToInt(String s) {
        Map<String, Integer> roman_values = new HashMap<String, Integer>();
        roman_values.put("I", 1);
        roman_values.put("V", 5);
        roman_values.put("X", 10);
        roman_values.put("L", 50);
        roman_values.put("C", 100);
        roman_values.put("D", 500);
        roman_values.put("M", 1000);
        int roman = roman_values.get(String.format("%s",s.charAt(s.length() - 1)));
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 1; j < s.length() - 2; j++) {
                if (roman_values.get(String.format("%s",s.charAt(i))) > roman_values.get(String.format("%s",s.charAt(j)))) {
                    roman += roman_values.get(String.format("%s",s.charAt(i)));
                } else {
                    roman -= roman_values.get(String.format("%s",s.charAt(i)));
                }
            }
        }
        return roman;
    }
}
