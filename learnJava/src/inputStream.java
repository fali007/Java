import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class inputStream{
    public void home() throws Exception {
        Student student=new Student("Felix", 211);
        FileOutputStream fout = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(student);
        out.flush();
        System.out.println("Success");
    }
}
