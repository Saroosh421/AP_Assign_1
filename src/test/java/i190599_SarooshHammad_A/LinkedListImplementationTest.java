package i190599_SarooshHammad_A;

import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedListImplementationTest {
	
	@SuppressWarnings("static-access")
	@Test
	public void pushFrontPassed() {
		LinkedListImplementation temp = new LinkedListImplementation();
		int[] expected= {-99,-45,-63};
		for(int i=2;i>=0;i--) {
			temp.pushFront(expected[i]);
		}
		LinkedListImplementation tempy = temp.headPointer;
		for(int i=0;i<3;i++) {
			assertEquals(tempy.data, expected[i]);
			tempy=tempy.nextPointer;
		}
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public void addPassed() {
		LinkedListImplementation temp = new LinkedListImplementation();
		int[] expected= {-99,-45,-63,39,22,-13};
		int[] actual= {39,22,-13};
		for(int i=0;i<3;i++) {
			temp.pushBack(actual[i]);
		}
		LinkedListImplementation tempy = temp.headPointer;
		for(int i=0;i<3;i++) {
			assertEquals(tempy.data, expected[i]);
			tempy=tempy.nextPointer;
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void pushBackPassed() {
		LinkedListImplementation temp = new LinkedListImplementation();
		int[] expected = {-99,-45,-63,39,22,-13,-5,-77};
		int[] actual = {-5,-77};
		for(int i=0;i<2;i++) {
			temp.pushBack(expected[i]);
		}
		LinkedListImplementation tempy = temp.headPointer;
		for(int i=0;i<2;i++) {
			assertEquals(tempy.data, expected[i]);
			tempy=tempy.nextPointer;
		}
	}
	
	@SuppressWarnings("static-access")
	@Test//(expected = Exception.class)
	public void topFrontPassed() throws Exception {
		LinkedListImplementation temp = new LinkedListImplementation();
		int expected = temp.headPointer.data;
		//System.out.println(temp.topFront());
		//System.out.println(expected);
		assertEquals(temp.topFront(),expected);
	}
	
	@SuppressWarnings("static-access")
	@Test(expected = Exception.class)
	public void topBackPassed() throws Exception {
		LinkedListImplementation temp = new LinkedListImplementation();
		int expected = temp.tailPointer.data;
		assertEquals(temp.topBack(),expected);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void sizePassed() {
		LinkedListImplementation temp = new LinkedListImplementation();
		LinkedListImplementation temp1 = temp.headPointer;
		int expected = 0;
		while(temp1!=null) {
			expected++;
			temp1=temp1.nextPointer;
		}
		assertEquals(temp.size(),expected);
	}
	
	@SuppressWarnings("static-access")
	@Test(expected = Exception.class)
	public void popFrontPassed() throws Exception {
		LinkedListImplementation temp = new LinkedListImplementation();
		LinkedListImplementation temp1 = temp.headPointer;
		LinkedListImplementation temp2 = temp.headPointer;
		int[] expected = new int[50];
		int i=0;
		if(temp1!=null) {
			temp1=temp1.nextPointer;
		}
		if(temp1!=null) {
			expected[i]=temp1.data;
			temp1=temp1.nextPointer;
		}
		temp2=temp2.nextPointer;
		for(int j=0;temp2!=null;j++) {
			assertEquals(temp2.data,expected[i]);
		}
	}
}

