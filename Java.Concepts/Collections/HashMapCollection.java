package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HashMapCollection {
	
	@Test
	public void HashMapCollection() {

		/*      KEY   : VALUE
		 *   "red"    : "apple"
		 *   "yellow" : "banana"
		 *   "white"  : "radish"
		 *   "green"  : "apple"
		 * */

		Map<String, String> fruits = new HashMap<>();
		fruits.put("red", "apple");
		fruits.put("yellow", "banana");
		fruits.put("white", "radish");
		fruits.put("green", "apple");

//		fruits.containsKey("red");      // returns true, if key is found
//		fruits.containsValue("apple");  // returns true, if value is found
//		fruits.size();                  // returns the size of the MAP
//		fruits.remove("red");      // Deletes the Entry whose key is "red"
//		fruits.clear();

		System.out.println(fruits.get("red"));

		for (Map.Entry pairEntry: fruits.entrySet()) {
			System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
		}
	}
	
	@Test
	public void Test_HasMap() throws Exception {
        Map map = new HashMap();
        map.put(21, "Enrico");
        map.put(3, "Anna");
        map.put(51, "Luca");
        map.put(913, "Luca");

        Assert.assertEquals(false, map.isEmpty());

        map.remove(21);

        Assert.assertEquals(3, map.size());
        Assert.assertEquals(true, map.containsKey(913));
        Assert.assertEquals(true, map.containsValue("Luca"));

        map.put(913, "Sara");

        Assert.assertEquals(3, map.size());
        Assert.assertEquals(false, map.containsValue("Enrico"));

        Assert.assertEquals(913, map.keySet().iterator().next());
        Assert.assertEquals("Sara", map.values().iterator().next());

        Set entrySet = map.entrySet();
        for (Object each : entrySet) {
            System.err.println(each);
        }
    }
}
