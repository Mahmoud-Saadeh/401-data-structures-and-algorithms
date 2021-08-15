import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class repeatedWordTest {

  @Test
  public void repeatedWord(){
    App app = new App();

    String value1 = "Once upon a time, there was a brave princess who...";
    String value2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    String value3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

    String result1 = app.hashmapRepeatedWord(value1);
    String result2 = app.hashmapRepeatedWord(value2);
    String result3 = app.hashmapRepeatedWord(value3);

    assertEquals("a", result1, "repeatedWord test should return 'a'");
    assertEquals("it", result2, "repeatedWord test should return 'it'");
    assertEquals("summer", result3, "repeatedWord test should return 'summer'");
  }

  @Test
  public void removeLastChar(){
    App app = new App();
    String result = app.removeLastChar("Hello!");

    assertEquals("Hello", result, "removeLastChar should return Hello");
  }
}
