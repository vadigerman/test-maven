package lv.ctco.javaschool.anagrams;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void anagramsCountFor3() {
        String str = "abc"; // Testing data
        int number = Main.numbRec(str.length()); // Testable code
        assertEquals(6, number);
    }

    @Test
    void anagramsCountFor4() {
        String str = "abcd"; // Testing data
        int number = Main.numbRec(str.length()); // Testable code
        assertEquals(24, number);
    }
}
