class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp = 0;
        
        for(int i=0;i<n/2;i++) {
            for(int j=i;j<n-i-1;j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
}



/*

n=3

3/2 = 1


i=0 -> 1

j=0;j<2;j++
temp = 1
matrix[0][0] = 7
matrix[2][0] = 

*/

