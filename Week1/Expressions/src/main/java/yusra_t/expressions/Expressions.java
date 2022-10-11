/**
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 11-10-2022
 * purpose: My first Hello World program in an IDE
 */

package yusra_t.expressions;

public class Expressions {

    public static void main(String[] args) {
        
        // Declare variables 
        int result;
        int operand1; 
        int operand2; 
        int operand3; 
        
        // Initialise operands 
        result = 0;
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2;
        
//Addition 
    System.out.println("Addition: ");

        result = 42 + 53; 
        System.out.println(result);
        
        result = operand1 + operand2;
        System.out.println(result);
          
        result = 1 + operand1;
        System.out.println(result);
        
        result = 1 + operand1 + operand2 + operand3;
        System.out.println(result);
        
        result = 2;
        result += 4;
        System.out.println(result);
        
        result += operand1;
        System.out.println(result);

// Subtraction
    System.out.println("Subtraction: ");

        result = 9 - 5;
        System.out.println(result);
        
        result = operand1 - operand2;
        System.out.println(result);
        
        result = 15 - operand1;
        System.out.println(result);
        
        result = 2;
        result -= 4;
        System.out.println(result);
        
        result -= operand1;
        System.out.println(result);
        
// Multiplication 
    System.out.println("Multiplication: ");
    
        result = 2 * 3;
        System.out.println(result);
        
        result = operand1 * operand2; 
        System.out.println(result);
        
        result = 2 * operand1;
        System.out.println(result);
        
        result = 2;
        result *= 4;
        System.out.println(result);
        
        result *= operand1; 
        System.out.println(result);
        
// Division and Modulus 
     System.out.println("Division and Modulus");
        
        result = 6 / 3;
        System.out.println(result);
        
        result = operand1 / operand2;
        System.out.println(result);
        
        // Modulus gets the remainder 
        
        result = operand1 % operand2;
        System.out.println(result);
        
        result = 20 / operand1;
        System.out.println(result);
        
        result = 40;
        result /= 4;
        System.out.println(result);
        
        result /= operand1;
        System.out.println(result); 
    }
}
