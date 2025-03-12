package NumberGuessingGame;


import java.util.Random;
import javax.swing.JOptionPane;

class GuessingGame{
    public static void main(String[] args) {
        Random rnd=new Random();
        int count=0;
        
        int computer_number=rnd.nextInt(100)+1;
    
    

        while(true)
        {
            try{
                    String u_number=(JOptionPane.showInputDialog("Guess a  number "));
                    if (u_number == null) {
                        JOptionPane.showMessageDialog(null, "Game cancelled! The correct number was " + computer_number);
                        break;
                        
                    }
                    int user_number=Integer.parseInt(u_number);
                    

                    

                    if (computer_number ==user_number){
                        JOptionPane.showMessageDialog(null, "you find it well done ");
                        count+=1;
                        break;
                    }
                    else if(computer_number>user_number) {
                        JOptionPane.showMessageDialog(null, "Think larger number  ");
                        count+=1;
                    

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Think smaller number ");
                        count+=1;
                    }
            }
            catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Enter apropriate number");
                }
        }
        JOptionPane.showMessageDialog(null, "You did in "+count+" counts");
        
    
    
}

}