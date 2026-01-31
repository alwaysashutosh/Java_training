package Java290126;

import java.io.*;
import java.util.*;

public class StudentManager {
    private static final String FILE_NAME = "students.txt";

    public void addStudent(Student student) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getCourse());
            System.out.println("Student added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return students;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    try {
                        int id = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        int age = Integer.parseInt(parts[2].trim());
                        String course = parts[3].trim();
                        students.add(new Student(id, name, age, course));
                    } catch (NumberFormatException e) {
                        // Skip invalid lines
                        System.out.println("Skipping invalid record: " + line);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return students;
    }

    public void viewAllStudents() {
        List<Student> students = getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No records found.");
        } else {
            System.out.println("------------------------------------------------");
            System.out.printf("%-5s %-20s %-5s %-15s%n", "ID", "Name", "Age", "Course");
            System.out.println("------------------------------------------------");
            for (Student s : students) {
                System.out.printf("%-5d %-20s %-5d %-15s%n", s.getId(), s.getName(), s.getAge(), s.getCourse());
            }
            System.out.println("------------------------------------------------");
        }
    }

    public void updateStudent(int id, Student newDetails) {
        List<Student> students = getAllStudents();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.set(i, newDetails);
                found = true;
                break;
            }
        }
        if (found) {
            saveAll(students);
            System.out.println("Student record updated.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void deleteStudent(int id) {
        List<Student> students = getAllStudents();
        boolean removed = students.removeIf(s -> s.getId() == id);

        if (removed) {
            saveAll(students);
            System.out.println("Student record deleted.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    private void saveAll(List<Student> students) {
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                out.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getCourse());
            }
        } catch (IOException e) {
            System.out.println("Error saving changes: " + e.getMessage());
        }
    }
}
