import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lonbok.AllargsConstructor;
import lonbok.Data;
import lonbok.NoargsConstructor;

@Entity
@Data
@AllargsConstructor
@NoargsConstructor

@Table(name = "Equipment_Type")
public class EquipmentType {
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer equipmentTypeId;
    private String equipmentName;
    private double dailyRentalCost;
    private String maintenanceSchedule;
}
