package storage;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static List<Student> readFile() throws IOException, ClassNotFoundException {
        File file = new File("list1.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        if (file.length() > 0){
            FileInputStream fs = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fs);
            Object obj = ois.readObject();
            List<Student> list = (List<Student>) obj;
            ois.close();
            fs.close();
            return list;
        }
        else return new ArrayList<>();
    }

    public static void writeFile(List<Student> students ) throws IOException {
        FileOutputStream fos = new FileOutputStream("list1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        fos.close();
        oos.close();
    }

}
