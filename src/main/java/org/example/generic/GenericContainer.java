/**
 *
 */
package org.example.generic;

/**
 * @author rjagadee
 *
 */
public class GenericContainer<T> {

	private T obj;

	public GenericContainer() {
		super();
	}

	// Pass type in as parameter to constructor
	public GenericContainer(T t) {
		obj = t;
	}

	/**
	 * @return the obj
	 */
	public T getObj() {
		return obj;
	}

	/**
	 * @param t
	 *            the obj to set
	 */
	public void setObj(T t) {
		obj = t;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.valueOf(obj);
	}

}
