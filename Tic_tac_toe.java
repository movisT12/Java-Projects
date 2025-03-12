package Tictactoe;
import java.util.Scanner;

public class Tic_tac_toe {
   
    public  static void printMatrix(String[][] matrix){
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    
                    System.out.print(matrix[i][j]);
                    if (j<2){
                    System.out.print("  |");
                    }
                }
                System.out.println();
                for (int line=0;line<2;line++)
                {
                System.out.print("----");
                    
                }
                System.out.println();
                
            }
    }
    public static int   insertnum(String choice ,String [][] matrix ,int row,int column,int count){
        
        for (int i =0;i<1;i++){
        if (matrix[row][column].isEmpty()){
        
            matrix[row][column]=choice;
            printMatrix(matrix);
            
        }
        else{
            System.out.println("This is already taken");
            count--;
            
            continue;
        }

        if (("O".equals(matrix[0][0]) && "O".equals(matrix[0][1]) && "O".equals(matrix[0][2]))||    ("O".equals(matrix[1][0]) && "O".equals(matrix[1][1]) && "O".equals(matrix[1][2]))||(
            "O".equals(matrix[2][0]) && "O".equals(matrix[2][1]) && "O".equals(matrix[2][2]
             ))||("O".equals(matrix[0][0]) && "O".equals(matrix[1][1]) && "O".equals(matrix[2][2]))||("O".equals(matrix[0][2]) && "O".equals(matrix[1][1]) && "O".equals(matrix[2][0]))||
             ("O".equals(matrix[0][0]) && "O".equals(matrix[1][0]) && "O".equals(matrix[2][0]))||
             ("O".equals(matrix[0][1]) && "O".equals(matrix[1][1]) && "O".equals(matrix[2][1]))||("O".equals(matrix[0][2]) && "O".equals(matrix[1][2]) && "O".equals(matrix[2][2]))) {
                System.out.println("game has finished ");
                System.exit(0);
             }
        else if (("X".equals(matrix[0][0]) && "X".equals(matrix[0][1]) && "X".equals(matrix[0][2]))||    ("X".equals(matrix[1][0]) && "X".equals(matrix[1][1]) && "X".equals(matrix[1][2]))||(
            "X".equals(matrix[2][0]) && "X".equals(matrix[2][1]) && "X".equals(matrix[2][2]
             ))||("X".equals(matrix[0][0]) && "X".equals(matrix[1][1]) && "X".equals(matrix[2][2]))||("X".equals(matrix[0][2]) && "X".equals(matrix[1][1]) && "X".equals(matrix[2][0]))||("X".equals(matrix[0][0]) && "X".equals(matrix[1][0]) && "X".equals(matrix[2][0]))||
             ("X".equals(matrix[0][1]) && "X".equals(matrix[1][1]) && "X".equals(matrix[2][1]))||("X".equals(matrix[0][2]) && "X".equals(matrix[1][2]) && "X".equals(matrix[2][2]))
             ) {
                System.out.println("game has finished ");
                System.exit(0);
             }

}
return count ;
}
    public static void main(String[] args) {
        String [][]matrix ={
            {"","",""},
            {"","",""},
            {"","",""}};
            printMatrix(matrix);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  First player name ");
        String first_name=sc.next();
        System.out.print("Enter Second player name ");
        String Second_name=sc.next();
        System.out.print(first_name +" Turn's ");
        System.out.println(" What you want to choose \n 1) Zero \n 2) cross");
        String option=sc.next();
        switch (option){
            case "1":
            System.out.println(first_name+" choose zero");
            break;
            case "2":
            System.out.println(first_name+" choose cross");
            break;
        }
            if (option.equals("1")){
                System.out.println(Second_name+" choose cross");
            }
            else {
                System.out.println(Second_name+" choose  zero");
            }
           String first_choice = option.equals("1") ? "O"  :"X";
           String second_choice=option.equals("1")?"X":"O"; 
           String[] choice={first_choice,second_choice};
           int counter=1;
         
    while (counter<10){
        {
        for (int i=0;i<2;i++)
        {
    System.out.println("Enter the row number .it starts with 0 not 1 ");
    int row=sc.nextInt();
    System.out.println("Enter the column number..it starts with 0 not 1  ");
    int column=sc.nextInt();
    System.out.println();
    String symbol=choice[i];
    int counter1 = counter;
    counter=insertnum(symbol,matrix,row, column,counter);
    if(counter != counter1){
        i = i-1;
    }
    if (counter==9){
        System.exit(0);
    }
    counter ++;
}
}
}
}
}