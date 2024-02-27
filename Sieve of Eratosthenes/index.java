class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        boolean arr[] = new boolean[N + 1];
        Arrays.fill(arr, true);

        for (int p = 2; p * p <= N; p++) {
            if (arr[p]) {
                for (int i = p * p; i <= N; i += p) {
                    arr[i] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (arr[i]) {
                list.add(i);
            }
        }

        return list;
    }
}
