package BankBranches;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {// Clase para datos globales
    public static Bank[] banks = new Bank[5];                    
    public static Branch[] branches = new Branch[15];            
    public static Employee[][] employees = new Employee[15][10]; 
    public static String[][] productsMatrix = new String[15][7]; 
    public static Campaign[] campaigns = new Campaign[10];       
    public static Client[] clients = new Client[50];
    
    // Contadores
    public static int bankCount = 0;
    public static int branchCount = 0;
    public static int campaignCount = 0;
    public static int clientCount = 0;

    static {
        for (int i = 0; i < productsMatrix.length; i++) {
            for (int j = 0; j < productsMatrix[i].length; j++) {
                productsMatrix[i][j] = ""; // Inicializar con strings vacíos
            }
        }
    }
}
