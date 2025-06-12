import java.util.*;
public class spiral_ordre_matrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int rowstart=0;
        int rowend=rows-1;
        int colstart=0;
        int colend=cols-1;
        while(rowstart<=rowend && colstart<=colend){
            //Now 1st traverseing......
            for(int col=colstart;col<=colend;col++){
                System.out.print(arr[rowstart][col]+ " ");
            }
            rowstart++;
            //Now 2nd Traverseing
            for(int row=rowstart;row<=rowend;row++){
                System.out.print(arr[row][colend] + " ");

            }
            colend--;
            //Now 3rd Traversing
            for(int col=colend;col>=colstart;col--){
                System.out.print(arr[rowend][col]+" ");
            }
            rowend--;

            for(int row=rowend;row>=rowstart;row--){
                System.out.print(arr[row][colstart]+" ");
            }
            colstart++;


            System.out.println();
        }

        

    }
    
}
