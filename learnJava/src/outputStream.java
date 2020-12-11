import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class outputStream {
    public void home() throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
        Student student=(Student)in.readObject();
        System.out.println(student.name+ " "+ student.number);
        in.close();
    }
}
