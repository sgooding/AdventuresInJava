package com.example.hf;
import java.io.*;

public class testboxin{
  public static void main(String[] args){
    try{
      FileInputStream fs = new FileInputStream("foo.ser");
      ObjectInputStream os = new ObjectInputStream(fs);

      Box myBox = (Box)os.readObject();
      os.close();

      System.out.println(" Box w("+myBox.getWidth()+") h("+myBox.getHeight()+")");
    } catch(Exception ex){
      ex.printStackTrace();
    }
  }
}
