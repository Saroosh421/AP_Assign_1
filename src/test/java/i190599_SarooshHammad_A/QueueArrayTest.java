package i190599_SarooshHammad_A;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueArrayTest {
	
	
	@SuppressWarnings("static-access")
	@Test
	public void enqueueTestPassed() {
		@SuppressWarnings("unused")
		QueueArray queue = new QueueArray(7);
		int[] expected = new int[7];
		for(int i=0,j=-5;i<7;i++,j+=2) {
			expected[i]=j;
		}
		for(int i=0,j=-5;i<7;i++,j+=2) {
			queue.enqueue(j);
		}
		for(int i=0;i<7;i++) {
			assertEquals(expected[i],queue.dequeue());
		}
	}
	
	
	@SuppressWarnings("static-access")
	@Test//(expected = Exception.class)
	public void enqueueFailed() throws Exception {
		QueueArray temp = new QueueArray(7);
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
	@Test
	public void enqueueTestFailed() {
		@SuppressWarnings("unused")
		QueueArray queue = new QueueArray(7);
		int[] expected = new int[7];
		for(int i=0,j=1;i<7;i++,j+=2) {
			expected[i]=j;
		}
		for(int i=0,j=-5;i<7;i++,j+=2) {
			queue.enqueue(j);
		}
		for(int i=0;i<3;i++) {
			queue.dequeue();
		}
		for(int i=0,j=9;i<3;i++,j+=2) {
			queue.enqueue(j);
		}
		for(int i=0;i<7;i++) {
			assertEquals(expected[i],queue.dequeue());
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void dequeueTestPassed() {
		@SuppressWarnings("unused")
		QueueArray queue = new QueueArray(7);
		int[] expected = new int[4];
		for(int i=0,j=1;i<4;i++,j+=2) {
			expected[i]=j;
		}
		for(int i=0,j=-5;i<7;i++,j+=2) {
			queue.enqueue(j);
		}
		for(int i=0;i<3;i++) {
			queue.dequeue();
		}
		for(int i=0;i<4;i++) {
			assertEquals(expected[i],queue.dequeue());
		}
	}
	/*
	@SuppressWarnings("static-access")
	@Test
	public void dequeueTestFailed() {
		@SuppressWarnings("unused")
		QueueArray queue = new QueueArray(7);
		int expected = 90;
		for(int i=0,j=1;i<7;i++,j+=2) {
			queue.enqueue(j);
		}
		for(int i=0;i<7;i++) {
			queue.dequeue();
		}
		queue.enqueue(expected);
		assertEquals(expected,queue.array[queue.removePointer]);
	}	*/
}

