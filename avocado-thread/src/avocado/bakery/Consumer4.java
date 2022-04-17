package avocado.bakery;

public class Consumer4 extends Thread { 
	private BreadBasket basket;

	public Consumer4(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 30; i++) {
				Thread.sleep(4000);
				basket.eatBread();
			} 
		}catch (Exception e) {
		}
	}
}