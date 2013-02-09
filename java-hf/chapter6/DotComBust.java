import java.util.*;

class DotComBust{
  
  private ArrayList<DotCom> dotComList= new ArrayList<DotCom>();
  private int numGuesses = 0;
  private GameHelper gameHelper = new GameHelper();

  public void setupGame(){
    DotCom one = new DotCom();
    one.setName("Pet.com");
    DotCom two = new DotCom();
    two.setName("eToys.com");
    DotCom three = new DotCom();
    three.setName("GoTo.com");
    dotComList.add(one);
    dotComList.add(two);
    dotComList.add(three);
  }

  public void startPlaying(){
    while(!dotComList.isEmpty())
    {
      String ans = gameHelper.getUserInput("Guess: \n");
    }
  }

  private void checkUserGuess(String guess){

  }

  private void finishGame(){
  }

}
