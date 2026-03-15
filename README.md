# Spring Boot JPA Course Management System

This project demonstrates the use of **Spring Boot, Spring Data JPA, and Hibernate ORM** to design a backend data model for an online learning platform.

The application focuses on implementing **advanced JPA concepts** such as entity relationships, inheritance strategies, embedded objects, and dynamic queries.

---
# Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Hibernate ORM
- Maven
- Lombok

---

# Domain Model

The project models a simplified **online course platform**.

### Main Entities
Course  
→ Section  
→ Lecture  
→ Resource

### Structure
Course  
├── Section  
│ ├── Lecture  
│ │ └── Resource  
│  
└── Authors

---
# JPA Relationships Implemented
This project demonstrates several important ORM mappings:

### Many-to-Many
A course can have multiple authors.

### One-to-Many
A course contains multiple sections.

### One-to-One
Each lecture has a single resource.


---
# Inheritance Strategy

Resources are implemented using **JPA inheritance**.

Resource  
|── Video  
|── File  
|── Text  


The project uses:  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  

This allows multiple resource types while keeping a clean domain model.

---

# Advanced JPA Features Used

- Entity relationships
- Inheritance mapping
- Embedded objects
- Composite primary keys
- Spring Data JPA repositories
- Specification pattern for dynamic queries
- Lombok for reducing boilerplate code

---

# 📂 Project Structure

src/main/java/com/mahdi/jpa  

├── models  
│ ├── Course  
│ ├── Section  
│ ├── Lecture  
│ ├── Resource  
│ ├── Video  
│ ├── File  
│ └── Text  
│  
├── repositories  
│ ├── AuthorRepository  
│ └── VideoRepository  
│  
├── specification  
│ └── AuthorSpecification  
│  
└── JpaApplication  







---

# 👨‍💻 Author

**Md. Mahdi Hasan Tazelly**

**GitHub:**  https://github.com/MdMahdiHasanTazelly

**X:** https://x.com/MahdiTazelly

**Portfolio:**  https://mahdi-tazelly.vercel.app/



