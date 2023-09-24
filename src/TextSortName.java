import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TextSortName {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // ファイル入出力（MS932からUTF8へ変換）
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample.txt"), "MS932"));
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample2.txt"), "UTF8"));

            String line;
            ArrayList<String> splitList = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                String[] lists = line.split(", ");
                for (String split : lists) {
                    splitList.add(split);
                }
            }
            String[][] test = new String[splitList.size() / 4][4];
            int cnt = 0;

            for (int i = 0; i < splitList.size() / 4; i++) {
                for (int j = 0; j < 4; j++) {
                    test[i][j] = splitList.get(cnt);
                    cnt++;
                }
            }
            Info[] arr_info = new Info[splitList.size() / 4];
            for (int i = 0; i < arr_info.length; i++) {
                arr_info[i] = new Info();
            }
            for (int i = 0; i < arr_info.length; i++) {
                arr_info[i].name = test[i][0];
            }
            for (int i = 0; i < arr_info.length; i++) {
                arr_info[i].age = test[i][1];
            }
            for (int i = 0; i < arr_info.length; i++) {
                arr_info[i].gender = test[i][2];
            }
            for (int i = 0; i < arr_info.length; i++) {
                arr_info[i].tel = test[i][3];
            }
            String[] Info = new String[arr_info.length];
            for (int i = 0; i < arr_info.length; i++) {
                Info[i] = arr_info[i].name + ", " + arr_info[i].age + ", " + arr_info[i].gender + ", "
                        + arr_info[i].tel;
            }
            String[] mins = new String[arr_info.length];
            String min = null;
            for (int i = 0; i < arr_info.length - 1; i++) {
                for (int j = i + 1; j < arr_info.length; j++) {
//                    System.out.println(arr_info[i].name + arr_info[j].name);
//                    System.out.println(arr_info[i].name.compareTo(arr_info[j].name));
                    if (arr_info[i].name.compareTo(arr_info[j].name) < 0) {
                        min = arr_info[i].name;
                        mins[i] = Info[i];
                    } else {
                        min = arr_info[j].name;
                        arr_info[j].name = arr_info[i].name;
                        arr_info[i].name = min;

                        mins[i] = Info[j];
                        Info[j] = Info[i];
                        Info[i] = mins[i];
                    }
                }
            }
            for (int i = 0; i < arr_info.length; i++) {
                System.out.println(Info[i]);
                bw.write(Info[i]);
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
