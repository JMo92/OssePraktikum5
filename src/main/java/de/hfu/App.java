package de.hfu;

import java.util.Scanner;


// TODO: Auto-generated Javadoc
/**
 * The Class App.
 */
public class App 
{
	
	/** The scanner. */
	static Scanner scanner= new Scanner(System.in);

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main( String[] args )
    {
    	System.out.println("Text eingeben: ");
    	System.out.println(scanner.nextLine().toUpperCase());   
    }
}