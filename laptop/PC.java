package org.laptop;

public class PC extends Laptop{
	public void getSystemInfo () {
		System.out.println("MAC");
	}
	public static void main(String[] args) {
		PC out=new PC();
		out.getSystemInfo();
	}

}
