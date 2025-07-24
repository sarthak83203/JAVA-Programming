/*Emma is a data analyst working with a grid-based system where each cell contains important numerical data. The grid represents spatial data, inventory records, or structured reports that require periodic updates.



Due to system updates and new requirements, Emma needs to modify the grid in the following ways:



She wants to insert either a new row or a new column at a given position.
Later, she needs to delete either a row or a column from the modified matrix.
Input format :
The first line contains two integers rows and cols (the dimensions of the matrix).

The next rows lines contain cols space-separated integers representing the initial matrix.

The next line contains two integers insertType and insertIndex:

insertType = 0 for row insertion, 1 for column insertion.
insertIndex is the position where the new row/column should be added.
If inserting a row, the next cols integers represent the new row or If inserting a column, the next rows integers represent the new column.

The next line contains two integers deleteType and deleteIndex:

deleteType = 0 for row deletion, 1 for column deletion.
deleteIndex is the position to be deleted.
Output format :
The first line of output prints the string "After insertion" followed by the modified matrix with the inserted row or column.

Each row of the matrix is printed on a new line with space-separated integers.

The next line prints the string "After deletion" followed by the final matrix after the specified deletion operation.

Each row of the resulting matrix is printed on a new line with space-separated integers.



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ N, M ≤ 10

1 ≤ dataset elements ≤ 1000

Sample test cases :
Input 1 :
3 3
1 2 3
4 5 6
7 8 9
0 1
10 11 12
1 2
Output 1 :
After insertion
1 2 3 
10 11 12 
4 5 6 
7 8 9 
After deletion
1 2 
10 11 
4 5 
7 8 
Input 2 :
2 2
5 6
7 8
1 0
1 3
0 1
Output 2 :
After insertion
1 5 6 
3 7 8 
After deletion
1 5 6 
*/
import java.util.*;
public class important_all_concept_ofmatrix {
        public static void printmatrix(int matrix[][],int row,int cols){
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int matrix[][]=new int[row][cols];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int insertType=sc.nextInt(); //0 for row and 1 for cols
        int insertIndex=sc.nextInt(); //tell at which position it should be added.
       
        if(insertType==0){
            int rows[]=new int [cols];
            for(int i=0;i<cols;i++){
                rows[i]=sc.nextInt();
            }
            int newmatrix[][]=new int[row+1][cols];
            for(int i=0,k=0;i<row+1;i++){
                if(i==insertIndex){
                    newmatrix[i]=rows;
                }else{
                    newmatrix[i]=matrix[k++];
                }
                
            }
            matrix=newmatrix; //directlt can pass in java.
            row++;
            
        }else{
            int newcols[]=new int[row];
            for(int i=0;i<row;i++){
                newcols[i]=sc.nextInt();
            }
            int newMatrix[][]=new int[row][cols+1];
            for(int i=0;i<row;i++){
                for(int j=0,k=0;j<cols+1;j++){
                    if(j==insertIndex){
                        newMatrix[i][j]=newcols[i];
                    }else{
                        newMatrix[i][j]=matrix[i][k++];
                    }
                    
                }
            }
            matrix=newMatrix;
            cols++;
            
            
        }
        System.out.println("After insertion");
        printmatrix(matrix,row,cols);
        
        int deleteType=sc.nextInt();
        int deleteIndex=sc.nextInt();
        
        if(deleteType==0){
            int newMatrix[][]=new int[row-1][cols];
            for(int i=0,k=0;i<row;i++){
                if(i==deleteIndex){
                    continue;
                    
                }
                newMatrix[k++]=matrix[i];
            }
            matrix=newMatrix;
            row--;
        }else{
            int newMatrix[][]=new int[row][cols-1];
            for(int i=0;i<row;i++){
                for(int j=0,k=0;j<cols;j++){
                    if(j==deleteIndex){
                        continue;
                    }
                    newMatrix[i][k++]=matrix[i][j];
                    
                }
            }
            matrix=newMatrix;
            cols--;
        }
        
        
         System.out.println("After deletion");
         printmatrix(matrix,row,cols);
         sc.close();
        
    }
    
}
