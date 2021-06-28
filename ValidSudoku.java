import java.util.*;
public class ValidSudoku
{
    public boolean isValidSudoku(char[][] board){
        for(int i=0;i<9;i++){
            HashSet<Character> row = new HashSet();
            HashSet<Character> col = new HashSet();
            for(int j=0;j<9;j++){
                if((board[i][j]!='.' && !row.add(board[i][j])) || (board[j][i]!='.' && !col.add(board[j][i])))
                return false;
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Character> box = new HashSet();
                for(int k=i; k<i+3; k++){
                    for(int l=j; l<j+3; l++){
                        if(board[k][l] != '.' && !box.add(board[k][l])){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        ValidSudoku ob = new ValidSudoku();
        char arr[][] = new char[9][9];
        System.out.println("Enter values: ");
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j] = obj.next().charAt(0);
            }
        }
        System.out.println(ob.isValidSudoku(arr));
    }
}