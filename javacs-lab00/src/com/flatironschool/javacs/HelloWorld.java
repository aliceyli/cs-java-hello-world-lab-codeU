package com.flatironschool.javacs;

public class HelloWorld {

	//Returns system's java version
    public static Double getVersion() {
    	String version = System.getProperty("java.specification.version");
        return(Double.parseDouble(version));
    }

    public static void main(String[] args) {
	    getVersion();
    }
}