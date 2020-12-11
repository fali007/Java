import java.io.Serializable;

public class Student implements Serializable {
    public String name;
    public int number;

    Student(String name, int number){
        this.name=name;
        this.number=number;
    }
}
