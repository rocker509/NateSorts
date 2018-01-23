
import java.util.*;

public class Sorts{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public Sorts(){
        steps = 100;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList <Integer> list){
        System.out.println();
        System.out.println("Bubble Sort:");
        System.out.println();
        int[] array = arrayExchange(list);
        
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        revamp(array, list);
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Integer> list){
        System.out.println();
        System.out.println("Selection Sort:");
        System.out.println();
        int[] array = arrayExchange(list);
        
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        revamp(array, list);
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(ArrayList <Integer> list){
        System.out.println();
        System.out.println("Insertion Sort:");
        System.out.println();
        int[] array = arrayExchange(list);
        
        int n = array.length;
        for (int i = 1; i < n; ++i)
        {
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        revamp(array, list);
    }

    /**
     *  Accessor method to return the current value of steps
     *
     */
    public long getStepCount(){
        return steps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to steps
     */
    public void setStepCount(long stepCount){
        steps = stepCount;
    }

    public int[] arrayExchange(ArrayList <Integer> list){
        int[] array = new int[list.size()];
        for(int i = 0; i < array.length; i++){
            array[i] = list.get(i);
        }
        return array;
    }
    public void revamp(int[] array, ArrayList <Integer> list){
        list.clear();
        for(int i = 0; i < array.length; i++){
            list.add(array[i]);
        }
    }
}
