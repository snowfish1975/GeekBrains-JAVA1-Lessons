import java.util.Random;

public class Cat {

    private String name;
    private int appetite;
    private boolean full;
    String[] catNames = {"Барсик", "Мурзик", "Пушок", "Бабай", "Чапа", "Гав", "Пушистик", "Бармалей", "Дружок", "Перс", "Стёпа", "Мурлыка"};

    public Cat() {
        Random rnd = new Random();
        name = catNames [rnd.nextInt(catNames.length)];
        appetite = rnd.nextInt(10)+7;
    }

    public void eat(Plate p) {
        full = false;
        if (p.decreaseFood(appetite)) full = true;
    }

    public void info(){
        System.out.println("Кот " + name + (full ? " сыт." : " всё еще голоден."));
    }

}
