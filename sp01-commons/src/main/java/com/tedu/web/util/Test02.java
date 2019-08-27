package com.tedu.web.util;

public class Test02 {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1);
		System.out.println(b1.v1);
		System.out.println(b1.v3);
		System.out.println("--------------");
		B b2 = new B();
		System.out.println(b2);
		System.out.println(b2.v1);
		System.out.println(b2.v3);
	}
}

class A {
	int v1 = 1;
	static int v2 = 2;
	static {
		System.out.println("A静态块");
	}

	A() {
		System.out.println("A构造方法");
	}
}

class B extends A {
	
	int v3 = 3;
	static int v4 = 4;
	static {
		System.out.println("B静态块");
	}
	B() {
		System.out.println("B构造方法");
	}
}

