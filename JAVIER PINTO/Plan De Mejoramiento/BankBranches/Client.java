package BankBranches;

public class Client {// Clase para clientes
    private String clientId;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String phone;
    private String[] products;  // Arreglo para productos del cliente
    private String campaignId;  //Campaña asignada
    
    public Client(String clientId, String firstName, String lastName, String idNumber, String phone) {// Constructor
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.phone = phone;
        this.products = new String[5]; // Máximo 5 productos por cliente
        this.campaignId = null;
    }
    
    public void addProduct(String product) {//Agregar producto al cliente
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void assignCampaign(String campaignId) {//Asignar campaña al cliente
        this.campaignId = campaignId;
    }
    
    // Getters
    public String getClientId() { return clientId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getIdNumber() { return idNumber; }
    public String getPhone() { return phone; }
    public String[] getProducts() { return products; }
    public String getCampaignId() { return campaignId; }
    
    @Override
    public String toString() {// Representación en cadena
        return "Nombre: " + firstName + ", Apellido:" + lastName + ", ID: " + idNumber + ", Tel: " + phone;
    }
}
