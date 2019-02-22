public class Main {

    private static Dog[] dogs = new Dog[5];

    public static void main(String[] args) {
        Cat cat = new Cat();
        for (int i = 0; i < 5; i++) {
            dogs[i] = new Dog();
        }

        cat.run((float) (Math.random()*400f));
        cat.jump((float) (Math.random()*5f));
        cat.swim(10f);

        for (int i = 0; i < 5; i++) {
            System.out.println("--------------------------------");
            dogs[i].run((float) (Math.random()*1000f) );
            dogs[i].jump((float) Math.random());
            dogs[i].swim((float) (Math.random()*100f) );
        }
    }

}
