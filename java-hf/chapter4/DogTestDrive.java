class DogTestDrive{
  public static void main(String[] args){
    Dog d = new Dog();
    d.setSize(40);
    d.bark(4);
    System.out.println("Size is " + d.getSize() );
    System.out.println("Secret of life is " + d.giveLifeSecret() );
    
    System.out.println("add two " +  d.addTwo(4,4));
  }
}
