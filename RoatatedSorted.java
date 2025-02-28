package Experiment5;

public class RoatatedSorted {
    // Ques7: Search in rotated sorted array
    public int search(int[] nums, int target) {
        int max=peakindex(nums);
        int index=binarysearch(0,max,nums,target);
        if(index==-1){
            index=binarysearch(max+1,nums.length-1,nums,target);
        }
        return index;
    }
    int peakindex(int[] nums){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<e&&nums[mid]>nums[mid+1]){
                return mid;
            }
            if(s<mid&&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[s]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    int binarysearch(int s,int e,int[] nums,int target){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }

}
