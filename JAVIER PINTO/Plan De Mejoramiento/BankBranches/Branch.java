package BankBranches;

public class Branch {// Clase para sucursales
    private String branchId;
    private String bankId;
    private String city;
    private String address;
    private String phone;
    private int employeeCount;
    
    public Branch(String branchId, String bankId, String city, String address, String phone) {// Constructor
        this.branchId = branchId;
        this.bankId = bankId;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.employeeCount = 0;
    }
    
    public void initializeProducts(int branchIndex) {// Método para inicializar productos en la matriz
        String[] products = {
            "Cuenta corriente",
            "Cuenta de ahorros", 
            "CDT",
            "Tarjeta de crédito",
            "Préstamo libranza",
            "Préstamo hipotecario",
            "Préstamo libre inversión"
        };

        for (int i = 0; i < products.length; i++) {// Llenar la matriz de productos
            GlobalData.productsMatrix[branchIndex][i] = products[i];
        }
    }
    
    // Getters
    public String getBranchId() { return branchId; }
    public String getBankId() { return bankId; }
    public String getCity() { return city; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public int getEmployeeCount() { return employeeCount; }
    public void setEmployeeCount(int count) { this.employeeCount = count; }
    
    @Override
    public String toString() {// Representación en cadena
        return "Sucursal: " + branchId + ", Ciudad: " + city + ", Tel: " + phone + ", Empleados: " + employeeCount;
    }
}
