package i190599_SarooshHammad_A;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueDequeueImplementationTest {

	@SuppressWarnings("static-access")
	@Test//(expected = Exception.class)
	public void addLeftPassed() throws Exception {
		QueueDequeueImplementation temp = new QueueDequeueImplementation(7);
		int[] expected = new int[7];
		for(int i=0,j=5;i<7;i++,j+=3) {
			expected[i]=j;
		}
		for(int i=0,j=5;i<7;i++,j+=3) {
			temp.addLeft(j);
		}
		temp.display();
		int tempy1= temp.leftPointer;
		int tempy2= temp.rightPointer;
		while(tempy1<tempy2) {
			assertEquals(expected[tempy1],temp.array[tempy1]);
			tempy1++; 
		}
	}
	
	@SuppressWarnings("static-access")
	@Test//(expected = Exception.class)
	public void addRightPassed() {
		QueueDequeueImplementation temp = new QueueDequeueImplementation(7);
		int[] expected = new int[7];
		for(int i=0,j=5;i<7;i++,j+=3) {
			expected[i]=j;
		}
		for(int i=0,j=23;i<7;i++,j-=3) {
			temp.addRight(j);
		}
		//temp.display();
		int tempy1= temp.leftPointer;
		int tempy2= temp.rightPointer;
		while(tempy1<tempy2) {
			assertEquals(expected[tempy1],temp.array[tempy1]);
			tempy1++; 
		}
	}

}

