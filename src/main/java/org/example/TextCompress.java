package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextCompress {
  private static final Logger logger = Logger.getLogger(TextCompress.class.getName());

  public static void main(String[] args) {
    // No flags or help flag entered. Print the program usage information.
    if (args.length == 0 || args[0].equals("--help") || args[0].equals("-h")) {
      UsageInformation.printUsageInformation();
      return;
    }

    // The first cmdline arg
    String CmdLineFlag = args[0];

    switch (CmdLineFlag) {

      // Rotate file text and stop
      case "-c":
        try {
          File outputFile = new File(args[1]);
          Scanner scanner = new Scanner(outputFile);

          StringBuilder inputText = new StringBuilder();

          while (scanner.hasNextLine()) {
            inputText.append(scanner.nextLine());
          }
          ArrayList<String> rotatedTextList = CyclicalTextRotate.rotateText(inputText.toString());
        } catch (FileNotFoundException e) {
          logger.log(Level.SEVERE, "File not found", e);
        }
        break;
      default:
        break;
    }
  }


}
