package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero() {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}

	@Test
	public void test_num2text_un() {
		Assert.assertEquals("un", Convert.num2text("1"));

	}

	@Test
	public void test_num2text_deux() {
		Assert.assertEquals("deux", Convert.num2text("2"));

	}

	@Test
	public void test_num2text_trois() {
		Assert.assertEquals("trois", Convert.num2text("3"));

	}

	@Test
	public void test_num2text_quatre() {
		Assert.assertEquals("quatre", Convert.num2text("4"));

	}

	@Test
	public void test_num2text_cinq() {
		Assert.assertEquals("cinq", Convert.num2text("5"));

	}

	@Test
	public void test_num2text_six() {
		Assert.assertEquals("six", Convert.num2text("6"));

	}

	@Test
	public void test_num2text_sept() {
		Assert.assertEquals("sept", Convert.num2text("7"));

	}

	@Test
	public void test_num2text_huit() {
		Assert.assertEquals("huit", Convert.num2text("8"));

	}

	@Test
	public void test_num2text_neuf() {
		Assert.assertEquals("neuf", Convert.num2text("9"));

	}

	@Test
	public void test_num2text_dix() {
		Assert.assertEquals("dix", Convert.num2text("10"));

	}

	@Test
	public void test_num2text_onze() {
		Assert.assertEquals("onze", Convert.num2text("11"));

	}

	@Test
	public void test_num2text_douze() {
		Assert.assertEquals("douze", Convert.num2text("12"));

	}

	@Test
	public void test_num2text_treize() {
		Assert.assertEquals("treize", Convert.num2text("13"));

	}

	@Test
	public void test_num2text_quatorze() {
		Assert.assertEquals("quatorze", Convert.num2text("14"));

	}

	@Test
	public void test_num2text_quinze() {
		Assert.assertEquals("quinze", Convert.num2text("15"));

	}

	@Test
	public void test_num2text_seize() {
		Assert.assertEquals("seize", Convert.num2text("16"));

	}

	@Test
	public void test_num2text_dix_sept() {
		Assert.assertEquals("dix-sept", Convert.num2text("17"));

	}

	@Test
	public void test_num2text_dix_huit() {
		Assert.assertEquals("dix-huit", Convert.num2text("18"));

	}

	@Test
	public void test_num2text_dix_neuf() {
		Assert.assertEquals("dix-neuf", Convert.num2text("19"));

	}

	@Test
	public void test_num2text_vingt() {
		Assert.assertEquals("vingt", Convert.num2text("20"));

	}

	@Test
	public void test_num2text_quarante_quatre() {
		Assert.assertEquals("six virgule quatre", Convert.num2text("6.40"));

	}

	@Test
	public void test_num2text_soixante_six() {
		Assert.assertEquals("soixante-six", Convert.num2text("66"));

	}

	@Test
	public void test_num2text_0() {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}

	@Test
	public void test_num2text_1() {
		Assert.assertEquals("un", Convert.num2text("1"));
	}

	@Test
	public void test_num2text_2() {
		Assert.assertEquals("deux", Convert.num2text("2"));
	}

	@Test
	public void test_num2text_3() {
		Assert.assertEquals("trois", Convert.num2text("3"));
	}

	@Test
	public void test_num2text_4() {
		Assert.assertEquals("quatre", Convert.num2text("4"));
	}

	@Test
	public void test_num2text_5() {
		Assert.assertEquals("cinq", Convert.num2text("5"));
	}

	@Test
	public void test_num2text_6() {
		Assert.assertEquals("six", Convert.num2text("6"));
	}

	@Test
	public void test_num2text_7() {
		Assert.assertEquals("sept", Convert.num2text("7"));
	}

	@Test
	public void test_num2text_8() {
		Assert.assertEquals("huit", Convert.num2text("8"));
	}

	@Test
	public void test_num2text_9() {
		Assert.assertEquals("neuf", Convert.num2text("9"));
	}

	@Test
	public void test_num2text_10() {
		Assert.assertEquals("dix", Convert.num2text("10"));
	}

	@Test
	public void test_num2text_11() {
		Assert.assertEquals("onze", Convert.num2text("11"));
	}

	@Test
	public void test_num2text_12() {
		Assert.assertEquals("douze", Convert.num2text("12"));
	}

	@Test
	public void test_num2text_13() {
		Assert.assertEquals("treize", Convert.num2text("13"));
	}

	@Test
	public void test_num2text_14() {
		Assert.assertEquals("quatorze", Convert.num2text("14"));
	}

	@Test
	public void test_num2text_15() {
		Assert.assertEquals("quinze", Convert.num2text("15"));
	}

	@Test
	public void test_num2text_16() {
		Assert.assertEquals("seize", Convert.num2text("16"));
	}

	@Test
	public void test_num2text_17() {
		Assert.assertEquals("dix-sept", Convert.num2text("17"));
	}

	@Test
	public void test_num2text_18() {
		Assert.assertEquals("dix-huit", Convert.num2text("18"));
	}

	@Test
	public void test_num2text_19() {
		Assert.assertEquals("dix-neuf", Convert.num2text("19"));
	}

	@Test
	public void test_num2text_20() {
		Assert.assertEquals("vingt", Convert.num2text("20"));
	}

	@Test
	public void test_num2text_21() {
		Assert.assertEquals("vingt et un", Convert.num2text("21"));
	}

	@Test
	public void test_num2text_22() {
		Assert.assertEquals("vingt-deux", Convert.num2text("22"));
	}

	@Test
	public void test_num2text_23() {
		Assert.assertEquals("vingt-trois", Convert.num2text("23"));
	}

	@Test
	public void test_num2text_24() {
		Assert.assertEquals("vingt-quatre", Convert.num2text("24"));
	}

	@Test
	public void test_num2text_25() {
		Assert.assertEquals("vingt-cinq", Convert.num2text("25"));
	}

	@Test
	public void test_num2text_26() {
		Assert.assertEquals("vingt-six", Convert.num2text("26"));
	}

	@Test
	public void test_num2text_27() {
		Assert.assertEquals("vingt-sept", Convert.num2text("27"));
	}

	@Test
	public void test_num2text_28() {
		Assert.assertEquals("vingt-huit", Convert.num2text("28"));
	}

	@Test
	public void test_num2text_29() {
		Assert.assertEquals("vingt-neuf", Convert.num2text("29"));
	}

	@Test
	public void test_num2text_30() {
		Assert.assertEquals("trente", Convert.num2text("30"));
	}

	@Test
	public void test_num2text_31() {
		Assert.assertEquals("trente et un", Convert.num2text("31"));
	}

	@Test
	public void test_num2text_32() {
		Assert.assertEquals("trente-deux", Convert.num2text("32"));
	}

	@Test
	public void test_num2text_33() {
		Assert.assertEquals("trente-trois", Convert.num2text("33"));
	}

	@Test
	public void test_num2text_34() {
		Assert.assertEquals("trente-quatre", Convert.num2text("34"));
	}

	@Test
	public void test_num2text_35() {
		Assert.assertEquals("trente-cinq", Convert.num2text("35"));
	}

	@Test
	public void test_num2text_36() {
		Assert.assertEquals("trente-six", Convert.num2text("36"));
	}

	@Test
	public void test_num2text_37() {
		Assert.assertEquals("trente-sept", Convert.num2text("37"));
	}

	@Test
	public void test_num2text_38() {
		Assert.assertEquals("trente-huit", Convert.num2text("38"));
	}

	@Test
	public void test_num2text_39() {
		Assert.assertEquals("trente-neuf", Convert.num2text("39"));
	}

	@Test
	public void test_num2text_40() {
		Assert.assertEquals("quarante", Convert.num2text("40"));
	}

	@Test
	public void test_num2text_71() {
		Assert.assertEquals("soixante et onze", Convert.num2text("71"));
	}
	
	@Test
	public void test_num2text_81() {
		Assert.assertEquals("quatre-vingt-un", Convert.num2text("81"));
	}

	@Test
	public void test_num2text_98() {
		Assert.assertEquals("quatre-vingt-dix-huit", Convert.num2text("98"));
	}

	@Test
	public void test_num2text_404() {
		Assert.assertEquals("quatre cent quatre", Convert.num2text("404"));
	}

	@Test
	public void test_num2text_231() {
		Assert.assertEquals("deux cent trente et un", Convert.num2text("231"));
	}
}
