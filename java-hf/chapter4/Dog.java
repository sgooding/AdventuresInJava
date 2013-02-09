class Dog{
  // instance variables declared in a class
  private int size; // currently unknown value

  private double height = 15.2; // with assignment

  String breed;
  String name;
  public void setSize(int s)
  {
    size = s;
  }
  public int getSize()
  {
    return size;
  }
  void bark(){
    System.out.println("Ruff,Ruff");
  }
  void bark(int numOfBarks)
  {
    while(numOfBarks > 0)
    {
      bark();
      numOfBarks = numOfBarks - 1;
    }
  }
  int giveLifeSecret()
  {
    return 42;
  }

  // always pass by copy
  int addTwo(int a, int b)
  {
    return a+b;
  }
}
