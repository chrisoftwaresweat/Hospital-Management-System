# 🏥 Hospital Management System (OOP-Based Design)

![Java](https://img.shields.io/badge/Language-Java-orange)  
![Status](https://img.shields.io/badge/Status-Planning--Stage-yellow)  
![Level](https://img.shields.io/badge/Level-Intermediate-blue)  
![Architecture](https://img.shields.io/badge/Architecture-OOP-lightgrey)  
![Progress](https://img.shields.io/badge/Progress-Unfinished-red)  

---

## 📌 Overview
A **console-based Hospital Management System** built in Java, designed to demonstrate the **four pillars of Object-Oriented Programming (OOP)**:

- Encapsulation  
- Inheritance  
- Polymorphism  
- Abstraction  

This project is currently in the **planning phase**, focusing on **system design, structure, and relationships between classes** before full implementation.

---

## 🎯 Project Goal
To create a simple system that simulates basic hospital operations:

- 👤 Add patients  
- 👨‍⚕️ Assign doctors  
- 🧪 Request laboratory tests  
- 💵 Generate billing  

The goal is not complexity, but **clean OOP design and logical structure**.

---

## 🚧 Project Status
> ⚠️ This project is **not yet implemented**.  
> It is currently a **blueprint / guide for development**.

---

## 🧱 Planned OOP Structure

### 🧍 Base Class
- `Person` (Abstract Class)  
  - common attributes: name, age, gender  
  - method: displayInfo()  

### 👥 Derived Classes
- `Patient` extends `Person`  
  - patientId, medicalHistory  

- `Doctor` extends `Person`  
  - specialization, assignedPatients  

---

### 🧪 Service Classes
- `LabTest`  
  - testName, result, status  

- `Billing`  
  - consultationFee, testFees, totalAmount  

---

### 🏥 Core System
- `HospitalSystem` (Main Class)  
  - handles:
    - patient registration  
    - doctor assignment  
    - lab requests  
    - billing  

---

## 🔄 OOP Concepts Applied

| Concept | Application |
|--------|------------|
| Encapsulation | Private fields with getters/setters |
| Inheritance | `Patient` and `Doctor` inherit from `Person` |
| Polymorphism | Overriding `displayInfo()` |
| Abstraction | Abstract class `Person` |

---

## 🖥️ Planned Program Flow
```bash
===== HOSPITAL MENU =====
1. Add Patient
2. Assign Doctor
3. Request Lab Test
4. Generate Bill
5. Exit
========================
