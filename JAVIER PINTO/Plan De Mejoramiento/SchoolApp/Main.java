package SchoolApp;

import java.util.Scanner;

public class Main {// Clase principal del sistema de gestión escolar
    private School school;
    private Scanner scanner;
    
    public Main() {// Constructor
        scanner = new Scanner(System.in);
        initializeSystem();
    }
    
    private void initializeSystem() {// Inicializar el sistema
        System.out.println("=== APP DE GESTIÓN ESCOLAR ===");
        System.out.print("Ingrese el nombre de la institución educativa: ");
        String institutionName = scanner.nextLine();
        
        int numberOfCourses = getValidatedIntegerInput("Ingrese el numero de cursos que desea crear: ", 1, 20);
        
        school = new School(institutionName, numberOfCourses);
        System.out.println("Institucion '" + institutionName + "' creada con capacidad para " + numberOfCourses + " cursos");
        
        createCourses(numberOfCourses);
        
        showMainMenu();
    }
    
    private void createCourses(int numberOfCourses) {// Crear cursos iniciales
        System.out.println("\nCreacción de cursos: ");
        
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("\nCurso " + (i + 1) + " de" + numberOfCourses);
            int gradeLevel = getValidatedIntegerInput("Ingrse el grado: ", 1, 11);
            
            System.out.print("Ingrese el código del curso: " + gradeLevel);
            String courseCode = scanner.nextLine();
            
            if (!school.addCourse(gradeLevel, courseCode)) {
                i--; 
            }
        }
        
        System.out.println("\nCursos creados con éxito.");
    }
    
    private void showMainMenu() {// Mostrar menú principal
        while (true) {
            System.out.println("\n" + school.getInstitutionName().toUpperCase() + "MENÚ PRINCIPAL");
            System.out.println("1.Ingresar Estudiante");
            System.out.println("2. Listar Estudiantes por Grado");
            System.out.println("3. Listar Todos los Estudiantes");
            System.out.println("4. Reporte");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción (1-5): ");
            
            int choice = getValidatedIntegerInput("", 1, 5);
            
            switch (choice) {
                case 1:
                    enrollStudent();
                    break;
                case 2:
                    listStudentsByGrade();
                    break;
                case 3:
                    school.listAllStudents();
                    break;
                case 4:
                    school.reportGrades();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema!");
                    return;
            }
        }
    }
    
    private void enrollStudent() {// Ingresar y matricular estudiante
        if (school.getCourseCount() == 0) {
            System.out.println("No hay cursos. Cree un curso primero.");
            return;
        }
        
        System.out.println("\nIngresar Estudiante:");
        
        System.out.print("ID: ");
        String studentId = scanner.nextLine();
        
        System.out.print("Nombre del estudiante: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Apellido del estudiante: ");
        String lastName = scanner.nextLine();
        
        int age = getValidatedIntegerInput("Ingresar edad: ", 5, 18);
        
        Student student = new Student(studentId, firstName, lastName, age);
        
        System.out.println("\nGrados disponibles:");
        Course[] courses = school.getCourses();
        for (int i = 0; i < school.getCourseCount(); i++) {// Listar cursos disponibles
            Course course = courses[i];
            String fullStatus = course.isFull() ? "Completo" : "";
            System.out.println("Grado " + course.getGradeLevel() + 
                            " - " + course.getStudentCount() + 
                            "/" + course.getMaxStudents() + " estudiantes" + fullStatus);
        }
        
        int gradeLevel = getValidatedIntegerInput("Introduzca el nivel académico para matricular al alumno: ", 1, 12);
        
        if (school.gradeExists(gradeLevel)) {// Verificar si el grado existe
            school.enrollStudentInGrade(gradeLevel, student);
        } else {
            System.out.println("Grado " + gradeLevel + " no existe.");
        }
    }
    
    private void listStudentsByGrade() {// Listar estudiantes por grado
        if (school.getCourseCount() == 0) {
            System.out.println("No hay cursos.");
            return;
        }
        
        int gradeLevel = getValidatedIntegerInput("Ingrese el grado que desea listar", 1, 12);
        school.listStudentsByGrade(gradeLevel);
    }
    
    private int getValidatedIntegerInput(String message, int min, int max) {// Validar entrada numérica
        while (true) {
            try {
                if (!message.isEmpty()) {
                    System.out.print(message);
                }
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Por favor ingrese un número entre " + min + " y " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("ingrese un número válido.");
            }
        }
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
