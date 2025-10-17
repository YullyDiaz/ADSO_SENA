package BankBranches;

import java.util.Scanner;
import java.util.Random;

public class BankSystem {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    
    // Registrar banco con ciudad
    public void registerBank() {
        System.out.println("\n REGISTRAR NUEVO BANCO");
        
        System.out.print("ID del banco: ");
        String bankId = scanner.next();
        
        System.out.print("Nombre del banco: ");
        String name = scanner.next();
        
        System.out.print("Ciudad sede: ");
        String city = scanner.next();
        
        System.out.print("Año de fundación: ");
        int year = scanner.nextInt();
        
        GlobalData.banks[GlobalData.bankCount] = new Bank(bankId, name, city, year);
        GlobalData.bankCount++;
        
        System.out.println("Banco registrado exitosamente");
    }
    
    // Registrar sucursal
    public void registerBranch() {
        if (GlobalData.bankCount == 0) {
            System.out.println("Primero debe registrar al menos un banco");
            return;
        }
        
        System.out.println("\nREGISTRAR NUEVA SUCURSAL");
        
        System.out.print("ID de la sucursal: ");
        String branchId = scanner.next();
        
        // Mostrar bancos disponibles
        System.out.println("Bancos disponibles:");
        for (int i = 0; i < GlobalData.bankCount; i++) {
            if (GlobalData.banks[i] != null) {
                System.out.println((i+1) + ". " + GlobalData.banks[i].getName() + 
                                " - " + GlobalData.banks[i].getHeadquartersCity());
            }
        }
        
        System.out.print("Seleccione banco (número): ");
        int bankIndex = scanner.nextInt() - 1;
        
        // Validar índice del banco
        if (bankIndex < 0 || bankIndex >= GlobalData.bankCount || GlobalData.banks[bankIndex] == null) {
            System.out.println(" Banco inválido");
            return;
        }
        
        System.out.print("Ciudad de la sucursal: ");
        String city = scanner.next();
        
        System.out.print("Dirección: ");
        String address = scanner.next();
        
        System.out.print("Teléfono: ");
        String phone = scanner.next();
        
        String bankId = GlobalData.banks[bankIndex].getBankId();
        GlobalData.branches[GlobalData.branchCount] = new Branch(branchId, bankId, city, address, phone);
        
        // Inicializar productos para esta sucursal
        GlobalData.branches[GlobalData.branchCount].initializeProducts(GlobalData.branchCount);
        
        GlobalData.branchCount++;
        System.out.println("Sucursal registrada exitosamente en " + city);
    }
    
    // Registrar empleados en sucursal
    public void registerEmployee() {
        if (GlobalData.branchCount == 0) {
            System.out.println("Primero debe registrar al menos una sucursal");
            return;
        }
        
        System.out.println("\n REGISTRAR EMPLEADO");
        
        System.out.print("ID del empleado: ");
        String empId = scanner.next();
        
        // Mostrar sucursales disponibles
        System.out.println("Sucursales disponibles:");
        for (int i = 0; i < GlobalData.branchCount; i++) {
            if (GlobalData.branches[i] != null) {
                System.out.println((i+1) + ". " + GlobalData.branches[i].getBranchId() + " - " + 
                                GlobalData.branches[i].getCity() + " - " + 
                                GlobalData.branches[i].getAddress());
            }
        }
        
        System.out.print("Seleccione sucursal (número): ");
        int branchIndex = scanner.nextInt() - 1;
        
        // Validar que el índice sea correcto
        if (branchIndex < 0 || branchIndex >= GlobalData.branchCount || GlobalData.branches[branchIndex] == null) {
            System.out.println("Sucursal inválida");
            return;
        }
        
        String branchId = GlobalData.branches[branchIndex].getBranchId();
        
        System.out.print("Nombre del empleado: ");
        String firstName = scanner.next();
        
        System.out.print("Apellido del empleado: ");
        String lastName = scanner.next();
        
        System.out.print("Cargo: ");
        String position = scanner.next();
        
        System.out.print("Email: ");
        String email = scanner.next();
        
        // Buscar posición disponible en la matriz de empleados
        int currentEmployeeCount = GlobalData.branches[branchIndex].getEmployeeCount();
        
        // Verificar que no exceda el límite de empleados por sucursal
        if (currentEmployeeCount >= 10) {
            System.out.println("Esta sucursal ya tiene el máximo de 10 empleados");
            return;
        }
        
        // Registrar empleado en la matriz
        GlobalData.employees[branchIndex][currentEmployeeCount] = 
            new Employee(empId, branchId, firstName, lastName, position, email);
        
        // Actualizar contador de empleados
        GlobalData.branches[branchIndex].setEmployeeCount(currentEmployeeCount + 1);
        
        System.out.println("Empleado registrado exitosamente en la sucursal " + branchId);
    }
    
    //  Crear campaña
    public void createCampaign() {
        System.out.println("\nCREAR CAMPAÑA");
        
        System.out.print("ID de la campaña: ");
        String campaignId = scanner.next();
        
        System.out.print("Nombre de la campaña: ");
        String name = scanner.next();
        
        System.out.print("Descripción: ");
        String description = scanner.next();
        
        System.out.print("Fecha inicio (dd/mm/aaaa): ");
        String startDate = scanner.next();
        
        System.out.print("Fecha fin (dd/mm/aaaa): ");
        String endDate = scanner.next();
        
        // Mostrar productos disponibles
        System.out.println("Productos disponibles:");
        String[] products = {"Cuenta corriente", "Cuenta de ahorros", "CDT", "Tarjeta de crédito", 
                        "Préstamo libranza", "Préstamo hipotecario", "Préstamo libre inversión"};
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i]);
        }
        System.out.print("Seleccione producto objetivo (número): ");
        int productIndex = scanner.nextInt() - 1;
        
        if (productIndex < 0 || productIndex >= products.length) {
            System.out.println("Producto inválido");
            return;
        }
        
        String targetProduct = products[productIndex];
        
        GlobalData.campaigns[GlobalData.campaignCount] = new Campaign(campaignId, name, description, startDate, endDate, targetProduct);
        GlobalData.campaignCount++;
        
        System.out.println("✅ Campaña creada exitosamente");
    }
    
    // Listar ciudad, sucursales y productos
    public void listBranchesAndProducts() {
        System.out.println("\nLISTADO DE SUCURSALES Y PRODUCTOS");
        
        if (GlobalData.branchCount == 0) {
            System.out.println("ℹNo hay sucursales registradas");
            return;
        }
        
        for (int i = 0; i < GlobalData.branchCount; i++) {
            if (GlobalData.branches[i] == null) continue;

            Branch branch = GlobalData.branches[i]; 
            Bank bank = findBankById(branch.getBankId());

            System.out.println("\n" + branch);
            if (bank != null) {
                System.out.println("    Banco: " + bank.getName());
            }
            System.out.println("    Productos disponibles:");

            // Listar productos de la matriz
            boolean hasProducts = false;
            for (int j = 0; j < 7; j++) {
                if (GlobalData.productsMatrix[i][j] != null && !GlobalData.productsMatrix[i][j].isEmpty()) {
                    System.out.println("    • " + GlobalData.productsMatrix[i][j]);
                    hasProducts = true;
                }
            }
            if (!hasProducts) {
                System.out.println("     No hay productos registrados");
            }
            
            // Listar empleados
            System.out.println("    Empleados:");
            boolean hasEmployees = false;
            for (int k = 0; k < branch.getEmployeeCount(); k++) {
                if (GlobalData.employees[i][k] != null) {
                    System.out.println("   " + GlobalData.employees[i][k].getFirstName() + " " + 
                                    GlobalData.employees[i][k].getLastName() + " - " + 
                                    GlobalData.employees[i][k].getPosition());
                    hasEmployees = true;
                }
            }
            if (!hasEmployees) {
                System.out.println("    No hay empleados registrados");
            }
        }
    }
    
    // Registrar cliente y asignar productos/campaña
    public void registerClient() {
        System.out.println("\nREGISTRAR CLIENTE");
        
        System.out.print("ID del cliente: ");
        String clientId = scanner.next();
        
        System.out.print("Nombre: ");
        String firstName = scanner.next();
        
        System.out.print("Apellido: ");
        String lastName = scanner.next();
        
        System.out.print("Número de identificación: ");
        String idNumber = scanner.next();
        
        System.out.print("Teléfono: ");
        String phone = scanner.next();
        
        GlobalData.clients[GlobalData.clientCount] = new Client(clientId, firstName, lastName, idNumber, phone);
        
        // Asignar productos al cliente
        assignProductsToClient(GlobalData.clientCount);
        
        // Asignar campaña si existe
        assignCampaignToClient(GlobalData.clientCount);
        
        GlobalData.clientCount++;
        System.out.println("Cliente registrado exitosamente");
    }
    
    private void assignProductsToClient(int clientIndex) {
        System.out.println("\nASIGNAR PRODUCTOS AL CLIENTE");
        
        String[] products = {"Cuenta corriente", "Cuenta de ahorros", "CDT", "Tarjeta de crédito", 
                        "Préstamo libranza", "Préstamo hipotecario", "Préstamo libre inversión"};
        
        System.out.println("Productos disponibles (máximo 5):");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i]);
        }
        System.out.println("0. Terminar asignación");
        
        int productCount = 0;
        while (productCount < 5) {
            System.out.print("Seleccione producto (número, 0 para terminar): ");
            int choice = scanner.nextInt();
            
            if (choice == 0) break;
            if (choice >= 1 && choice <= 7) {
                GlobalData.clients[clientIndex].addProduct(products[choice-1]);
                productCount++;
                System.out.println("Producto asignado: " + products[choice-1]);
            } else {
                System.out.println(" Opción inválida");
            }
        }
    }
    
    private void assignCampaignToClient(int clientIndex) {
        if (GlobalData.campaignCount == 0) {
            System.out.println(" No hay campañas disponibles para asignar");
            return;
        }
        
        System.out.println("\nASIGNAR CAMPAÑA AL CLIENTE");
        System.out.println("Campañas disponibles:");
        for (int i = 0; i < GlobalData.campaignCount; i++) {
            if (GlobalData.campaigns[i] != null) {
                System.out.println((i+1) + ". " + GlobalData.campaigns[i].getName() + " - " + GlobalData.campaigns[i].getTargetProduct());
            }
        }
        
        System.out.print("Seleccione campaña (número, 0 para omitir): ");
        int choice = scanner.nextInt();
        
        if (choice == 0) return;
        
        if (choice > 0 && choice <= GlobalData.campaignCount && GlobalData.campaigns[choice-1] != null) {
            String campaignId = GlobalData.campaigns[choice-1].getCampaignId();
            GlobalData.clients[clientIndex].assignCampaign(campaignId);
            System.out.println("Campaña asignada: " + GlobalData.campaigns[choice-1].getName());
        } else {
            System.out.println(" Campaña inválida");
        }
    }
    
    // Listar productos del cliente y campañas
    public void listClientProductsAndCampaigns() {
        System.out.println("\nPRODUCTOS DE CLIENTES Y CAMPAÑAS");
        
        if (GlobalData.clientCount == 0) {
            System.out.println("ℹNo hay clientes registrados");
            return;
        }
        
        for (int i = 0; i < GlobalData.clientCount; i++) {
            if (GlobalData.clients[i] == null) continue;
            
            Client client = GlobalData.clients[i];
            System.out.println("\n" + client);
            
            System.out.println("   Productos:");
            String[] products = client.getProducts();
            boolean hasProducts = false;
            for (String product : products) {
                if (product != null) {
                    System.out.println("   • " + product);
                    hasProducts = true;
                }
            }
            if (!hasProducts) {
                System.out.println("   No tiene productos asignados");
            }
            
            // RF6: Mostrar campaña
            if (client.getCampaignId() != null) {
                Campaign campaign = findCampaignById(client.getCampaignId());
                if (campaign != null) {
                    System.out.println("   Campaña: " + campaign.getName() + " - " + campaign.getDescription());
                }
            } else {
                System.out.println("   No tiene campaña asignada");
            }
        }
    }
    
    // MÉTODO AUXILIAR - AGREGAR ESTO AL FINAL
    private Bank findBankById(String bankId) {
        for (int i = 0; i < GlobalData.bankCount; i++) {
            if (GlobalData.banks[i] != null && GlobalData.banks[i].getBankId().equals(bankId)) {
                return GlobalData.banks[i];
            }
        }
        return null;
    }
    
    private Campaign findCampaignById(String campaignId) {
        for (int i = 0; i < GlobalData.campaignCount; i++) {
            if (GlobalData.campaigns[i] != null && GlobalData.campaigns[i].getCampaignId().equals(campaignId)) {
                return GlobalData.campaigns[i];
            }
        }
        return null;
    }
}