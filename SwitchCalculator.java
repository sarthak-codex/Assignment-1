//Program to show basic usage of calculator using switch case.

class SwitchCalculator
{
	public static void main(String[] args) 
	{
		float a=7, b=77, answer;
		char d='^';
                double value = Math.pow(a, b);
    
    switch (d)
		{
		case '+':
			answer = a+b;
				System.out.println("The answer of a+b= "+answer);
			break;
		
    case '-':
			answer=a-b;
				System.out.println("The answer of a-b= "+answer);
			break;
		
    case '*':
			answer=a*b;
				System.out.println("The answer of a*b= "+answer);
			break;
		
    case '/':
			answer=a/b;
				System.out.println("The answer of a/b= "+answer);
			break;
		
    case '^':
                        
		                System.out.println("The answer of a^b= "+value);
                        break;    
    default:
			System.out.println("Invalid.");
			}
   }
}
