import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class add_test {

	@Test
	public void test() {
		int arr[] = new int[4];
		Random randomGenerator = new Random();
		
		int sum = 0;
	    
	   for ( int d = 0 ; d < arr.length ; d++ )
	   {
	  	 arr[d] = randomGenerator.nextInt(100);
	  	 sum+=arr[d];
	   }
	   
		Operations_on_natural_num junit = new Operations_on_natural_num(arr);
		assertEquals(sum,junit.sum_values());
	}

}
