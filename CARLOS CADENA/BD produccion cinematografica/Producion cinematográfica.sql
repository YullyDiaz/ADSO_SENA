-- CREACIÓN DE LA BASE DE DATOS
CREATE DATABASE movie_production_system;
USE movie_production_system;

-- TABLAS PRINCIPALES (3FN)
CREATE TABLE Genre (
    genre_id INT PRIMARY KEY AUTO_INCREMENT,
    genre_name VARCHAR(50) NOT NULL
);

CREATE TABLE Role_Type (
    role_id INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(50) NOT NULL,
    role_category ENUM('Actor', 'Director', 'Tecnico') NOT NULL
);

CREATE TABLE Department (
    department_id INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(100) NOT NULL,
    department_head VARCHAR(100)
);

CREATE TABLE Location_Type (
    location_type_id INT PRIMARY KEY AUTO_INCREMENT,
    type_name VARCHAR(100) NOT NULL,
    requirements TEXT
);

CREATE TABLE Scene_Status (
    status_id INT PRIMARY KEY AUTO_INCREMENT,
    status_name VARCHAR(50) NOT NULL
);

CREATE TABLE Position (
    position_id INT PRIMARY KEY AUTO_INCREMENT,
    position_name VARCHAR(100) NOT NULL,
    department_id INT,
    salary_range VARCHAR(100),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

CREATE TABLE Budget_Category (
    category_id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(100) NOT NULL,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

CREATE TABLE Permit_Type (
    permit_type_id INT PRIMARY KEY AUTO_INCREMENT,
    type_name VARCHAR(100) NOT NULL,
    authority_required VARCHAR(100)
);

CREATE TABLE Equipment_Type (
    equipment_type_id INT PRIMARY KEY AUTO_INCREMENT,
    equipment_name VARCHAR(100) NOT NULL,
    daily_rental_cost DECIMAL(10,2) NOT NULL,
    maintenance_schedule VARCHAR(100)
);

CREATE TABLE Supplier (
    supplier_id INT PRIMARY KEY AUTO_INCREMENT,
    supplier_name VARCHAR(200) NOT NULL,
    contact_person VARCHAR(100),
    phone VARCHAR(20),
    email VARCHAR(100)
);

-- TABLAS DE ENTIDADES PRINCIPALES
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

CREATE TABLE Person (
    person_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(150),
    phone VARCHAR(20),
    birth_date DATE,
    nationality VARCHAR(50)
);

CREATE TABLE Person_Role (
    person_role_id INT PRIMARY KEY AUTO_INCREMENT,
    person_id INT,
    role_id INT,
    experience_years INT,
    FOREIGN KEY (person_id) REFERENCES Person(person_id),
    FOREIGN KEY (role_id) REFERENCES Role_Type(role_id)
);

CREATE TABLE Location (
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

CREATE TABLE Scene (
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

CREATE TABLE Budget (
    budget_id INT PRIMARY KEY AUTO_INCREMENT,
    movie_id INT,
    department_id INT,
    allocated_amount DECIMAL(12,2),
    spent_amount DECIMAL(12,2),
    fiscal_year YEAR,
    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

-- TABLAS DE RELACIÓN (PIVOTE)
CREATE TABLE Cast (
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

CREATE TABLE Scene_Location (
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

CREATE TABLE Technical_Team (
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

CREATE TABLE Scene_Cast (
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

CREATE TABLE Budget_Detail (
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

CREATE TABLE Location_Permit (
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

CREATE TABLE Scene_Equipment (
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

CREATE TABLE Location_Schedule (
    schedule_id INT PRIMARY KEY AUTO_INCREMENT,
    location_id INT,
    start_date DATE,
    end_date DATE,
    reserved_by_movie INT,
    FOREIGN KEY (location_id) REFERENCES Location(location_id),
    FOREIGN KEY (reserved_by_movie) REFERENCES Movie(movie_id)
);

CREATE TABLE Script_Version (
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

-- INSERCIÓN DE DATOS EN ESPAÑOL

-- Géneros cinematográficos
INSERT INTO Genre (genre_name) VALUES 
('Drama'),
('Comedia'),
('Acción'),
('Ciencia Ficción'),
('Romance');

-- Tipos de roles
INSERT INTO Role_Type (role_name, role_category) VALUES 
('Actor Principal', 'Actor'),
('Actor Secundario', 'Actor'),
('Director', 'Director'),
('Director de Fotografía', 'Technical'),
('Sonidista', 'Technical');

-- Departamentos
INSERT INTO Department (department_name, department_head) VALUES 
('Dirección', 'Carlos Martínez'),
('Fotografía', 'Ana López'),
('Sonido', 'Pedro García'),
('Vestuario', 'María Rodríguez'),
('Producción', 'Juan Pérez');

-- Estados de escena
INSERT INTO Scene_Status (status_name) VALUES 
('Planificada'),
('En Progreso'),
('Completada'),
('Cancelada'),
('Reprogramada');

-- Tipos de ubicación
INSERT INTO Location_Type (type_name, requirements) VALUES 
('Interior', 'Permiso de filmación en interior'),
('Exterior', 'Permiso municipal y control de tráfico'),
('Estudio', 'Reserva de estudio con equipo técnico'),
('Natural', 'Permiso ambiental y de conservación'),
('Pública', 'Permiso gubernamental y seguridad');

-- Cargos técnicos
INSERT INTO Position (position_name, department_id, salary_range) VALUES 
('Director', 1, 'Alto'),
('Asistente de Dirección', 1, 'Medio'),
('Director de Fotografía', 2, 'Alto'),
('Cámara', 2, 'Medio'),
('Técnico de Sonido', 3, 'Medio');

-- Categorías de presupuesto
INSERT INTO Budget_Category (category_name, department_id) VALUES 
('Salarios', 1),
('Equipo Técnico', 2),
('Vestuario', 4),
('Locaciones', 5),
('Post-producción', 5);

-- Tipos de permisos
INSERT INTO Permit_Type (type_name, authority_required) VALUES 
('Filmación Exterior', 'Municipalidad'),
('Uso de Vía Pública', 'Tránsito y Policía'),
('Filmación Nocturna', 'Municipalidad y Vecinos'),
('Espacio Natural', 'Ministerio de Ambiente'),
('Edificación Histórica', 'Patrimonio Cultural');

-- Tipos de equipo
INSERT INTO Equipment_Type (equipment_name, daily_rental_cost, maintenance_schedule) VALUES 
('Cámara Red Dragon', 500.00, 'Cada 3 meses'),
('Luces LED', 150.00, 'Cada mes'),
('Grabadora Sonido', 80.00, 'Cada 2 meses'),
('Dolly', 200.00, 'Cada 6 meses'),
('Vestuario Especial', 100.00, 'Limpieza después de uso');

-- Proveedores
INSERT INTO Supplier (supplier_name, contact_person, phone, email) VALUES 
('Equipos Profesionales SA', 'Roberto Jiménez', '+34 912 345 678', 'roberto@equipospro.com'),
('Vestuario Cinematográfico', 'Laura Martínez', '+34 913 456 789', 'laura@vestuariofilm.com'),
('Locaciones España', 'Miguel Ángel Ruiz', '+34 914 567 890', 'miguel@locaciones.es'),
('Sonido Digital SL', 'Elena Vargas', '+34 915 678 901', 'elena@sonidodigital.com'),
('Catering Artístico', 'Sofía Hernández', '+34 916 789 012', 'sofia@cateringart.com');

-- Películas
INSERT INTO Movie (title, genre_id, total_budget, start_date, end_date, status) VALUES 
('El Último Amanecer', 1, 5000000.00, '2024-03-01', '2024-08-15', 'Producción'),
('Risas en la Ciudad', 2, 3000000.00, '2024-04-10', '2024-09-20', 'Pre-producción'),
('Misión Secreta', 3, 8000000.00, '2024-02-15', '2024-07-30', 'Post-producción'),
('Futuro Incierto', 4, 6000000.00, '2024-05-01', '2024-10-10', 'Pre-producción'),
('Corazones Encontrados', 5, 2500000.00, '2024-01-20', '2024-06-15', 'Estrenada');

-- Personas
INSERT INTO Person (first_name, last_name, email, phone, birth_date, nationality) VALUES 
('Antonio', 'Banderas', 'antonio.banderas@email.com', '+34 600 111 222', '1960-08-10', 'Español'),
('Penélope', 'Cruz', 'penelope.cruz@email.com', '+34 600 222 333', '1974-04-28', 'Español'),
('Pedro', 'Almodóvar', 'pedro.almodovar@email.com', '+34 600 333 444', '1949-09-25', 'Español'),
('Javier', 'Bardem', 'javier.bardem@email.com', '+34 600 444 555', '1969-03-01', 'Español'),
('Maribel', 'Verdú', 'maribel.verdu@email.com', '+34 600 555 666', '1970-10-02', 'Español');

-- Roles de personas
INSERT INTO Person_Role (person_id, role_id, experience_years) VALUES 
(1, 1, 35),
(2, 1, 30),
(3, 3, 40),
(4, 1, 30),
(5, 1, 25);

-- Ubicaciones
INSERT INTO Location (location_name, address, city, country, location_type_id, daily_cost, max_capacity) VALUES 
('Plaza Mayor', 'Plaza Mayor s/n', 'Madrid', 'España', 2, 1500.00, 200),
('Estudio 5', 'Calle Estudios 45', 'Barcelona', 'España', 3, 2500.00, 50),
('Casa Solariega', 'Carretera Vieja km 12', 'Toledo', 'España', 1, 800.00, 30),
('Bosque Natural', 'Parque Natural Sierra', 'Granada', 'España', 4, 500.00, 100),
('Edificio Histórico', 'Calle Historia 78', 'Sevilla', 'España', 5, 1200.00, 40);

-- Escenas
INSERT INTO Scene (movie_id, scene_number, description, estimated_duration, planned_date, actual_duration, status_id) VALUES 
(1, 1, 'Encuentro en la plaza', 120, '2024-03-15', 135, 3),
(1, 2, 'Diálogo en interior', 90, '2024-03-20', 85, 3),
(2, 1, 'Escena cómica en parque', 60, '2024-05-10', NULL, 1),
(3, 5, 'Persecución en coche', 180, '2024-03-10', 195, 3),
(4, 3, 'Laboratorio futuro', 150, '2024-06-15', NULL, 1);

-- Presupuestos
INSERT INTO Budget (movie_id, department_id, allocated_amount, spent_amount, fiscal_year) VALUES 
(1, 1, 1000000.00, 850000.00, 2024),
(1, 2, 800000.00, 650000.00, 2024),
(2, 1, 600000.00, 450000.00, 2024),
(3, 3, 400000.00, 380000.00, 2024),
(4, 4, 300000.00, 150000.00, 2024);

-- Reparto (Cast)
INSERT INTO Cast (movie_id, person_id, character_name, salary, role_id, contract_start, contract_end) VALUES 
(1, 1, 'Juan Martínez', 500000.00, 1, '2024-03-01', '2024-08-15'),
(1, 2, 'María López', 450000.00, 1, '2024-03-01', '2024-08-15'),
(2, 4, 'Carlos Ruiz', 300000.00, 1, '2024-04-10', '2024-09-20'),
(3, 1, 'Agente Especial', 600000.00, 1, '2024-02-15', '2024-07-30'),
(4, 5, 'Científica', 350000.00, 1, '2024-05-01', '2024-10-10');

-- Escenas - Ubicaciones
INSERT INTO Scene_Location (scene_id, location_id, shooting_date, worked_hours, status_id) VALUES 
(1, 1, '2024-03-15', 8, 3),
(2, 2, '2024-03-20', 6, 3),
(3, 4, '2024-05-10', 10, 1),
(4, 1, '2024-03-10', 12, 3),
(5, 3, '2024-06-15', 8, 1);

-- Equipo Técnico
INSERT INTO Technical_Team (movie_id, person_id, department_id, position_id, hire_date, end_date, monthly_salary) VALUES 
(1, 3, 1, 1, '2024-02-01', '2024-08-31', 25000.00),
(1, 4, 2, 3, '2024-02-15', '2024-08-31', 18000.00),
(2, 3, 1, 1, '2024-03-20', '2024-09-30', 22000.00),
(3, 5, 3, 5, '2024-01-20', '2024-07-31', 15000.00),
(4, 2, 4, 3, '2024-04-15', '2024-10-31', 16000.00);

-- Reparto por Escena
INSERT INTO Scene_Cast (scene_id, person_id, scheduled_hours, actual_hours, overtime_hours, costume_required) VALUES 
(1, 1, 8, 9, 1, TRUE),
(1, 2, 8, 8, 0, TRUE),
(2, 1, 6, 5, 0, FALSE),
(3, 4, 10, NULL, NULL, TRUE),
(4, 1, 12, 13, 1, TRUE);

-- Detalles de Presupuesto
INSERT INTO Budget_Detail (budget_id, category_id, concept, amount, expense_date, supplier_id, payment_status) VALUES 
(1, 1, 'Salario director', 50000.00, '2024-03-01', 1, 'Pagado'),
(1, 2, 'Alquiler cámaras', 25000.00, '2024-03-05', 1, 'Pagado'),
(2, 3, 'Vestuario época', 15000.00, '2024-03-10', 2, 'Pagado'),
(3, 4, 'Alquiler locación', 20000.00, '2024-04-01', 3, 'Pendiente'),
(4, 5, 'Efectos especiales', 30000.00, '2024-02-20', 4, 'Pagado');

-- Permisos de Ubicación
INSERT INTO Location_Permit (location_id, permit_type_id, permit_number, issue_date, expiry_date, cost, status) VALUES 
(1, 1, 'FM-2024-001', '2024-03-01', '2024-12-31', 5000.00, 'Vigente'),
(2, 2, 'FM-2024-002', '2024-03-15', '2024-12-31', 3000.00, 'Vigente'),
(3, 3, 'FM-2024-003', '2024-04-01', '2024-10-31', 2000.00, 'Vigente'),
(4, 4, 'FM-2024-004', '2024-05-01', '2024-11-30', 1500.00, 'En proceso'),
(5, 5, 'FM-2024-005', '2024-02-01', '2024-08-31', 4000.00, 'Vigente');

-- Equipamiento por Escena
INSERT INTO Scene_Equipment (scene_id, equipment_type_id, quantity, responsible_person_id, rental_start, rental_end) VALUES 
(1, 1, 2, 3, '2024-03-14', '2024-03-16'),
(1, 2, 5, 4, '2024-03-14', '2024-03-16'),
(2, 3, 1, 5, '2024-03-19', '2024-03-21'),
(3, 4, 1, 3, '2024-05-09', '2024-05-11'),
(4, 1, 3, 4, '2024-03-09', '2024-03-11');

-- Horarios de Ubicación
INSERT INTO Location_Schedule (location_id, start_date, end_date, reserved_by_movie) VALUES 
(1, '2024-03-15', '2024-03-15', 1),
(1, '2024-03-10', '2024-03-10', 3),
(2, '2024-03-20', '2024-03-20', 1),
(4, '2024-05-10', '2024-05-10', 2),
(3, '2024-06-15', '2024-06-15', 4);

-- Versiones de Guión
INSERT INTO Script_Version (movie_id, version_number, revision_date, author_id, changes_description, file_path) VALUES 
(1, 'v1.0', '2024-01-15', 3, 'Guión inicial', '/scripts/ultimo_amanecer_v1.pdf'),
(1, 'v1.1', '2024-02-01', 3, 'Cambios en diálogos acto 2', '/scripts/ultimo_amanecer_v1.1.pdf'),
(2, 'v1.0', '2024-03-01', 3, 'Guión comedia inicial', '/scripts/risas_ciudad_v1.pdf'),
(3, 'v2.0', '2024-01-20', 4, 'Reescena persecución', '/scripts/mision_secreta_v2.pdf'),
(4, 'v1.0', '2024-04-01', 5, 'Primera versión ciencia ficción', '/scripts/futuro_incierto_v1.pdf');

-- CONSULTAS SOLICITADAS

-- 1. Costo total por actor incluyendo salario y horas de trabajo
SELECT 
    p.person_id,
    CONCAT(p.first_name, ' ', p.last_name) AS nombre_actor,
    c.salary AS salario_base,
    COALESCE(SUM(sc.actual_hours * 50), 0) AS ganancias_por_horas, -- Suponiendo 50€/hora
    (c.salary + COALESCE(SUM(sc.actual_hours * 50), 0)) AS costo_total
FROM Person p
JOIN Cast c ON p.person_id = c.person_id
LEFT JOIN Scene_Cast sc ON p.person_id = sc.person_id
GROUP BY p.person_id, p.first_name, p.last_name, c.salary;

-- 2. Identificar conflictos de agenda para actores
SELECT 
    p.person_id,
    CONCAT(p.first_name, ' ', p.last_name) AS nombre_actor,
    s1.planned_date AS fecha_conflicto,
    COUNT(DISTINCT s1.scene_id) AS escenas_solapadas
FROM Person p
JOIN Scene_Cast sc1 ON p.person_id = sc1.person_id
JOIN Scene s1 ON sc1.scene_id = s1.scene_id
JOIN Scene_Cast sc2 ON p.person_id = sc2.person_id
JOIN Scene s2 ON sc2.scene_id = s2.scene_id
WHERE s1.planned_date = s2.planned_date
AND s1.scene_id != s2.scene_id
AND s1.planned_date IS NOT NULL
GROUP BY p.person_id, p.first_name, p.last_name, s1.planned_date;

-- 3. Controlar que el presupuesto por departamento no se exceda
SELECT 
    m.title AS pelicula,
    d.department_name AS departamento,
    b.allocated_amount AS presupuesto_asignado,
    b.spent_amount AS presupuesto_gastado,
    (b.allocated_amount - b.spent_amount) AS presupuesto_restante,
    CASE 
        WHEN b.spent_amount > b.allocated_amount THEN 'EXCEDIDO'
        WHEN b.spent_amount > b.allocated_amount * 0.9 THEN 'CASI EXCEDIDO'
        ELSE 'DENTRO DEL PRESUPUESTO'
    END AS estado_presupuesto
FROM Budget b
JOIN Movie m ON b.movie_id = m.movie_id
JOIN Department d ON b.department_id = d.department_id
ORDER BY m.title, d.department_name;

-- 4. Gestionar la disponibilidad de ubicaciones para evitar sobreposiciones
SELECT 
    l.location_name AS ubicacion,
    ls.start_date AS fecha_inicio,
    ls.end_date AS fecha_fin,
    m.title AS pelicula_reservada,
    CONCAT(p.first_name, ' ', p.last_name) AS director
FROM Location l
JOIN Location_Schedule ls ON l.location_id = ls.location_id
JOIN Movie m ON ls.reserved_by_movie = m.movie_id
JOIN Technical_Team tt ON m.movie_id = tt.movie_id AND tt.position_id = 1
JOIN Person p ON tt.person_id = p.person_id
WHERE ls.start_date BETWEEN '2024-03-01' AND '2024-06-30'
ORDER BY l.location_name, ls.start_date;

-- 5. Generar reportes de eficiencia por escena (tiempo planificado vs real)
SELECT 
    m.title AS pelicula,
    s.scene_number AS numero_escena,
    s.description AS descripcion,
    s.estimated_duration AS duracion_estimada,
    s.actual_duration AS duracion_real,
    (s.actual_duration - s.estimated_duration) AS diferencia_tiempo,
    CASE 
        WHEN s.actual_duration <= s.estimated_duration THEN 'EN TIEMPO'
        ELSE 'RETRASADA'
    END AS estado_eficiencia,
    l.location_name AS ubicacion
FROM Scene s
JOIN Movie m ON s.movie_id = m.movie_id
LEFT JOIN Scene_Location sl ON s.scene_id = sl.scene_id
LEFT JOIN Location l ON sl.location_id = l.location_id
WHERE s.actual_duration IS NOT NULL
ORDER BY m.title, s.scene_number;

-- Consulta adicional: Actores en múltiples películas
SELECT 
    CONCAT(p.first_name, ' ', p.last_name) AS actor,
    COUNT(DISTINCT c.movie_id) AS cantidad_peliculas,
    GROUP_CONCAT(m.title SEPARATOR ', ') AS peliculas
FROM Person p
JOIN Cast c ON p.person_id = c.person_id
JOIN Movie m ON c.movie_id = m.movie_id
GROUP BY p.person_id, p.first_name, p.last_name
HAVING COUNT(DISTINCT c.movie_id) > 1;

-- Consulta adicional: Ubicaciones más utilizadas
SELECT 
    l.location_name AS ubicacion,
    COUNT(DISTINCT sl.scene_id) AS escenas_grabadas,
    COUNT(DISTINCT sl.movie_id) AS peliculas_diferentes,
    SUM(sl.worked_hours) AS total_horas_trabajo
FROM Location l
JOIN Scene_Location sl ON l.location_id = sl.location_id
GROUP BY l.location_id, l.location_name
ORDER BY escenas_grabadas DESC;