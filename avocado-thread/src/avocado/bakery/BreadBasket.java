package avocado.bakery;

public class BreadBasket {
	private int breadCount = 0;

	public BreadBasket(){}

	public synchronized void makeBread(){
		String name = Thread.currentThread().getName();
		while (breadCount >= 20) {
			try {
				System.out.println(name+"  빵 생산 초과로 대기.  총 = "+breadCount + " 개 ");
				System.out.println("");
				System.out.println("-------------------------------");
				System.out.println("");
				wait();
			} catch (Exception e) {}
		}
		breadCount++;
		System.out.println(name + " 따끈한 빵 1개 생산완료.  총 = "+breadCount + " 개 ");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		notify();   
	}

	public synchronized void eatBread(){
		String name = Thread.currentThread().getName();
		while (breadCount < 1) {
			try {
				System.out.println(name+"  빵이 없어 기다리는 중.  총 = "+breadCount + " 개 ");
				System.out.println("");
				System.out.println("-------------------------------");
				System.out.println("");
				wait();
			} catch (Exception e) { }
		}
		breadCount--;
		System.out.println(name+" 따끈한 빵 한개 구매완료.  총 = " +breadCount + " 개 ");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		notify();
	}
}