package BankBranches;

import java.util.Scanner;

public class Main {// Clase principal para ejecutar el sistema
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankSystem bankManager = new BankSystem();
        int option;
        
        System.out.println("SISTEMA DE GESTIÓN BANCARIA");
        
        do {// Menú principal
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Registrar banco ");
            System.out.println("2. Registrar sucursal ");
            System.out.println("3. Registrar empleado ");
            System.out.println("4. Crear campaña ");
            System.out.println("5. Listar sucursales y productos ");
            System.out.println("6. Registrar cliente ");
            System.out.println("7. Listar clientes y campañas ");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    bankManager.registerBank();
                    break;
                case 2:
                    bankManager.registerBranch();
                    break;
                case 3:
                    bankManager.registerEmployee();
                    break;
                case 4:
                    bankManager.createCampaign();
                    break;
                case 5:
                    bankManager.listBranchesAndProducts();
                    break;
                case 6:
                    bankManager.registerClient();
                    break;
                case 7:
                    bankManager.listClientProductsAndCampaigns();
                    break;
                case 8:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (option != 8);
        
        scanner.close();
    }
}
