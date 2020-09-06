package homework5;

public class Office {
    public static void main(String[] args) {

        Employee[] person = new Employee[5];

        person[0] = new Employee("Иванов","Игорь","Сергеевич", "журналист", "ivanov@yandex.ru", "89201454898", 45000, 35);
        person[1] = new Employee("Ивлев","Иван","Степанович", "повар", "ivlev@yandex.ru", "89229842154", 40000, 45);
        person[2] = new Employee("Сергеев","Артём","Леонидович", "курьер", "sergeev@yandex.ru", "89804581898", 25000, 25);
        person[3] = new Employee("Толчин","Павел","Игоревич", "водитель", "tolchin@yandex.ru", "89121454844", 35000, 43);
        person[4] = new Employee("Тюрин","Евгений","Георгиевич", "программист", "turin@yandex.ru", "89301503448", 85000, 39);

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                person[i].info();
            }
        }
        //вариант через for_each
        for (Employee employee : person) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }
    }

}
