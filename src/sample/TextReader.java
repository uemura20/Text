package sample;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TextReader {

    public void excute() {

        FileInputStream fs = null;
        InputStreamReader is = null;
        BufferedReader br = null;

        try {
            fs = new FileInputStream("Sample2.txt");
            is = new InputStreamReader(fs);
            br = new BufferedReader(is);

            String line;

            line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("ファイルの読み込みに失敗");
            e.printStackTrace();
        } finally {

            try {
                br.close();
            } catch (Exception e) {

            }
        }

    }

}
