/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.problems;

import java.util.Scanner;

/**
 *
 * @author School
 */
public class practice2 {

    /**
     * @param args the command line arguments
     * Practice problem pdf 
     * https://docs.google.com/document/d/0B8qiHDiC8qnbd1BkY3BOLWdnMnc/edit?resourcekey=0-KO6kH4eJUVpeavApddfYFQ
     */
    public static void main(String[] args) {
        
        // Problem #1
        // A.
        System.out.println("Problem 1");
        System.out.println("1A.\n");
        
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = 6; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //BREAK
        System.out.println("\n1B.\n");
        // B.
        
        for(int i = 5; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = 5; k >= i; k--){
                System.out.print("&");
            }
            System.out.println("");
        }
        
        //BREAK
        System.out.println("\n1C.\n");
        // C.
        
        System.out.println("@");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 1; j++){
               System.out.print("@"); 
            }
            for(int k = 0; k <= i; k++){
                System.out.print(" ");
            }
            System.out.println("@");
        }
        for (int i = 0; i <= 6; i++) {
            System.out.print("@");
        }
        
        //BREAK 
        System.out.println("");
        System.out.println("\nProblem 2\n");
        // Problem #2
        
        for (int a = 1, b = 10, c = 11, d = 20, e = 21, f = 30; a <= 10; a++, b--, c++, d--, e++, f--) {
            System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
        }

        //BREAK 
        System.out.println("");
        System.out.println("\nProblem 3\n");
        // Problem #3
        
        //boxLetters();
             
        //BREAK 
        System.out.println("\nProblem 4\n");
        // Problem #4
        
        //sort10Int();
        
        //BREAK 
        System.out.println("\nProblem 5\n");
        // Problem #5
        
        exponentCalc();
        
    }
    
    //Methods
    
    //Problem #3 
    public static void boxLetters() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter rows:");
        int heightIN = scan.nextInt();
        System.out.println("Enter columns:");
        int widthIN = scan.nextInt();
        
        for (int i = 0; i < heightIN; i++) {
            for (int j = 0; j < widthIN; j++) {
            System.out.print("B ");
            }
            System.out.println("");
        }
    }
    
    //Problem #4
    public static void sort10Int() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 10 Integers:");
        int small, large;
        int p = 2;
        
        System.out.println("Num 1:");
        int a = scan.nextInt();
        large = a;
        small = a;
        
        while(p <= 10) {
            System.out.println("Num " + p + ":");
            int b = scan.nextInt();
            
            if (b < small) {
                small = b;
            }
            if (b > large) {
                large = b;
            }
            
            p++;
        }
        System.out.println("Largest int: " + large + ", Smallest int: " + small);
    }
    
    //Problem #5
    public static void exponentCalc() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter base/integer:");
        int b = scan.nextInt();
        System.out.println("Enter exponenet/power:");
        int e = scan.nextInt();
        int result = 1, i = 1;
        do {
            result = result * b;
            i++;
        }
        while(i == e);
        System.out.println(result);
        
    }
    
    
}
