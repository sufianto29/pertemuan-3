/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables33;

/**
 *
 * @author Lenovo
 */
public class Variables33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bool = true;
        
        //int intVar = true; -> mistake
        int intVar1 = 1;
        int intVar2 = 2;
        //intVar3 = 3; -> mistake
        int intVar3 = 3;

        double doubleVar1, doubleVar2, doubleVar3, doubleVar4;
        doubleVar1 = 1.1;
        //doublevAr2 = 2.1; -> mistake
        doubleVar2 = 2.1;
        // double doubleVar3 = 3.1; -> mistake, karena sebelumnya sudah di-declare
        doubleVar3= 3.1;
        //mistake, doubleVar4 belum diinisialisasi
        doubleVar4 = 4.1;

        // String stringVar1 = 1; -> mistake
        String stringVar1 = "1";
        String stringVar2 = "2";

        //Don't edit these print statements
        System.out.println("bool = "        +bool);
        System.out.println("intVar1 = "     +intVar1);
        System.out.println("intVar2 = "     +intVar2);
        System.out.println("intVar3 = "     +intVar3);
        System.out.println("doubleVar1 = "  +doubleVar1);
        System.out.println("doubleVar2 = "  +doubleVar2);
        System.out.println("doubleVar3 = "  +doubleVar3);
        System.out.println("doubleVar4 = "  +doubleVar4);
        System.out.println("stringVar1 = "  +(stringVar1 +1));
        System.out.println("stringVar2 = "  +(stringVar2 +2));
    }
    
}
