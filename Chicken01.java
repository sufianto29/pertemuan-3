/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chicken01;

/**
 *
 * @author Lenovo
 */
public class Chicken01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int eggsPerChicken;
        int chickenCount;
        int totalEggs;


        //SKENARIO PERTAMA
        eggsPerChicken = 5;
        chickenCount = 3;
        // senin siang
        totalEggs = eggsPerChicken * chickenCount;

        // Selesa pagi
        chickenCount = chickenCount + 1; // bisa chickenCount += 1 atau chickenCount++
       // selesa siang
       totalEggs = totalEggs + (eggsPerChicken * chickenCount);
       // bisa juga totalEggs += (eggsPerChicken * chickenCount)

       // Rabu pagi
       chickenCount = chickenCount / 2;
       totalEggs = totalEggs + (eggsPerChicken * chickenCount);

       System.out.println(totalEggs);

       // SKENARIO KEDUA

       // senin pagi
       eggsPerChicken = 4;
       chickenCount = 8;
       // senin siang
       totalEggs = eggsPerChicken * chickenCount;

       // Selasa pagi
       chickenCount = chickenCount += 1;
       // Selasa siang
       totalEggs += (eggsPerChicken * chickenCount);

       // Rabu pagi
       chickenCount = chickenCount / 2;
       totalEggs += (eggsPerChicken * chickenCount);

       System.out.println(totalEggs);
    }
    
}
