package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HashSetCollection {
	
	@Test
	public void Test_HashSet() {

		// Set demonstration using HashSet

		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(23);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(10);

		for (int element: hashSet) {
			System.out.println(element + " ");
		}

//		hashSet.isEmpty();      // returns true, if Set is empty
//		hashSet.contains(10);   // returns true, if the element is found
//		hashSet.remove(23);  // returns true, if the element was deleted
//		hashSet.clear();        // Deletes all element

		System.out.println();

		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(23);
		treeSet.add(4);
		treeSet.add(4);
		treeSet.add(4);
		treeSet.add(10);
		treeSet.add(1);

		for (int element: treeSet) {
			System.out.println(element + " ");
		}
	}
	
	@Test
    public void Test_HashSets() throws Exception {
        Set set = new HashSet();
        set.add(10);
        set.add(1);
        set.add(-1);
        set.add(1);
        set.add(10);

        Assert.assertEquals(false, set.isEmpty());

        int expectedSize = 3;
        Assert.assertEquals(expectedSize, set.size());

        Assert.assertEquals(false, set.contains("10"));
        Assert.assertEquals(true, set.contains(1));

        Assert.assertEquals(-1, set.iterator().next());

        for (Object each : set) {
            System.out.println(each);
        }
    }
}
