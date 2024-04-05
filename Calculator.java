import java.util.Scanner;
public class Shahad_Aljohani_Raghad_Alahmadi_C3E {
 public static void main (String[]args){
     System.out.println(" choose (2) for two number operation, choose (1) for one number operations"
             + "\n if you would like to know the average choose (3) ");
     Scanner x = new Scanner(System.in);
     int choice = x.nextInt();
     if (choice==2) {
         System.out.println("Choose your operation: " +
                 "\n 1. Addition of two numbers" +
                 "\n 2. Subtraction of two numbers" +
                 "\n 3. Multiplication of two numbers" +
                 "\n 4. Division of two numbers" +
                 "\n 5. Modulus (a % b)" +
                 "\n 6. Power (a^b) " );
         int twoNumberOP=x.nextInt();
         System.out.println("Write down the numbers you want to calculate: ");
         double number1=x.nextDouble();
         double number2=x.nextDouble();
         switch (twoNumberOP) {
             case 1: System.out.println(addition(number1,number2)); 
break;
    case 2: System.out.println(subtraction(number1, number2));
break;
    case 3: System.out.println(multiplication(number1,number2)); 
break;
    case 4: System.out.println(division(number1,number2)); 
break;
    case 5: System.out.println(remainder(number1, number2)); 
break;
    case 6: power(number1,number2);
break;
     }
     }
     else if (choice==1) {
     System.out.println("Choose your operations: "+
            "7. Square root of (x)\n" +
            "8. Factorial of a number (n!)\n" +
            "9. Log(n)\n" +
            "10. Sin(x)\n" +
            "11. Absolute value (|x|)\n" +         
            "12. Check if a given number is a palindrome or not.\n" +
            "13. Check if a number is a prime or not");
int oneNumberOP=x.nextInt();
System.out.println("Write down the number you want to calculate: ");
double number11=x.nextDouble();
     switch (oneNumberOP) {
          case 7: System.out.println(sqrt(number11));
break;
    case 8: System.out.println(factorial((int)number11));
break;
    case 9: System.out.println(number11);
break;
    case 10: System.out.println(sin(number11));
break;
    case 11: System.out.println(absoluteValue((float)number11));
break;
    case 12:System.out.println(palindrome((int)number11)); 
break;
    case 13: System.out.println(primeNumber(number11));
break;
 }
}
     else if (choice==3 ){
System.out.println("How many numbers you want to enter?");
 int n1 = x.nextInt();
 double[] array = new double[n1];
    for(int i=0; i<array.length; i++){
        System.out.println("Enter the number "+(i+1)+" : ");
        array[i] = x.nextDouble();
}
x.close();
average(n1,array);
 }
     
 } 
 public static double addition (double number1,double number2) {
    return number1+number2;
}
public static double subtraction(double number1, double number2) {
    double swap;
    double finalSub;
    if (number1>=number2) {
        return number1-number2; }
    else {
    swap=number1;
    number1=number2;
    number2=swap; }
    finalSub=number1-number2;
    return finalSub; }
public static double multiplication (double number1, double number2) {
return number1*number2;
}
public static double division (double number1,double number2) {
double swap;
    double finalDiv;
    if (number1>number2) {
        return (float)(number1/number2); }
    else if  (number1<number2){
    swap=number1;
    number1=number2;
    number2=swap; }
    finalDiv=number1/number2;
    return (float)finalDiv;
}
public static double remainder (double number1, double number2) {
    return number1%number2;
}
public static double sqrt (double number1){
    double temp;
	double sqrt = number1/2;
	do {
             temp=sqrt;
	     sqrt=(temp+(number1/temp))/2; }
        while ((temp-sqrt)!=0);
	return sqrt;
    }
public static void power (double number1,double number2) {
        double base=number1;
        long result=1;
        while (number2 != 0) {
           result*=base;
            --number2;}
        System.out.println(result);
}
public static int factorial (double number1) { 
 int fact = 1 ;
 for ( int i = 1 ; i <=number1 ; i++ ) {
 fact*=i;
 }
 return fact;
 }
public static float absoluteValue (float number1) {
     return (number1=number1<=0.0F? -(number1):number1);}   

public static double sin (double number1) {
 return Math.sin(number1);
}

public static boolean primeNumber (double number1) {
    if (number1 <= 1) {
 return false; }
 for (int i = 2; i < number1 ; i++) {
 if (number1 % i == 0)
 return false;}
 return true;
  }
public static boolean palindrome (int number1) {
    int digit1= number1%10;
    number1/=10;
    int digit2= number1%10;
    number1/=10;
    int digit3=number1%10;
    if (digit1==digit3) 
        return true;
    else
        return false;
}

public static void average(double n , double[]number1) {
       
double[] array = new double[0];
double sum = 0;

for(int i=0; i<array.length; i++){
 sum = sum + array[i];
}                 
double average = sum / array.length;
System.out.println("The average is: " + average);
    }  
}
