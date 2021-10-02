package i190599_SarooshHammad_A;

import static org.junit.Assert.*;

import org.junit.Test;


public class QueueLinkedListImplementationTest {

	@SuppressWarnings("static-access")
	@Test//(expected = Exception.class)
	public void enqueuePassed() throws Exception {
		QueueLinkedListImplementation temp = new QueueLinkedListImplementation(7);
		int[] expected = new int[7];
		for(int i=0,j=5;i<7;i++,j+=3) {
			expected[i]=j;
		}
		for(int i=0,j=5;i<7;i++,j+=3) {
			temp.enqueue(j);
		}
		int tempy1= temp.addPointer;
		int tempy2= temp.removePointer;
		while(tempy2<tempy1) {
			assertEquals(expected[tempy2],temp.array[tempy2]);
			tempy2++; 
		}
	}

	@SuppressWarnings("static-access")
	@Test//(expected = Exception.class)
	public void enqueueFailed() throws Exception {
		QueueLinkedListImplementation temp = new QueueLinkedListImplementation(7);
		int[] expected = {0,8,11,14,17,20,23};//{5,8,11,14,17,20,23}
		int[] actual = new int[7];
		for(int i=0,j=5;i<7;i++,j+=3) {
			actual[i]=j;
		}
		for(int i=0;i<7;i++) {
			temp.enqueue(actual[i]);
		}
		temp.dequeue();
		temp.enqueue(0);
		//temp.display();
		int tempy2 = 0;		
		while(tempy2<temp.array.length) {
			assertEquals(expected[tempy2],temp.array[tempy2]);
			tempy2++; 
		}
	}	
	
	@SuppressWarnings("static-access")
	@Test//(expected = Exception.class)
	public void dequeuePassed() throws Exception {
		QueueLinkedListImplementation temp = new QueueLinkedListImplementation(7);
		int[] expected = new int[7];
		for(int i=0,j=5;i<7;i++,j+=3) {
			expected[i]=j;
		}
		for(int i=0,j=5;i<7;i++,j+=3) {
			temp.enqueue(j);
		}
		for(int i=0;i<3;i++) {
			temp.dequeue();
		}
		int tempy1= temp.addPointer;
		int tempy2= temp.removePointer;
		while(tempy2<tempy1) {
			assertEquals(expected[tempy2],temp.array[tempy2]);
			tempy2++; 
		}
	}
	
	@SuppressWarnings({ "unlikely-arg-type" })
	@Test
	public void sizeTest() {
		QueueLinkedListImplementation temp = new QueueLinkedListImplementation(7);
		int si = 0;
		while(temp.removePointer!=temp.addPointer) {
			si++;
			temp.removePointer++;
		}
		equals(si == temp.size()); 
	}
	
	@Test
	public void queueEmptyTest() throws Exception {
		boolean emp=true;
		QueueLinkedListImplementation temp = new QueueLinkedListImplementation(7);
		if(temp.removePointer!=temp.addPointer) {
			emp=false;
		}
		if(emp) {
			assertTrue(emp == temp.empty());
		}
		else {
			assertFalse(emp == temp.empty());
		}
		
	}
}

