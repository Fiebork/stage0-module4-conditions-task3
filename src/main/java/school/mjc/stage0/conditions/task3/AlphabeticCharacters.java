package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            if (character == 'e' || character == 'y' || character == 'u' || character == 'i' || character == 'o' || character == 'a' ||
                    character == 'E' || character == 'Y' || character == 'U' || character == 'I' || character == 'O' || character == 'A') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
