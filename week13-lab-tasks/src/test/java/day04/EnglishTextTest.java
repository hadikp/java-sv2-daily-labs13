package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnglishTextTest {

    @Test
    void testCharAt() {
        EnglishText englishText = new EnglishText();
        englishText.makeMapFromText("font");
    }

}