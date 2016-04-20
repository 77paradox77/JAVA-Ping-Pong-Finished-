import java.util.ArrayList;

public class PingPong {

  public ArrayList<Object> runPingPong(Integer countUpTo) {
    ArrayList<Object> myList = new ArrayList<Object>();
    for (Integer i = 1; i <= countUpTo; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        myList.add("pingpong");
      } else if (i % 3 == 0) {
        myList.add("ping");
      } else if (i % 5 == 0) {
        myList.add("pong");
      } else {
        myList.add(i);
      }
    }
    return myList;
  }

}
