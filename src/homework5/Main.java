package homework5;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Иван Иванович", "Программист", "sad@email.com",
                "+79518454432", 100000, 55);
        employee1.printEmployee();

        Employee[] employees =new Employee[5];
        employees[0]=new Employee("Петров Петр Петрович", "Учитель", "petrov@mail.ru","+79543343222",
                60000,41);
        employees[1]=new Employee("Просковин Аркадий Михайлович", "Менеджер по продажам", "proskovin@mail.ru","+79073343152",
                60000,31);
        employees[2]=new Employee("Конский Илья Анатольевич", "Писатель", "kon@mail.ru","+79523343897",
                60000,35);
        employees[3]=new Employee("Шилин Василий Романович", "Менеджер", "shilin@mail.ru","+79543349876",
                900000,51);
        employees[4]=new Employee("Мамура Иван Петрович", "Летчик", "mamura@mail.ru","+795433436543",
                26000,49);
        for (Employee employee : employees) if (employee.age>40)
            employee.printEmployee();



    }


    }

