package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero() {
		Assert.assertEquals("zéro", "0");
	}

	@Test
	public void test_num2text_onze() {
		Assert.assertEquals("onze", "11");

	}
}
