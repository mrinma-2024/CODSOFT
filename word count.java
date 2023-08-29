import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static int countWords(String text) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You can count words of any text or file");
        System.out.println("Please choose an option:");
        System.out.println("Press 1 Enter a text");
        System.out.println("Press 2 Provide a file");

        int option = scanner.nextInt();
        scanner.nextLine(); 

        switch (option) {
            case 1: {
                System.out.print("Enter the text: ");
                String inputText = scanner.nextLine();
                int wordCount = countWords(inputText);
                System.out.println("Total words in the text: " + wordCount);
                break;
            }
            case 2: {
                System.out.print("Enter the file name: ");
                String fileName = scanner.nextLine();

                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    StringBuilder fileContent = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        fileContent.append(line).append("\n");
                    }
                    int wordCount = countWords(fileContent.toString());
                    System.out.println("Total words in the file: " + wordCount);
                } catch (IOException e) {
                    System.out.println("Error reading the file: " + e.getMessage());
                    break;
                }
            }
            default: {
                System.out.println("Invalid option. Please choose 1 or 2.");
            }

            scanner.close();
        }
    }
}
