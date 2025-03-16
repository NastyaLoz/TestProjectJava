import java.util.ArrayList;

public class Students {
    ArrayList<Student> studentArray = new ArrayList<>();

//  Инициализация списка студентов
    public Students(){
        studentArray.add(new Student());
        studentArray.add(new Student("Алексей"));
        studentArray.add(new Student("Анна", 22));
        studentArray.add(new Student("Екатерина", 2.1));
        studentArray.add(new Student("Евдокия", 21, 5.0));
    }


    public void addStudent(Student student){
        studentArray.add(student);
        System.out.println("Студент успешно добавлен!");
    }

    public void removeStudentByName(String name){
        ArrayList<Student> foundStudent = findStudentByName(name);
        int count = foundStudent.size();
        for (Student student: foundStudent){
            studentArray.remove(student);
        }
        System.out.println("Количество студентов с именем '" + name + "', удаленных из системы: " + count);
    }

    public ArrayList<Student> findStudentByName(String name){
        ArrayList<Student> foundStudents = new ArrayList<>();
        for(Student student: studentArray){
            if (student.name.equals(name)){
//                System.out.println("Студент найден");
                foundStudents.add(student);
            }
        }
        return foundStudents;
    }



    public double averageGrade(){
        double sum = 0;
        for (Student student: studentArray){
            sum += student.grade;
        }
        return sum/studentArray.size();

    }


//  Выводит в консоль всех студентов - все данные
    public void displayStudents(){
        for(Student student: studentArray){
            student.displayInfo();
            System.out.println("---------------------------");
        }
    }

//  Выводит в консоль кол-во студентов - длину списка
    public void displayCountStudents(){
        System.out.println("Количество студентов: " + studentArray.size());
    }
}
