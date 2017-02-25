package com.test.ouyang.interview;

import org.junit.Assert;
import org.junit.Test;

import com.ouyang.interview.Migu;

public class MiguTest {
	@Test
	public void testMigu1() throws Exception {
		int[] nums = {1,2,3};
		Assert.assertEquals(1, Migu.getStep(nums));
	}
	
	@Test
	public void testMigu2() throws Exception {
		int[] nums = {2,2,2};
		Assert.assertEquals(0, Migu.getStep(nums));
	}
	
	@Test
	public void testMigu3() throws Exception {
		int[] nums = {1,2,3,4,5};
		Assert.assertEquals(4, Migu.getStep(nums));
	}
	
	@Test
	public void testMigu4() throws Exception {
		int[] nums = {1,2,3,4,15};
		Assert.assertEquals(4, Migu.getStep(nums));
	}
}
