# 🏥 Hospital Management System (OOP-Based Design)

![Java](https://img.shields.io/badge/Language-Java-orange)
![Status](https://img.shields.io/badge/Status-In%20Development-yellow)
![Level](https://img.shields.io/badge/Level-Intermediate-blue)
![Architecture](https://img.shields.io/badge/Architecture-OOP-lightgrey)
![Progress](https://img.shields.io/badge/Progress-Unfinished-red)

---

## 📌 Overview
A console-based Hospital Management System built in Java to demonstrate the four pillars of Object-Oriented Programming (OOP):

- Encapsulation  
- Inheritance  
- Polymorphism  
- Abstraction  

This project is currently in development and focuses on building a clean, structured, and scalable OOP design before adding advanced features.

---

## 🎯 Project Objective
The system simulates basic hospital operations in a simplified console environment while applying proper software design principles.

Current and planned features include:

- Patient registration and management  
- Doctor registration and management  
- Viewing patient records  
- Viewing doctor records *(new feature)*  
- Doctor and room assignment  
- Medical service requests (lab tests, consultations)  
- Billing system (inpatient and outpatient computation)  

The focus is on logic, structure, and OOP implementation rather than UI design.

---

## 🚧 Project Status
This project is currently in the development phase.

### Current progress:
- Core class structure implemented  
- OOP relationships established  
- Menu system created  
- Basic hospital flow working  
- Patient and doctor viewing implemented  

### Planned improvements:
- Input validation improvements  
- Error handling enhancements  
- Code refactoring and optimization  
- Expansion of medical services  
- Better system scalability  

---

## 🧱 System Design (OOP Structure)

### Base Class
**Person (Abstract Class)**
- name  
- age  
- displayInfo()  

---

### Derived Classes
**Patient extends Person**
- doctor assignment  
- room number  
- medical services  
- billing type  

**Doctor extends Person**
- specialization  

---

### Medical Services
**MedicalService (Abstract Class)**
- service name  
- fee  
- performService()  

Implemented services:
- LabTest  
- Consultation  

---

### Billing System
**Billing (Abstract Class)**
- calculateBill(serviceFee)  

Implementations:
- InPatient (adds room and hospital fees)  
- OutPatient (adds consultation charge)  

---

### Core Modules
- Admission (room management)  
- HospitalMenu (user interaction layer)  
- Patient and Doctor management system  

---

## 🔄 OOP Concepts Applied

| Concept | Application |
|--------|-------------|
| Encapsulation | Private fields with getters and setters |
| Inheritance | Patient and Doctor extend Person |
| Polymorphism | Method overriding in services and displayInfo |
| Abstraction | Abstract classes for Person, Billing, MedicalService |

---

## 🖥️ Program Flow
```bash
===== HOSPITAL MENU =====
1. Add Patient
2. Add Doctor
3. View Patients
4. View Doctors
5. Assign Doctor / Room
6. Request Medical Service
7. Generate Bill
8. Exit
=========================
