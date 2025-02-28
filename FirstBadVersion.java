package Experiment5;

public class FirstBadVersion {
     // Ques2: First Bad Version
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
      public int firstBadVersion(int n) {
        int s=0;
        int e =n;
        while(s<=e){
            int mid = s+(e-s)/2;
            boolean result = isBadVersion(mid);
            if(result){
                if(mid>s&&isBadVersion(mid-1)){
                    e=mid-1;
                }
                else{
                    return mid;
                }
                
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }

}
