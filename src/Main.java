import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//      Пример создания объекта класса Student
        Student student = new Student("Андрей",25, 2.5);
//      Вывод в консоль данных, созданного объекта класса Student
        student.displayInfo();

//      Создание объекта класса Students
        Students students = new Students();
//      Вывод в консоль всех элементов класса Students, которые создаются по умолчанию
        students.displayStudents();
//      Вывод в консоль кол-ва элементов Student в классе Students
        students.displayCountStudents();


//      Добавляем через метод класса в объект класса Students новый элемент Student
        students.addStudent(new Student("Андрей",25, 2.5));
        students.addStudent(new Student("Андрей",20, 4.5));
//      Вывод в консоль кол-ва элементов Student в классе Students
        students.displayCountStudents();

//      Поиск студентов по имени
        findStudent(students,"Андрей");

//      Удаление студентов по имени
        removeStudent(students, "Анна");

//       Вывод средней оценки
        double average = students.averageGrade();
        System.out.println("Средняя оценка студентов: " + average);



    }

    public static void findStudent(Students students, String name){
        if (name.isEmpty()){
            System.out.println("Имя не должно быть пустым!");
        }
        else {
//          Создаем пустой объект класса Students
            Students fStudents = new Students();
//          Чистим список элементов объекта
            fStudents.studentArray.clear();
//          Ищем студентов с заданным именем
            fStudents.studentArray = students.findStudentByName(name);
            if (fStudents.studentArray.isEmpty()){
                System.out.println("Студенты с таким именем не найдены");
            }
            else {
                System.out.println("Студенты с именем '" + name + "':");
                fStudents.displayStudents();
            }
        }
    }

    public static void removeStudent(Students students, String name){
        if (name.isEmpty()){
            System.out.println("Имя не должно быть пустым!");
        }
        else {
            students.removeStudentByName(name);
        }
    }
}