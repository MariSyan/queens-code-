public class Main{ 
   public static void main(String [] args){ 
    Scanner in = new Scanner(System.in); 
    System.out.println("Enter n:"); 
    size=in.nextInt(); 
    chsboard=new int [size][size];
    int i,j;
    for (i = 0; i<size ; i++) { 
    for ( j = 0; j <size ; j++) { 
    chsboard[i][j]=0; if (solve(0)){ 
    printChsBoard(); 
   }
   else {
    System.out.println("No solution"); }
         } 
     }
  }

}

class nQueens{
static int [][] chsboard; static int size;

static boolean solve(int col){ if (col>size-1){ return true; }
for (int i=0;i<size;i++){ 
if (isSafe(i,col))
chsboard[i][col]=1;
if (solve(col+1)) 
return true; 
chsboard[i][col]=0; }
return false; } 
static boolean isSafe(int row, int col) {
int i, j; for (i = 0; i < col; i++) 
if (chsboard[row][i] == 1) 
return false;
for (i = row, j = col; j >= 0 && i < size; i++, j--)
if (chsboard[i][j] == 1) 
return false;
return true;

} 
static void printChsBoard(){
for (int i = 0; i <size ; i++) {
System.out.println("\n"); 
for (int j = 0; j <size ; j++) {
System.out.println(chsboard[i][j]);

        } 
   } 
}

}