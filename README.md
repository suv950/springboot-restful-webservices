# 🧑‍💼 User Management - Spring Boot REST API

This is a **CRUD REST API** built with **Spring Boot** for managing user data. It performs operations like **Create**, **Read**, **Update**, and **Delete** user records in a **MySQL database** using **Spring Data JPA**.

---

## ✅ Features

- Create a new user
- Get all users
- Get user by ID
- Update user details
- Delete user

---

## 🔧 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL (via MySQL Workbench)
- Lombok
- Maven

---

## 📁 Project Structure
user-management-api/
│
├── src/main/java/com/example/usermanagement/
│ ├── controller/
│ ├── entity/
│ ├── repository/
│ ├── service/
│ └── UserManagementApplication.java
│
├── src/main/resources/
│ ├── application.properties
│
├── pom.xml
└── README.md

## ⚙️ Prerequisites

- Java 17+
- Maven
- MySQL Workbench (or any MySQL DB)
- IDE (e.g., IntelliJ IDEA, Eclipse)
- Postman (for API testing)

---

## 🚀 Getting Started

### 1. Clone the repository

git@github.com:suv950/springboot-restful-webservices.git

2. Create MySQL Database
   Open MySQL Workbench and run:

CREATE DATABASE user_db;

| Method | Endpoint          | Description       |
| ------ | ----------------- | ----------------- |
| POST   | `/api/users`      | Create a new user |
| GET    | `/api/users`      | Get all users     |
| GET    | `/api/users/{id}` | Get user by ID    |
| PUT    | `/api/users/{id}` | Update user       |
| DELETE | `/api/users/{id}` | Delete user       |



