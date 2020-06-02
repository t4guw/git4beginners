/*
    David Liu
    T4G GitHub Classroom Style checker

    Description:
    Created for the purpose of a brief style check that outputs a deduction score.
    Deductions are based on a lack of a class header, method descriptors, and proper indentation using 4 spaces.
    There are A LOT of edge cases to be evaluated here and the simplest and most robust method of
    proper style grading is to look through each student file one-by-one. I would use this style checker
    as a comparison tool.

    Deductions are issued like so:
    No class header - 2 points
    For each missing method header - 1 point
    Missing all method headers - 5 points (overrides the for each missing method header)
    For each improper indentation of 4 spaces - 1 point
 */
import java.io.File;
import java.util.Scanner;

public class StyleCheck {

    public static void main(String[] args) {
        try {
            String fileName = "Test.java";
            int deductions = 0;
            if (!hasClassHeader(fileName)) {
                deductions += 2;
            }
            System.out.println(deductions);
            deductions += checkIndentation(fileName);
            int noComment = checkComments(fileName);
            if (noComment < 0) {
                deductions += 5;
            } else {
                deductions += noComment;
            }
            System.out.println(deductions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean hasClassHeader(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length() != 0) {
                    for (int a = 0; a < line.length(); a++) {
                        if (line.charAt(a) != ' ') {
                            line = line.substring(a);
                            break;
                        }
                    }
                    if (line.length() >= 2 && (line.substring(0, 2).equals("//") || line.substring(0, 2).equals("/*"))) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            // Empty file
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int checkIndentation(String fileName) {
        try {
            int lineNumber = 1;
            int improper = 0;
            int spacing = 4;
            int openBraces = 0;
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int spaces = 0;
                if (line.length() != 0) {
                    for (int a = 0; a < line.length(); a++) {
                        if (line.charAt(a) == ' ') {
                            spaces++;
                        } else {
                            line = line.substring(a);
                            break;
                        }
                    }
                    if (line.contains("}")) {
                        openBraces--;
                    }
                    // If the line doesn't match the spacing
                    if (spacing * openBraces != spaces) {
                        if (line.length() >= 2) {
                            // Check if it's a comment
                            String comment = line.substring(0, 2);
                            // It's not a comment
                            if (!(comment.equals("//") || comment.equals("/*") || comment.equals("*/"))) {
                                System.out.println("Improper identation on line " + lineNumber);
                                improper++;
                            }
                        }
                    }
                    if (line.contains("{")) {
                        openBraces++;
                    }
                }
                lineNumber++;
            }
            return improper;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int checkComments(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            int lineNumber = 1;
            int numNoComments = 0;
            int numMethods = 0;
            boolean comment = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length() != 0) {
                    for (int a = 0; a < line.length(); a++) {
                        if (line.charAt(a) != ' ') {
                            line = line.substring(a);
                            break;
                        }
                    }

                    if (line.length() >= 2 && (line.substring(0, 2).equals("//") || line.substring(0, 2).equals("*/"))) {
                        comment = true;
                        continue;
                    }

                    if (line.contains(" "))  {
                        String access = line.substring(0, line.indexOf(" "));
                        if (access.equals("public") || access.equals("protected") || access.equals("private")) {
                            numMethods++;
                            if (!comment) {
                                System.out.println("No method header at line number " + lineNumber);
                                numNoComments++;
                            }
                        }
                    }
                    comment = false;
                }
                lineNumber++;
            }
            // For no comments on any method header
            if (numMethods == numNoComments) {
                return -1;
            }
            return numNoComments;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
