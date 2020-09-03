package homework5;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String post;
    private String imail;
    private String telefon;
    private int wages;
    private int age;

    public Employee(String surname, String name, String patronymic, String post, String imail, String telefon, int wages, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.post = post;
        this.imail = imail;
        this.telefon = telefon;
        this.wages = wages;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.printf(" %s, %s, %s, %s, %s, %s, %d, %d\n", surname, name, patronymic, post, imail, telefon, wages, age);
    }
}
