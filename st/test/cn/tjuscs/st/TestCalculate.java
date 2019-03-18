package cn.tjuscs.st;

import org.junit.Assert;
import org.junit.Test;

import cn.tjuscs.st.Calculate;

public class TestCalculate {
	
	@Test
    //测试 Count()方法
    public void testCount1(){
		Calculate c = new Calculate();
        String result = c.Count(4);
        Assert.assertEquals(result, "Failure");
    }
 
	@Test
    //测试  Count()方法
    public void testCount2(){
		Calculate c = new Calculate();
        String result = c.Count(3);
        Assert.assertEquals(result, "Success");
    }
	@Test
    //测试  Count()方法
    public void testCount3(){
		Calculate c = new Calculate();
        String result = c.Count(85);
        Assert.assertEquals(result, "Success");
    }
}
