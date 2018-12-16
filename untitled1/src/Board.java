public class Board {
     public int board[][]=new int[12][12];

   void MakeBoard() {
       for (int i=0;i<12;i++) {
           board[0][i]=8;
       }
       for (int i=0;i<12;i++) {
           board[11][i]=8;
       }
       for (int i=0;i<12;i++) {
           board[i][0]=8;
       }
       for (int i=0;i<12;i++) {
           board[i][11]=8;
       }
   }
   void GiveBoard(){
    for (int i = 0;i < 12; i++){
        for (int j = 0;j<12 ; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println(" ");
    }

    }
}
