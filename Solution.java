class RunSum {
    static int[] runningSum(int[] nums){
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result = result + nums[i];
            nums[i] = result;
        }
        return nums;
    }
    
}
