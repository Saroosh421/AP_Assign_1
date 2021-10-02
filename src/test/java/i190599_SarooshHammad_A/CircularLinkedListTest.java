package i190599_SarooshHammad_A;

import static org.junit.Assert.*;

import org.junit.Test;

import i190599_SarooshHammad_A.CircularLinkedList.Node;

public class CircularLinkedListTest {

	@SuppressWarnings("static-access")
	@Test
	public void pushFrontPassed() {
		int[] expected= {44,67,21,58,39,71,85,94,16};
		CircularLinkedList temp = new CircularLinkedList();
		for(int i=8;i>=0;i--) {
			temp.pushFront(expected[i]);
		}
		Node tempy = temp.head;
		for(int i=0;i<9;i++) {
			assertEquals(tempy.key, expected[i]);
			tempy=tempy.next;
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void pushBackPassed() {
		int[] expected= {44,67,21,58,39,71,85,94,16};
		CircularLinkedList temp = new CircularLinkedList();
		for(int i=0;i<9;i++) {
			temp.pushBack(expected[i]);
		}
		Node tempy = temp.head;
		for(int i=0;i<9;i++) {
			assertEquals(tempy.key, expected[i]);
			tempy=tempy.next;
		}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void popFrontPassed() {
		int[] actual= {-99,-45,-63,-39,22,13,-5,77,81};
		int[] expected= {-5,77,81};
		CircularLinkedList temp = new CircularLinkedList();
		for(int i=0;i<9;i++) {
			temp.pushBack(actual[i]);
		}
		for(int i=0;i<6;i++) {
			temp.popFront();
		}
		Node tempy = temp.head;
		for(int i=0;i<3;i++) {
			assertEquals(tempy.key, expected[i]);
			tempy=tempy.next;
		}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void popBackPassed() {
		CircularLinkedList temp = new CircularLinkedList();
		int[] actual= {-99,45,-63,-39,22,-13,5,-77,81};
		int[] expected= {-99,45};
		for(int i=0;i<9;i++) {
			temp.pushBack(actual[i]);
		}
		for(int i=0;i<7;i++) {
			temp.popBack();
		}
		Node tempy = temp.head;
		for(int i=0;i<2;i++) {
			assertEquals(tempy.key, expected[i]);
			tempy=tempy.next;
		}
	}
}

