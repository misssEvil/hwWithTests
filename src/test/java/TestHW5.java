import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TestHW5 {



        @Test
        public void Hello(){
            System.out.println("Hello, world!");
        }


        @Test
        public void checkDayOfWeek(){
            Assert.assertEquals("It's Mon", HW5.dayOfWeek(1));
            Assert.assertEquals("It's Thur", HW5.dayOfWeek(4));
            Assert.assertEquals("Input data out of range!", HW5.dayOfWeek(10));

        }



        @Test
        public void checkAvgTemp(){
           Assert.assertEquals(37.3, HW5.avgTemp(38.5, 35.6, 38.1, 36.6, 37.7), 0.00001);

        }





}
