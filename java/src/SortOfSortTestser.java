import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class SortOfSortTestser {

    @Test
    public void testsortOfSort1(){
        int[] array = new int[8];
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
        array[0] = 6;
        array[1] = 5;
        array[2] = 1;
        array[3] = 0;
        array[4] = 2;
        array[5] = 3;
        array[6] = 7;
        array[7] = 9;
        sorter.sortOfSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
