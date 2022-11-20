package calcy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {

	Calculator calcy;
	
	@BeforeEach
	public void setup() {
	    System.out.println("inside setup");
		calcy=new Calculator();
	
	}
	
	@AfterEach
	public void clear() {
		System.out.println("inside clear");
	}
	
	/**
	 * scenario: positive numbers passed as input
	 * inputs: 2,5
	 * expectation: 7
	 */
	@Test
	public void testAdd_1() {
	    System.out.println("inside testAdd_1");
		int input1=2,input2=5;
		int expectation=7;
		int result=calcy.add(input1, input2);
	    assertEquals(expectation, result);     
	}
	
	/**
	 * scenario: negative numbers passed as input
	 * inputs: -2,-3
	 * expectation: -5
	 */
	@Test
	public void testAdd_2() {
		System.out.println("inside testAdd_2");
		int input1=-2, input2=-3;
		int expectation=-5;
		int result=calcy.add(input1, input2);
	    assertEquals(expectation, result);     
	}

	/**
	 * scenario: number is even
	 * inputs set for each test run :{4,110,1500}
	 * expectation :true
	 */
	@ParameterizedTest
	@ValueSource(ints = {4, 110,1500} )
	public void testIsEven_1(int input){
		System.out.println("nside test_isEven_1, input="+input);
    	boolean result=	calcy.isEven(input);
	    assertTrue(result);
	}
	
	/**
	 * scenario: number is even
	 * inputs set for each test run :{4,110,1500}
	 * expectation :true
	 */
	@ParameterizedTest
	@ValueSource(ints = {5, 111,1505} )
	public void testIsEven_2(int input){
		System.out.println("nside test_isEven_2, input="+input);
    	boolean result=	calcy.isEven(input);
	    assertFalse(result);
	}
	
	
}
