# 🚀 AI Chatbot using Spring Boot + Gemini API

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java">
  <img src="https://img.shields.io/badge/SpringBoot-3.x-brightgreen?style=for-the-badge&logo=springboot">
  <img src="https://img.shields.io/badge/API-Gemini-blue?style=for-the-badge&logo=google">
  <img src="https://img.shields.io/badge/Status-Active-success?style=for-the-badge">
</p>

---

## 🧠 Project Overview

An **AI-powered chatbot** built using **Spring Boot** and integrated with the **Google Gemini API** to generate intelligent, real-time responses.

💡 This project demonstrates:

* Backend API development
* AI integration
* Clean architecture
* Real-world chatbot use case

---

## ✨ Features

✔️ AI-powered smart responses
✔️ REST API-based architecture
✔️ Fast and scalable backend
✔️ Easy frontend integration (React / Postman)
✔️ Clean and modular code structure
✔️ Secure API key handling

---

## 🏗️ Architecture

```
User → Controller → Service → Gemini API → Response → User
```

---

## 🛠️ Tech Stack

| Technology  | Usage             |
| ----------- | ----------------- |
| Java        | Core Programming  |
| Spring Boot | Backend Framework |
| REST API    | Communication     |
| Gemini API  | AI Responses      |
| Maven       | Build Tool        |

---

## 📂 Project Structure

```
src/main/java/com/example/chatbot
│
├── controller   → Handles API requests
├── service      → Business logic & Gemini API call
├── model        → Request/Response models
├── config       → Configuration files
└── ChatbotApplication.java
```

---

## ⚙️ Setup Guide

### 🔹 1. Clone Repository

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

---

### 🔹 2. Configure API Key

Open:

```
src/main/resources/application.properties
```

Add:

```properties
gemini.api.key=YOUR_API_KEY
```

---

### 🔹 3. Run Application

```bash
mvn spring-boot:run
```

---

## 📡 API Usage

### 🔸 Endpoint

```
POST /api/chat
```

### 🔸 Request

```json
{
  "message": "Explain AI in simple terms"
}
```

### 🔸 Response

```json
{
  "response": "AI is like teaching computers to think and learn like humans."
}
```

---

## 🧪 Testing

✔️ Postman
✔️ Curl
✔️ React Frontend

---

## ⚡ Example Curl

```bash
curl -X POST http://localhost:8080/api/chat \
-H "Content-Type: application/json" \
-d '{"message":"Hello AI"}'
```

---

## 📸 Demo Preview

> 🚀 Add screenshots or demo video here to impress recruiters

---

## 🎯 Future Enhancements

* 🔐 User Authentication (JWT)
* 💾 Chat History Storage (Database)
* 🌐 Frontend UI (React)
* 📊 Analytics Dashboard

---

## 🤝 Contribution

Contributions are welcome!
Feel free to fork and improve this project.

---

## 👨‍💻 Author

**Radha Krishna Matta**
🎓 BTech Student | 💻 Full Stack Developer | 🤖 AI Enthusiast

🔗 GitHub: https://github.com/RadhakrishnaMATTA

---

## ⭐ Show Your Support

If you like this project:

👉 Give a ⭐ on GitHub
👉 Share with others
👉 Connect with me

---

<p align="center">
  🚀 "Building real-world AI applications as a fresher"
</p>
