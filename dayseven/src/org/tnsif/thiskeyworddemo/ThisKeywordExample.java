package org.tnsif.thiskeyworddemo;

public class ThisKeywordExample {
	private int cvvNo;
	private long atmNo;
	public ThisKeywordExample(int cvvNo, long atmNo) {
		
		this.cvvNo = cvvNo;
		this.atmNo = atmNo;
	}
	public void print()
	{
		System.out.println("CVV no is: "+cvvNo+" "+"Atm  card no is: "+atmNo);
	}
	
	

}
