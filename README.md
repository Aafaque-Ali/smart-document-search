# Smart Document Search API

A backend application built using **Spring Boot, MySQL, and JPA** that allows users to
store, search, and manage document metadata efficiently. Designed with clean
architecture and scalable REST APIs.

---

## 🚀 Features
- Create and manage document metadata
- Keyword-based search functionality
- Pagination support for large datasets
- Global exception handling
- Centralized logging using SLF4J
- RESTful APIs with JSON responses

---

## 🛠️ Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- SLF4J Logging
- Git & GitHub

---

## 📌 API Endpoints

### Create Document
**POST** `/api/documents`

```json
{
  "title": "Sample Doc",
  "fileName": "sample.pdf",
  "fileType": "pdf",
  "description": "Test document"
}```

### Get All Document
**GET**  `/api/documents`

### Search Documents
**GET** `/api/documents/search?keyword=Sample`

### Paginated Results
**GET** `/api/documents/page?page=0size=4`


## Architecture
- Controller Layer
- Service Layer
- Repository Layer
- Entity Layer

---

## 🏁 How to Run
1. Clone the repository
2. Configure MySQL in application.properties
3. Run the application
4. Access APIs via Postman

---

## 📈 Future Enhancements
- File upload support
- AI-powered semantic search
- Authentication & authorization
- Cloud deployment

---

## 👤 Author
### Aafaque Ali Sayyed
Java Developer | Spring Boot | MySQL
GitHub: https://github.com/Aafaque-Ali
LinkedIn: www.linkedin.com/in/aafaque-ali-sayyed
