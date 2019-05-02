package com.mkyong.hashing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

public boolean isPrime(int num){
System.out.println("testing");
	boolean val = true;
	if(num == 1 || num == 2)
		return false;
	for (int i = 2; i < num/2; i++){
		if(num%i == 0) {
		val = false;
		break;
		}	
	}
return val;
}
}
