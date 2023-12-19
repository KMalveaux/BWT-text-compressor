package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CyclicalTextRotate {
  private static final Logger logger = Logger.getLogger(TextCompress.class.getName());

  /**
   * Rotates the given text cyclically.
   * @param text The text to be cyclically rotated.
   */
  public static ArrayList<String> rotateText(String text) {
    ArrayList<String> rotatedTextList = new ArrayList<>();

    // Throw exception if text is null.
    if (text == null) {
      logger.log(Level.SEVERE, "Input text is null. Cannot rotate null text.");
      throw new IllegalArgumentException("Input text is null. Cannot rotate null text.");
    }

    try{
      File outputFile = new File("Output.txt");
      FileWriter fileWriter = new FileWriter(outputFile);

      // Loop to cyclically rotate the text
      for(int i = 0; i < text.length(); i++){
        fileWriter.write(text + "\n");
        char carryChar = text.charAt(text.length() - 1);
        text = text.substring(0, text.length() - 1);
        text = carryChar + text;
      }

      Scanner scanner = new Scanner("Output.txt");
      while (scanner.hasNextLine()) {
        rotatedTextList.add(scanner.nextLine());
      }
      fileWriter.close();
      return rotatedTextList;
    } catch(IOException e){
      logger.log(Level.SEVERE, "An IOException occurred in CyclicalTextRotate.", e);
    }

    // Shouldn't ever get here. If we ever return null, an error has occurred.
    return null;
  }
}
