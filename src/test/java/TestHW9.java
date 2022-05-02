
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestHW9 {

    @Test
    public void OddEven(){
        Assertions.assertEquals("Odd", HW9.OddEven(-345));
        Assertions.assertEquals("Even", HW9.OddEven(0));
        Assertions.assertEquals("Undefined", HW9.OddEven(2147483647 + 1));
    }

    @Test
    public void OddIndices(){
        Assertions.assertArrayEquals(new int[] {590, 985, 68}, HW9.OddIndices(new int[] {-45, 590, 234, 985, 12, 68}));
    }

    @Test
    public void SumArray(){
        Assertions.assertEquals(15, HW9.SumArray(new int[]{0, 1, 2, 3, 4, 5}));
        Assertions.assertEquals(-10, HW9.SumArray(new int[]{-7, -3}));
    }

    @Test
    public void BiggerValue(){
        Assertions.assertEquals(9999, HW9.BiggerValue(3333, 9999));
        Assertions.assertEquals(345, HW9.BiggerValue(345, 345));
        Assertions.assertEquals(2201, HW9.BiggerValue(2201, 789));

    }

    @Test
    public void IsPositiveNumber(){
        Assertions.assertTrue(HW9.IsPositiveNumber(555));
        Assertions.assertTrue(HW9.IsPositiveNumber(0));
        Assertions.assertFalse(HW9.IsPositiveNumber(-555));

    }

    @Test
    public void AreNumbersEqual(){
        Assertions.assertEquals(0, HW9.AreNumberEqual(89, 89));
        Assertions.assertEquals(-1, HW9.AreNumberEqual(-89, 89));
        Assertions.assertEquals(1, HW9.AreNumberEqual(89, -89));
    }

    @Test
    public void CheckRemainder(){
        Assertions.assertEquals("Bad number", HW9.CheckRemainder(9));
        Assertions.assertEquals("Good number", HW9.CheckRemainder(15));
        Assertions.assertEquals("Poor number", HW9.CheckRemainder(10));
    }

    @Test
    public void MinMaxAve(){
        Assertions.assertArrayEquals(new int[] {3, 7, 5}, HW9.MinMaxAve(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 2, 6));
        Assertions.assertArrayEquals(new int[] {0, 5, 3}, HW9.MinMaxAve(new int[] {5, 4, 0, 8, 1}, 0, 2));
    }

    @Test
    public void Intersection(){

    }

    @Test
    public void PeakElement(){
        List <Integer> list = Arrays.asList(3, 7, 23);
        Assertions.assertEquals(list, HW9.PeakElement(new int[] {3, 2, 7, 5, 1, 9, 23, 1}));
        List <Integer> list2 = Arrays.asList(11, 8, 23);
        Assertions.assertEquals(list2, HW9.PeakElement(new int[] {11, 5, 8, 0, 1, 23, 4}));
        List <Integer> list3 = Arrays.asList(11, 25, 14);
        Assertions.assertEquals(list3, HW9.PeakElement(new int[] {-4, 11, 0, 25, 8, 1, 14}));
    }

    @Test
    public void ReverseArray(){
        Assertions.assertArrayEquals(new int[] {10, 3, 7, 2}, HW9.ReverseArray(new int[] {2, 7, 3, 10}));
        Assertions.assertArrayEquals(new int[] {15, 4, 0, 5, 87}, HW9.ReverseArray(new int[] {87, 5, 0, 4, 15}));
    }

    @Test
    public void SortArray(){
        Assertions.assertArrayEquals(new int[] {2, 3, 4, 4, 5, 7, 9, 12, 12}, HW9.SortArray(new int[] {4, 3, 7, 12, 5, 2, 9, 4, 12}));
    }

    @Test
    public void KthLargest(){
       Assertions.assertEquals(9, HW9.KthLargest(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}, 3));
    }

    @Test
    public void NegativeOneTheRight(){
        Assertions.assertArrayEquals(new int[]{4, 7, 5, 9, 4, 12, -3, -12, -2}, HW9.NegativeOnTheRight(new int[] {4, -3, 7, -12, 5, -2, 9, 4, 12}));
    }

    @Test
    public void SumOfTwo(){
        Assertions.assertArrayEquals(new int [][] { {3, 9}, {7, 5}}, HW9.SumOfTwo(new int [] {4, 3, 7, 12, 5, 2, 9, 4, 12}, 12));
        Assertions.assertArrayEquals(new int[][] { {4, 4}, {2, 6}, {1, 7}}, HW9.SumOfTwo(new int[] {4, 2, 6, 1, 3, 7, 4}, 8));
    }







}
