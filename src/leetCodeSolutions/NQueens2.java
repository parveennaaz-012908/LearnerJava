package leetCodeSolutions;

public class NQueens2 {
   public static int totalNQueens(int n) {
       int[][] arr = new int[n][n];
       int solutions =0;
        for(int i=0;i<n;i++)
        {
            boolean isSet = false;
            for(int j=0;j<n;j++)
            {
               int pos =i+j;

               if(pos<n && isSet==false){
                   arr[i][pos]=1;
                   isSet =true;


            }
                j++;
            }
        }
       for(int i=0;i<n;i++) {
           for (int j = 0; j < n; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
           return solutions;

    }
    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
}
