package cd.get.ready.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class DogWalkerTest {

    @Test
    public void testOne(){
        DogWalker dw = new DogWalker();
        int[] dogs = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int expected = dw.numberOfWalksCalculator(dogs);
        int actual = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        DogWalker dw = new DogWalker();
        int[] dogs = {10, 20, 10, 10, 30, 50, 10, 20, 30, 100};
        int expected = dw.numberOfWalksCalculator(dogs);
        int actual = 6;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testThree(){
        DogWalker dw = new DogWalker();
        int[] dogs = {1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5};
        int expected = dw.numberOfWalksCalculator(dogs);
        int actual = 8;
        Assert.assertEquals(expected, actual);
    }

}