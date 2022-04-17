package avocado.bakery;

public class Consumer1 extends Thread { 
	private BreadBasket basket;

	public Consumer1(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 30; i++) {
				Thread.sleep(1000);
				basket.eatBread();
			} 
		}catch (Exception e) {
		}
	}
}