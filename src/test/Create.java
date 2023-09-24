package test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create {

    public static void main(String[] args) {

        try {
            Path file = Paths.get("Sample2.txt");

            if(Files.exists(file)) {
                System.out.println("既存ファイルが存在するので処理をスキップしました。");
            } else {
                Files.createFile(file);
                System.out.println("ファイルを作成しました。");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}