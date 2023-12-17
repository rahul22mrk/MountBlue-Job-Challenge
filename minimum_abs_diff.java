 public static int minimumAbsoluteDifference(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.size()-1; i++){
           ans = Math.min(ans , Math.abs(arr.get(i) - arr.get(i+1)));
        }
        return ans;

    }
