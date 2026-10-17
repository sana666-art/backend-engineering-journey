# Backend Engineering Journey

A personal learning repository documenting my journey through backend engineering — from Java fundamentals and object-oriented programming to Spring Boot, Node.js, Express, and MongoDB.

Each folder is a self-contained set of practice exercises, concept demos, or mini-projects built while learning.

## Repository Layout

```
backend-engineering-journey/
├── Java programming language/       # Core Java & CS fundamentals
├── Java Backend Framework/          # Spring Boot, Spring, JPA/Hibernate, SOAP, REST
└── NodeJS Backend Framework/        # Node.js, Express, MongoDB + full To-Do app
```

## Contents

### 1. Java Programming Language

Core language concepts and problem-solving, organized progressively:

| Folder | Topics |
| --- | --- |
| `01-java-basics` | Syntax, variables, types, operators, arrays, loops, functions |
| `02-oop-concepts-and-projects` | OOP, inheritance, polymorphism, abstraction, packages + Expense Manager app |
| `03-data-structures` | Data structures practice |
| `04-algorithms` | Algorithms practice |
| `05-rogramming-challenge` | 100+ coding challenges (numbers, arrays, strings, collections, threads, streams, enums) |
| `06-functional-programming` | Functional style vs. structured, lambdas, `Optional` |
| `07 Exception and File Handling` | Custom exceptions, checked/unchecked exceptions, file read/write |

**Build**: Maven (or IntelliJ IDEA project files included).

### 2. Java Backend Framework

Spring-based backend projects:

| Project | Description |
| --- | --- |
| `learn-spring-framework` | Core Spring container, beans, dependency injection |
| `learn-spring-boot` | Spring Boot basics, auto-configuration, Actuator |
| `learn-jpa-and-hibernate` | JPA, Hibernate, Spring Data JPA with H2 |
| `learn-gradle` | Spring Boot project built with Gradle |
| `restfulwebservices` | REST API with CRUD, validation, versioning |
| `soap-course-management` | SOAP web service (course management) |
| `Student-MS-demo` | Student management REST API |
| `backend-demo` | General Spring Boot demo |
| `Learning Java` | Scratch Java playground |

**Build**: Maven (`./mvnw`) or Gradle (`./gradlew`).

### 3. NodeJS Backend Framework

| Project | Description |
| --- | --- |
| `Code and Concepts` | Node.js core, Express basics, and MongoDB/Mongoose demos |
| `TO-DO App` | Full-stack To-Do application (see [its README](NodeJS%20Backend%20Framework/TO-DO%20App/README.md)) |

**Code and Concepts** includes:
- `NodeJS basics/` — core modules, globals, streams & buffers, import/export, modules
- `ExpressJS basics/` — routing, middleware, EJS views
- `MongoDB_NodeJS/` — MongoDB & Mongoose integration

## Highlighted Project: To-Do App

A full-stack task manager built with **Node.js, Express, MongoDB, and EJS**.

- User authentication (register / login / logout) with bcrypt + sessions
- Task CRUD with categories, priorities, and due dates
- Search, filtering, drag-and-drop reordering, dark mode
- Export tasks to **PDF** and **CSV**

```bash
cd "NodeJS Backend Framework/TO-DO App"
npm install
# create .env with MONGO_URI and SESSION_SECRET
npm start          # http://localhost:3000
```

See the [full README](NodeJS%20Backend%20Framework/TO-DO%20App/README.md) for API endpoints and usage.

## Prerequisites

- **Java**: JDK 17+ and Maven or Gradle
- **Node.js**: v18+ and npm
- **MongoDB**: local instance or MongoDB Atlas

## Running Projects

**Java (Maven)**
```bash
./mvnw spring-boot:run
```

**Java (Gradle)**
```bash
./gradlew bootRun
```

**Node.js**
```bash
npm install
npm start
```

## Purpose

This repository is a learning log, not a production codebase. It tracks my progress in backend development through hands-on exercises and progressively larger projects.

## Author

- GitHub: [@sana666-art](https://github.com/sana666-art)

## License

Provided for educational and reference purposes. Individual projects may specify their own license.
