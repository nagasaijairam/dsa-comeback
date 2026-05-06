package Arrays;

class TwoSum {
    public int[] TwoSum(int[] nums, int target) {
        int len = nums.length;
        for( int i=1 ; i < len;i++){
            for (int j=i ; j< len; j++){
                if(nums[j]+nums[j-i] == target){
                    return new int[] {j,j-i};
                }
            }
        }
        return new int[] {-1,-1};
    }
}