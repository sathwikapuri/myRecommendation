import java.util.* ;
import java.io.*; 

 class Check {
	 public static int calculate(int row,int col,int maxrow,int maxcol,int[][] dp,int[][] matrix)
	 {
		 if(row==maxrow-1 && col>=0 && col<maxcol)
		 {
			 return matrix[row][col];
		 }
		
		 if(row>=0 && row<maxrow && col>=0 && col<maxcol)
		 {
            if(dp[row][col]!=0)
            {
                return dp[row][col];
            }
			 int x=matrix[row][col]+calculate(row+1,col,maxrow,maxcol,dp,matrix);
			 int y=matrix[row][col]+calculate(row+1, col-1, maxrow, maxcol, dp, matrix);
			 int z=matrix[row][col]+calculate(row+1, col+1, maxrow, maxcol, dp, matrix);
			 ArrayList<Integer>al=new ArrayList<>();
			 al.add(x);
			 al.add(y);
			 al.add(z);
			Integer ans=Collections.max(al);
            return dp[row][col]=ans;
		 }
		return 0;
	 }
	public static int getMaxPathSum(int[][] matrix) {
		int n=matrix.length;
		int m=matrix[0].length;
		
		int dp[][]=new int[n+1][m+1];
		int max=-9999999;
		for(int i=0;i<m;i++)
		{
             max=Math.max(max,calculate(0,i,n,m,dp,matrix));
		}
		return max;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
              matrix[i][j]=sc.nextInt();
            }
        }
        int ans=getMaxPathSum(matrix);
        System.out.print(ans);
    }
}
