package com.yao.testutil.multithread;

public class ThreadTest {
	int x ;

	public class Runner implements Runnable {
		public void run() {
			int current = 0;
			for (int i = 0; i < 4; i++) {
				System.out.print(current + ", ");
				x = current + 2;
			}
		}
	}

	public static void main(String[] args) {
		new ThreadTest().go();
	}

	public void go() {
		Runnable r1 = new Runner();
		new Thread(r1).start();
		new Thread(r1).start();
	}
}
