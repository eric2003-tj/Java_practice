import java.io.*;
public class Introduction{
  public static void main(String[] args) throws IOException  {
    FileOutputStream output = new FileOutputStream("output.txt");
    String outputText = "Hello";
    byte[] outputByte = outputText.getBytes();
    output.write(outputByte);
    output.close();
  }
}
