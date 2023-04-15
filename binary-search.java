public class binary-search {
    public static void main(String[] args) {
        int arr[]={2,3,4,12,23,45};
        int target=12;
        int ans=binarysearches(arr,target);
        System.out.println(ans);
    }
    static int binarysearches(int arr1[],int num)
    {
        int start=0,end=arr1.length-1;
        while(start<=end)
        { int temp=(start+end)/2;
            if(arr1[temp]==num)
            {
                return temp;
            }
            else if(arr1[temp]<num)
            {
                start=temp+1;
            }
            else
                end=temp-1;
        }
        return start;

    }
}

