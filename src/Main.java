import java.util.ArrayList;

/**
 * @author Hong
 */
// this is a real OO program. responsibilities are deleted to objects
public class Main {

    public static void main(String[] args) {

        ArrayList<Student> myClass = new ArrayList<>();

        myClass.add(new Student("Suzan", "OOP"));
        myClass.add(new Student("John", "P1"));
        myClass.add(new GraduateStudent("Mary", "P2"));
        myClass.add(new Student("Bush", "P2"));
        myClass.add(new GraduateStudent("Kris", "OOP"));
        myClass.add(new Student("Jone", "P1"));

        // telling the whole class to go to the next class
        for (Student s : myClass) {
            String responsibility = s.getName() + ": " + s.goToNextClass();
            System.out.println(responsibility);
        }

    }

}
