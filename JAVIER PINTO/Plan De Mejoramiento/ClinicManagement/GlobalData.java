package ClinicManagement;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {// Clase para datos globales
    public static Clinic[] clinics = new Clinic[3];           
    public static Ambulance[] ambulances = new Ambulance[5];  
    public static String[][] distanceMatrix = new String[3][3]; 
    public static List<Patient> nonTransferablePatients = new ArrayList<>();
    
    // Contadores globales
    public static int totalTransfers = 0;
    public static double totalDistance = 0;
}

