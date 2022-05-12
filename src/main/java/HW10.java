import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

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
        return str.contains(word) == true;
    }

    public static String addQuoteMarksAndPeriod(String str)
    {
       return  "\"\"".concat(str).concat(".").concat("\"\"");
    }

    public static String formatCityName(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1, str.length()).toLowerCase();
    }

    public static String substringParams(String str, String param){
        return str.substring(str.indexOf(param), str.lastIndexOf(param) + 1 );
    }

    public static boolean firstLastLetterEqual(String str){
        str = str.toLowerCase();
        return str.charAt(0) == str.charAt(str.length() - 1);
    }

    public static String [] strToArr(String s){
       String [] sArr;
       sArr = s.split(" ");

       sArr[0] = "Name: " + sArr[0];
       sArr[1] = "Father name: " + sArr[1];
       sArr[2] = "Surname: " + sArr[2];

       return sArr;
    }

    public static int SumANSII(String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i)) ){   // (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                sum = sum + str.charAt(i);
            }
            else {
                return sum;
            }
        }
        return sum;
    }

    public static boolean compareLettersValue(char ch1, char ch2){
        return ch1 < ch2;
    }

    public static int [] stringToNumbers(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                count++;
            }
        }

        int [] res = new int[count];
        int j = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                res[j] = Integer.parseInt(str.substring(i, i+1));
                j++;
            }
        }
        return res;
    }

    public static String stringToLetters(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i))){
                result += str.substring(i, i + 1);
            }
        }
        return result;
    }

    public static String stringToLettersAndSpaces(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' '){
                result += str.substring(i, i + 1);
            }
        }
        return result;
    }

    public static String stringToNumbersAndSpaces(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i)) || str.charAt(i) == ' '){
                result += str.substring(i, i + 1);
            }
        }
        return result;
    }

    public static int countWords(String str, String word){
        String [] sArr;
        sArr = str.split(" ");
        int count = 1;

        for (String s : sArr) {
            if (s.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static String startsWithLetter(String str, char letter){
        String [] sArr;
        sArr = str.split(" ");
        String result = "";

        for (int i = 0; i < sArr.length; i++){
            if (sArr[i].charAt(0) == letter || sArr[i].charAt(0) == letter - 32){
                sArr[i] = sArr[i].replace(",","").replace(".", "");
                result =result + sArr[i] + ", ";
            }
        }
        return result.substring(0, result.length()-2);
    }

    public static String reverseString(String str){
        String r = "";
        /*int j = str.length() -1 ;

        char [] arr = new char[str.length()];
        for (int i = 0; i < arr.length;i++){
            arr[j] = str.charAt(i);
            j--;
        }

        for (int i = 0; i < arr.length;i++){
            r += String.valueOf(arr[i]);
        }*/

        for (int j = (str.length() - 1); j >=0; j--){
            r = r + str.charAt(j);
        }
        return r;
    }

    public static String removeAllDuplicates(String str){
        String res = "";
        str = str.toLowerCase();
        if (!str.isEmpty()){
            for (int i = 0; i < str.length(); i++){
                if (str.contains(String.valueOf(str.charAt(i)))){
                    res = res.concat(String.valueOf(str.charAt(i)));
                    str = str.replaceAll(String.valueOf(str.charAt(i)), "");
                }
            }
        }
        else {
            res = "String is empty";
        }
        return res;
    }

    public static String stringIntersection(String str1, String str2){
        String intersection = "";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int n = 0;
        if (str1.length() > str2.length()){
            for (int i = 0; i < str1.length(); i++){
                for (int j = n; j < str2.length(); j++){
                    if (str2.charAt(j) == str1.charAt(i)){
                        intersection = intersection + str2.charAt(j);
                        n = j+1;
                    }
                }
            }

        }
        else {
            for (int i = 0; i < str2.length(); i++){
            for (int j = n; j <str1.length(); j++){
                if (str2.charAt(i) == str1.charAt(j)){
                    intersection = intersection + str1.charAt(j);
                    n = j+1;
                }
            }
        }
        }
        return intersection;
    }

    public static String longestCommonSubstring(String str1, String str2, String str3){
        String substring = "";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str3 = str2.toLowerCase();




        return substring;
    }


}
