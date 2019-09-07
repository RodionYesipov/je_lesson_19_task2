import java.io.File;
import java.util.Arrays;
import java.util.List;
/**
 2*. Вывести список файлов текущей директории рекурсивно (только файлов без директорий)
 * */
public class Main {
    private static void outputAllFiles(File file){
        boolean isDirectory = false;
        List<File> files = Arrays.asList(file.listFiles());
        for (File f : files) {
            if (!f.isDirectory()) {
                System.out.println(f.getAbsolutePath());
            } else {
                isDirectory = true;
                outputAllFiles(f);
            }
        }
    }
    public static void main(String[] args) {
        File file = new File(".");
        outputAllFiles(file);
    }
}
