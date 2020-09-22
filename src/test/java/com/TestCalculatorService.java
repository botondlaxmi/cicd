package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	 Calculatorservice calc = new Calculatorservice();
	 
	 @Test
	 public void testSum() {
		     
		     Assertions.assertEquals(30, calc.sum());
	 }
	 
	 @Test
	 public void testSub() {

		     Assertions.assertEquals(-10, calc.subtract());
	 }
	 @Test
	 public void testmultiply() {

		     Assertions.assertEquals(200, calc.multiply());
	 }
	 @Test
	 public void testdivide() {

		     Assertions.assertEquals(0, calc.divide());
	 }
	 @Test
	 public void testquotient() {

		     Assertions.assertEquals(10, calc.quotient());
	 }
	 
}
