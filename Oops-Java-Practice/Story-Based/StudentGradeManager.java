import java.io.*;

public class StudentGradeManager {

    static String[] names = new String[100];
    static int[][] marks = new int[100][5];
    static int[] totals = new int[100];
    static String[] grades = new String[100];
    static int studentCount = 0;

    public static void main(String[] args) {

        try {
            readStudentData("students.txt");

            calculateGrades();

            System.out.println("----- Student Report -----");
            displayStudents();

            searchStudent("Raj");

            bubbleSort();

            System.out.println("\n----- Sorted By Total Marks -----");
            displayStudents();

            writeReport("report.txt");

            System.out.println("\nReport written to report.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }

    static void readStudentData(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            names[studentCount] = data[0];

            int total = 0;

            for (int i = 0; i < 5; i++) {
                marks[studentCount][i] = Integer.parseInt(data[i + 1]);
                total += marks[studentCount][i];
            }

            totals[studentCount] = total;
            studentCount++;
        }

        br.close();
    }

    static void calculateGrades() {

        for (int i = 0; i < studentCount; i++) {

            double percentage = totals[i] / 5.0;

            if (percentage >= 90) {
                grades[i] = "A+";
            }
            else {
                if (percentage >= 80) {
                    grades[i] = "A";
                }
                else {
                    if (percentage >= 70) {
                        grades[i] = "B";
                    }
                    else {
                        if (percentage >= 60) {
                            grades[i] = "C";
                        }
                        else {
                            grades[i] = "D";
                        }
                    }
                }
            }
        }
    }

    static void displayStudents() {

        System.out.printf("%-10s %-10s %-10s%n",
                "Name", "Total", "Grade");

        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%-10s %-10d %-10s%n",
                    names[i],
                    totals[i],
                    grades[i]);
        }
    }

    static void searchStudent(String name) {

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {

            if (names[i].equalsIgnoreCase(name)) {

                System.out.println("\nStudent Found:");
                System.out.println("Name: " + names[i]);
                System.out.println("Total: " + totals[i]);
                System.out.println("Grade: " + grades[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nStudent not found.");
        }
    }

    static void bubbleSort() {

        for (int i = 0; i < studentCount - 1; i++) {

            for (int j = 0; j < studentCount - i - 1; j++) {

                if (totals[j] < totals[j + 1]) {

                    int tempTotal = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = tempTotal;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    String tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;

                    int[] tempMarks = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMarks;
                }
            }
        }
    }

    static void writeReport(String fileName) throws IOException {

        BufferedWriter bw =
                new BufferedWriter(new FileWriter(fileName));

        bw.write("Student Report\n");
        bw.write("---------------------------\n");

        for (int i = 0; i < studentCount; i++) {

            bw.write(
                    names[i] +
                    " | Total: " +
                    totals[i] +
                    " | Grade: " +
                    grades[i]
            );

            bw.newLine();
        }

        bw.close();
    }
}