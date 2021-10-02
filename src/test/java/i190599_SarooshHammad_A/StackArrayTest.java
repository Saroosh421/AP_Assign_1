package i190599_SarooshHammad_A;


import static org.junit.Assert.*;

import org.junit.Test;

public class StackArrayTest {

	@SuppressWarnings("static-access")
	@Test
	public void pushPass() {
		StackArray Arr = new StackArray();
		int[] expected = new int[100];
		for(int i=0,j=2;i<8;i++,j-=2) {
			expected[i]=j;
		}
		for(int i=0;i<8;i++) {
			Arr.push(expected[i]);
		}
		assertArrayEquals(expected,Arr.array);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void popPass() {
		StackArray Arr = new StackArray();
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
		for(int i=0;i<Arr.size;i++) {
		assertEquals(expected[i],Arr.array[i]);
		}
	}
}

