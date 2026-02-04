public class Index_largest {
    public static int largest_index(int[] arr)
    {
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[res])
            {
                res=i;
            }

        }

        return res;
    }
}
