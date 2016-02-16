/**
 * 
 */
package org.zhenglai.lintcode.ds;

/**
 * @author Zhenglai Zhang <zhenglaizhang@hotmail.com>
 *
 */
public interface List<E> extends Collection<E> {
	
	boolean add(E e);
	
	E get(int index);
}
