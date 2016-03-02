package test;

import org.junit.Assert;
import org.junit.Test;

import core.main;

public class Test1 {
	
	@Test
	public void test(){
		Assert.assertEquals(main.helloBello(), "Hello Bello");
		Assert.assertNotNull(main.getModel());
		Assert.assertNotNull(main.getNullModel());
	}

}
