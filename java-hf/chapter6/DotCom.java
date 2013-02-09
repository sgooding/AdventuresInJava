import java.util.ArrayList;

class DotCom{
  ArrayList<String> locationCells;
  String name;
  public void setLocation(ArrayList<String> location) {
    locationCells = location;
  }
  public void setName(String name){
    this.name = name;
  }


  public String checkGuess(String guess){
    String result = "miss";
    int index = locationCells.indexOf(guess);

    if(index>0) {
      locationCells.remove(guess);

      if(locationCells.isEmpty()) {
        result = "kill";
      } else {
      result = "hit";
      }
    }
    return result;
  }

}
