import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHW10 {

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

    @Test
    public void formatCityName(){
        Assertions.assertEquals("Tashkent", HW10.formatCityName("tashkent"));
        Assertions.assertEquals("Chicago", HW10.formatCityName("ChicaGO"));
    }

    @Test
    public void substringParams(){
        Assertions.assertEquals("bracadab", HW10.substringParams("Abracadabra", "b"));
        Assertions.assertEquals("ppersnapp", HW10.substringParams("Whippersnapper", "p"));
    }

    @Test
    public void firstLastLetterEquals(){
        Assertions.assertTrue( HW10.firstLastLetterEqual("Abracadabra"));
        Assertions.assertFalse(HW10.firstLastLetterEqual("Whippersnapper"));
    }

    @Test
    public void strToArr(){
        String  [] s1 = new String[] {"Name: Alexandr", "Father name: Sergeevich", "Surname: Pushkin"};
        Assertions.assertArrayEquals(s1,HW10.strToArr("Alexandr Sergeevich Pushkin"));
    }

    @Test
    public void SumANSII(){
        Assertions.assertEquals(294, HW10.SumANSII("abc"));
        Assertions.assertEquals(198, HW10.SumANSII("ABC"));
        Assertions.assertEquals(0, HW10.SumANSII("123"));
    }

    @Test
    public void compareLettersValues(){
        Assertions.assertTrue(HW10.compareLettersValue('a', 'm'));
        Assertions.assertFalse(HW10.compareLettersValue('m', 'l'));
    }

    @Test
    public void stringToNumbers(){
        Assertions.assertArrayEquals(new int[] {1, 2, 3, 4, 5}, HW10.stringToNumbers("1, 2, 3, 4, 5"));
        Assertions.assertArrayEquals(new int[] {2, 2, 2, 0, 0}, HW10.stringToNumbers("222yu00"));
    }

    @Test
    public void formatting(){
        Assertions.assertEquals("panda", HW10.stringToLetters("p2and7a"));
        Assertions.assertEquals("Love on tour", HW10.stringToLettersAndSpaces("Love on tour-2018"));
        Assertions.assertEquals("8 955 4", HW10.stringToNumbersAndSpaces("8 9tg55dr 4fgfr"));
    }

    @Test
    public void wordCount(){

        Assertions.assertEquals(5, HW10.countWords(str, "Java"));
        Assertions.assertEquals(2, HW10.countWords(str, "version"));
    }

    @Test
    public void startsWithLetter(){
        Assertions.assertEquals("lame, love, lame, live, Look", HW10.startsWithLetter(str2, 'l'));
        Assertions.assertEquals("decrepit, delight, do, deeds, dearest, do, despised, doth", HW10.startsWithLetter(str2, 'd'));
    }

    @Test
    public void reverseString(){
        Assertions.assertEquals("arbadacarbA", HW10.reverseString("Abracadabra"));
        Assertions.assertEquals("eugoV", HW10.reverseString("Vogue"));
    }

    @Test
    public void stringIntersection(){
        Assertions.assertEquals("car2", HW10.stringIntersection("Car2rot", "car2s"));
        Assertions.assertEquals("car", HW10.stringIntersection("cars", "Carrot"));
        Assertions.assertEquals("tie", HW10.stringIntersection("blacktiee","tied"));
        Assertions.assertEquals("tie", HW10.stringIntersection("tied", "blacktiee"));
        Assertions.assertEquals("oo", HW10.stringIntersection("Schmoooze", "Noob"));
        Assertions.assertEquals("oo", HW10.stringIntersection("Noob", "Schmoooze"));
        Assertions.assertEquals("aaa", HW10.stringIntersection("uyaaaaa", "raaat"));
        Assertions.assertEquals("11", HW10.stringIntersection("12112", "12211405"));
    }

    @Test
    public void longestCommonSubstring(){


        Assertions.assertEquals("maz", HW10.longestCommonSubstring("Smaze", "amazing", "amazon"));
        Assertions.assertEquals("stone", HW10.longestCommonSubstring("12rollingstone", "yop12pstone", "we12arestones"));
    }








}
