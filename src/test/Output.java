package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Output {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}