package BankBranches;

public class Bank {// Clase para bancos
    private String bankId;
    private String name;
    private String headquartersCity;
    private int foundationYear;
    
    public Bank(String bankId, String name, String headquartersCity, int foundationYear) {// Constructor
        this.bankId = bankId;
        this.name = name;
        this.headquartersCity = headquartersCity;
        this.foundationYear = foundationYear;
    }
    
    // Getters
    public String getBankId() { return bankId; }
    public String getName() { return name; }
    public String getHeadquartersCity() { return headquartersCity; }
    public int getFoundationYear() { return foundationYear; }
    
    @Override
    public String toString() {// Representación en cadena
        return "Nombre:" + name + ", Ciudad: " + headquartersCity + " | Fundación: " + foundationYear;
    }
}
