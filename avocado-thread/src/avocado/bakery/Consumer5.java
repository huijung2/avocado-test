package avocado.bakery;

public class Consumer5 extends Thread { 
	private BreadBasket basket;

	public Consumer5(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 30; i++) {
				Thread.sleep(5000);
				basket.eatBread();
			} 
		}catch (Exception e) {
		}
	}
}