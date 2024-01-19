package net.javaguides.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.assertj.core.util.Arrays;

public class JavaTestConsumerAndPredicate {
	
	
	public static void main(String are[])
	{
		
		
		Consumer c= t -> System.out.println("printing from consumer"+t);
		
		c.accept(78);
		int[] l1= {1,3,5,7,8,8};
		
		List<Object> arl= Arrays.asList(l1);
		arl.stream().forEach(t->System.out.println("printing from for each  "+t));
	}

}
