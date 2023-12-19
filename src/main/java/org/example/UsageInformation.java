package org.example;

public class UsageInformation {
    public static void printUsageInformation() {
        System.out.println("Text compressor v1.0");
        System.out.println("Usage: java TextCompress.java [options]");
        System.out.println("Options:");
        System.out.printf(
                "\t %-15s %s \n",
                "-p",
                "paste entire text then output to file"
        );
        System.out.printf(
                "\t %-15s %s \n",
                "-h, --help",
                "display usage information"
        );
        System.out.printf("\t %-15s %s \n", "-c <file>", "cyclically rotate text");
    }
}
