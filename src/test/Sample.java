package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
public static void main(String args[]){
    try{
      File file = new File("C:\\Users\\CHO YEONGHYEON\\Desktop\\TextFileSystem\\sample.txt");

      if (checkBeforeReadfile(file)){
        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        while((str = br.readLine()) != null){
          System.out.println(str);
        }

        br.close();
      }else{
        System.out.println("ファイルが見つからないか開けません");
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }

  private static boolean checkBeforeReadfile(File file){
    if (file.exists()){
      if (file.isFile() && file.canRead()){
        return true;
      }
    }

    return false;
  }
}