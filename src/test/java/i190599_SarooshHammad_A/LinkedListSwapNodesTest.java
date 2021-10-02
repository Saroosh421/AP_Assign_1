package i190599_SarooshHammad_A;


import static org.junit.Assert.*;
import i190599_SarooshHammad_A.LinkedListSwapNodes.Node;
import org.junit.Test;

public class LinkedListSwapNodesTest {


	@SuppressWarnings("static-access")
	@Test
	public void pushFrontPassed() {
		LinkedListSwapNodes temp = new LinkedListSwapNodes();
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
		LinkedListSwapNodes temp = new LinkedListSwapNodes();
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
	public void swapPassed() {
		LinkedListSwapNodes temp = new LinkedListSwapNodes();
		int[] actual= {-22,-13,-5,-77,-81};
		int[] expected= {-81,-13,-5,-77,-22};
		for(int i=0;i<5;i++) {
			temp.pushBack(actual[i]);
		}
		temp.swap();
		Node tempy = temp.head;
		for(int i=0;i<5;i++) {
			assertEquals(tempy.key, expected[i]);
			tempy=tempy.next;
		}
		//If only 1 node
		LinkedListSwapNodes temp1 = new LinkedListSwapNodes();
		actual[0]=-5;
		expected[0]=-5;
		temp1.pushBack(actual[0]);
		tempy = temp1.head;
		assertEquals(tempy.key, expected[0]);
	}
	
}

