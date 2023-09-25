import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TextEdit {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // ファイル入出力（MS932からUTF8へ変換）
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample.txt"), "UTF8"));
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample2.txt"), "UTF8"));

            String line;
            while ((line = br.readLine()) != null) {

                // 置換処理
                line = line.replace("AA", "ZZ");    //全ての値に対してAAをZZに変更する
                // ファイルへ書き込み
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ie) {
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ie) {
                }
            }
        }
        try {
            // ファイル入出力（MS932からUTF8へ変換）
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample2.txt"), "MS932"));
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample.txt"), "UTF8"));

            String line;
            while ((line = br.readLine()) != null) {

                // ファイルへ書き込み
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ie) {
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ie) {
                }
            }
        }
    }
}