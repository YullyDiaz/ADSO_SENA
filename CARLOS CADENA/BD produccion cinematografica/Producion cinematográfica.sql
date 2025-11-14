-- CREACIÓN DE LA BASE DE DATOS
CREATE DATABASE movie_production_system;
USE movie_production_system;

-- TABLAS PRINCIPALES DE LAS CATEGORÍAS (APLICANDO 1, 2, Y 3 FN)
CREATE TABLE Genre ( --Guarda los generos de las películas
    genre_id INT PRIMARY KEY AUTO_INCREMENT,
    genre_name VARCHAR(50) NOT NULL
);

CREATE TABLE Role_Type ( --Define los trabajos o cargos en una producción cinematográfica
    role_id INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(50) NOT NULL,
    role_category ENUM('Actor', 'Director', 'Tecnico') NOT NULL
);

CREATE TABLE Department ( --Las diferentes áreas o divisiones de trabajo en una producción
    department_id INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(100) NOT NULL,
    department_head VARCHAR(100)
);

CREATE TABLE Location_Type ( --Los diferentes tipos de lugares donde se puede grabar
    location_type_id INT PRIMARY KEY AUTO_INCREMENT,
    type_name VARCHAR(100) NOT NULL,
    requirements TEXT
);

CREATE TABLE Scene_Status ( --Los diferentes estados por los que pasa una escena durante la rpoducción
    status_id INT PRIMARY KEY AUTO_INCREMENT,
    status_name VARCHAR(50) NOT NULL
);

CREATE TABLE Position ( --Los puestos de trabjo específicos dentro de cada departamento
    position_id INT PRIMARY KEY AUTO_INCREMENT,
    position_name VARCHAR(100) NOT NULL,
    department_id INT,
    salary_range VARCHAR(100),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

CREATE TABLE Budget_Category ( --Las categorías de gasto dentro del presupuesto
    category_id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(100) NOT NULL,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

CREATE TABLE Permit_Type ( --Los diferentes tipos de permisos necesarios para grabar en ubicaciones
    permit_type_id INT PRIMARY KEY AUTO_INCREMENT,
    type_name VARCHAR(100) NOT NULL,
    authority_required VARCHAR(100)
);

CREATE TABLE Equipment_Type ( --Los diferentes tipos de equipos técnicos usados en la producción
    equipment_type_id INT PRIMARY KEY AUTO_INCREMENT,
    equipment_name VARCHAR(100) NOT NULL,
    daily_rental_cost DECIMAL(10,2) NOT NULL,
    maintenance_schedule VARCHAR(100)
);

CREATE TABLE Supplier ( --Información de los proveedores de servicios o productos
    supplier_id INT PRIMARY KEY AUTO_INCREMENT,
    supplier_name VARCHAR(200) NOT NULL,
    contact_person VARCHAR(100),
    phone VARCHAR(20),
    email VARCHAR(100)
);

-- TABLAS DE ENTIDADES PRINCIPALES DE LAS PELÍCULAS (APLICANDO 1, 2, Y 3 FN)
CREATE TABLE Movie (
    movie_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    genre_id INT,
    total_budget DECIMAL(12,2),
    start_date DATE,
    end_date DATE,
    status ENUM('Pre-producción', 'Producción', 'Post-producción', 'Estrenada'),
    FOREIGN KEY (genre_id) REFERENCES Genre(genre_id)
);

CREATE TABLE Person ( --Información básica de cada película
    person_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(150),
    phone VARCHAR(20),
    birth_date DATE,
    nationality VARCHAR(50)
);

CREATE TABLE Person_Role ( --Información base de las películas
    person_role_id INT PRIMARY KEY AUTO_INCREMENT,
    person_id INT,
    role_id INT,
    experience_years INT,
    FOREIGN KEY (person_id) REFERENCES Person(person_id),
    FOREIGN KEY (role_id) REFERENCES Role_Type(role_id)
);

CREATE TABLE Location ( --Lugares físicos donde se puede grabar
    location_id INT PRIMARY KEY AUTO_INCREMENT,
    location_name VARCHAR(200) NOT NULL,
    address TEXT,
    city VARCHAR(100),
    country VARCHAR(100),
    location_type_id INT,
    daily_cost DECIMAL(10,2),
    max_capacity INT,
    FOREIGN KEY (location_type_id) REFERENCES Location_Type(location_type_id)
);

CREATE TABLE Scene ( --Escenas individuales de las películas
    scene_id INT PRIMARY KEY AUTO_INCREMENT,
    movie_id INT,
    scene_number INT NOT NULL,
    description TEXT,
    estimated_duration INT, -- en minutos
    planned_date DATE,
    actual_duration INT,
    status_id INT,
    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id),
    FOREIGN KEY (status_id) REFERENCES Scene_Status(status_id)
);

CREATE TABLE Budget ( --Presupuesto asignado y gastado por departamento en cada película
    budget_id INT PRIMARY KEY AUTO_INCREMENT,
    movie_id INT,
    department_id INT,
    allocated_amount DECIMAL(12,2),
    spent_amount DECIMAL(12,2),
    fiscal_year YEAR,
    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

-- TABLAS DE RELACIÓN (PIVOTE) (APLICANDO 1, 2, Y 3 FN)
CREATE TABLE Cast ( --Una persona puede estar en multiples películas, una película puede tener muchas personas
    cast_id INT PRIMARY KEY AUTO_INCREMENT,
    movie_id INT,
    person_id INT,
    character_name VARCHAR(100),
    salary DECIMAL(10,2),
    role_id INT,
    contract_start DATE,
    contract_end DATE,
    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id),
    FOREIGN KEY (person_id) REFERENCES Person(person_id),
    FOREIGN KEY (role_id) REFERENCES Role_Type(role_id)
);

CREATE TABLE Scene_Location ( --Una escena se puede grabar en muchas ubicaciones, una ubicación se puede usar para muchas escenas
    scene_location_id INT PRIMARY KEY AUTO_INCREMENT,
    scene_id INT,
    location_id INT,
    shooting_date DATE,
    worked_hours INT,
    status_id INT,
    FOREIGN KEY (scene_id) REFERENCES Scene(scene_id),
    FOREIGN KEY (location_id) REFERENCES Location(location_id),
    FOREIGN KEY (status_id) REFERENCES Scene_Status(status_id)
);

CREATE TABLE Technical_Team (  --Qué técnicos trabajan en qué películas, en qué departamentos y con qué puesto
    team_id INT PRIMARY KEY AUTO_INCREMENT,
    movie_id INT,
    person_id INT,
    department_id INT,
    position_id INT,
    hire_date DATE,
    end_date DATE,
    monthly_salary DECIMAL(10,2),
    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id),
    FOREIGN KEY (person_id) REFERENCES Person(person_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id),
    FOREIGN KEY (position_id) REFERENCES Position(position_id)
);

CREATE TABLE Scene_Cast ( --Un actor puede participar en muchas escenas, una escena puede tener muchos actores
    scene_cast_id INT PRIMARY KEY AUTO_INCREMENT,
    scene_id INT,
    person_id INT,
    scheduled_hours INT,
    actual_hours INT,
    overtime_hours INT,
    costume_required BOOLEAN,
    FOREIGN KEY (scene_id) REFERENCES Scene(scene_id),
    FOREIGN KEY (person_id) REFERENCES Person(person_id)
);

CREATE TABLE Budget_Detail ( --Gastos individuales dentro de un presupuesto
    budget_detail_id INT PRIMARY KEY AUTO_INCREMENT,
    budget_id INT,
    category_id INT,
    concept VARCHAR(200),
    amount DECIMAL(10,2),
    expense_date DATE,
    supplier_id INT,
    payment_status ENUM('Pagado', 'Pendiente', 'Rechazado'),
    FOREIGN KEY (budget_id) REFERENCES Budget(budget_id),
    FOREIGN KEY (category_id) REFERENCES Budget_Category(category_id),
    FOREIGN KEY (supplier_id) REFERENCES Supplier(supplier_id)
);

CREATE TABLE Location_Permit ( --Permisos específicos para cada ubicación
    permit_id INT PRIMARY KEY AUTO_INCREMENT,
    location_id INT,
    permit_type_id INT,
    permit_number VARCHAR(100),
    issue_date DATE,
    expiry_date DATE,
    cost DECIMAL(10,2),
    status ENUM('Vigente', 'Vencido', 'En proceso'),
    FOREIGN KEY (location_id) REFERENCES Location(location_id),
    FOREIGN KEY (permit_type_id) REFERENCES Permit_Type(permit_type_id)
);

CREATE TABLE Scene_Equipment ( --Que equipos se usan en que escenas
    equipment_id INT PRIMARY KEY AUTO_INCREMENT,
    scene_id INT,
    equipment_type_id INT,
    quantity INT,
    responsible_person_id INT,
    rental_start DATE,
    rental_end DATE,
    FOREIGN KEY (scene_id) REFERENCES Scene(scene_id),
    FOREIGN KEY (equipment_type_id) REFERENCES Equipment_Type(equipment_type_id),
    FOREIGN KEY (responsible_person_id) REFERENCES Person(person_id)
);

CREATE TABLE Location_Schedule ( --Cuando está reservada cada ubicación y para que película
    schedule_id INT PRIMARY KEY AUTO_INCREMENT,
    location_id INT,
    start_date DATE,
    end_date DATE,
    reserved_by_movie INT,
    FOREIGN KEY (location_id) REFERENCES Location(location_id),
    FOREIGN KEY (reserved_by_movie) REFERENCES Movie(movie_id)
);

CREATE TABLE Script_Version ( --Diferentes versiones del guión de cada película
    version_id INT PRIMARY KEY AUTO_INCREMENT,
    movie_id INT,
    version_number VARCHAR(20),
    revision_date DATE,
    author_id INT,
    changes_description TEXT,
    file_path VARCHAR(500),
    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id),
    FOREIGN KEY (author_id) REFERENCES Person(person_id)
);
