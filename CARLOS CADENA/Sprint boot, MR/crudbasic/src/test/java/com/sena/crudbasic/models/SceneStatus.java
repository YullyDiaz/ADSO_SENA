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

@Table(name = "Scene_Status")
public class SceneStatus {
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer statusId;
    private String statusName;
}

