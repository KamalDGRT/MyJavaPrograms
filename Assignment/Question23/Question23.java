/*
Write a program that will count the number of character in a file.
*/

import java.io.*; 

class Question23 { 
    public static void main(String[] args) throws IOException  { 
        File file = new File("data.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 

        String line; 

        // Initializing counters 
        int characterCount = 0; 

        // Reading line by line from the file until a null is returned 
        while((line = reader.readLine()) != null)  { 
            if(!line.equals(""))             
                characterCount += line.length(); 
        } 
        System.out.println("Total number of characters = " + characterCount);
    } 
} 

/* Outptut after execution 

Total number of characters = 141

*/
