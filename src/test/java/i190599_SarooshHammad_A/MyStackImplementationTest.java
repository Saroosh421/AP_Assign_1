package i190599_SarooshHammad_A;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackImplementationTest {

	@SuppressWarnings("static-access")
	@Test//(expected = Exception.class)
	public void pushPass() throws Exception {
		MyStackImplementation temp = new MyStackImplementation(7);
		int expected[]= {1,8,4,6,3,5,2};
		for(int i=0;i<7;i++) {
			temp.push(expected[i]);
		}
		for(int i=0;i<temp.topPointer;i++) {
			assertEquals(expected[i],temp.arraytostoreStack[i]);
		}
	}
	
	@SuppressWarnings("static-access")
	@Test//(expected = Exception.class)
	public void popPass() throws Exception {
		MyStackImplementation temp = new MyStackImplementation(7);
		int expected[]= {1,8,4,6};
		int actual[] = {1,8,4,6,3,5,2};
		for(int i=0;i<7;i++) {
			temp.push(actual[i]);
		}
		for(int i=0;i<3;i++) {
			temp.pop();
		}
		for(int i=0;i<temp.topPointer;i++) {
			assertEquals(expected[i],temp.arraytostoreStack[i]);
		}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void topPass() throws Exception {
		MyStackImplementation temp = new MyStackImplementation(7);
		int expected[]= {1,8,4,6,3,5,2};
		for(int i=0;i<5;i++) {
			temp.push(expected[i]);
		}
		int topVal=temp.arraytostoreStack[temp.topPointer];
		assertEquals(topVal,temp.top());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void sizePass() throws Exception {
		MyStackImplementation temp = new MyStackImplementation(7);
		int expected[]= {1,8,4,6,3,5,2};
		for(int i=0;i<7;i++) {
			temp.push(expected[i]);
		}
		int si=0;
		for(int i=0;i<temp.arraytostoreStack.length;i++) {
			si++;
		}
		assertEquals(si,temp.size());
	}
}

