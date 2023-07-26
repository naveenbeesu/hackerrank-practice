package com.java.ah.practice;

import org.junit.jupiter.api.Test;

public class ComplementaryDNATest {
	
	//Test case to test makeComplement
	@Test
	public void test01() {
       assertEquals("TTTT", ComplementaryDNA.makeComplement("AAAA"));
    }
	
    @Test
    public void test02() {
       assertEquals("TAACG", ComplementaryDNA.makeComplement("ATTGC"));
    }
    
    @Test
    public void test03() {
       assertEquals("CATA", ComplementaryDNA.makeComplement("GTAT"));
    } 

}
