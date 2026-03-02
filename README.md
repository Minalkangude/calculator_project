# 🧮 Simple Calculator Web Application (Advanced Java)

## 📌 Project Overview

This is a simple Calculator Web Application developed using **Advanced Java (Servlet + JSP)**.  
The application performs basic arithmetic operations like Addition, Subtraction, Multiplication, and Division.

This project demonstrates the use of:
- Jakarta Servlet (Tomcat 11 compatible)
- JSP
- RequestDispatcher
- Switch case
- Integer.parseInt()
- Form handling using POST method

---

## 🚀 Technologies Used

- Java
- Jakarta Servlet API
- JSP (Java Server Pages)
- Apache Tomcat 11
- Maven
- HTML

---

## ⚙️ How It Works

1. User enters two numbers in the input fields.
2. The form sends data using the POST method to the servlet.
3. Servlet retrieves the values using `getParameter()`.
4. Since `getParameter()` returns String, the values are converted using `Integer.parseInt()`.
5. Based on the selected operation, `switch case` is used to calculate the result.
6. The result is sent to the Result.jsp using `RequestDispatcher`.
7. The result is displayed using JSP expression.

---

## 📂 Project Structure

calculator
│
├── src
│ └── main
│ ├── java
│ │ └── CalculationServlet.java
│ │
│ └── webapp
│ ├── Number.jsp
│ └── Result.jsp
│
└── pom.xml


---

## 🧠 Concepts Implemented

- Handling form data in Servlet
- Converting String to Integer using `Integer.parseInt()`
- Using `switch case` for operation selection
- Forwarding request using `RequestDispatcher`
- Sending data from Servlet to JSP using `setAttribute()`
- Displaying data using JSP Expression `<%= %>`

---

## 📷 Features

✔ Simple and clean UI  
✔ Performs 4 arithmetic operations  
✔ Uses POST method for secure data handling  
✔ Compatible with Tomcat 11 (Jakarta namespace)  

---

## 🛠️ How to Run

1. Clone the repository.
2. Open the project in IntelliJ / Eclipse.
3. Configure Apache Tomcat 11.
4. Build and run the project.
5. Open in browser:

---

---

## 📌 Learning Outcome

Through this project, I understood:

- How Servlet and JSP work together
- How client request is processed by server
- How to handle user input in web applications
- How to forward data between Servlet and JSP

---

## 👩‍💻 Author

Developed by **Minal Kangude**  
B.Tech (Artificial Intelligence & Data Science)  
Third Year Engineering Student

---

## 🌟 Support & Feedback

If you found this project helpful:

⭐ Please give it a Star  
🍴 Fork the repository  
💬 Feel free to give feedback or suggestions  

Your support and feedback help me improve and build better projects 🚀

---

## 📬 Connect With Me

If you have suggestions, improvements, or collaboration ideas, feel free to reach out.

I'm always open to learning and growing in the field of Java and Web Development.

---

✨ Thank you for visiting my project!
