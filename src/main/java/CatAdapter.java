public class CatAdapter implements Animals {    //Адаптер реализует целевой интерфейс
    Cat cat;

    public CatAdapter(Cat cat){         //Конструктор получает адаптируемый объект Cat
        this.cat = cat;
    }

    public void bark() {        //Вызов bark делегируется методу meow класса Cat
        cat.meow();
    }
}
