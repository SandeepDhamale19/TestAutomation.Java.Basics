package OOPs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Objects {

	@Test
	public void Test_Objects() {

		Rectangle r1 = new Rectangle();
		r1.setLength(10);
		r1.setBreadth(20);

		Rectangle r2 = r1;
		r2.setLength(50);
		r2.setBreadth(100);

		Rectangle r3 = new Rectangle();
		Rectangle r4 = new Rectangle();
		Rectangle r5 = new Rectangle();

		System.out.println(r1.getBreadth());
		Assert.assertEquals(r1.getBreadth(), 100);
		
		System.out.println(r1.getLength());
		Assert.assertEquals(r1.getLength(), 50);
	}

	public class Rectangle {

		int length; // or it can be float
		int breadth;

		public float getArea() {

			float area = length * breadth;
			return area;
		}

		public float findPerimeter() {

			int p = 2 * ( length + breadth );
			return p;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getBreadth() {
			return breadth;
		}

		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}
	}
}
