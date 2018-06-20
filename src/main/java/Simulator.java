public class Simulator {

    public static void main(String[] args){
        Simulator simulator = new Simulator();
        AbstractDogFactory dogFactory = new NumberDogFactory();
        simulator.simulate(dogFactory);
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

        flockofWelshCorgi.add(corgi1);       //Добавляем их в контейнер flock
        flockofWelshCorgi.add(corgi2);
        flockofWelshCorgi.add(corgi3);
        flockofWelshCorgi.add(corgi4);
        flockofWelshCorgi.add(corgi5);

        flockofDogs.add(flockofWelshCorgi); // Добавлем стаю корги в основую стаю собак

        System.out.println("\nВся стая гавкает:");
        simulate(flockofDogs);                               //Заставляем собак гавкать

        System.out.println("\nКорги гавкают:");
        simulate(flockofWelshCorgi);

        System.out.println("\nСобаки прогавкали " + BarkCounter.getNumber() + " раза!");
    }

    void simulate(BarkBark barkBark){
        barkBark.bark();
    }
}
