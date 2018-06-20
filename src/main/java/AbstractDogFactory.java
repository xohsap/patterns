public abstract class AbstractDogFactory {  //Абстрактная фабрика,
											// которая будет реализовываться субклассами для создания разных собак

	public abstract BarkBark createBeagle();    //Каждый метод создает одну из собак
	public abstract BarkBark createBulldog();
	public abstract BarkBark createWelshCorgi();
}
