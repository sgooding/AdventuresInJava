package com.example.hf;
import java.io.*;

public class testboxout{
  public static void main(String[] args){
    Box myBox = new Box();
    myBox.setWidth(50);
    myBox.setHeight(20);
    try{
      FileOutputStream fs = new FileOutputStream("foo.ser");
      ObjectOutputStream os = new ObjectOutputStream(fs);
      os.writeObject(myBox);
      os.close();
    } catch(Exception ex){
      ex.printStackTrace();
    }
  }
}
