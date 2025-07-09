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

### 2. View All Students
- Open view.html in browser.
- It fetches data via fetch('/students') and populates the table.

---

## 📘 Project 2: Expense Tracker Web Application (expensetracker)

This is a mini web application built using **Spring Boot**, **MySQL**, and **HTML/JavaScript** that allows users to record, view, update, and delete their daily expenses.

---

## 🔧 Technologies Used

- **Spring Boot** – Backend REST API framework  
- **Spring Data JPA** – ORM for database operations  
- **MySQL** – Relational database  
- **HTML + JavaScript (Fetch API)** – Frontend user interface  
- **REST API** – For CRUD operations on expenses  

---

## 📂 Project Structure
```text
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── expensetrackerweb/
│       │           └── expensetracker/
│       │               ├── ExpensetrackerApplication.java← Main class
│       │
│       │               ├── model/
│       │               │   └── Expense.java ← Entity class
│       │
│       │               ├── repository/
│       │               │   └── ExpenseRepository.java ← JPA repository
│       │
│       │               └── controller/
│       │                   └── ExpenseController.java ← REST API controller
│
│       └── resources/
│           ├── application.properties ← DB config
│           ├── static/
│           │   └── addexpense.html (adding expense HTML form)
│	  │   └── delete-expense.html (delete expense HTML form)
│	  │   └── getexpense.html (get expense by id HTML form)
│	  │   └── update-expense.html (update expense HTML form)
│	  │   └── viewallexpenses.html (view all expense HTML form)
│           └── templates/ 
│
└── pom.xml                                 
```


---

## 📄 Features

- ✅ Add a new expense with fields:  
  - Title (short description)  
  - Amount (value of expense)  
  - Category (e.g., Food, Travel, Rent)  
  - Date (when expense occurred)  
- ✅ View all expenses in a list (optional total amount at bottom)  
- ✅ View a specific expense by ID  
- ✅ Update any field of an existing expense by ID  
- ✅ Delete an expense by ID  
- ✅ RESTful API design  

---

## 🖥️ Endpoints Summary

| Action       | Method | Endpoint             | Description                   |
|--------------|--------|----------------------|-------------------------------|
| Create       | POST   | `/expenses`          | Add new expense               |
| Read All     | GET    | `/expenses`          | Get list of all expenses      |
| Read One     | GET    | `/expenses/{id}`     | Get expense by ID             |
| Update       | PUT    | `/expenses/{id}`     | Update expense by ID          |
| Delete       | DELETE | `/expenses/{id}`     | Delete expense by ID          |

---

## 🧪 Testing
### 1. Add Expense
Open form.html in your browser.

Fill in the fields and submit to save.

### 2. View All Expenses
Open view.html in your browser.

The page fetches and displays all expenses.

---

