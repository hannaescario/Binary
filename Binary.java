/******************************************************************
 * Program 1: Conversion from binary to decimal representation
 * Programmer: Hanna Mae D. Escario
 *
 * Class: IT 121        Instructor: John Mark Gabrentina
 *
 * Pledge: I have neither given nor received unauthorized aid
 * on this program.     (signature on file)
 *
 * Description: This program converts a binary number to decimal.
 *
 * Input: Binary number
 *
 * Output: Decimal number
 *
 ******************************************************************/

// Imported packages
import javax.swing.*;

public class Binary
{

    // Main method
    public static void main(String[] args)
    {

        String binaryString=JOptionPane.showInputDialog("Enter a 6-bit binary number");

        int binary=Integer.parseInt(binaryString);

        int decimal=0;

        int bit;


        {
            bit=binary%10;
            decimal=decimal+bit;
            binary=binary/10;

            bit=binary%10;
            decimal=decimal+bit*56;

        }
/*  Other examples

    bit=binary%10;
    decimal=decimal+bit*2;
    binary=binary/10;

    bit=binary%10;
    decimal=decimal+bit*64;


    bit=binary%10;
    decimal=decimal+bit*1;
    binary+binary/10;

    bit=binary%10;
    decimal=decimal+bit*48;
*/
        int i=0;
        int power2=2;
        int len=binaryString.length();
        while (i<len) {
            bit=binary%10;//get the last bit (6th)
            decimal=decimal+bit*power2;//add it, multiplied by the corresponding power of 2
            binary=binary/10;//get rid of the 6th bit, now the 5th bit is last
            power2*=2;
            i++;
        }

        // Format output String
        String binaryOutput="Binary: " + binaryString;
        String decimalOutput="Decimal: " + decimal;

        // Output message
        JOptionPane.showMessageDialog(null, binaryOutput + "\n" + decimalOutput,
                "Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);

        // Exit
        System.exit(0);

    }
}

    //what is the largest binary number you can put into the program?
    // 111101
    //what is its decimal value?
    // 61