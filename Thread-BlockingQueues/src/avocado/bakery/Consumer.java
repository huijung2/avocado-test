package avocado.bakery;


//손님 1  -----------------------------
class Consumer1 extends Thread { 
	private BreadBasket basket;

	public Consumer1(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				basket.eatBread();
			} 
		}catch (Exception  e) {
		}
	}
}

//손님 2  -----------------------------
class Consumer2 extends Thread { 
	private BreadBasket basket;

	public Consumer2(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(2000);
				basket.eatBread();
			} 
		}catch (Exception   e) {
		}
	}
}

//손님 3  -----------------------------
class Consumer3 extends Thread { 
	private BreadBasket basket;

	public Consumer3(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(3000);
				basket.eatBread();
			} 
		}catch (Exception  e) {
		}
	}
}

//손님 4  -----------------------------
class  Consumer4 extends Thread { 
	private BreadBasket basket;

	public Consumer4(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(4000);
				basket.eatBread();
			} 
		}catch (Exception  e) {
		}
	}
}

//손님 5  -----------------------------
class Consumer5 extends Thread { 
	private BreadBasket basket;

	public Consumer5(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(5000);
				basket.eatBread();
			} 
		}catch (Exception  e) {
		}
	}
}