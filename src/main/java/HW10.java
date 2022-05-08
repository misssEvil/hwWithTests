import java.util.List;

public class HW10 {

    public static String deleteWhiteSpaces(String str) {
        int strLength = str.length();

        if (str.isEmpty()) {
            str = "String is empty";
        } else {
            str = str.trim();

            if (strLength == str.length()) {
                str = "There were no whitespaces";
            } else {
                str = "Whitespaces were trimmed";
            }
        }
        return str;
    }

    public static String removeAllA(String str) {
        String res;
        if (str.isEmpty()) {
            res = "String is empty!";
        } else {
            res = str.replaceAll("a", "");
        }
        return res;
    }

    public static String removeAllZeros(String str) {
        String res;

        if (str.isEmpty()) {
            res = "String is empty!";
        } else {
            res = str.replaceAll(" ", "").replaceAll("0", "");
        }
        return res;
    }

    public static String removeAllSpaces(String str) {
        String res;

        if (str.isEmpty()) {
            res = "String is empty!";
        } else {
            res = str.replaceAll(" ", "");
        }
        return res;
    }

    public static String containsLetterA(String str) {
        int counter = 0;

        if (str.isEmpty()) {
            return "String is empty!";
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'A' || str.charAt(i) == 'a') {
                    counter++;
                }
            }

        }
        return String.valueOf(counter);
    }

    public static boolean containsWord(String str, String word){
        if (str.contains(word) == true){
            return true;
        }
        else {
            return false;
        }
    }

    public static String addQuoteMarksAndPeriod(String str)
    {
       return  "\"\"".concat(str).concat(".").concat("\"\"");
    }
}
