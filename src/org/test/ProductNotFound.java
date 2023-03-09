package org.test;

public class ProductNotFound extends Exception {
	
	@Override
	public String getMessage() { // the method getMessage presented in throwable.it is used to get msg with exception in console 
		return "product is not available in the search list";
	}

}
