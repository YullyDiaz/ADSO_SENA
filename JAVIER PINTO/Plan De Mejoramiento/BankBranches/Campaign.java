package BankBranches;

public class Campaign {// Clase para campañas
    private String campaignId;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private String targetProduct;
    
    public Campaign(String campaignId, String name, String description, String startDate, String endDate, String targetProduct) {// Constructor
        this.campaignId = campaignId;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.targetProduct = targetProduct;
    }
    
    // Getters
    public String getCampaignId() { return campaignId; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }
    public String getTargetProduct() { return targetProduct; }
    
    @Override
    public String toString() {// Representación en cadena
        return "Nombre: " + name + ", Producto: " + targetProduct + " | " + startDate + " a " + endDate;
    }
}
