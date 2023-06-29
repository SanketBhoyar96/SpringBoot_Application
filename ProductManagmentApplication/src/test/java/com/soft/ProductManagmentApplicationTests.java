package com.soft;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import com.soft.model.User;
import com.soft.repositary.UserRepositary;

@SpringBootTest
class ProductManagmentApplicationTests {
		

//	@BeforeAll
//	public static void beforeClass() {
//		System.out.println("before Test ALL");
//	}

//	@BeforeEach
//	public void beforeMethodTest() {
//		System.out.println("before method case test::");
//	}
	
	
//	@Test
//	public void testfact_1() {
//		Factorialtest factexample= new Factorialtest();
//		int expectedresult=120;
//		System.out.println("test case 1 excution::");
//		int actualresult=factexample.findFactorial(5);
//		
//		assertThat(actualresult).isEqualTo(expectedresult);
//	}
//	@Test
//	public void testfact_2() {
//		Factorialtest factexample= new Factorialtest();
//		int expectedresult=120;
//		System.out.println("test case 2 excution::");
//		int actualresult=factexample.findFactorial(6);
//		
//		assertThat(actualresult).isEqualTo(expectedresult);
//	}
	
//	@AfterEach
//	public void AfterAlltest() {
//		System.out.println("After method case test::");
//	}
	
//	@AfterAll
//	public static void AfteerClass() {
//		System.out.println("After Test All");
//	}

}
