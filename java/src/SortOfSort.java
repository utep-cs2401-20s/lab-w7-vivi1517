public class SortOfSort {
    public void sortOfSort(int[] array) {
        sortOfSort(array, 0, array.length - 1, 1);
    }
    public void sortOfSort(int[] array, int low, int high, int counter){
       if(low <= high) {
           if (counter == 1) {
               int max = array[low];
               int index = low;
               for (int i = low + 1; i <= high; i++) {
                   if (array[i] > max) {
                       max = array[i];
                       index = i;
                   }
               }
               int temp = array[high];
               array[high] = array[index];
               array[index] = temp;
               sortOfSort(array, low, high - 1, counter + 1);
           }
           else if (counter == 2) {
               int max = array[low];
               int index = low;
               for (int i = low + 1; i <= high; i++) {
                   if (array[i] > max) {
                       max = array[i];
                       index = i;
                   }
               }
               int temp = array[high];
               array[high] = array[index];
               array[index] = temp;
               sortOfSort(array, low, high - 1, counter + 1);
           }
           else if (counter == 3) {
               int max = array[low];
               int index = low;
               for (int i = low + 1; i <= high; i++) {
                   if (array[i] > max) {
                       max = array[i];
                       index = i;
                   }
               }
               int temp = array[low];
               array[low] = array[index];
               array[index] = temp;
               sortOfSort(array, low + 1, high, counter + 1);
           }
           else if (counter == 4){
               int max = array[low];
               int index = low;
               for (int i = low + 1; i <= high; i++) {
                   if (array[i] > max) {
                       max = array[i];
                       index = i;
                   }
               }
               int temp = array[low];
               array[low] = array[index];
               array[index] = temp;
               sortOfSort(array, low + 1, high, 1);
           }
       }
   }

}

//iterate through every single item in the array and find the max. You have a counter. Once you find the max you switch
//it to the end and update counter when counter is even it goes in the front//
