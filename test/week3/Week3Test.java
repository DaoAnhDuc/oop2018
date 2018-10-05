package week3;

import week3.Week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {
    @Test
    public void testmax1(){
            assertEquals(15, Week3.max(15,5));
    }
    @Test
    public void testmax2(){
        assertEquals(99, Week3.max(15,99));
    }
    @Test
    public void testmax3(){
        assertEquals(14, Week3.max(14,5));
    }
    @Test
    public void testmax4(){
        assertEquals(25, Week3.max(3,25));
    }
    @Test
    public void testmax5(){
        assertEquals(95, Week3.max(45,95));
    }

    @Test
    public void testMinOfAray1(){
            int a[] = {1,2,3,4,5,6,7,8,9,10};
            assertEquals(1,Week3.minOfArray(a));
    }
    @Test
    public void testMinOfAray2() {
        int b[] = {5, 6, 9, 8, 1, 0, 1, 1, 77, 55, 223, 4};
        assertEquals(0, Week3.minOfArray(b));
    }
    @Test
    public void testMinOfAray3() {
        int c[] = {-10, -5, -10, 5, 3, 4, 9, 2, 555, 666, 999};
        assertEquals(-10, Week3.minOfArray(c));
    }
    @Test
    public void testMinOfAray4() {
        int d[] = {1, 9, 8, 7, 5, 2, 1, 2, -100, 30, -8};
        assertEquals(-100, Week3.minOfArray(d));
    }
    @Test
    public void testMinOfAray5(){
            int e[] ={0,1,23,5,6,7,89,15,56};
            assertEquals(0,Week3.minOfArray(e));
    }
    @Test
    public  void calculateBMI1() {
        assertEquals("Béo phì", Week3.calculateBMI(80, 1.56));//32
    }
    @Test
    public  void alculateBMI2() {
        assertEquals("Bình thường",Week3.calculateBMI(67,1.72)) ;//22.64
    }@Test
    public  void calculateBMI3() {
        assertEquals("Bình thường",Week3.calculateBMI(60,1.72)) ;//20.28
    }@Test
    public  void calculateBMI4() {
        assertEquals("Thừa cân",Week3.calculateBMI(77,1.77)) ;//24.57
    }@Test
    public  void calculateBMI5() {
        assertEquals("Béo phì",Week3.calculateBMI(91,1.9)) ;//25.2
    }
}