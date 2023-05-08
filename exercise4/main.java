package exercise4;

public class main {
    public static void main(String[] args) {
    char[][] board = {
    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
    
    System.out.println("Validete:" + isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] array) {
        boolean check=true;
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 8; j++){
                if (array[i][j]!='.'){
                    for (int k = j+1; k < 9; k++){
                        if (array[i][j]==array[i][k]){
                            check=false;
                        }                    
                    }
                }
            }
        }
        for (int j = 0; j < 9; j++){
            for (int i = 0; i < 8; i++){
                if (array[i][j]!='.'){
                    for (int k = i+1; k < 9; k++){
                        if (array[i][j]==array[k][j]){
                            check=false;
                        }                    
                    }
                }
            }
        }
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                for (int i = 0 + 3*x; i < 3 + 3*x; i++){
                    for (int j = 0 + 3*y; j < 3 + 3*y; j++){
                        if (array[i][j]!='.'){
                            for (int k = 0 + 3*x; k < 3 + 3*x; k++){
                                for (int l = 0 + 3*y; l < 3 + 3*y; l++){
                                    if (k!=i && l!=j){
                                        if (array[i][j]==array[k][l]){
                                            check=false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return check;
    }
}