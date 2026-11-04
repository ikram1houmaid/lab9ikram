package comm.example.tp9;

public class Main {

    public static void main(String[] args) {

        FileReaderUtil file = new FileReaderUtil();

        System.out.println("--- Lecture moderne du fichier ---");

        file.readFileModern("test.txt");
    }
}