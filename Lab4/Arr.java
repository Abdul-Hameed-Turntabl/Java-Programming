package Lab4;

public class Arr {

    public int size = 0;
    int[] int_arr = null;

    Arr(int size)
    {
        this.size = size;
        this.int_arr = new int[size];
        for(int i = 0; i < size; i++)
            int_arr[i] = i+1;
    }
}
