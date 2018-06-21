public abstract class AbstractDogFactory {  //Абстрактная фабрика,
											// которая будет реализовываться субклассами для создания разных собак

	public abstract BarkBark createBeagle();        //создаем бигля
	public abstract BarkBark createBulldog();       //создаем бульдога
	public abstract BarkBark createWelshCorgi();    //создаем корги
}
