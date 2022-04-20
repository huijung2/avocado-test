package avocado.bakery;

import java.util.concurrent.BlockingQueue;


public class BreadBasket {
	private int bread = 0;  
	private BlockingQueue<Integer> basket;  
	private int max_size = 20;

	public BreadBasket(BlockingQueue<Integer> basket){
		this.basket = basket;
	}

	//생산자
	void makeBread(int bread) throws Exception{
		String name = Thread.currentThread().getName();
		while (bread >= max_size) {
			try {
				System.out.println("["+name+"]    빵 생산 초과로 대기.");
				System.out.println("");
			}catch (Throwable e) {}
		}
		basket.put(bread++);
		System.out.println("["+name+"]   빵 생산완료.  총 = "+basket.size() + " 개 ");
		System.out.println("");
	}

	//소비자
	void eatBread() throws Exception{

		String name = Thread.currentThread().getName();
		while (bread < 1) {			
			try {
				System.out.println("["+name+"]    빵이 없어 기다리는 중. ");
				System.out.println("");
			}catch (Throwable e) {}
			Integer b = basket.take();
			System.out.println("["+name+"]  빵 한개 구매완료.  총 = " + basket.size() + " 개 ");
			System.out.println("");
		}
	}
}