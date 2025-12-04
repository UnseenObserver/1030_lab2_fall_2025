/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eecs1020_lab2_pawloski;

import java.util.Scanner;

/**
 *
 * @author Charlotte Pawloski
 */
public class Main {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int[] chptList = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      boolean[] bolChptList = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
      boolean some = false;
    
      for(int i = 1; i < 16; i++) {
        chptList[i] = scnr.nextInt();
      }

      for(int i = 1; i < 16; i++) {
        if(chptList[i] == 1) {
            bolChptList[i] = true;
        }
      }

      for(int i = 1; i <= 16; i++) {
        group:
        if(bolChptList[i]) {
            some = true;
            System.out.print(i);
            for(int j = i+1; j <=16; j++) {
                if(!bolChptList[j]) {
                    if(((j - 1) - i) > 1) {
                        System.out.print("-" + (j-1) + " ");
                    } else {
                        if(i != j-1) {
                            System.out.print(" " + (j-1) + " ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    i = j;
                    break group;
               }
            }
        }
      }
      if(!some) {
        System.out.print("None ");
      }

        System.out.println();
   }
}
