package patterns;
/*
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
 */
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;

        for(int row=0;row<2*n;row++){
            int colsInRow;
            if(row>n){
                colsInRow = 2*n-row;
            }
            else{
                colsInRow = row;
            }
            for(int col=1;col<=colsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
