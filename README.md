# Institutions - Spring Boot Web Application with Thymeleaf

## Overview
This is a Spring Boot web application that implements CRUD (Create, Read, Update, Delete) operations using Thymeleaf for the frontend.

## Features
- Spring Boot framework
- Thymeleaf for UI rendering
- Spring Data JPA for database interaction
- CRUD operations on an entity (e.g., Institutions, Students, etc.)

## Technologies Used
- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Boot DevTools
- MySQL Driver
- Thymeleaf
- Bootstrap (for styling)
- Maven

## Installation and Setup
### Prerequisites
- Java 17+
- Maven

### Steps to Run
1. **Clone the repository**
   ```sh
   git clone https://github.com/yourusername/Institutions.git
   cd Institutions
   ```

2. **Build the project**
   ```sh
   mvn clean install
   ```

3. **Run the application**
   ```sh
   mvn spring-boot:run
   ```

4. **Access the application**
   Open your browser and go to:
   ```
   http://localhost:3434
   ```

## Database Configuration
Update `application.properties` with your preferred database configuration.

## CRUD Operations
- **List all institutions**: `GET /institutions`
- **Create new institution**: `GET /institutions/new`, `POST /institutions`
- **Edit an institution**: `GET /institutions/edit/{id}`, `POST /institutions/update/{id}`
- **Delete an institution**: `GET /institutions/delete/{id}`

## Folder Structure
```
├── src
│   ├── main
│   │   ├── java/com/example/institutions
│   │   │   ├── controller
│   │   │   ├── model
│   │   │   ├── repository
│   │   │   ├── service
│   │   │   ├── InstitutionsApplication.java
│   │   ├── resources
│   │   │   ├── templates
│   │   │   │   ├── index.html
│   │   │   │   ├── form.html
│   │   │   ├── static
│   │   │   │   ├── css
│   │   │   │   ├── js
│   │   │   ├── application.properties
├── pom.xml
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## Contact
For any inquiries, contact [uttamkumar.narra@gmail.com](mailto:uttamkumar.narra@gmail.com)
