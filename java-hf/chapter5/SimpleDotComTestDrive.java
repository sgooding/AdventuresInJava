class SimpleDotComTestDrive{
  public static void main(String[] argv){
    //1. Instantiate the SimpleDotCom object.
    SimpleDotCom dotcom = new SimpleDotCom();

    //2. Assign it a location, an array of ints
    int[] location = {2,3,4};
    dotcom.setLocationCells(location);

    //3. Create a string to represent a user guess
    String guess = "2";

    //4. Invoke the checkYourself method
    String result = dotcom.checkYourself(guess);

    //5. Print out the result to see if it's correct
    String testResult = "failed";
    if (result.equals("hit")){
      testResult = "passed";
    }
    
    System.out.println(testResult);
  }
}
