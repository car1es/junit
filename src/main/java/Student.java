import java.util.*;

public class Student {
    private String name;
    private int age;
    private double averageRating;
    private Sex sex;
    private static int id;
    private static Map<Integer, Student> Students = new HashMap<>();

    public Student(String name, int age, double averageRating, Sex sex) {
        id++;
        this.name = name;
        this.age = age;
        this.averageRating = averageRating;
        this.sex = sex;
        Students.put(id,this);
    }



    public static List<Student> getAllStudents(){
        return new ArrayList<>(Students.values());
    }
    public static List<Student> getByGenderStudents (Sex sex){
        List<Student> studentList = new ArrayList<>();
        for (Student student : Students.values()){
            if (student.sex == sex){
                studentList.add(student);
            }
        }
        return studentList;
    }
    public static List<Student> getStudentUnderAge(int age){
        List<Student> list = new ArrayList<>();
        for (Student student : Students.values()){
            if (student.age < age){
                list.add(student);
            }
        }
        return list;
    }
    public static List<Student> getStudentUnderAverageRating (double averageRating){
        List<Student> list = new ArrayList<>();
        for (Student student : Students.values()){
            if (student.averageRating < averageRating){
                list.add(student);
            }
        }
        return list;
    }
}
