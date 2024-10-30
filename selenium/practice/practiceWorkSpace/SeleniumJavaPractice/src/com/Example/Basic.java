package com.Example;

public class Basic {
	public Basic() {
		System.out.println("object created.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		System.out.println(i);
		Basic b = new Basic();
		System.out.println(b.add(7, 9));

	}
	public int add(int a, int b) {
		return a+b;
	}

}
