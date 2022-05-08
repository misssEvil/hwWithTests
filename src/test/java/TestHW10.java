import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHW10 {

    @Test
    public void deleteWhiteSpaces(){
        Assertions.assertEquals("Whitespaces were trimmed", HW10.deleteWhiteSpaces(" QAforEveryone"));
        Assertions.assertEquals("There were no whitespaces", HW10.deleteWhiteSpaces("QA4Everyone"));
    }

    @Test
    public void removeAllA(){
        Assertions.assertEquals("QA4Everyone", HW10.removeAllA("QA4Everyone"));
        Assertions.assertEquals("pnd", HW10.removeAllA("panda"));
        Assertions.assertEquals("String is empty!", HW10.removeAllA(""));
    }

    @Test
    public void removeAllZeros(){
        Assertions.assertEquals("35429764", HW10.removeAllZeros(" 3 5 0 4 2 0 9 7 0 6 0 4 0 0 0 0"));
        Assertions.assertEquals("111", HW10.removeAllZeros("0000000111"));
        Assertions.assertEquals("String is empty!", HW10.removeAllZeros(""));
    }

    @Test
    public void removeAllSpaces(){
        Assertions.assertEquals("QA4Everyone", HW10.removeAllSpaces(" QA 4 Everyone "));
        Assertions.assertEquals("panda", HW10.removeAllZeros("p a n d a "));
        Assertions.assertEquals("String is empty!", HW10.removeAllSpaces(""));
    }

    @Test
    public void containsLetterA(){
        Assertions.assertEquals("5", HW10.containsLetterA("Abracadabra"));
        Assertions.assertEquals("0", HW10.containsLetterA("Homenum Revelio"));
    }

    @Test
    public void containsWord(){
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy" +
                " version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";

        String str2 =
                        "As a decrepit father takes delight" +
                        " To see his active child do deeds of youth, " +
                        "So I, made lame by fortune’s dearest spite, " +
                        "Take all my comfort of thy worth and truth." +
                        "For whether beauty, birth, or wealth, or wit, " +
                        "Or any of these all, or all, or more," +
                        " Entitled in thy parts do crownèd sit, " +
                        "I make my love engrafted to this store. " +
                        "So then I am not lame, poor, nor despised, " +
                        "Whilst that this shadow doth such substance give " +
                        "That I in thy abundance am sufficed, " +
                        "And by a part of all thy glory live. " +
                        "Look what is best, that best I wish in thee. " +
                        "This wish I have; then ten times happy me.";

        Assertions.assertTrue(HW10.containsWord(str, "Java"));
        Assertions.assertTrue(HW10.containsWord(str, "vendors"));
        Assertions.assertFalse(HW10.containsWord(str, "Harry"));

        Assertions.assertFalse(HW10.containsWord(str2, "Java"));
        Assertions.assertTrue(HW10.containsWord(str2, "thee"));
        Assertions.assertTrue(HW10.containsWord(str2, "engrafted"));
    }

    @Test
    public void addQuoteMarksAndPeriod(){
        Assertions.assertEquals( "\"\"One.\"\"", HW10.addQuoteMarksAndPeriod("One"));
        Assertions.assertEquals( "\"\"TWO.\"\"", HW10.addQuoteMarksAndPeriod("TWO"));
    }


}
