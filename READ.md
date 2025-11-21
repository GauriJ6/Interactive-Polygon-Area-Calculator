# 📐 Interactive Polygon Area Calculator

**OOM Project**

A Java Swing–based desktop application that allows users to interactively manipulate the vertices of polygons (Triangles and Quadrilaterals) to calculate their **Area**, **Perimeter**, and **Angles** in real time.
It includes secure user authentication and file persistence.

---

## 👤 Contributor

* **Gauri Joshi** — IIB2024003

---

## ✨ Key Features

### 1. User Authentication 🔐

* **Login & Signup:** Secure access to the application.
* **Persistent Storage:** Credentials stored permanently in `users.txt` using a custom `UserManager`.

### 2. Interactive Geometry ✏️

* **Draggable Vertices:** Click & drag shape vertices to dynamically resize the polygon.
* **Real-Time Calculations:** Area, Perimeter, and Angles update instantly.
* **Coordinate Display:** Hover on a vertex to view its exact `(X, Y)` position.

### 3. Shape Management 🔺🟥

* **Polymorphism:** Easily switch between **Triangle** and **Quadrilateral** modes.
* **Customization:** Change polygon line colors using a color picker.

### 4. File I/O & Export 💾

* **Save/Load:** Store shape configurations to text files and load them anytime.
* **Export Image:** Export the drawing canvas as a `.png`.

---

## 🛠️ Technical Concepts Used

This project demonstrates core Object-Oriented Programming principles:

* **Abstraction:**
  `PolygonShape` is an abstract base class defining essential methods (`calculateProperties`, `getArea`).

* **Polymorphism:**
  The `Plot` class uses a single `PolygonShape` reference to manage both `Triangle` and `Quadrilateral`.

* **Encapsulation:**
  User data & shape data are kept private and accessed through public methods.

* **Event Handling:**
  Use of `ActionListener`, `MouseListener`, and `MouseMotionListener` for interactivity.

* **File Handling:**
  `BufferedReader` and `BufferedWriter` are used for reading/writing shape data and user credentials.

---

## 📂 Project Structure

```
Root/
├── ExtraFunctions/           # Logic & Model Classes
│   ├── PolygonShape.java     # Abstract Base Class
│   ├── Triangle.java         # Concrete Implementation
│   └── Quadrilateral.java    # Concrete Implementation
│
├── gui/                      # UI & Controller Classes
│   ├── Start.java            # Main Entry Point (Splash Screen)
│   ├── Login.java            # Authentication Screen
│   ├── Signup.java           # User Registration
│   ├── Plot.java             # Drawing Canvas & Dashboard
│   └── UserManager.java      # Backend logic for user auth
│
└── users.txt                 # Stores user credentials



## 🚀 How to Run

### **Prerequisites**

* Java Development Kit (JDK) installed

### **Compilation**

Open terminal in your project root and run:

```bash
javac gui/Start.java
```

### **Execution**

Run the main class:

```bash
java gui.Start
```

---

## 📖 User Guide

### **Splash Screen**

* The app starts with a welcome screen and automatically transitions to the Login page.

### **Authentication**

* Click **SIGN UP** to register a new user.
* Enter credentials and click **LOGIN** to proceed.

### **Main Dashboard**

#### **Shape Selection**

* Choose **Triangle** or **Quadrilateral** from the dropdown.

#### **Modify Shape**

* Click and drag vertices (small squares) on the canvas to reshape the polygon.

#### **Tools**

* **Change Color:** Select custom outline colors.
* **Save Shape:** Save vertex coordinates to a `.txt` file.
* **Load Shape:** Load a previously saved configuration.
* **Export PNG:** Save a snapshot of your current polygon.
* **Reset:** Clears the canvas and resets the default shape.
