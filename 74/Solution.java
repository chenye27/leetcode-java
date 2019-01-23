class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length == 0) return false;
        int i= matrix.length-1;
        int j=0;
        while(i>=0 &&target < matrix[i][0]) i--;
        if(i <0 ) return false;
        int l = 0,r = matrix[0].length-1;
        int mid;
        while(l <= r){
            mid = (l+r)/2;
            if(target == matrix[i][mid]){
                return true;
            }else if(target < matrix[i][mid]){
                r = mid-1;
            }else l = mid+1;
        }
        return false;
    }
}