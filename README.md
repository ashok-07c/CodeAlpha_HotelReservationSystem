# Hotel Reservation System

A Java console-based Hotel Reservation System developed using Object-Oriented Programming (OOP) concepts and File Handling.

---

## Features

- Search available hotel rooms
- Book hotel rooms
- Cancel reservations
- View reservation details
- Room categorization:
  - Standard
  - Deluxe
  - Suite
- Payment simulation
- File handling for storing bookings

---

## Technologies Used

- Java
- OOP Concepts
- File Handling
- ArrayList
- Scanner Class

---

## Project Structure

```plaintext
HotelReservationSystem/
│
├── Main.java
├── Hotel.java
├── Room.java
├── Reservation.java
├── Payment.java
├── FileManager.java
└── bookings.txt
```

---

## OOP Concepts Used

- Classes and Objects
- Encapsulation
- Constructors
- Method Calling
- ArrayList Collection
- File I/O Operations

---

## Room Categories

| Category | Price |
|----------|--------|
| Standard | ₹2000 |
| Deluxe | ₹4000 |
| Suite | ₹7000 |

---

## How to Run

### Step 1: Compile

```bash
javac *.java
```

### Step 2: Run

```bash
java Main
```

---

## Functionalities

### 1. View Available Rooms
Displays all available rooms with category and pricing.

### 2. Book Room
Users can:
- Enter customer name
- Select room number
- Make payment
- Confirm booking

### 3. Cancel Reservation
Allows cancellation using room number.

### 4. View Reservations
Displays all current bookings.

---

## Sample Output

```plaintext
===== HOTEL RESERVATION SYSTEM =====

1. View Available Rooms
2. Book Room
3. Cancel Reservation
4. View Reservations
5. Exit
```

---

## File Handling

Bookings are stored permanently in:

```plaintext
bookings.txt
```

---

## Future Improvements

- GUI using Java Swing/JavaFX
- Database Integration (MySQL)
- Online Payment Gateway
- User Login System
- Admin Dashboard

---

## Project Description

The Hotel Reservation System is a Java-based console application that allows users to search, reserve, and manage hotel rooms efficiently. The project demonstrates the implementation of Object-Oriented Programming concepts along with File Handling for persistent data storage.

---

## Author

Ashok Cherukuri
