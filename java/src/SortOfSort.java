public class SortOfSort {
   public void sortOfSort(int[] array){
       int max = array[0];
       int index = 0;
       int counter = 1;     //counts the round were on when looking for max
       int secondCounter = 1;
       for (int i = 0; i < array.length; i++){
           for (int j = 0; j < array.length - 1; j++) {
               if (array[j] > array[j + 1]) {
                   max = array[j];
                   index = j;//go through array looking for max. once max is found switch it to
               }
           }
       }
       int temp = array[]
        }
        int temp = array[array.length - 1];
        array[array.length - 1] = max;
   }

}

//iterate through every single item in the array and find the max. You have a counter. Once you find the max you switch
//it to the end and update counter when counter is even it goes in the front//
