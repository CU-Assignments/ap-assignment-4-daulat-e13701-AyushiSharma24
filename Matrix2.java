package Experiment5;

public class Matrix2 {
    // Ques8: Search 2D matrix II
    public boolean searchMatrix(int[][] matrix, int target) {
        return helper(matrix,target,0,matrix[0].length-1);
    }
    public boolean helper(int[][] matrix,int target,int i,int j){
        if(i>=matrix.length||j>=matrix[0].length||i<0||j<0){
            return false;
        }
        if(matrix[i][j]==target){
            return true;
        }
        if(matrix[i][j]>target){
            j=j-1;
        }
        else if(matrix[i][j]<target){
            i=i+1;
        }
        return helper(matrix,target,i,j);
    }
}
