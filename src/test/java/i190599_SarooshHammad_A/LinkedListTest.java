package i190599_SarooshHammad_A;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import i190599_SarooshHammad_A.LinkedList.Node;

public class LinkedListTest {

	private LinkedList temp;

	@Before
	public void Initialization() {
		LinkedList temp = new LinkedList();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void pushFrontPassed() {
		int[] expected= {-99,-45,-63,-39,-22,-13,-5,-77,-81};
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
		int[] expected= {99,45,63,39,22,-13,-5,-77,-81};
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
	
	@SuppressWarnings("static-access")
	@Test
	public void popPassed() {
		int[] actual= {-99,45,-63,-39,22};
		//int[] expected= {-99,45};
		for(int i=0;i<5;i++) {
			temp.pushBack(actual[i]);
		}
		temp.pop(0);
		
		Node tempy = temp.head;
		for(int i=1;i<5;i++) {
			assertEquals(tempy.key, actual[i]);
			tempy=tempy.next;
		}
		temp.pop(3);
		
		tempy = temp.head;
		for(int i=1;i<4;i++) {
			assertEquals(tempy.key, actual[i]);
			tempy=tempy.next;
		}
		temp.pop(1);
		
		tempy = temp.head;
		assertEquals(tempy.key, 45);
		tempy=tempy.next;
		assertEquals(tempy.key, -39);
	}
}

