# Employee Management System using Hibernate

This project is a simple Employee Management System implemented using Hibernate ORM for basic CRUD (Create, Read, Update, Delete) operations on a MySQL database. It includes an `Employee` entity, a DAO (Data Access Object) for handling database operations, and a main class for running the application.

## Project Setup

Before running the application, ensure you have the following prerequisites installed on your system:

- **Java 17**
- **Maven**
- **MySQL database**

### Creating the Project

To set up the project:

1. **Create a Maven Project**:
   - Open IntelliJ IDEA.
   - Go to `File -> New -> Project`.
   - Select `Maven` and fill in the project details.

2. **Add Dependencies**:
   Update your `pom.xml` file to include the necessary dependencies for Hibernate and MySQL.

### Hibernate Configuration
1. **Create `hibernate.cfg.xml`**:
   Create a `hibernate.cfg.xml` file in the `src/main/resources` directory with the necessary Hibernate configuration.

   Replace `yourdatabase`, `yourusername`, and `yourpassword` with your actual MySQL database details.
### Creating the Employee Entity

Create a Java class `Employee` in the `com.example` package. This class represents the Employee entity with attributes such as `id`, `firstName`, `lastName`, and `email`.
### Creating the Employee DAO
Create a Java class `EmployeeDAO` in the `com.example` package. This class contains methods for performing CRUD operations on the `Employee` entity using Hibernate.
## Running the Application
1. **Start MySQL**: Ensure your MySQL server is running.

2. **Run the Application**: Execute the `Main` class from IntelliJ IDEA.
## Usage
Once the application is running, you can perform the following operations:

- **Create Employee**: Add a new employee to the database.
- **Read Employees**: Retrieve a list of all employees or fetch details of a specific employee by ID.
- **Update Employee**: Update the details of an existing employee.
- **Delete Employee**: Remove an employee from the database.
