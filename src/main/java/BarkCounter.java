public class BarkCounter implements BarkBark {  //Реализуем декоратор

	BarkBark dog;       //Переменная для хранения декорируемого объекта
	static int number;  //подсчет всех barkов

	public BarkCounter (BarkBark dog){  //в конструкторе получаем ссылку на декорирумую реализию BarkBark
		this.dog = dog;
	}

	public void bark() {        //Гавкаем и увеличиваем счетчик
		dog.bark();
		number++;
	}

	public static int getNumber() {     //Метод возвращает количество всех bark во всех реализациях BarkBark
		return number;
	}
}
