class Solution
{
    public static void solve(char[] charArray,int index,ArrayList<String> ans){
        if(index>=charArray.length){
            String permutation = new String(charArray);
            ans.add(permutation);
            return;
        }
        for(int j=index;j<charArray.length;j++){
            char temp = charArray[index];
            charArray[index]=charArray[j];
            charArray[j]=temp;
            solve(charArray,index+1,ans);
            temp=charArray[index];
            charArray[index]=charArray[j];
            charArray[j]=temp;
        }
    }
    
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> ans = new ArrayList<>();
        char[] charArray = S.toCharArray();
        int index=0;
        solve(charArray,index,ans);
        Collections.sort(ans);
        return ans;
    }
	   
}
