package Arrays;

public class secondLargestElement {
    public static int secondLargestElementinArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int flag = 0;
        int first = nums[0];
        for(int e : nums){
            if(e!=first){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            return -1;
        }
        
        for(int e : nums){
            if(e>max){
                smax = max;
                max = e;
            }else if(e>smax && e<max){
                smax = e;
            }
        }
        return smax;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums =  {3,6,7,4,7,9}; 
		System.out.println(secondLargestElementinArray(nums));
	}

}
