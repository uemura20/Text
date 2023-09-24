package test;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class InputAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // FileWriterクラスのオブジェクトを生成する
            FileWriter file = new FileWriter("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\report.txt", true);
            // PrintWriterクラスのオブジェクトを生成する
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            String Input = sc.next();
            //ファイルに追記する
            pw.println(Input);
            System.out.println("1行追記されました。");
            //ファイルを閉じる
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}