import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW9 {

    public static String OddEven(long num){
        String res = "";

        if (num < -Integer.MAX_VALUE || num > Integer.MAX_VALUE){
            res = "Undefined";
        }
        else {
            if (num % 2 == 0){
                res = "Even";
            }
            else res = "Odd";
        }
        return res;
    }

    public static int [] OddIndices(int [] arr) {
        int[] res = new int[arr.length / 2];
        int i;
        int j = 0;
        for ( i = 0; i < arr.length;) {

                if (i % 2 != 0){
                    res[j] = arr[i];
                    i++;
                    j++;
                }
                else {
                    i++;
                }
            }
        return res;
    }

    public static long SumArray(int [] arr){
        long sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static long BiggerValue(int x, int y){
        long res;

        if (x >= y){
            res = x;
        }
        else {
            res = y;
        }
        return res;
    }

    public static boolean IsPositiveNumber(int num){
        boolean r;
        if (num >= 0){
            r = true;
        }
        else r = false;
        return r;
    }

    public static long AreNumberEqual(int x, int y){
        long r = 0;
        if (x == y){
            r = 0;
        }
        if (x < y){
            r = -1;
        }
        if ( x > y) {
            r = 1;
        }
        return r;
    }

    public static String CheckRemainder(int m){
        String r = "";
        if ( m % 3 == 0 && m % 5 == 0) {
            r = "Good number";
        }

        if (m % 3 == 0 && m % 5 != 0){
            r = "Bad number";
        }
        if (m % 3 != 0 && m % 5 == 0){
            r = "Poor number";
        }
        if (m % 3 != 0 && m % 5 != 0){
            r = "-1";
        }
        return r;
    }

    public static int [] MinMaxAve(int [] arr, int a, int b){ // check arr length for a and b
        int [] res = new int[3];
        int upperBound;
        int lowerBound;

        if (a > b){
            upperBound = a;
            lowerBound = b;
        }
        else {
            upperBound = b;
            lowerBound = a;
        }

        int min = arr[lowerBound];
        int max = arr[lowerBound];
        int avg = 0;
        for (int i = lowerBound; i <= upperBound; i++){
            avg = avg + arr[i];
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        avg = avg / (upperBound - lowerBound + 1);

        res[0] = min;
        res[1] = max;
        res[2] = avg;
        return res;
    }

    public static int [] intersection(int [] arr1, int [] arr2){
        List <Integer> r = new ArrayList<>();

        int i;
        int j;

        for (i = 0; i < arr1.length; i++){
            for (j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    r.add(arr1[i]);
                }
            }
        }
        return Common.ListToArray(r);
    }

    public static List <Integer> PeakElement(int [] arr){
        List <Integer> peakList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if (i == 0){
                if (arr[i] > arr[i+1]){
                    peakList.add(arr[i]);
                }
            }
            if (i == (arr.length - 1)){
                if (arr[arr.length - 1] > arr[arr.length - 2]){
                    peakList.add(arr[arr.length - 1]);
                }
            }
            if (i > 0 && i < arr.length-1){
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                    peakList.add(arr[i]);
                }
            }
        }
        return peakList;
    }

    public static int [] ReverseArray(int [] arr){
        int [] result = new int[arr.length];
        int i;
        int j = arr.length - 1;

        for ( i = 0; i <arr.length; ){
            result[i] = arr[j];
            i++;
            j--;
        }
     return result;
    }

    public static int [] SortArray(int [] arr){ // EPAM сортировка пузырьком
        Arrays.sort(arr);
        return arr;
        /*
        public static String sortArray(int[] arr) {
        boolean b = false;
        int j;
        while (b != true) {
            b = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    b = false;
                    j = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = j;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
         */
    }

    public static long KthLargest(int [] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static int [] NegativeOnTheRight(int [] arr){
        List <Integer> positive = new ArrayList<>();
        List <Integer> negative = new ArrayList<>();
        int [] res = new int[arr.length];


        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                positive.add(arr[i]);
            }
            else {
                negative.add(arr[i]);
            }
        }

        /*
     /*
     public static String negativeRight(int[] arr) {
        int[] newArray = new int[arr.length];

        int index1 = 0;
        int index2 = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= 0) {
                newArray[index2] = arr[i];
                index2--;
            }

            if (arr[arr.length - i - 1] > 0) {
                newArray[index1] = arr[arr.length - i - 1];
                index1++;
            }
        }
        return Arrays.toString(newArray);
    }
}
         */


        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (i < positive.size()){
                res[i] = positive.get(i);
            }
            else {
                res[i] = negative.get(j);
                j++;
            }
        }
        return res;
    }


    public static int [][] SumOfTwo(int [] arr, int sum){
        List <Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] + arr[j] == sum){
                   res.add(arr[i]);
                   res.add(arr[j]);
                   break;
                }
            }
        }

        int [][] finalArr = new int [res.size()/2][2];
        int j = 0;
        for (int i = 0; i < finalArr.length; i++){
            finalArr[i][0] = res.get(j);
            finalArr [i][1] = res.get(j + 1);
            j += 2;
        }
        return finalArr;
    }

    public static int [][] NumberOfOccurences(int [] arr){
        List <Integer> list = new ArrayList<>();
        int counterN = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    counterN++;
                }
            }
            if (counterN != 0){
                i = i + counterN ;
                list.add(arr[i]);
                list.add(counterN + 1);
            }
            counterN = 0;
        }

        int [][] finalArr = new int [list.size()/2][2];
        int j = 0;
        for (int i = 0; i < finalArr.length; i++){
            finalArr[i][0] = list.get(j);
            finalArr [i][1] = list.get(j + 1);
            j += 2;
        }
        return finalArr;
    }







}
