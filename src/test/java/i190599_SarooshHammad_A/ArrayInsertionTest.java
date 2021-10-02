package i190599_SarooshHammad_A;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayInsertionTest {		
		
		@SuppressWarnings("static-access")
		@Test
		public void insertTestPassed() {
			ArrayInsertion ary= new ArrayInsertion();
			int[] array=new int[20];
			int[] expected=new int[20];
			for(int i=0,j=3;i<5;i++,j+=3) {
				expected[i]=j;
			}
			ary.insert(array,3,0);
			ary.insert(array,6,1);
			ary.insert(array,9,2);
			ary.insert(array,12,3);
			ary.insert(array,15,4);
			assertArrayEquals(expected,array);
		}
	
		@SuppressWarnings("static-access")
		@Test
		public void insertTestFailed() {
			ArrayInsertion ary2= new ArrayInsertion();
			int[] array2=new int[6];
			int[] expected2=new int[6];
			for(int i=0,j=3;i<6;i++,j+=3) {
				expected2[i]=j;
			}
			ary2.insert(array2,3,0);
			ary2.insert(array2,6,1);
			ary2.insert(array2,9,2);
			ary2.insert(array2,12,3);
			ary2.insert(array2,15,4);
			ary2.insert(array2,18,5);
			assertArrayEquals(expected2,array2);
		}
		
		@SuppressWarnings("static-access")
		@Test
		public void insertTestFailed2() {
			ArrayInsertion ary= new ArrayInsertion();
			int[] array=new int[6];
			int[] expected=new int[6];
			for(int i=0,j=3;i<5;i++,j+=3) {
				expected[i]=j;
			}
			ary.insert(array,6,1);
			ary.insert(array,12,3);
			ary.insert(array,9,2);
			ary.insert(array,15,4);
			ary.insert(array,3,0);
			assertArrayEquals(expected,array);
		}
		
	}


