package JAVA.Json;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import

//Se utilizan atributos como Nombre y Empresa para realizar el ejercicio.
class Json {

    //Se utilizan modificadores de acceso privados
    private Map<String, Object> user;
    private Map<String, Object> company;

    // Implementación del constructor para los atributos con parámetros
    public Json() {
        this.user = new HashMap<>();
        this.user.put("name", "Juan");
        this.user.put("age", 30);
        this.user.put("email", "juan@example.com");
        
        this.company = new HashMap<>();
        this.company.put("name", "Tech Corp");
        this.company.put("employees", 100);
        this.company.put("founded", 2020);
    }

    public Json(Map<String, Object> userData, Map<String, Object> companyData) {
        this.user = (userData != null) ? userData : new HashMap<>();
        this.company = (companyData != null) ? companyData : new HashMap<>();
        
        if (this.user.isEmpty()) {
            this.user.put("name", "Juan");
            this.user.put("age", 30);
            this.user.put("email", "juan@example.com");
        }
        
        if (this.company.isEmpty()) {
            this.company.put("name", "Tech Corp");
            this.company.put("employees", 100);
            this.company.put("founded", 2020);
        }
    }

    // En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public Map<String, Object> getUser() {
        return this.user;
    }

    public void setUser(Map<String, Object> newUser) {
        if (newUser != null) {
            this.user = newUser;
        } else {
            throw new IllegalArgumentException("El usuario debe ser un objeto válido");
        }
    }

    public Map<String, Object> getCompany() {
        return this.company;
    }

    public void setCompany(Map<String, Object> newCompany) {
        if (newCompany != null) {
            this.company = newCompany;
        } else {
            throw new IllegalArgumentException("La empresa debe ser un objeto válido");
        }
    }

    // En esta parte aplicamos un método con return que combina usuario y empresa en un JSON
    public String combineJson() {
        Map<String, Object> combinedData = new HashMap<>();
        combinedData.put("user", this.user);
        combinedData.put("company", this.company);
        combinedData.put("timestamp", new Date().toISOString());
        
        Gson gson = new Gson();
        return gson.toJson(combinedData);
    }

    // Por último implementamos un método void para la ejecución del programa.
    public void displayJsonData() {
        Gson gson = new Gson();
        System.out.println("DATOS JSON");
        System.out.println("Usuario: " + gson.toJson(this.user));
        System.out.println("Empresa: " + gson.toJson(this.company));
    }
}
