import java.util.ArrayList;

public class PingPong {

  public ArrayList<Object> runPingPong(Integer countUpTo) {
    ArrayList<Object> myList = new ArrayList<Object>();
    for (Integer i = 1; i <= countUpTo; i++) {
      myList.add(i);
    }
    return myList;
  }

}
