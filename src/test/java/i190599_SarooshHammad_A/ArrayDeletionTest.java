package i190599_SarooshHammad_A;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayDeletionTest {
	
	@SuppressWarnings("static-access")
	@Test
	public void DeletionTestPassed1() {
		ArrayDeletion ary= new ArrayDeletion();
		int[] array=new int[6];
		int[] expected=new int[6];
		for(int i=0,j=8;i<5;i++,j+=4) {
			expected[i]=j;
		}
		expected[5]=-1;
		for(int i=0,j=4;i<6;i++,j+=4) {
			array[i]=j;
		}
		ary.delete(array,0);
		assertArrayEquals(expected,array);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void DeletionTestPassed2() {
		ArrayDeletion ary= new ArrayDeletion();
		int[] array=new int[5];
		int[] expected=new int[5];
		expected[0]=5;expected[1]=1;expected[2]=-5;expected[3]=-10;
		expected[4]=-1;
		array[0]=5;array[1]=-1;array[2]=1;array[3]=-5;array[4]=-10;
		ary.delete(array,1);
		assertArrayEquals(expected,array);
	}
}
