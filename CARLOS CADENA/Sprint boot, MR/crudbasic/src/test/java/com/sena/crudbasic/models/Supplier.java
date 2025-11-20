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

@Table(name = "Supplier")
public class Supplier {
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer supplierId;
    private String supplierName;
    private String contactPerson;
    private String phone;
    private String email;
}