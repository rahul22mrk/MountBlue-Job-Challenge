# In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
        long sum=0;
        for(long l:ar)
            sum+=l;
        
        return sum;

    }
