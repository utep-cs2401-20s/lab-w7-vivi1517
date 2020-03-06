import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class SortOfSortTestser {

    @Test
    public void testsortOfSort1(){      //I decided to test the array given to us in the pdf just to be sure that
        int[] array = new int[8];       //the method that I wrote worked the way it should. The test passed.
        array[0] = 2;
        array[1] = 7;
        array[2] = 1;
        array[3] = 3;
        array[4] = 0;
        array[5] = 9;
        array[6] = 6;
        array[7] = 5;
        SortOfSort sorter = new SortOfSort();
        int[] sorted = new int[8];
        sorted[0] = 6;
        sorted[1] = 5;
        sorted[2] = 1;
        sorted[3] = 0;
        sorted[4] = 2;
        sorted[5] = 3;
        sorted[6] = 7;
        sorted[7] = 9;
        sorter.sortOfSort(array);
        assertArrayEquals(sorted, array);
    }



    @Test
    public void testsortOfSort2(){      //I chose to test a sorted list to make sure it would sort of sort even that.
        int[] array = new int[8];       //When writing the code I wrote it based off of the pdf so I wanted to make
        array[0] = 1;                   //sure it worked even with a sorted array. The test passed.
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        SortOfSort sorter = new SortOfSort();
        int[] sorted = new int[8];
        sorted[0] = 6;
        sorted[1] = 5;
        sorted[2] = 2;
        sorted[3] = 1;
        sorted[4] = 3;
        sorted[5] = 4;
        sorted[6] = 7;
        sorted[7] = 8;
        sorter.sortOfSort(array);
        assertArrayEquals(sorted, array);
    }

    @Test
    public void testsortOfSort3(){      //I chose to test a backwards list to make sure it would sort of sort even that.
        int[] array = new int[8];       //When writing the code I wrote it based off of the pdf so I wanted to make
        array[0] = 8;                   //sure it worked even with a sorted array. The test passed.
        array[1] = 7;
        array[2] = 6;
        array[3] = 5;
        array[4] = 4;
        array[5] = 3;
        array[6] = 2;
        array[7] = 1;
        SortOfSort sorter = new SortOfSort();
        int[] sorted = new int[8];
        sorted[0] = 6;
        sorted[1] = 5;
        sorted[2] = 2;
        sorted[3] = 1;
        sorted[4] = 3;
        sorted[5] = 4;
        sorted[6] = 7;
        sorted[7] = 8;
        sorter.sortOfSort(array);
        assertArrayEquals(sorted, array);
    }

    @Test
    public void testsortOfSort4(){      //I chose to test a list with duplicates to make sure that would not cause any
        int[] array = new int[8];       //problems. The test passed.
        array[1] = 1;
        array[2] = 2;
        array[3] = 2;
        array[4] = 3;
        array[5] = 3;
        array[6] = 4;
        array[7] = 4;
        SortOfSort sorter = new SortOfSort();
        int[] sorted = new int[8];
        sorted[0] = 3;
        sorted[1] = 3;
        sorted[2] = 1;
        sorted[3] = 1;
        sorted[4] = 2;
        sorted[5] = 2;
        sorted[6] = 4;
        sorted[7] = 4;
        sorter.sortOfSort(array);
        assertArrayEquals(sorted, array);
    }

    @Test
    public void testsortOfSort5(){      //I chose to test a short array with an odd number of elements to ensure that
        int[] array = new int[3];       //the counter in my method did not have a problem sorting this.
        array[0] = 6;                   //The test passed.
        array[1] = 1;
        array[2] = 3;

        SortOfSort sorter = new SortOfSort();
        int[] sorted = new int[3];
        sorted[0] = 1;
        sorted[1] = 3;
        sorted[2] = 6;
        sorter.sortOfSort(array);
        assertArrayEquals(sorted, array);
    }

}
