# Microservices Application: User Management and Favorite Items

This project demonstrates a microservices architecture with distinct modules for user management (`userms`), favorite items management (`favouritems`), and service discovery (`discoveryserver`). The application is built using Spring Boot and Netflix Eureka for a scalable and modular design.

---

## **Modules Overview**

### 1. **User Management Service (`userms`)**
This module handles user-related operations, such as registration, login, and user data retrieval.

#### **Key Features**
- **Registration**: Users can register with their details.
- **Login**: Users can log in and receive a JWT token.
- **User Data Retrieval**:
  - Fetch user details by username.
  - Retrieve a list of all users.

#### **APIs**
| Endpoint                  | HTTP Method | Description                        |
|---------------------------|-------------|------------------------------------|
| `/register`               | POST        | Register a new user.              |
| `/login`                  | POST        | Authenticate and get a token.     |
| `/users/byusername/{username}` | GET     | Get user details by username.     |
| `/users/all`              | GET         | Get a list of all users.          |

---

### 2. **Favorite Items Service (`favouritems`)**
This module manages users' favorite items, such as adding, removing, and viewing favorited players.

#### **Key Features**
- **Add Favorite**: Users can add players to their favorites list.
- **Remove Favorite**: Users can remove players from their favorites list.
- **View Favorites**: Users can view their favorited players.

#### **APIs**
| Endpoint                         | HTTP Method | Description                               |
|----------------------------------|-------------|-------------------------------------------|
| `/favouritePlayers/add`          | POST        | Add a player to the favorites list.       |
| `/favouritePlayers/delete`       | DELETE      | Remove a player from the favorites list.  |
| `/favouritePlayers/allFavoritedPlayer/{userName}` | GET | List all favorite players for a user.    |

---

### 3. **Discovery Server (`discoveryserver`)**
This module is responsible for service discovery using Netflix Eureka. It helps manage and locate services in the microservices architecture.

#### **Dependencies**
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
