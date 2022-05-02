
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TestHW5 {



        @Test
        public void Hello(){
            System.out.println("Hello, world!");
        }


        @Test
        public void checkDayOfWeek(){

            Assertions.assertEquals("It's Mon", HW5.dayOfWeek(1));
            Assertions.assertEquals("It's Thur", HW5.dayOfWeek(4));
            Assertions.assertEquals("Input data out of range!", HW5.dayOfWeek(10));

        }



        @Test
        public void checkAvgTemp(){
            Assertions.assertEquals(37.3, HW5.avgTemp(38.5, 35.6, 38.1, 36.6, 37.7), 0.00001);

        }





}
