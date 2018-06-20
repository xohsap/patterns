public class ToyAdapter implements BarkBark {    //Адаптер реализует целевой интерфейс
    ToyPug toyPug;

    public ToyAdapter(ToyPug toyPug){         //Конструктор получает адаптируемый объект ToyPug
        this.toyPug = toyPug;
    }

    public void bark() {        //Вызов bark делегируется методу playsound класса ToyPug
        toyPug.playsound();
    }
}
