/*
Anbu wants to make this Valentine special for Disha. So, he wants to collect maximum number of roses. Help him to collect maximum number of roses. Roses are kept in boxes and the boxes are further arranged in an N×M grid.
Anbu can pick a box and get all the roses it contain.So, help him collect the maximum number of Roses.


Constraints:
No Constraints


Example:
Sample Input:

1
4 4
1 2 3 4
5 6 7 8
9 1 4 2
6 3 5 7

Sample Output:

28


Explanation:
Input Format:

There are T test cases.
For each test case, the first line consists of two integers N and M, denoting the number of rows and number of columns in matrix A respectively. Each of the following N lines consist of M space-separated integers, thus describing the grid.
Output Format:

For each test case, output the maximum number of roses Anbu can collect.
*/








import java.util.*;
public class Valentine{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int T = sc.nextInt();
    while(T-- > 0){
      int n=sc.nextInt();
      int m=sc.nextInt();
      int[][] a=new int[n][m];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          a[i][j]=sc.nextInt();
        }
      }

      int sum=0;
      for(int i=0;i<n;i++){
        int max=0;
        for(int j=0;j<m;j++){
                  if(a[i][j] > max){
                    max=a[i][j];
                  }
          
        }
        sum+=max;
      }
      System.out.println(sum);
    }
  }
}


