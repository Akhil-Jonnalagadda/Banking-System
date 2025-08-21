# Banking System Project

## Overview
This is a Java-based Banking System application with a graphical user interface (GUI). It allows users to manage different types of bank accounts, perform transactions, and view account details in a secure and user-friendly environment.

## Features
- **Login System:** Secure login with username and password.
- **Account Management:** Add, view, and manage Savings, Current, and Student accounts.
- **Transactions:** Deposit and withdraw money with validation and error handling.
- **GUI:** Modern, colorful interface for easy navigation and use.
- **Exception Handling:** Custom exceptions for invalid operations (e.g., insufficient balance, invalid amount).

## How to Run
1. **Compile the Source Code:**
   - Open PowerShell in the `BankingSystem` directory.
   - Run the following command to compile all Java files:
     ```powershell
     Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { javac -d bin $_.FullName }
     ```
2. **Run the Application:**
   - Execute the following command to start the application:
     ```powershell
     java -cp bin Application
     ```
   - The login window will appear. Use the credentials:
     - **Username:** akhil
     - **Password:** 123

## Project Structure
- `src/` : Contains all Java source files organized by package (Bank, GUI, Data, Exceptions).
- `bin/` : Compiled `.class` files.
- `img/` : Images used in the GUI.
- `README.md` : Project documentation and instructions.

## Usage
- After logging in, you can add new accounts, deposit/withdraw money, and view account details.
- The application handles errors gracefully and provides feedback for invalid operations.

## Requirements
- Java JDK 8 or higher
- Windows PowerShell (for running commands)

## Purpose
This project demonstrates:
- Object-oriented programming in Java
- GUI development with Swing
- Exception handling and validation
- Real-world banking operations simulation

