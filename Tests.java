package com.rechnen.main.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class Tests {

	
	
	@Test
	public void testAcuracy() {
		BigDecimal bm = new BigDecimal("2000000000.5");
		String str = "2000000000.5";
		assertNotEquals(bm, str);
	}
	
	@Test
	public void testAcuracy1() {
		BigDecimal bm = new BigDecimal("2000000000.6");
		String str = "2000000000.6";
		assertEquals(bm.toString(), str);
	}
	
	@Test
	public void testAcuracy2() {
		BigDecimal bm = new BigDecimal("2000000000");
		int inv = 2000000000;
		assertNotEquals(bm.toString(), inv);
	}
	
	@Test
	public void testAcuracy3() {
		BigDecimal bm = new BigDecimal("2000000000");
		int inv = 2000000000;
		assertEquals(Integer.valueOf(bm.toString()), inv);
	}
	
	@Test
	public void testAcuracy4() {
		BigDecimal bm = new BigDecimal("2000000000");
		int inv = 2000000000;
		assertEquals(bm.toString(), String.valueOf(inv));
	}
	
	@Test
	public void testAcuracy5() {
		BigDecimal bm = new BigDecimal("2000000000.5");
		double dv = 2000000000.5;
		assertNotEquals(bm, dv);
	}
	
	@Test
	public void testAcuracy6() {
		BigDecimal bm = new BigDecimal("2000000000.5");
		double dv = 2000000000.5;
		assertNotEquals(bm, String.valueOf(dv));
	}
	
	@Test
	public void testAcuracy7() {
		BigDecimal bm = new BigDecimal("2000000000.5");
		double dv = 2000000000.5;
		assertNotEquals(bm.toString(), String.valueOf(dv));
	}
	
	@Test
	public void testAcuracy8() {
		BigDecimal bm = new BigDecimal("2000000000.5");
		double dv = 2000000000.5;
		assertNotEquals(bm.toString(), Double.valueOf(dv));
	}
	
	@Test
	public void testAcuracy9() {
		BigDecimal bm = new BigDecimal("2000000000.5");
		double dv = 2000000000.5;
		assertNotEquals(bm, Double.valueOf(dv));
	}
	
	@Test
	public void testAcuracy10() {
		BigDecimal bm = new BigDecimal("2000000000.5");
		double dv = 2000000000.5;
		assertEquals(bm.doubleValue(), Double.valueOf(dv));
	}
	
	@Test
	public void testAcuracy11() {
		BigDecimal bm = new BigDecimal("2000000000.5");
		double dv = 2000000000.5;
		assertEquals(bm.doubleValue(), dv);
	}
	
	@Test
	public void testAcuracy12() {
		BigDecimal bm = new BigDecimal("2000000000.5");
		BigDecimal bm1 = new BigDecimal("1000000000.3");
		BigDecimal bm3 = bm.subtract(bm1);
		assertEquals(bm3.doubleValue(), 1000000000.2);
	}
	
	@Test
	public void testAcuracy13() {
		BigDecimal bm = new BigDecimal("1.5");
		BigDecimal bm1 = new BigDecimal("2.2");
		BigDecimal bm3 = bm.plus();
		assertNotEquals(bm3.doubleValue(), Double.valueOf(3.7));
	}
	
	@Test
	public void testAcuracy14() {
		BigDecimal bm = new BigDecimal("1.5");
		BigDecimal bm1 = new BigDecimal("2.2");
		BigDecimal bm3 = bm.plus();
		assertNotEquals(bm3, 3.7);
	}
	
	@Test
	public void testAcuracy15() {
		BigDecimal bm = new BigDecimal("1.5");
		BigDecimal bm1 = new BigDecimal("2.2");
		BigDecimal bm3 = bm.plus();
		assertNotEquals(bm3.doubleValue(), 3.7);
	}
	
	@Test
	public void testAcuracy16() {
		BigDecimal bm = new BigDecimal("3");
		BigDecimal bm1 = new BigDecimal("3");
		BigDecimal bm3 = bm.divide(bm1);
		assertEquals(bm3.doubleValue(), 1);
	}
	
	@Test
	public void testAcuracy17() {
		BigDecimal bm = new BigDecimal("9");
		BigDecimal bm1 = new BigDecimal("4");
		BigDecimal bm3 = bm.divide(bm1);
		assertEquals(bm3.doubleValue(), 2.25);
	}
	
	@Test
	public void testAcuracy18() {
		BigDecimal bm = new BigDecimal("9");
		BigDecimal bm1 = new BigDecimal("5");
		BigDecimal bm3 = bm.multiply(bm1);
		assertEquals(bm3.doubleValue(), 45);
	}
	
	@Test
	public void testAcuracy19() {
		BigDecimal bm = new BigDecimal("9");
		BigDecimal bm1 = new BigDecimal("5.2");
		BigDecimal bm3 = bm.multiply(bm1);
		assertEquals(bm3.doubleValue(), 46.8);
	}
	
	@Test
	public void testAcuracy20() {
		BigDecimal bm = new BigDecimal("11");
		BigDecimal bm1 = new BigDecimal("5.7");
		BigDecimal bm3 = bm.multiply(bm1);
		assertEquals(bm3.doubleValue(), 62.7);
	}
	
	@Test
	public void testAcuracy21() {
		BigDecimal bm = new BigDecimal("11.1");
		BigDecimal bm1 = new BigDecimal("5.7");
		BigDecimal bm3 = bm.multiply(bm1);
		assertEquals(bm3.doubleValue(), 63.27);
	}


	

}
