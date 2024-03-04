class Solution {
    
    // public static boolean checkPalindrome(String s,int i,int j){
    //     if(i>j) return true;
    //     if(s.charAt(i)!=s.charAt(j)){
    //         return false;
    //     }
    //     else{
    //         return checkPalindrome(s,i+1,j-1);
    //     }
    // }
    
    int isPalindrome(String S) {
        // code here
        // if(checkPalindrome(S,0,S.length()-1)){
        //     return 1;
        // }else{
        //     return 0;
        // }
        
        int n=S.length();
        for(int i=0;i<n/2;i++){
            if(S.charAt(i)!=S.charAt(n-i-1)){
                return 0;
            }
        }
        return 1;
    }
};
