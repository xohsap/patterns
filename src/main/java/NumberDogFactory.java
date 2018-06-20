public class NumberDogFactory extends AbstractDogFactory{   //Расширяем абстрактную фабрику

	public BarkBark createBeagle(){                 //Каждый метод упаковываем в декоратор.
		return new BarkCounter(new Beagle());
	}

	public BarkBark createBulldog(){
		return new BarkCounter(new Bulldog());
	}

	public BarkBark createWelshCorgi(){
		return new BarkCounter(new WelshCorgi());
	}
}




