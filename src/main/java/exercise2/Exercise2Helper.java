package exercise2;

import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
public class Exercise2Helper {

    public static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'y');


    public int countVowels(String name) {
        name = name.toLowerCase();
        int vowelsCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (VOWELS.contains(c)) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public boolean hasTwoConsecutiveLetters(String name) {
        name = name.toLowerCase();
        char lastChar = name.charAt(0);
        for (int i = 1; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (currentChar == lastChar) {
                return true;
            }
            lastChar = currentChar;
        }
        return false;
    }

}
