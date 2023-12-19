import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import org.example.CyclicalTextRotate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TextRotatorTest {

  @Test
  @DisplayName("Ensure text is cyclically rotated correctly.")
  public void testRotateText() {
    String testText = "hey";
    List<String> correctResult = List.of("hey", "yhe", "eyh", "hey" );

    // Call rotateText and store it in result
    ArrayList<String> result = CyclicalTextRotate.rotateText(testText);
    // Compare the result to the correct result.
    assertIterableEquals(correctResult, result);
  }
}
