package lottonumbergenerator;
// PantherID:  5600352
// CLASS: COP 2210 – Fall 2015
// ASSIGNMENT #1
// DATE: September 18
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//

import java.util.Random;//import package
import javax.swing.JOptionPane;

public class LottoNumberGenerator {

    
    public static void main(String[] args) {
        
        
        Random r = new Random();
        boolean running = true;
        while(running){
            String choice = JOptionPane.showInputDialog("What would you like to play?"
                + "\n1. Fantasy 5"
                + "\n2. Regular Lottery");
        
            if (choice.equals("1")){
                int x = 1 + r.nextInt(36);

                String fantasyMsg = ("Here are your randomly selected numbers for Fantasy 5! Good Luck!\n");
                String fantasyNumbers = (1 + r.nextInt(36) + ", " + (1+r.nextInt(36)) + ", " + (1+r.nextInt(36)) + ", " + (1+r.nextInt(36)) + ", " + (1+r.nextInt(36)));

                JOptionPane.showMessageDialog(null, fantasyMsg + fantasyNumbers);
                running = false;

            }else if(choice.equals("2")){
                int x = 1 + r.nextInt(53);

                String lottoMsg = ("Here are your randomly selected numbers for The Lottery! Good Luck!\n"); 
                String lottoNumbers = (1 + r.nextInt(53) + ", " + (1+r.nextInt(53)) + ", " + (1+r.nextInt(53)) + ", " + (1+r.nextInt(53)) + ", " + (1+r.nextInt(53)) + ", " + (1+r.nextInt(53)));

                JOptionPane.showMessageDialog(null, lottoMsg + lottoNumbers);
                
                running = false;
            }else{
                JOptionPane.showMessageDialog(null, "You must type 1 or 2!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
}