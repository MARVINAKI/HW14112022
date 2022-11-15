package Forge;

public class Main {
    public static void main(String[] args) {


        Human human1 = new Human(null, "Минск", "Бренд-менеджер");
        Human human2 = new Human("Аня", "Москва", 1993, "Методист образовательных программ");
        Human human3 = new Human("Катя", "Калининград", 1992, "Продакт-менеджер");
        Human human4 = new Human("Артём", "Москва", 1995, "Директор по развитию бизнеса");


        Car car1 = new Car("Lada", "", 2015, "РФ", "", 1.7);
        Car car2 = new Car("Audi", "A8", 2020, "Германия", "чёрный", 3.0);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 3.0);
        Car car4 = new Car("Kia", "Sportage (4 gen)", 2018, "Южная Корея", "красный", 2.4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);


        human1.greetings();
        System.out.println(car1);
    }

}