/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parsing01;

/**
 *
 * @author Lenovo
 */
public class Parsing01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String hargaBaju = "22";
        String persenPajak = "0.1";
        String gibberish = "blablabla";

        //Parse shirtPrice and taxRate, and print the total tax
        int intHrgBaju = Integer.parseInt(hargaBaju);
        double doublePersenPajak = Double.parseDouble(persenPajak);
        System.out.println("Total pajak: " + (intHrgBaju*doublePersenPajak));
        
         
        //Try to parse taxRate as an int
        //int intPersenPajak = Integer.parseInt(persenPajak);
        //error

        //Try to parse gibberish as an int
        //int intGibberish = Integer.parseInt(gibberish);
        //error
    }
    
}
