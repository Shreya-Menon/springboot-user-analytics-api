-> springboot-user-analytics-api
A high-performance analytics API built using Spring Boot and MySQL.  Designed to track user events, store analytics data, and return insights  with optimized response time (~25% improvement after refactoring).

-> User Analytics API (Spring Boot)

A lightweight Spring Boot REST API for managing users and tracking analytics data.  
This project demonstrates clean architecture, modular REST controllers, DTO usage, and MySQL persistence.

===========================================================================

->  Features
- CRUD operations for Users  
- Fetch user analytics data  
- Layered architecture (Controller → Service → Repository)  
- MySQL database integration  
- Exception handling  
- DTOs for request/response  
- Project built with Maven + Spring Boot 3  

===========================================================================

->  Tech Stack
- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- MySQL  
- Maven  

===========================================================================

->  Project Structure

src/
├── main/
│ ├── java/com/example/analytics
│ │ ├── controller/
│ │ ├── service/
│ │ ├── repository/
│ │ ├── model/
│ │ └── dto/
│ └── resources/
│ ├── application.properties
│ └── schema.sql
└── test/

===========================================================================

->  Setup Instructions

1️⃣ Clone the repository
bash
git clone https://github.com/Shreya-Menon/springboot-user-analytics-api.git
cd springboot-user-analytics-api

2️⃣ Create MySQL Database
CREATE DATABASE user_analytics;
USE user_analytics;

CREATE TABLE users (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  email VARCHAR(100),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE analytics (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  user_id BIGINT,
  login_count INT DEFAULT 0,
  last_active TIMESTAMP NULL,
  CONSTRAINT fk_user
    FOREIGN KEY (user_id) REFERENCES users(id)
);
Configure application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/user_analytics
spring.datasource.username=root
spring.datasource.password=example
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

 Run the Application
 
3️⃣ Using Maven
mvn clean install

mvn spring-boot:run

===========================================================================
-> API DOCUMENTATION

-> REQUEST
{
  "name": "Shreya",
  "email": "shreya@example.com"
}

->RESPONSE

{
  "id": 1,
  "name": "Shreya",
  "email": "shreya@example.com"
}

