/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.problems;

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
        
        //BREAK & TODO: do problem 2
        System.out.println("\n\n");
        // Problem #2
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        
    }
    
    
}
