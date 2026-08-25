class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans= new ArrayList<>(); 
       int startRow=0;
       int endRow=matrix.length-1;
       int startCol=0;
       int endCol=matrix[0].length-1;

       while(startRow<=endRow && startCol<=endCol)
       {
        //left to right
        for(int j=startCol; j<=endCol; j++)
        {
            ans.add(matrix[startRow][j]);
        }
        //up to down
        startRow++;
        for(int i=startRow; i<=endRow; i++)
        {
            ans.add(matrix[i][endCol]);
        }
        //right to left

        endCol--;
        if(startRow<=endRow){
        for(int j=endCol; j>=startCol; j--)
        {
            ans.add(matrix[endRow][j]);
        }
        }
        endRow--;
        //down to up
         if(startCol<=endCol){
         for(int i=endRow; i>=startRow; i--)
         {
            ans.add(matrix[i][startCol]);
         }
         }
         startCol++;
       }

       return ans;
        }
    
}
