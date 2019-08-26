//To check leap year using only if-else

class LeapYearIfElse
 {
        public static void main(String[] args) 
        {
        int year;
        if((year % 400 == 0 && year % 100 == 0) || (year % 4 == 0))
            {
            System.out.println(+year"is a leap year");
            }
        else
           System.out.println(+year"is not a leap year");
        }   
  }
