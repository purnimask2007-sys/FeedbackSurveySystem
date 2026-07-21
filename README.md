# Feedback / Survey Collection System

## Project Overview

The **Feedback / Survey Collection System** is a console-based Java application developed using Object-Oriented Programming (OOP) principles. The system allows users to participate in surveys, submit responses, and view aggregated survey statistics. It demonstrates the effective use of Java Collections such as **ArrayList** and **HashMap** for storing and processing survey data.

This project is designed as a Low-Level Design (LLD) mini project for learning Java collections, object-oriented design, and basic data processing.

---

## Features

* Create a survey with multiple questions.
* Support multiple-choice questions.
* Collect responses from multiple participants.
* Store responses using `HashMap`.
* Store questions and responses using `ArrayList`.
* Display total responses for each question.
* Calculate the number of votes received for each option.
* Identify the most selected option for every question.
* Menu-driven console interface.

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* HashMap
* Java Collections Framework

---

## Project Structure

```text
FeedbackSurveySystem
│
├── Main.java
├── SurveyService.java
├── Survey.java
├── Question.java
├── Response.java
├── Statistics.java
└── README.md
```

---

## Class Description

### Main.java

* Entry point of the application.
* Displays the menu.
* Handles user interaction.

### Survey.java

* Stores survey information.
* Maintains the list of questions.

### Question.java

* Represents a survey question.
* Stores the question text and available options.

### Response.java

* Represents a participant's responses.
* Uses a `HashMap<QuestionID, SelectedOption>` to store answers.

### SurveyService.java

* Manages survey operations.
* Collects responses.
* Stores participant data.
* Calls the statistics module.

### Statistics.java

* Computes aggregate statistics.
* Displays vote counts.
* Finds the most selected option.

---

## Data Structures Used

### ArrayList

Used for:

* Storing survey questions.
* Storing options for each question.
* Storing participant responses.

Example:

```java
ArrayList<Question> questions;
ArrayList<String> options;
ArrayList<Response> responses;
```

### HashMap

Used for mapping each question to the selected option.

Example:

```java
HashMap<Integer, Integer> answers;
```

Example Data:

```text
Question 1 -> Option 2
Question 2 -> Option 1
Question 3 -> Option 4
```

---

## Program Flow

1. Start the application.
2. Display the main menu.
3. View available survey questions.
4. Submit responses.
5. Store responses.
6. Calculate statistics.
7. Display aggregated results.
8. Exit the application.

---

## Sample Menu

```text
========== Feedback / Survey Collection System ==========
1. View Survey
2. Submit Feedback
3. View Statistics
4. Exit
Enter your choice:
```

---

## Sample Statistics Output

```text
Question:
Rate the Teaching Quality

Excellent : 12
Good      : 9
Average   : 4
Poor      : 1

Total Responses : 26

Most Selected Option : Excellent
```

---

## Object-Oriented Concepts Used

* Classes and Objects
* Encapsulation
* Composition
* Collections Framework
* Separation of Responsibilities
* Menu-Driven Application Design

---

## Learning Outcomes

After completing this project, students will understand:

* How to design a simple Java application using OOP.
* Practical implementation of `ArrayList` and `HashMap`.
* Data collection and aggregation techniques.
* Basic Low-Level Design (LLD) principles.
* Modular programming and code organization.

---

## Future Enhancements

* User authentication.
* Admin panel for survey management.
* File-based data storage.
* Database integration (MySQL).
* Graphical User Interface (JavaFX/Swing).
* Online survey support.
* Export survey reports to PDF or Excel.

---

## Author

**Mini Project:** Feedback / Survey Collection System

**Language:** Java

**Concepts:** ArrayList, HashMap, OOP, Collections Framework

**Project Type:** Low-Level Design (LLD) Mini Project
