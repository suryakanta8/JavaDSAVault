import java.util.List;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    List<Integer> list = new ArrayList<>();
    list.forEach( list -> {
      System.out.println("Hello world!");
    });
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}