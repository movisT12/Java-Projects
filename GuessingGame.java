package NumberGuessingGame;

import java.util.Random;
import javax.swing.JOptionPane;

class GuessingGame {
    public static void main(String[] args) {
        Random rnd = new Random(); // Random object to generate a number
        int count = 0; // Counter to track number of guesses
        
        int computer_number = rnd.nextInt(100) + 1; // Generate random number between 1 and 100

        while (true) {
            try {
                // Show input dialog to get user's guess
                String u_number = (JOptionPane.showInputDialog("Guess a  number "));
                
                // If user cancels the dialog (clicks cancel or closes it)
                if (u_number == null) {
                    JOptionPane.showMessageDialog(null, "Game cancelled! The correct number was " + computer_number);
                    break;
                }

                // Convert user's input from String to int
                int user_number = Integer.parseInt(u_number);

                // Check if user's guess is correct
                if (computer_number == user_number) {
                    JOptionPane.showMessageDialog(null, "you find it well done ");
                    count += 1; // Increment guess count
                    break; // Exit the loop if guessed correctly
                } 
                // If guess is too low
                else if (computer_number > user_number) {
                    JOptionPane.showMessageDialog(null, "Think larger number  ");
                    count += 1; // Increment guess count
                } 
                // If guess is too high
                else {
                    JOptionPane.showMessageDialog(null, "Think smaller number ");
                    count += 1; // Increment guess count
                }
            } catch (NumberFormatException e) {
                // Handle invalid (non-integer) input
                JOptionPane.showMessageDialog(null, "Enter apropriate number");
            }
        }

        // Show total number of attempts
        JOptionPane.showMessageDialog(null, "You did in " + count + " counts");
    }
}
