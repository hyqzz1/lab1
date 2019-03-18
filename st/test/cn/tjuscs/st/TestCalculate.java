package cn.tjuscs.st;

import org.junit.Assert;
import org.junit.Test;

import cn.tjuscs.st.Calculate;

public class TestCalculate {
	
	@Test
    //���� Count()����
    public void testCount1(){
		Calculate c = new Calculate();
        String result = c.Count(4);
        Assert.assertEquals(result, "Failure");
    }
 
	@Test
    //����  Count()����
    public void testCount2(){
		Calculate c = new Calculate();
        String result = c.Count(3);
        Assert.assertEquals(result, "Success");
    }
	@Test
    //����  Count()����
    public void testCount3(){
		Calculate c = new Calculate();
        String result = c.Count(85);
        Assert.assertEquals(result, "Success");
    }
}
