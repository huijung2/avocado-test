package avocado.bakery;

public class Main { 

	public static void main(String[] args) {
		BreadBasket basket = new BreadBasket();

		new Thread(new BakerA(basket), "제빵사A").start();
		new Thread(new BakerB(basket), "제빵사B").start();
		new Thread(new Consumer1(basket), "손님1").start();
		new Thread(new Consumer2(basket), "손님2").start();
		new Thread(new Consumer3(basket), "손님3").start();
		new Thread(new Consumer4(basket), "손님4").start();
		new Thread(new Consumer5(basket), "손님5").start();
	}
}