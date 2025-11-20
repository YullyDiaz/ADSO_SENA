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
@Table(name = "Budget_Category")
public class BudgetCategory {
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    private Integer departmentId;
    
}
