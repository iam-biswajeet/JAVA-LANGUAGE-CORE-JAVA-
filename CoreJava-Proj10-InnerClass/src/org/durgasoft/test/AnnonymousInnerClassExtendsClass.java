package org.durgasoft.test;

public class AnnonymousInnerClassExtendsClass {
	public static void main(String[] args) {
		Thread t=new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("InnerClass");
				}
			}
		};
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main");
		}
	}

}
