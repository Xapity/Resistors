/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resistors;

import java.util.*;

/**
 *
 * @author camac2045
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] values = new int[9];
        System.out.println("What is your resistors colour code?"
                + "\nSerate each colour by hyphens");
        String[] colours = {"Black", "Brown", "Red", "Orange",
            "Yellow", "Green", "Blue", "Violet", "Grey", "White"};
//set up 2d array with values next to each colour
        for (int i = 0; i < 9; i++) {
            values[i] = i;
        }
//set up 2d array with values next to each colour
        String line = sn.nextLine();
        String[] inputs = line.split("-", 3);
        int sum, val1 = 0,val2 = 0,val3 = 0;
        for(int i = 0; i < 9; i++){
            if(inputs[0].equalsIgnoreCase(colours[i])){
                val1 = values[i];
            }
        }
        for(int i = 0; i < 9; i++){
            if(inputs[1].equalsIgnoreCase(colours[i])){
                val2 = values[i];
            }
        }
        for(int i = 0; i < 9; i++){
            if(inputs[2].equalsIgnoreCase(colours[i])){
                val3 = values[i];
            }
        }
        
        sum = (int) ((val1*10+val2)*(Math.pow(10,val3)));
        System.out.println(sum+ "ohms");
    }
    
    
}


