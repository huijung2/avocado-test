package avocado.bakery;

public class Consumer3 extends Thread { 
	private BreadBasket basket;

	public Consumer3(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 30; i++) {
				Thread.sleep(3000);
				basket.eatBread();
			} 
		}catch (Exception e) {
		}
	}
}