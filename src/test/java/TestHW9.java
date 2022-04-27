import org.junit.Assert;
import org.junit.Test;


public class TestHW9 {

    @Test
    public void OddEven(){
      Assert.assertEquals("Odd", HW9.OddEven(-345));
      Assert.assertEquals("Even", HW9.OddEven(0));
      Assert.assertEquals("Undefined", HW9.OddEven(2147483647 + 1));
    }

    @Test
    public void OddIndices(){
        Assert.assertArrayEquals(new int[] {590, 985, 68}, HW9.OddIndices(new int[] {-45, 590, 234, 985, 12, 68}));
    }

    @Test
    public void SumArray(){
        Assert.assertEquals(15, HW9.SumArray(new int[]{0, 1, 2, 3, 4, 5}));
        Assert.assertEquals(-10, HW9.SumArray(new int[]{-7, -3}));
    }

    @Test
    public void BiggerValue(){
        Assert.assertEquals(9999, HW9.BiggerValue(3333, 9999));
    }

    @Test
    public void IsPositiveNumber(){
        Assert.assertTrue(HW9.IsPositiveNumber(555));
        Assert.assertTrue(HW9.IsPositiveNumber(0));
        Assert.assertFalse(HW9.IsPositiveNumber(-555));
    }

    @Test
    public void AreNumbersEqual(){
        Assert.assertEquals(0, HW9.AreNumberEqual(89, 89));
        Assert.assertEquals(-1, HW9.AreNumberEqual(-89, 89));
        Assert.assertEquals(1, HW9.AreNumberEqual(89, -89));
    }

    @Test
    public void CheckRemainder(){
        Assert.assertEquals("Good number", HW9.CheckRemainder(15));
        Assert.assertEquals("Bad number", HW9.CheckRemainder(9));
        Assert.assertEquals("Poor number", HW9.CheckRemainder(10));
    }

    @Test
    public void MinMaxAve(){
        Assert.assertArrayEquals(new int[] {3, 7, 5}, HW9.MinMaxAve(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 2, 6));
        Assert.assertArrayEquals(new int[] {5, 0, 3}, HW9.MinMaxAve(new int[] {5, 4, 0, 8, 1}, 0, 2));
    }
}
