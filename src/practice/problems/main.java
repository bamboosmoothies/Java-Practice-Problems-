/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.problems;

/**
 *
 * @author School
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //REVERSE YOUR WORDS!
        String r = reverse("crapdosis");
        System.out.println(r);
        
        System.out.println(reverse("chocolate"));
        System.out.println(reverse("A Block of Cheese"));
        System.out.println(reverse("racecar"));
        
        //
        
    }
    
    //reverse String method 
    /**
     * 
     * @param word
     * @return reverse String
     */
    public static String reverse(String s){
        //Declare and Initalize Array
        char[] letters = new char[s.length()];
        
        //Reverse for-loop and store reverse letter to Array
        int letterIndex = 0;
        for(int i = s.length()-1; i >= 0; i--){   
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        
        //for-loop to store to String to return
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            reverse += letters[i];
        }
        return reverse;
    }
    
}
