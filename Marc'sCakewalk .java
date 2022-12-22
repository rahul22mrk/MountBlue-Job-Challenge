public static long marcsCakewalk(List<Integer> calorie) {
    // Write your code here
        Collections.sort(calorie,Collections.reverseOrder());
        long res=0;
        for(int i=0;i<calorie.size();i++)
        {
            res=res+(long)Math.pow(2,i) * calorie.get(i);
        }
        return res;

    }
