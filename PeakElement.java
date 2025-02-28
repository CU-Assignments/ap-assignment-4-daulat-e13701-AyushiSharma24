package Experiment5;

public class PeakElement {
    //Ques5: Find Peak Element
    public int findPeakElement(int[] nums) {
        int s =0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<nums.length-1&&nums[mid+1]>nums[mid]){
                s=mid+1;
            }
            else if(mid>0&&nums[mid-1]>nums[mid]){
                e=mid-1;
            }
            else{
                return mid;
            }
        }
        return ans;
    }

}
