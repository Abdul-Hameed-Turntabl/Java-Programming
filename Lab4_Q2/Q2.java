package Lab4_Q2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Q2 {

    public int[] arr = new int[6];
    Random rand = new Random();

    private boolean exists(int[] arr,int end,int value)
    {
        for(int i = 0; i < end; i++)
        {
            if(arr[i] == value)
                return true;
        }
        return false;
    }

    private void swap(int[] arr, int i, int j)
    {
        int tmp = 0;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    int get_max_indx(int[] arr,int i, int j)
    {
        int max = arr[i];
        int indx = i;
        if(j < i || i < 0 || j > arr.length-1)
            return 0xFFFFFFFF;
        for(int k = i+1; k < j ; k++)
        {
            if(max < arr[k])
            {
                max = arr[k];
                indx = k;
            }
        }
        return indx;
    }

    private void insertion_sort(int[] arr)
    {
        int index = arr.length-1;
    }
    
    Q2()
    {
        int rand_val = rand.nextInt(1,49); 
        for(int i = 0; i < arr.length; i++)
        {
            while(exists(arr, i,rand_val ))
                rand_val = rand.nextInt(1,49);
            arr[i] = rand_val;
        }

        Arrays.sort(arr);
    }

}
