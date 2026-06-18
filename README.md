# EventEase - Event Management Backend System

## Project Description

EventEase is a Spring Boot based backend application developed for managing events and user registrations.

The system manages:

* Users
* Events
* Event Registrations

Users can register for events and view event registration details through REST APIs.

---

## Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Hibernate
* Maven
* Postman
* Jakarta Validation

---

## Project Structure

```
EventEase
│
├── controller
│     ├── UserController
│     ├── EventController
│     └── RegistrationController
│
├── dto
│     ├── UserDTO
│     ├── EventDTO
│     └── RegistrationDTO
│
├── entity
│     ├── User
│     ├── Event
│     └── Registration
│
├── repository
│     ├── UserRepository
│     ├── EventRepository
│     └── RegistrationRepository
│
├── service
│     ├── UserService
│     ├── EventService
│     └── RegistrationService
│
├── serviceimpl
│     ├── UserServiceImpl
│     ├── EventServiceImpl
│     └── RegistrationServiceImpl
│
├── exception
│     ├── ResourceNotFoundException
│     └── GlobalExceptionHandler
│
└── EventEaseApplication
```

---

## Entity Relationships

User → Registration ← Event

Relationship Mapping:

* One User can have many Registrations
* One Event can have many Registrations
* Registration acts as a bridge entity

---

## Database Configuration

Add the following in application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/eventease
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.port=8080
```

---

## API Endpoints

### Create User

Method:

```
POST
```

URL:

```
http://localhost:8080/users
```

Request Body:

```json
{
    "name":"John",
    "email":"john@gmail.com"
}
```

---

### Create Event

Method:

```
POST
```

URL:

```
http://localhost:8080/events
```

Request Body:

```json
{
    "title":"Spring Boot Workshop",
    "description":"Hands-on Spring Boot training",
    "date":"2025-08-30",
    "location":"Chennai"
}
```

---

### Register User for Event

Method:

```
POST
```

URL:

```
http://localhost:8080/registrations
```

Request Body:

```json
{
    "userId":1,
    "eventId":1
}
```

---

### Get Registrations by Event ID

Method:

```
GET
```

URL:

```
http://localhost:8080/registrations/1
```

---

## Validation Used

* @Valid
* @NotNull
* @Size
* @Email

---

## Exception Handling

Centralized exception handling is implemented using:

* @ControllerAdvice
* ResourceNotFoundException

Handles:

* Validation errors
* Resource not found errors
* General exceptions

---

## Features Implemented

✔ Create User

✔ Create Event

✔ Register User for Event

✔ View Event Registrations

✔ DTO Validation

✔ Global Exception Handling

✔ Duplicate Registration Prevention

✔ JPA Entity Relationships

---

## Testing Tool

Postman was used to test REST APIs.

---


