public class Simulator {

    public static void main(String[] args){
        Simulator simulator = new Simulator();                      //объект симулятор
        Simulator simulator1 = new Simulator();                     //объект симулятор1
        AbstractDogFactory dogFactory = new NumberDogFactory();     //Фабрика собак
        simulator.simulate(dogFactory);
        simulator1.simulate2();
    }

    void simulate(AbstractDogFactory dogFactory){           //Создаем объекты наших собак
        BarkBark welshCorgi = dogFactory.createWelshCorgi();
        BarkBark beagle = dogFactory.createBeagle();
        BarkBark bulldog = dogFactory.createBulldog();
        BarkBark pug = new ToyAdapter(new ToyPug());        //Создаем объект ToyPug замаскированный под настоящую собаку

        Flock flockofDogs = new Flock();                    //Создаем стаю собак, ведь ими проще управлять
        flockofDogs.add(beagle);
        flockofDogs.add(bulldog);
        flockofDogs.add(welshCorgi);
        flockofDogs.add(pug);

        Flock flockofWelshCorgi = new Flock();               //А теперь создаем несколько объектов корги
        BarkBark corgi1 = dogFactory.createWelshCorgi();
        BarkBark corgi2 = dogFactory.createWelshCorgi();
        BarkBark corgi3 = dogFactory.createWelshCorgi();
        BarkBark corgi4 = dogFactory.createWelshCorgi();
        BarkBark corgi5 = dogFactory.createWelshCorgi();
        BarkBark corgi6 = dogFactory.createWelshCorgi();

        flockofWelshCorgi.add(corgi1);       //Добавляем их в контейнер flock
        flockofWelshCorgi.add(corgi2);
        flockofWelshCorgi.add(corgi3);
        flockofWelshCorgi.add(corgi4);
        flockofWelshCorgi.add(corgi5);
        flockofWelshCorgi.add(corgi6);

        flockofDogs.add(flockofWelshCorgi); // Добавлем стаю корги в основую стаю собак

        System.out.println("\nВся стая гавкает:");
        simulate(flockofDogs);                               //Заставляем собак гавкать

        System.out.println("\nКорги гавкают:");
        simulate(flockofWelshCorgi);

        System.out.println("\nСобаки прогавкали " + BarkCounter.getNumber() + " раз!");
    }

    void simulate2(){                           //Вывод без паттерна компоновщик
        BarkBark welshCorgi = new WelshCorgi();
        BarkBark beagle = new Beagle();
        BarkBark bulldog = new Bulldog();
        BarkBark pug = new ToyAdapter(new ToyPug());

        System.out.println("\nВывод без паттерна");
        simulate(welshCorgi);
        simulate(beagle);
        simulate(bulldog);
        simulate(pug);
        System.out.println("Бигль прогавкал " + Beagle.getNumber() + " раза!");     //Код без паттерна декоратор
    }

    void simulate(BarkBark barkBark){
        barkBark.bark();
    }
}
