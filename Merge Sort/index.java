class Solution
{
    void merge(int arr[],int start,int end){
        int mid=(start+end)/2;
        int len1=mid-start+1;
        int len2=end-mid;
        int first[]=new int[len1];
        int second[]=new int[len2];
        int mainArrayIndex=start;
        for(int i=0;i<len1;i++){
            first[i]=arr[mainArrayIndex++];
        }
        for(int i=0;i<len2;i++){
            second[i]=arr[mainArrayIndex++];
        }
        int index1=0;
        int index2=0;
        mainArrayIndex=start;
        while(index1<len1 && index2<len2){
            if(first[index1]<second[index2]){
                arr[mainArrayIndex++]=first[index1++];
            }else{
                arr[mainArrayIndex++]=second[index2++];
            }
        }
        while(index1<len1){
            arr[mainArrayIndex++]=first[index1++];
        }
        while(index2<len2){
            arr[mainArrayIndex++]=second[index2++];
        }
    }
    
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,r);
    }
}
