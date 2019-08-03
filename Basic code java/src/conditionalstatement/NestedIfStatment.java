package conditionalstatement;

public class NestedIfStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c=30;
		
		
		if (a>b)
		{
						
			   if(a>c)
			    {
				System.out.println("a is grater than b");
			    } else 
			    {
			    System.out.println("a is grater than b but less than c");
			    }
		 
		}else
		 {
		System.out.println("a is less than b ");
		 }
				
	}
		
	}


