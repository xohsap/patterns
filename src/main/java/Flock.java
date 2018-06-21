import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements BarkBark {        //Класс стая собак
	ArrayList<BarkBark> barks = new ArrayList<BarkBark>();  //ArrayList для хранения реализаций BarkBark

	public void add(BarkBark bark){     //Метод включат реализацию BarkBark в Flock
		barks.add(bark);
	}

	public void bark() {    //Перебираем элементы ArrayList и вызываем метод bark() для каждого элемента
		Iterator<BarkBark> iterator = barks.iterator(); //тут мы используем итератор для перебора листа
		while (iterator.hasNext()) {
			BarkBark bark = iterator.next();
			bark.bark();
		}
	}
}
