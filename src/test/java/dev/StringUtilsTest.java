package dev;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringUtilsTest   {
	
	@Parameters
	public static Collection<Object> datas(){
		List<Object> datas = new ArrayList<Object>();
		datas.add(new Object[]{"chat","chats", 1});
		datas.add(new Object[]{"machins","machine", 1});
		datas.add(new Object[]{"aviron","avion",1});
		datas.add(new Object[]{"distance","instance",2});
		datas.add(new Object[]{"chien","chine", 2});
		datas.add(new Object[]{null,null,-1});	
		return datas ;
	}
	
	@Parameter public String ch1;
	@Parameter(value=1) public String ch2;
	@Parameter(value=2) public int expect;
	
	@Test
	public void testlevenshteinDistance(){
		int result = StringUtils.levenshteinDistance(ch1, ch2);
		Assert.assertEquals(expect, result);
	}
}
