public class Simulator {
    public static void main(String[] args){
        Simulator simulator = new Simulator();
        simulator.simulate();
    }

    void simulate(){
        Animals welshCorgi = new WelshCorgi();
        Animals beagle = new Beagle();
        Animals cat = new CatAdapter(new Cat());        //Создаем объект Cat замаскированный под

        simulate(welshCorgi);
        simulate(beagle);
        simulate(cat);
    }

    void simulate(Animals animals){
        animals.bark();
    }
}
