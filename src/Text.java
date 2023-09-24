import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Text {
    class Person {

        private String name;
        private String age;
        private String gender;
        private String tel;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
    }

    private boolean checkBeforeReadFile(File file) {
        if (file.exists()) {
            if (file.isFile() && file.canRead()) {
                return true;
            }
        }
        return false;
    }

    //コンソール制御
    public static void main(String[] args) {
        File file = new File("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample.txt");
        Text text = new Text();

        try {
            while (true) {
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
                BufferedReader br = new BufferedReader(new FileReader(file));

                System.out.println("氏名を入力してください");
                String name = new java.util.Scanner(System.in).nextLine();
                if (name.equals("E") == true || name.equals("") == true) {
                    System.out.println("終了");
                    break;
                }
                System.out.println("年齢を入力してください");
                String age = new java.util.Scanner(System.in).nextLine();
                if (age.equals("E") == true || age.equals("") == true) {
                    System.out.println("終了");
                    break;
                }
                System.out.println("性別を入力してください");
                String gender = new java.util.Scanner(System.in).nextLine();
                if (gender.equals("E") == true || gender.equals("") == true) {
                    System.out.println("終了");
                    break;
                }
                System.out.println("電話番号を入力してください");
                String tel = new java.util.Scanner(System.in).nextLine();
                if (tel.equals("E") == true || tel.equals("") == true) {
                    System.out.println("終了");
                    break;
                }

                List<List<String>> lists = Arrays.asList(
                        Arrays.asList(name, age, gender, tel));

                pw.println(lists.get(0).get(0) + ", " + lists.get(0).get(1) + ", " + lists.get(0).get(2) + ", "
                        + lists.get(0).get(3));
                //氏名, 年齢, 性別, 電話番号
                //pw.println(lists);
                //[[氏名, 年齢、性別、電話番号]]
                pw.close();
                System.out.println("連絡先を追加しました");
            }
        } catch (IOException ex) {
            System.out.println("err");
        }
    }

}