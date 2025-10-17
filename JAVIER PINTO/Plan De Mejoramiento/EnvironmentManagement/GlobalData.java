package EnvironmentManagement;
public class GlobalData {// Clase para datos globales del sistema
    public static String[] cities = new String[5];                    
    public static Headquarter[] headquarters = new Headquarter[10];   
    public static Environment[][] environments = new Environment[10][20];
    public static Instructor[] instructors = new Instructor[30];      
    public static Coordinator[] coordinators = new Coordinator[10];   
    
    // Matrices para control
    public static String[][] scheduleMatrix = new String[30][3];      
    public static String[][] inventoryMatrix = new String[10][20];    
    
    // Contadores
    public static int cityCount = 0;
    public static int headquarterCount = 0;
    public static int instructorCount = 0;
    public static int coordinatorCount = 0;
    
    static {// Inicialización de matrices y arreglos
        for (int i = 0; i < scheduleMatrix.length; i++) {
            for (int j = 0; j < scheduleMatrix[i].length; j++) {
                scheduleMatrix[i][j] = "";
            }
        }
        
        for (int i = 0; i < inventoryMatrix.length; i++) {// Inicializa cada fila de la matriz de inventario
            for (int j = 0; j < inventoryMatrix[i].length; j++) {
                inventoryMatrix[i][j] = "Inventario por defecto - Mesa, Sillas, Pizarra, Proyector";
            }
        }
    }
}
