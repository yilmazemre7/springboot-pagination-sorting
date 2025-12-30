# Spring Boot Pagination & Sorting

RESTful Spring Boot application implementing pagination and sorting using Spring Data JPA.

## 📋 Table of Contents

- [Technologies](#-technologies)
- [Project Structure](#-project-structure)
- [Requirements](#-requirements)
- [Installation](#-installation)
- [API Usage](#-api-usage)
- [Request & Response Examples](#-request--response-examples)

## 🛠 Technologies

| Technology | Version |
|------------|---------|
| Java | 17 |
| Spring Boot | 4.0.1 |
| Spring Data JPA | - |
| PostgreSQL | - |
| Lombok | - |
| Maven | - |

## 📁 Project Structure

```
pageable/
├── src/main/java/com/emrecanyilmaz/
│   ├── controller/
│   │   ├── impl/
│   │   │   ├── RestBaseController.java      # Base controller class
│   │   │   └── RestEmployeeController.java  # Employee REST controller
│   │   └── IRestEmployeeController.java     # Controller interface
│   ├── dto/
│   │   ├── DtoDepartment.java               # Department DTO
│   │   └── DtoEmployee.java                 # Employee DTO
│   ├── model/
│   │   ├── Department.java                  # Department entity
│   │   └── Employee.java                    # Employee entity
│   ├── repository/
│   │   └── EmployeeRepository.java          # JPA repository
│   ├── service/
│   │   ├── impl/
│   │   │   └── EmployeeService.java         # Service implementation
│   │   └── IEmployeeService.java            # Service interface
│   ├── starter/
│   │   └── PageableApplicationStarter.java  # Spring Boot starter
│   └── utils/
│       ├── PagerUtils.java                  # Pagination helper
│       ├── RestPageableEntity.java          # Pageable response entity
│       ├── RestPageableRequest.java         # Pageable request entity
│       └── RestRootEntity.java              # Root response wrapper
└── src/main/resources/
    └── application.properties               # Application configuration
```

## ⚙ Requirements

- **Java 17** or higher
- **Maven 3.6+**
- **PostgreSQL** database

## 🚀 Installation

### 1. Clone the Repository

```bash
git clone https://github.com/emrecanyilmaz/springboot-pagination-sorting.git
cd springboot-pagination-sorting/pageable
```

### 2. Configure PostgreSQL Database

Edit the database settings in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.jpa.properties.hibernate.default_schema=pageable
spring.datasource.username=postgres
spring.datasource.password=12345
```

### 3. Create Database Schema

Create the `pageable` schema in PostgreSQL:

```sql
CREATE SCHEMA IF NOT EXISTS pageable;
```

### 4. Run the Application

```bash
./mvnw spring-boot:run
```

Or for Windows:

```bash
mvnw.cmd spring-boot:run
```

## 📡 API Usage

### Endpoint

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/rest/api/employee/list/pageable` | Get paginated employee list |

### Request Parameters

| Parameter | Type | Description |
|-----------|------|-------------|
| `pageSize` | int | Number of records per page |
| `pageNumber` | int | Page number (starts from 0) |
| `columnName` | String | Column name to sort by |
| `isAsc` | boolean | `true`: Ascending, `false`: Descending |

## 📝 Request & Response Examples

### Request

```http
GET /rest/api/employee/list/pageable?pageSize=10&pageNumber=0&columnName=firstName&isAsc=true
```

### Response

```json
{
  "status": "OK",
  "payload": {
    "content": [
      {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "department": {
          "id": 1,
          "name": "IT",
          "location": "New York"
        }
      },
      {
        "id": 2,
        "firstName": "Jane",
        "lastName": "Smith",
        "department": {
          "id": 2,
          "name": "HR",
          "location": "Los Angeles"
        }
      }
    ],
    "pageNumber": 0,
    "pageSize": 10,
    "totalElements": 50
  }
}
```

## 🗃 Database Model

### Employee

| Column | Type | Description |
|--------|------|-------------|
| id | Long | Primary Key |
| first_name | String | Employee first name |
| last_name | String | Employee last name |
| department_id | Long | Foreign Key (Department) |

### Department

| Column | Type | Description |
|--------|------|-------------|
| id | Long | Primary Key |
| name | String | Department name |
| location | String | Department location |


- GitHub: [@emrecanyilmaz](https://github.com/emrecanyilmaz)
