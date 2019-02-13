/**
 *
 */
package com.java.core.generic;

import java.util.ArrayList;

/**
 * @author rjagadee
 *
 */
public class GenericMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<GenericContainer> genericList = new ArrayList<GenericContainer>();
		Person pers = new Person();
		pers.setAddress("Airoli");
		pers.setName("Radhika");
		genericList.add(new GenericContainer<>("ABCD"));
		genericList.add(new GenericContainer<>(123));
		genericList.add(new GenericContainer<>(pers));
		System.out.println(genericList);
	}

}
