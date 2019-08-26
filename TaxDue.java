class TaxDue
{

	public static void main(String[] args) 
	{
      double sal = 20000.00, tax;
      double a = 0.00, b = 15000.00, c = 30000.00, d = 50000.00, e = 80000.00;
      int f = -1;
      
      if((sal>=0.00)&&(sal<=14999.99))
    	  {
        tax=0.00+((15/100)*(sal-a));
		    System.out.println("Tax due is: " +tax+ "$");
         }
      else if((sal>=15000.00)&&(sal<=29999.99))
    	   {
         tax=2250.00+((18/100)*(sal-b));
		     System.out.println("Tax due is: "+tax+ "$");
         }       
      else if((sal>=30000.00)&&(sal<=49999.99))
    	  {
        tax=5400.00+((22/100)*(sal-c));
		    System.out.println("Tax due is: " +tax+ "$");
        }
      else if((sal>=50000.00)&&(sal<=79999.99))
    	  {
        tax=11000.00+((27/100)*(sal-d));
		    System.out.println("Tax due is: " +tax+ "$");
        } 
      else if((sal>=80000.00)&&(sal<=150000.00))
    	  {
        tax=21600.00+((33/100)*(sal-e));
		    System.out.println("Tax due is: " +tax+ "$");
        }
      else
        {
	      System.out.println(+f+ " as salary is outside the range");
        }
	}
}
