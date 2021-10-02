package i190599_SarooshHammad_A;

import static org.junit.Assert.*;

import org.junit.Test;

import i190599_SarooshHammad_A.QueueLinkedList.Node;

public class QueueLinkedListTest {

	
	@SuppressWarnings("static-access")
	@Test
	public void enqueueTestPassed1() {
		int[] expected= {11,-34,-56,29,93,76,85};
		QueueLinkedList temp = new QueueLinkedList();
		for(int i=0;i<7;i++) {
			temp .enqueue(expected[i]);
		}
		Node tempy= temp.head;
		int j=0;
		while(tempy!=null) {
			assertEquals(tempy.key,expected[j]);
			j++;
			tempy=tempy.next;
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void deQueueTestPassed() {
		QueueLinkedList temp = new QueueLinkedList();
		int[] actual = {11,-34,-56,29,93,76,85};
		int[] expected = {29,93,76,85};
		for(int i=0;i<7;i++) {
			temp.enqueue(actual[i]);
		}
		for(int i=0;i<3;i++) {
			temp.dequeue();
		}
		Node tempy= temp.head;
		int j=0;
		while(tempy!=null) {
			assertEquals(tempy.key,expected[j]);
			j++;
			tempy=tempy.next;
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void enqueueTestPassed2() {
		QueueLinkedList temp = new QueueLinkedList();
		int[] actual = {11,-34,-56,29,93,76,85};
		int[] expected= {29,93,76,85,1,2,3};
		for(int i=0;i<7;i++) {
			temp.enqueue(actual[i]);
		}
		for(int i=0;i<3;i++) {
			temp.dequeue();
		}
		for(int i=4;i<7;i++) {
			temp.enqueue(expected[i]);
		}
		Node tempy= temp.head;
		int j=0;
		while(tempy!=null) {
			assertEquals(tempy.key,expected[j]);
			j++;
			tempy=tempy.next;
		}
	}
}

