package com.buparser;

import java.io.*;
import java.util.Scanner;

import com.handlexer.*;

public class Main {
    public static void main(String[] args) {
        HandLexer lex = new HandLexer();
        Parser parser = new Parser();

        try {
            File file;
            if (args.length > 0) {
                // check argument for file:
                file = new File(args[0]);
            } else {
                // get file from user input prompt (only works with CMD):
                Scanner scanner = new Scanner(System.in);
                String input_file;
                System.out.print("Input file name/path: ");
                input_file = scanner.nextLine();
                file = new File(input_file);
                scanner.close();
            }

            // conduct lexical analysis
            System.out.println("LEXICAL ANALYSIS PHASE: \n\n");
            TokenList tokenList = lex.Analyze(new File(file.getAbsolutePath()));

            // conduct bottom up parsing
            System.out.println("\n\nPARSING PHASE: \n\n");
            parser.Parse(tokenList);

        } catch (FileNotFoundException e) {
            System.out.println("File not found :3");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }
    }
}
