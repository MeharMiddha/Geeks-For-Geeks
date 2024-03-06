class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low>=high) return;
        int p = partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot=arr[low];
        int count=0;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        // place pivot at right position
        int pivotIndex = low+count;
        int temp=arr[pivotIndex];
        arr[pivotIndex]=arr[low];
        arr[low]=temp;
        int i =low, j=high;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                int a=arr[i];
                arr[i]=arr[j];
                arr[j]=a;
                i++;j--;
            }
        }
        return pivotIndex;
    } 
}
