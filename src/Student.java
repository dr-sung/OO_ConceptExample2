/**
 *
 * @author Hong Sung
 */
public class Student {

    private String name;
    private String nextClass;

    public Student(String name, String nextClass) {
        this.name = name;
        this.nextClass = nextClass;
    }

    public String getName() {
        return name;
    }

    public String goToNextClass() {
        String location = InfoSystem.getLocation(nextClass);
        String direction = InfoSystem.getDirection(location);
        return "Next Class is " + nextClass + " in " + location + "\n"
                + "\tDirection: " + direction + "\n";
    }

}
