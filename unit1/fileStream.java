import java.io.*;
public class Introduction {
  public static void main(String[] args) throws IOException {
    String path = "/home/ccuser/workspace/java-input-and-output-file-input-stream/input.txt";
    FileInputStream input1 =  new FileInputStream(path);
    int i = 0;
    while((i = input1.read())!=-1){
       System.out.print((char)i); 
    }
    input1.close();
  }
}
