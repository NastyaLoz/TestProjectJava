public class Student {
    String name;
    int age;
    double grade;



    public Student(){
        this.name = "Name";
        this.age = 20;
        this.grade = 1.0;
    }

    public Student(String name){
        this.name = name;
        this.age = 20;
        this.grade = 1.0;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = 1.0;
    }

    public Student(String name, double grade){
        this.name = name;
        this.age = 20;
        this.grade = grade;
    }

    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println("Имя: " + name + "\nВозраст: " + age + "\nОценка: " + grade);
    }
}
