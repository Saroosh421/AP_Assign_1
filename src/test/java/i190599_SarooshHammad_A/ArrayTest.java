package i190599_SarooshHammad_A;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayTest {
	private Array array1;

	@Before
	public void Initialization() {
		Array array1 = new Array();
	}

	@SuppressWarnings("static-access")
	@Test
	public void insertTestPassed() {
		int[] expected=new int[100];
		for(int i=0, j=9;i<5;i++,j-=2) {
			expected[i]=j;
		}
		for(int j=0,i=9;j<5;j++,i-=2) {
			array1.insert(i, j);
		}
		assertArrayEquals(expected,array1.array);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void insertTestFailed() {
		int[] expected=new int[100];
		expected[0]=9;expected[1]=7;expected[2]=5;expected[3]=1;expected[4]=3;
		array1.insert(9, 0);
		array1.insert(7, 1);
		array1.insert(5, 2);
		array1.insert(3, 4);
		array1.insert(1, 3);
		assertArrayEquals(expected,array1.array);
	}
	

	@SuppressWarnings("static-access")
	@Test
	public void deleteTestFailed() {
		int[] expected=new int[100];
		expected[0]=9;expected[1]=7;expected[2]=5;expected[3]=1;
		for(int i=0,j=9;i<5;i++,j-=2) {
			array1.insert(j, i);
		}
		array1.delete(3);
	//	array1.display();
	//	for(int i=0;i<100;i++) {
	//		System.out.println(array1.array[i]);
	//	}
		assertArrayEquals(expected,array1.array);
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public void linearSearchTestPassed() {
		boolean find = false;
		for(int i=0,j=9;i<5;i++,j-=2) {
			array1.insert(j, i);
		}
		if(Array.linearSearch(3)) {
			find = true;
		}
		assertTrue(find);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void binarySearchTestPassed() {
		Array array1 = new Array();
		boolean find = false;
		for(int i=0,j=10;i<5;i++,j-=2) {
			array1.insert(j, i);
		}
		//array1.display();
		if(array1.binarySearch(6,0,4)) {
			find = true;
		}
		assertEquals(true,find);
	}

	@SuppressWarnings("static-access")
	@Test
	public void binarySearchTestFailed() {
		Array array1 = new Array();
		boolean find = false;
		for(int i=0,j=10;i<5;i++,j-=2) {
			array1.insert(j, i);
		}
		//array1.display();
		if(array1.binarySearch(8,0,4)) {
			find = true;
		}
		assertEquals(true,find);
	}
	

	@SuppressWarnings("static-access")
	@Test
	public void bubbleSortTestPassed() {
		Array array1 = new Array();
		int[] expected=new int[100];
		for(int i=0,j=2;i<5;i++,j+=2) {
			expected[i]=j;
		}
		array1.insert(6, 0);
		array1.insert(2, 1);
		array1.insert(8, 2);
		array1.insert(4, 3);
		array1.insert(10, 3);
		//array1.display();
		array1.bubbleSort();
		//array1.display();
		assertArrayEquals(expected,array1.array);
	}

}

