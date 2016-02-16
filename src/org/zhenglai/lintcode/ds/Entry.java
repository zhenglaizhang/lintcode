/**
 * 
 */
package org.zhenglai.lintcode.ds;

/**
 * @author Zhenglai Zhang <zhenglaizhang@hotmail.com>
 *
 */
public interface Entry<K, V> {
	
	static final int COMPILER_CONSTANT = 12;
	
	K getKey();
	
	V getValue();
	
	static void hello() {}
	
	default void print() {
		System.out.println("<" + getKey() + ", " + getValue() + ">");
	}
}
