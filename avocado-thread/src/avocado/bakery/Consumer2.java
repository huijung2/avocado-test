package avocado.bakery;

public class Consumer2 extends Thread { 
	private BreadBasket basket;

	public Consumer2(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 30; i++) {
				Thread.sleep(2000);
				basket.eatBread();
			} 
		}catch (Exception e) {
		}
	}
}