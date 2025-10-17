package SchoolApp;

public class Course {// Clase curso
    private int gradeLevel;
    private String courseCode;
    private Student[] enrolledStudents;
    private int studentCount;
    private final int MAX_STUDENTS = 25;
    
    public Course(int gradeLevel, String courseCode) {// Constructor
        this.gradeLevel = gradeLevel;
        this.courseCode = courseCode;
        this.enrolledStudents = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }
    
    public boolean enrollStudent(Student student) {// Inscribir alumno en el curso
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("No se puede inscribir el alumno, el máximo es de 25 estudiantes.");
            return false;
        }
        
        for (int i = 0; i < studentCount; i++) {// Verificar si el estudiante ya está inscrito
            if (enrolledStudents[i].getStudentId().equals(student.getStudentId())) {
                System.out.println("El estudiante ya está inscrito en este curso.");
                return false;
            }
        }
        
        enrolledStudents[studentCount] = student;
        studentCount++;
        System.out.println("Estudiante: " + student.getFullName() + " Matriculado con éxito. " + gradeLevel);
        return true;
    }
    
    public void listStudents() {// Listar estudiantes inscritos
        System.out.println("\nEstudiantes en el grado " + gradeLevel + " (" + courseCode + ")");
        if (studentCount == 0) {
            System.out.println("No hay estudiantes inscrito en este curso");
            return;
        }
        
        for (int i = 0; i < studentCount; i++) {// Mostrar cada estudiante
            System.out.println((i + 1) + ". " + enrolledStudents[i]);
        }
        System.out.println("Total: " + studentCount + " estudiantes");
    }
    
    // Getters
    public int getGradeLevel() { return gradeLevel; }
    public String getCourseCode() { return courseCode; }
    public int getStudentCount() { return studentCount; }
    public Student[] getEnrolledStudents() { return enrolledStudents; }
    public int getMaxStudents() { return MAX_STUDENTS; }
    
    public boolean isFull() {// Verificar si el curso está lleno
        return studentCount >= MAX_STUDENTS;
    }
}
