package Salary;

class Student {
    private String name;
    private int id;
    private int[] grades; 
    private int gradeCount;

    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new int[5]; 
        this.gradeCount = 0;
    }

    
    public void addGrade(int grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;
        } else {
            System.out.println("Cannot add more grades, array is full.");
        }
    }

   
    public double calculateAverage() {
        if (gradeCount == 0) return 0;
        int sum = 0;
        for (int i = 0; i < gradeCount; i++) { 
            sum += grades[i];
        }
        return (double) sum / gradeCount;
    }

    
    public int findHighestGrade() {
        if (gradeCount == 0) return 0;
        int highest = grades[0];
        for (int i = 1; i < gradeCount; i++) { 
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }
        return highest;
    }

    
    public int findLowestGrade() {
        if (gradeCount == 0) return 0;
        int lowest = grades[0];
        for (int i = 1; i < gradeCount; i++) { 
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        return lowest;
    }

   
    public void displayGradeReport() {
        System.out.println("Grade Report for " + name + " (ID: " + id + ")");
        System.out.print("Grades: ");
        for (int i = 0; i < gradeCount; i++) { 
            System.out.print(grades[i] + " ");
        }
        System.out.println();
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("Highest Grade: " + findHighestGrade());
        System.out.println("Lowest Grade: " + findLowestGrade());
        System.out.println("--------------------------------");
    }
}

public class GradeManager {
    public static void main(String[] args) {
        Student student1 = new Student("Anaan", 101);
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(78);

        Student student2 = new Student("Basit", 102);
        student2.addGrade(88);
        student2.addGrade(92);
        student2.addGrade(80);
        student2.addGrade(95);

        student1.displayGradeReport();
        student2.displayGradeReport();
    }
}
