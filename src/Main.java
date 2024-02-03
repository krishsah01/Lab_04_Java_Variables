/**
 * @author krishkumarsah sahkr@mail.uc.edu
 */
public class Main
{
    public static void main(String[] args)
    {
     /* int age = 0;
        double salary = 0.0;
        String name = "Krish";
        boolean done = false;
      */
        int intOperandA = 23;
        int intOperandB = 17;
        int intSum = 0;
        int intProduct = 0;
        int intQuotient = 0;
        int intDifference = 0;
        int intModulo = 0; //remainder Output

        intSum = intOperandA + intOperandB ;
        System.out.println("The sum of "+ intOperandA + " and " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        intDifference = intOperandA - intOperandB ;
        System.out.println("The difference of "+ intOperandA + " and " + intOperandB + " is " + intDifference);
        intModulo = intOperandA % intOperandB ;
        System.out.println("The remainder of "+ intOperandA + " and " + intOperandB + " is " + intModulo);

        double doubleOperandA = 3.14;
        double doubleOperandB = 21.17;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleQuotient = 0;
        double doubleDifference = 0;
        double doubleModulo = 0;

        doubleSum = doubleOperandA + doubleOperandB ;
        System.out.println("The sum of "+ doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        doubleDifference = doubleOperandA - doubleOperandB ;
        System.out.println("The difference of "+ doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleModulo = doubleOperandA % doubleOperandB ;
        System.out.println("The remainder of "+ doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);

        double myLunchCost = 11.99;
        System.out.println("The cost of my lunch is " + myLunchCost);
        int kids_in_family = 2;
        System.out.println("Number of Kids in my family is " + kids_in_family);
        String is_it_raining = "Yes, it is!";
        System.out.println("Is it raining outside? " + is_it_raining);
        double gasPricePerGallon = 3.35;
        System.out.println("The price of gas per gallon is " + gasPricePerGallon);
        int myFavNum = 7;
        System.out.println("My favorite number is " + myFavNum);
        double myShoeSize = 9;
        System.out.println("My shoe size is " + myShoeSize);
        String birthMonth = "March";
        System.out.println("My birth month is " + birthMonth);
        String myName = "Krish Kumar Sah";
        System.out.println("My full name is " + myName);
    }
}