import java.io.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true));

            String line;

            bw.write("\n===== STUDENT REPORT CARD =====\n");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int mark1 = Integer.parseInt(data[1]);
                int mark2 = Integer.parseInt(data[2]);
                int mark3 = Integer.parseInt(data[3]);

                double average = (mark1 + mark2 + mark3) / 3.0;

                bw.write("Name    : " + name + "\n");
                bw.write("Marks   : " + mark1 + ", " + mark2 + ", " + mark3 + "\n");
                bw.write("Average : " + average + "\n");

                if (average >= 90)
                    bw.write("Grade   : A+\n");
                else if (average >= 75)
                    bw.write("Grade   : A\n");
                else if (average >= 60)
                    bw.write("Grade   : B\n");
                else
                    bw.write("Grade   : C\n");

                bw.write("---------------------------\n");
            }

            br.close();
            bw.close();

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Student data file not found.");

        } catch (IOException e) {
            System.out.println("Error while reading/writing file: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Invalid marks format found in file.");
        }
    }
}