package DuckDuckGoose;

import stackAndQueue.Queue;

public class DuckDuckGooseGame {
  private final Queue<String> queue = new Queue<>();

  public void addToQueue(String value){
    queue.enqueue(value);
  }

  public String DuckDuckGoose(int num){
    int count = 0;
    while (queue.size != 1){
      count++;

      if (count != num){
        queue.enqueue(queue.dequeue());
      }else {
        queue.dequeue();
        count = 0;
      }
    }
    return queue.dequeue();
  }
}
