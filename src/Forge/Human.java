package Forge;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Human(String name, String town, String jobTitle) {
        this(name, town, 0, jobTitle);
    }


    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name == null ? "\'Информация не указана\'" : name.trim();
        this.town = town == null || town.trim().isEmpty() ? "\'Информация не указана\'" : town.trim();
        this.yearOfBirth = Math.abs(yearOfBirth);
        this.jobTitle = jobTitle == null || jobTitle.trim().isEmpty() ? "\'Информация не указана\'" : jobTitle.trim();
    }

    public void greetings() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города "
                + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности "
                + jobTitle + ". Будем знакомы!");
    }

    @Override
    public String toString() {
        return "Человек {" +
                " Имя=" + name +
                ", город='" + town + '\'' +
                ", год рождения='" + yearOfBirth + '\'' +
                '}';
    }
}
