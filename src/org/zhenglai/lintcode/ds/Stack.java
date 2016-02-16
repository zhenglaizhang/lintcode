/**
 * 
 */
package org.zhenglai.lintcode.ds;

/**
 * @author darinzh
 *
 */
public interface Stack<E> {
	
	/**
	 * Returns the number of elements in the stack
	 * @return number of elements in the stack
	 */
	int size();
	
	/**
	 * Tests whether the stack is empty
	 * @return true if stack is empty, false otherwise
	 */
	boolean isEmpty();
	
	void push(E e);
	
	E top();
	
	E pop();
}
