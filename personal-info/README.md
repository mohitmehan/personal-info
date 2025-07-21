# Personal Info - Spring WebFlux Project

This project is a basic Java application for maintaining personal information using Spring Boot and WebFlux. It demonstrates a clean architecture with clear separation of concerns and documentation.

## Features
- Reactive REST API using Spring WebFlux
- In-memory storage for personal information
- CRUD operations: Create, Read, Update, Delete
- Follows Single Responsibility Principle (SRP) and best practices

## Project Structure
```
personal-info/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/example/personalinfo/
│               ├── PersonalInfoApplication.java
│               ├── model/
│               │   └── PersonalInfo.java
│               ├── repository/
│               │   └── PersonalInfoRepository.java
│               ├── service/
│               │   └── PersonalInfoService.java
│               └── controller/
│                   └── PersonalInfoController.java
```

## How to Run
1. **Build the project:**
   ```sh
   mvn clean install
   ```
2. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```
   The server will start on `http://localhost:8080`.

## API Endpoints
- `POST /api/personal-info` - Create or update personal info
- `GET /api/personal-info/{email}` - Get info by email
- `GET /api/personal-info` - Get all personal info
- `DELETE /api/personal-info/{email}` - Delete info by email

### Example JSON
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "phone": "1234567890",
  "address": "123 Main St, City, Country"
}
```

## Notes
- This project uses in-memory storage (no database).
- For production, replace the repository with a persistent store.
- Requires Java 17+ and Maven.

---
**Author:** Your Name 