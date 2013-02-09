import java.io.*;

public class Box implements Serializable{
  private int width;
  private int height;

  // transient keeps out any variables
  transient int ignoreme;

  public int getWidth(){
    return width;
  }
  public int getHeight(){
    return height;
  }

  public void setWidth(int w){
    width = w;
  }
  public void setHeight(int h){
    height = h;
  }
}
