package stackAndQueue;

import stackAndQueue.animals.Animal;

import java.util.Locale;

public class AnimalShelter<T> {
  private final Queue<String> dogs;
  private final Queue<String> cats;

  public AnimalShelter() {
    dogs = new Queue<>();
    cats = new Queue<>();
  }

  public boolean enqueue(Animal animal){
    String className = animal.getClass().getSimpleName();
    if (className.equals("Cat")){
      cats.enqueue(animal.getName());
    }else if (className.equals("Dog")){
      dogs.enqueue(animal.getName());
    }else {
      return false;
    }
    return true;
  }

  public String dequeue(String type){
//    String className = animal.getClass().getSimpleName();
    if (type.toLowerCase(Locale.ROOT).equals("cat")){
     return cats.dequeue();
    }else if (type.toLowerCase(Locale.ROOT).equals("dog")){
      return dogs.dequeue();
    }else {
      return null;
    }
  }
  public String getCats(){
    return cats.toString();
  }

  public String getDogs(){
    return dogs.toString();
  }
}
