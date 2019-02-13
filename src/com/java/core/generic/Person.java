/**
 *
 */
package com.java.core.generic;

/**
 * @author rjagadee
 *
 */
public class Person {

	private String name;

	private String address;

	/**
	 *
	 */
	public Person() {
		// No initialization needed.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}
