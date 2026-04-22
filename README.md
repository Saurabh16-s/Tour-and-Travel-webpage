# 🌍 Tour and Travel Web Application

A full-stack Tour and Travel booking web application built using modern technologies like **Spring Boot**, **React.js**, **AWS (SQS & SES)**, and **JWT Authentication**.
This project enables users to explore destinations, make bookings, and receive confirmation emails in real-time.

---

## 🚀 Features

* 🔐 User Authentication (JWT-based)
* 🧑 User Registration & Login
* 🌍 Browse Travel Destinations
* 📅 Book Tours with Check-in/Check-out
* 📩 Email Confirmation after Booking
* ⚡ Asynchronous Processing using AWS SQS
* ☁️ Email delivery via AWS SES
* 🔄 Secure API communication

---

## 🏗️ Tech Stack

### 🔹 Frontend

* React.js
* Axios
* CSS

### 🔹 Backend

* Spring Boot
* Spring Security
* JWT Authentication
* JPA / Hibernate

### 🔹 Database

* PostgreSQL / MySQL

### 🔹 AWS Services

* Amazon SQS (Message Queue)
* Amazon SES (Email Service)
* AWS EC2

---

## ⚙️ Architecture

```text
Frontend (React)
        ↓
Backend (Spring Boot)
        ↓
Database (User & Booking Data)
        ↓
AWS SQS Queue
        ↓
Consumer Service
        ↓
AWS SES → Email to User
```

---

## 🔐 Authentication Flow

1. User logs in using email & password
2. Backend generates JWT token
3. Token stored in browser (localStorage)
4. All API requests include `Authorization: Bearer <token>`

---

## 📩 Email Flow

1. User creates booking
2. Booking saved in database
3. Message pushed to SQS queue
4. Consumer reads message
5. Email sent using SES

---

## 🛠️ Setup Instructions

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/Tour-and-Travel-webpage.git
cd Tour-and-Travel-webpage
```

---

### 2️⃣ Backend Setup (Spring Boot)

* Configure `application.properties`:

```properties
aws.region=ap-south-1
aws.sqs.queue-url=YOUR_QUEUE_URL
```

* Add AWS credentials (via AWS CLI or config)

```bash
aws configure
```

* Run backend:

```bash
mvn spring-boot:run
```

---

### 3️⃣ Frontend Setup (React)

```bash
cd frontend
npm install
npm start
```

---

## ☁️ AWS Setup

### 🔹 SQS

* Create a queue
* Copy Queue URL
* Add to backend config

### 🔹 SES

* Verify sender email
* (Sandbox mode requires verifying receiver email)
* Move to production for real usage

---

## ⚠️ Common Issues

* ❌ 403 Error → Missing JWT token
* ❌ Email not sent → SES not verified
* ❌ No messages → SQS not configured
* ❌ Duplicate users → Email not unique in DB

---

## 📌 Future Improvements

* 🌐 Payment Integration
* 📊 Admin Dashboard
* 📧 HTML Email Templates
* 📱 Mobile Responsive UI


---

## 👨‍💻 Author

**Saurabh Singh**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and share it!
