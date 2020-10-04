package Collections;

import java.util.ArrayList;
import java.util.Collection;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListCollection {
	
	@Test
	public void Test_List() throws Exception {
        Collection list = new ArrayList();
        list.add("ABC");
        list.add(10);

        Assert.assertEquals(false, list.isEmpty());

        int expectedSize = 2;
        Assert.assertEquals(expectedSize, list.size());

        Assert.assertEquals(true, list.contains("ABC"));
        Assert.assertEquals(false, list.contains("AbC"));

        Assert.assertEquals("ABC", list.iterator().next());

        for (Object each : list) {
            System.out.println(each);
        }
    }
}
