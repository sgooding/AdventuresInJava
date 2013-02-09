class PrimitiveTypes{


  public static void main(String[] args){
    boolean test = true;
    int number = 3;
    float decimal = 3.0f;
    Dog myDog = new Dog();
    myDog.val = 3;
    myDog.bark();
    Dog[] pets;
    pets = new Dog[3];
    pets[0] = new Dog();
    pets[1] = new Dog();
    pets[2] = new Dog();
    for( int i = 0; i < pets.length; i++ )
    {
      pets[i].val = i;
      pets[i].bark();
    }
  }
}
