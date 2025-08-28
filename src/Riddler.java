/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Vikram Saluja
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        // Set the shift to 9
        int shift = 9;

        // Run for length of the encrypted text
        for(int i = 0; i < encrypted.length(); i++){
            // Set c to next charecter
            char c = encrypted.charAt(i);
            // Make sure that 'c' is a letter and no punctation or a space
            if(Character.isLetter(c)){
                int offset = (c - 'a' + shift) % 26;
                // Add the shifted charecter to the result
                decrypted += (char)('a' + offset);
            }
            else {
                // Add space and puncuation to the result
                decrypted += c;
            }
        }

        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String number = "";

        for(int i = 0; i < encrypted.length(); i++){
            char charecter = encrypted.charAt(i);

            // Check if the charecter is a space to know if it is a part of the same number or not
            if(charecter != ' '){
                number += charecter;
            }
            else{
                // When there is space, convert the number into its ascii value and add it to the string
                if(!number.equals("")){
                    int ascii = Integer.parseInt(number);
                    decrypted += (char) ascii;
                    // Reset variable for the next number
                    number = "";
                }
            }
        }

        // Checks to see if the all the numbers have been converted
        // If not then do the same for the last number
        if(!number.equals("")){
            int ascii = Integer.parseInt(number);
            decrypted += (char) ascii;
        }


        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
