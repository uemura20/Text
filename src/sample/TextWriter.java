package sample;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TextWriter {
    
    class Person {

        private String name;
        private String address;
        private String tel;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getTel() {
            return tel;
        }
        public void setTel(String tel) {
            this.tel = tel;
        }
    }
    
    public void excute() {

        FileInputStream fs = null;
        InputStreamReader is = null;
        BufferedReader br = null;
        
        try {
            //キーボード入力用のオブジェクト
            br = new BufferedReader(new InputStreamReader(System.in));
            //ファイル出力のオブジェクト
            FileWriter fw = new FileWriter("Sample2.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            while (true) {//無限ループ
                String str = br.readLine();
                if (str.equals("")) {
                    break;
                } else {
                    pw.println(str);
                }
            }
            pw.close();//ファイルのクローズ 絶対にクローズすること!

        } catch (Exception e) {
            System.out.println("ファイルの読み込みに失敗");
            e.printStackTrace();
        }
    }
}
