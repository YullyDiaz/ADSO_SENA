package SchoolApp;

public class School {// Clase institución educativa
    private String institutionName;
    private Course[] courses;
    private int courseCount;
    
    public School(String institutionName, int maxCourses) {
        this.institutionName = institutionName;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }
    
    public String getInstitutionName() {// Getter nombre institución
        return institutionName;
    }
    
    public boolean addCourse(int gradeLevel, String courseCode) {//Crear nuevo grado

        for (int i = 0; i < courseCount; i++) {// Verificar si el grado ya existe
            if (courses[i].getGradeLevel() == gradeLevel) {
                System.out.println("Grado " + gradeLevel + " qué ya existe en la institución.");
                return false;
            }
        }
        
        if (courseCount < courses.length) {// Agregar nuevo curso
            courses[courseCount] = new Course(gradeLevel, courseCode);
            courseCount++;
            System.out.println("Curso para el grado" + gradeLevel + " creado correctamente.");
            return true;
        } else {
            System.out.println("No se pueden agregar más cursos, se alcanzó el máximo.");
            return false;
        }
    }
    
    public boolean enrollStudentInGrade(int gradeLevel, Student student) {// Inscribir alumno en grado específico
        Course targetCourse = findCourseByGrade(gradeLevel);
        if (targetCourse != null) {
            return targetCourse.enrollStudent(student);
        } else {
            System.out.println("Grado " + gradeLevel + " no se encuentra en la institución.");
            return false;
        }
    }
    
    public void reportGrades() {// Reporte de grados y estudiantes
        System.out.println("\nReporte :" + institutionName);
        System.out.println("Total de los grados en la institución: " + courseCount);
        
        for (int i = 0; i < courseCount; i++) {
            Course course = courses[i];
            System.out.println("Grado " + course.getGradeLevel() + 
                            ": " + course.getStudentCount() + 
                            "/" + course.getMaxStudents() + " Estudiantes inscritos.");
        }
        
        System.out.println("Total de estudiantes en la institución: " + getTotalStudents());
    }
    
    public void listStudentsByGrade(int gradeLevel) {// Listar estudiantes por grado
        Course course = findCourseByGrade(gradeLevel);
        if (course != null) {
            course.listStudents();
        } else {
            System.out.println("Grado " + gradeLevel + " no existe");
        }
    }
    
    public void listAllStudents() {
        System.out.println("\nTotal de estudiantes en:" +institutionName);
        boolean hasStudents = false;
        
        for (int i = 0; i < courseCount; i++) {// Listar estudiantes en cada grado
            if (courses[i].getStudentCount() > 0) {
                hasStudents = true;
                courses[i].listStudents();
            }
        }
        
        if (!hasStudents) {
            System.out.println("No hay estudiantes inscritos en la institución.");
        }
    }
    
    // Métodos auxiliares
    private Course findCourseByGrade(int gradeLevel) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getGradeLevel() == gradeLevel) {
                return courses[i];
            }
        }
        return null;
    }
    
    private int getTotalStudents() {
        int total = 0;
        for (int i = 0; i < courseCount; i++) {
            total += courses[i].getStudentCount();
        }
        return total;
    }
    
    public Course[] getCourses() {
        return courses;
    }
    
    public int getCourseCount() {
        return courseCount;
    }
    
    public boolean gradeExists(int gradeLevel) {
        return findCourseByGrade(gradeLevel) != null;
    }
}
