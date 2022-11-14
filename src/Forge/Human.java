package Forge;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    public void greetings() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города "
                + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности "
                + jobTitle + ". Будем знакомы!");
    }

    @Override
    public String toString() {
        return "Human{" +
                " Имя=" + name +
                ", город='" + town + '\'' +
                ", год рождения='" + yearOfBirth + '\'' +
                '}';
    }
}