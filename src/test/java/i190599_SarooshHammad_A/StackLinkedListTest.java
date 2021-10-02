package i190599_SarooshHammad_A;

import static org.junit.Assert.*;
import i190599_SarooshHammad_A.StackLinkedList.Node;

import org.junit.Test;

public class StackLinkedListTest {

	@SuppressWarnings("static-access")
	@Test
	public void pushPass() {
		StackLinkedList temp = new StackLinkedList();
		int[] expected= {-99,-45,-63,-39,-22,-13,-5,-77,-81};
		for(int i=8;i>=0;i--) {
			temp.push(expected[i]);
		}
		Node tempy = temp.head;
		for(int i=0;i<9;i++) {
			assertEquals(tempy.key, expected[i]);
			tempy=tempy.next;
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void popPass() {
		StackLinkedList Arr = new StackLinkedList();
		int[] actual = new int[100];
		int[] expected = new int[100];
		for(int i=0,j=2;i<8;i++,j-=2) {
			actual[i]=j;
		}
		for(int i=0,j=2;i<5;i++,j-=2) {
			expected[i]=j;
		}
		for(int i=0;i<8;i++) {
			Arr.push(actual[i]);
		}
		for(int i=0;i<3;i++) {
			Arr.pop();
		}
		Arr.display();
		Node tempy = Arr.head;
		for(int i=0,j=4;i<Arr.size;i++,j--) {
			assertEquals(expected[j],tempy.key);
			tempy=tempy.next;
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public void topPass() {
		StackLinkedList Arr = new StackLinkedList();
		int[] expected = new int[100];
		for(int i=0,j=2;i<5;i++,j-=2) {
			expected[i]=j;
		}
		for(int i=0;i<5;i++) {
			Arr.push(expected[i]);
		}
		Node tempy = Arr.head;
		int topVal=tempy.key;
		assertEquals(topVal,Arr.top());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void sizePass() {
		StackLinkedList Arr = new StackLinkedList();
		int[] expected = new int[100];
		for(int i=0,j=2;i<5;i++,j-=2) {
			expected[i]=j;
		}
		for(int i=0;i<5;i++) {
			Arr.push(expected[i]);
		}
		Node tempy = Arr.head;
		int si=0;
		while(tempy!=null) {
			si++;
			tempy=tempy.next;
		}
		assertEquals(si,Arr.size);
	}
}

