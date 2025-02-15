class Solution {
    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length-1;
        int mid;

        while(low<=high){


            mid = low + (high-low)/2;

            if(nums[low] < nums[high]) return nums[low];

            if((mid == 0 || nums[mid] < nums[mid-1]) && (mid == nums.length-1 || nums[mid] < nums[mid+1])){

                return nums[mid];
            }

            else if(nums[mid]<nums[high]){

                high = mid -1;
            }

            else {

                low = mid +1;
            }

        }

        return -1;
    }
} 
