public class Beagle implements BarkBark {    //Класс Бигля
    static int number;
    public void bark(){                 //Бигль умеет гавкать
        System.out.println("BeagleBark");
        number++;
    }

    public static int getNumber(){
        return number;
    }
}
