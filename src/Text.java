import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

    // ファイルを読み込む
    public ArrayList<Person> readFile(File file) {
        int i = 0;
        ArrayList<Person> list = new ArrayList<Person>();
        BufferedReader br = null;
        try {
            if (checkBeforeReadFile(file)) {
                br = new BufferedReader(new FileReader(file));
                String line = null;
                Person person = null;
                while ((line = br.readLine()) != null) {


                        // 次は i = 1 → 住所
                        i++;

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    // 全員分のデータを表示する
    void showPeople(ArrayList<Person> list) {
        int j = 0;
        for (Person person : list) {
            System.out.print("No" + j);
            System.out.println(person.getName());
            j++;
        }
    }

    //コンソール制御
    public static void main(String[] args) {
        File file = new File("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample.txt");
        Text text = new Text();
        ArrayList<Person> list = text.readFile(file);
        text.showPeople(list);

        try {
            while (true) {
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
                BufferedReader br = new BufferedReader(new FileReader(file));
                System.out.println("氏名を入力してください");
                String name = new java.util.Scanner(System.in).nextLine();

                if (name.equals("E") == true || name.equals("") == true ) {
                    System.out.println("終了");
                    break;
                } else {

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

                String person_Info = name + ", " + age + ", " + gender + ", " + tel;
                pw.println(person_Info);

                pw.close();
                System.out.println("連絡先を追加しました");
            }
        } catch (IOException ex) {
            System.out.println("err");
        }
    }
}