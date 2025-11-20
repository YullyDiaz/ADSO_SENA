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

@Table(name = "Permit_Type")
public class PermitType {
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer permitTypeId;
    private String typeName;
    private String authorityRquired;
    
}