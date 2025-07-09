# CRUDSpringBoot
# My Java Spring Boot CRUD Projects

## 📘 Project 1: Student CRUD Application (STUDENTCRUD1)

This is a simple CRUD (Create, Read, Update, Delete) web application built using **Spring Boot**, **MySQL**, and **HTML/JavaScript**. It allows users to manage student records by adding, viewing, updating, and deleting students from the database.

---

## 🔧 Technologies Used

- **Spring Boot** - Backend framework
- **Spring Data JPA** - ORM for database operations
- **MySQL** - Relational database
- **Thymeleaf / HTML / JavaScript** - Frontend
- **REST API** - Exposed endpoints for CRUD operations

---

## 📂 Project Structure

```text
ordercrud/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── example/
        │           └── ordercrud/
        │               ├── OrderCrudApplication.java      # Main class
        │               ├── model/
        │               │   └── Order.java                 # Entity class
        │               ├── repository/
        │               │   └── OrderRepository.java       # JPA repository
        │               └── controller/
        │                   └── OrderController.java       # REST API controller
        └── resources/
            ├── application.properties                    # DB configuration
            ├── static/
            │   └── form.html                             # HTML form
            └── templates/
```


  

## 📄 Features

- ✅ Add a new student via HTML form
- ✅ View all students (JSON or HTML table)
- ✅ View individual student by ID
- ✅ Update student details by ID
- ✅ Delete student by ID
- ✅ RESTful API design

---

## 🖥️ Endpoints Summary

| Action       | Method | Endpoint           | Description              |
|--------------|--------|--------------------|--------------------------|
| Create       | POST   | `/students`        | Add new student          |
| Read All     | GET    | `/students`        | Get list of all students |
| Read by ID   | GET    | `/students/{id}`   | Get a student by ID      |
| Update       | PUT    | `/students/{id}`   | Update student by ID     |
| Delete       | DELETE | `/students/{id}`   | Delete student by ID     |

## 🧪 Testing
### 1. Add Student
- Open form.html in browser.
- Enter name and grade.
- Click submit to save to DB.

## 📘 Project 2: Student CRUD Application (STUDENTCRUD1)

### 2. View All Students
- Open view.html in browser.
- It fetches data via fetch('/students') and populates the table.
