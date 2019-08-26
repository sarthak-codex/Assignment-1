//4. Write a java program to find the greatest among 4 numbers using ternary operator.

class GreatestNo
   { 

public static void main(String args[])  
     {  

       int a = 15, b = 77, c = 67, d = 57, max;  

       max = (a > b && a > c && a > d) ? a : ((b > c && b > d) ?  b : (c > d ? c : d)); 

       System.out.println("Largest number is: " + max + );  
     }  
   } 

//OUTPUT
//Largest number is: 77
