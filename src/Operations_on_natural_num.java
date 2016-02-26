import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Operations_on_natural_num {

	private  Set<Integer> set = new HashSet<Integer>();
	
	public Operations_on_natural_num(int []elems)
	{
		for(int x : elems)
		{
			if(x >0)
				set.add(x);
		}
	}
	
	public void add_elem(int elem)
	{
		if(elem >0)
			set.add(elem);
	}
	
	public int sum_values()
	{
		int result=0;
		for(int xx : set)
		{
			result += xx;
		}
		return result;
	}
	
	public void print_values()
	{
		for(int xx : set)
		{
			System.out.println(xx);
		}
	}
	public int subtract_values()
	{
		int result=(int) set.toArray()[0];
		System.out.println("res"+result);
		int z=0;
		
		for(int xx : set)
		{
			if(z==0)
			{
				z++;
				continue;
			}
				
			result -= xx;
			
		}
		return result;
	}
	
	public int product_values()
	{
		int result=1;
		for(int xx : set)
		{
			result *= xx;
		}
		return result;
	}
	
	public int divide_values()
	{
		int result=(int) set.toArray()[0];
		int z=0;
		for(int xx : set)
		{
			if(z==0)
			{
				z++;
				continue;
			}
			result /= xx;
		}
		return result;
	}
	
	public static void main(String args[])
	{
		int arr[] = new int[4];
		Random randomGenerator = new Random();
		
	    
	   for ( int d = 0 ; d < arr.length ; d++ )
	   {
	  	 arr[d] = randomGenerator.nextInt(100);
	   }

	   Operations_on_natural_num oon = new Operations_on_natural_num(arr);
	   
	   oon.print_values();
	   
	   System.out.println("Sum: "+oon.sum_values());
	   System.out.println("Subtract: "+oon.subtract_values());
	   System.out.println("Multiply: "+oon.product_values());
	   System.out.println("Divide: "+oon.divide_values());
	}
}
