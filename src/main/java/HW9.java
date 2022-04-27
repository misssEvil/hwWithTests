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
        if (x > y){
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

    public static int [] MinMaxAve(int [] arr, int a, int b){
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

        int avg = 0;
        for (int i = lowerBound; i <= upperBound; i++){
            avg = avg + arr[i];
        }
        avg = avg / (upperBound - lowerBound + 1);

        res[0] = arr[lowerBound];
        res[1] = arr[upperBound];
        res[2] = avg;
        return res;
    }


}
