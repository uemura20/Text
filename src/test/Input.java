package test;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Input {

    public static void main(String[] args) {
        try {
            // FileWriterクラスのオブジェクトを生成する
            FileWriter file = new FileWriter("Sample2.txt", true);
            // PrintWriterクラスのオブジェクトを生成する
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            //ファイルに追記する
            pw.println("氏名");
            pw.println("生年月日");
            pw.println("採用年月");
            pw.println("部署");

            System.out.println("1行追記されました。");
            //ファイルを閉じる
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}