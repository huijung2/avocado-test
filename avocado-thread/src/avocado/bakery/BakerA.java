package avocado.bakery;

public class BakerA extends Thread { 
	private BreadBasket basket; 

	public BakerA(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 30; i++) {
				Thread.sleep(3000);
				basket.makeBread();
			}
		} catch (Exception e) {
			Thread.yield();
		}
	}
}
