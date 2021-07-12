package stackAndQueue;
import org.junit.Test;
import stackAndQueue.animals.Animal;
import stackAndQueue.animals.Cat;
import stackAndQueue.animals.Dog;

import static org.junit.Assert.*;
public class AnimalShelterTest {
  @Test
  public void catClassTest() {
    Cat cat = new Cat("cat1");
    Animal animalCat = new Cat("cat2");

    assertEquals("catClassTest should return cat1", "cat1", cat.getName());
    assertEquals("catClassTest should return Cat class", "Cat", animalCat.getClass().getSimpleName());
  }
  @Test
  public void dogClassTest() {
    Dog dog = new Dog("dog1");
    Animal animalDog = new Dog("dog2");

    assertEquals("dogClassTest should return dog1", "dog1", dog.getName());
    assertEquals("dogClassTest should return Dog class", "Dog", animalDog.getClass().getSimpleName());
  }

  @Test
  public void enqueueTest() {
    AnimalShelter shelter = new AnimalShelter();

    shelter.enqueue(new Cat("cat1"));
    shelter.enqueue(new Dog("dog1"));
    shelter.enqueue(new Cat("cat2"));

    assertEquals("dogClassTest should return front -> { cat1 } -> { cat2 } <- rear", "front -> { cat1 } -> { cat2 } <- rear", shelter.getCats());
    assertEquals("dogClassTest should return front -> { dog1 } <- rear", "front -> { dog1 } <- rear", shelter.getDogs());
  }

  @Test
  public void dequeueTest() {
    AnimalShelter shelter = new AnimalShelter();

    shelter.enqueue(new Cat("cat1"));
    shelter.enqueue(new Dog("dog1"));
    shelter.enqueue(new Cat("cat2"));

    assertEquals("dogClassTest should return cat1", "cat1", shelter.dequeue("cat"));
    assertEquals("dogClassTest should return dog1", "dog1", shelter.dequeue("dog"));
    assertNull("dogClassTest should return null", shelter.dequeue("bird"));
    assertEquals("dogClassTest should return front -> rear", "front -> rear", shelter.getDogs());
    assertEquals("dogClassTest should return front -> { cat2 } <- rear", "front -> { cat2 } <- rear", shelter.getCats());
  }
}
