package Arrays;

public class largestInArray {
	
    public int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int e : nums){
            if(e>max){
                max = e;
            }
        }
        return max;
    }
}
