
public class MyFirstApp{
  public static void main(String[] args){
    System.out.println("Welcome World");

    String array[] = {"hello","you","wonderful","man",
      "what","are","you","doing","today"};

    int i = 10;
    while( i >= 0 )
    {
      System.out.println("Hello " + i);
      i--;
    }

    for(int k = 0; k < array.length; k++)
    {
      System.out.println(array[k]);
    }

    int value = (int)(Math.random()*array.length);
    System.out.println("Mystery Word = " + array[value]);

  }
}

