package com.interview;

import java.util.Date;

public final class ImmutableClass {

	/*
	 * Integer class is immutable as it does not provide any setter to change its
	 * content
	 */
	private final Integer immutableInteger;

	/*
	 * String class is immutable as it also does not provide setter to change its
	 * content
	 */
	private final String immutableString;

	/*
	 * Date class is mutable as it provide setters to change various date/time parts
	 */
	private final Date mutableDate;

	// Default private constructor will ensure no unplanned construction of class
	private ImmutableClass(Integer immutableInteger, String immutableString, Date date) {
		this.immutableInteger = immutableInteger;
		this.immutableString = immutableString;
		//create a defensive copy of the parameter if they are mutable objects:
		this.mutableDate = new Date(date.getTime());
	}

	// Factory method to store object creation logic in single place
	public static ImmutableClass createNewInstance(Integer fld1, String fld2, Date date) {
		return new ImmutableClass(fld1, fld2, date);
	}

	// Provide no setter methods

	public Integer getImmutableInteger() {
		return immutableInteger;
	}

	public String getImmutableString() {
		return immutableString;
	}

	/*
	 * Date class is mutable so we need a little care here.
	 * We should not return the reference of original instance variable.
	 * Instead a new Date object, with content copied to it, should be returned.
	 */
	public Date getMutableDate() {
		return new Date(mutableDate.getTime());
	}

	@Override
	public String toString() {
		return "ImmutableClass [immutableInteger=" + immutableInteger + ", immutableString=" + immutableString
				+ ", mutableDate=" + mutableDate + "]";
	}

}
