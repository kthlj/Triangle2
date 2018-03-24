package cn.tju.scs;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestTriangle1 {
	private int a;
    private int b;
    private int c;
    private String expected;
	private Triangle1 sanjiao;
	

	
	@Before
	public void setup() throws Exception{

		sanjiao =new Triangle1();
	
	}
	
	 public TestTriangle1(int a, int b, int c, String expected) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.expected = expected;
	    }
	 @Parameters
	    public static Collection<Object[]> getData() {
	        return Arrays.asList(new Object[][] { { 1, 0, 2, "not a triangle" }, { 2, 3, 2, "isosceles" },
	                { 5, 5, 5, "equilateral" }, { 2, 3, 4, "scalene" } });
	    }
   @Test
   public void testEqual(){
	   assertEquals(this.expected, sanjiao.form(a, b, c));

   }


}
