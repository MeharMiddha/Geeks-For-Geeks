class Solution {
    
    public static boolean canWePlace(int[] stalls,int dis,int cows){
        int countCows=1,last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dis){
                countCows++;
                last=stalls[i];
            }
            if(countCows>=cows) return true;
        }
        return false;
    }
    
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low=0;
        int high=stalls[n-1]-stalls[0];
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canWePlace(stalls,mid,k)) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
}
