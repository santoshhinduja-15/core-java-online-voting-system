# Core Java Online Voting System
A console-based Online Voting System developed using Core Java.  
This project simulates a real-world election process with admin-controlled voter and candidate management, secure one-person-one-vote logic, file-based data persistence, and result declaration.

## Features
### Admin Module
- Admin login with credentials
- Add candidates with duplicate ID validation
- Add voters with duplicate ID validation
- Open and close voting
- View election results
- Tie handling in results

### Voter Module
- Voter authentication using Voter ID
- View available candidates
- Cast vote (one person can vote only once)
- Voting allowed only when voting status is OPEN

### 📂 File Handling
- Automatic creation of required `.txt` files
- Persistent storage using text files:
  - voters.txt
  - candidates.txt
  - voting_status.txt

### Validation & Safety
- Duplicate voter ID prevention
- Duplicate candidate ID prevention
- Input validation for numeric values
- Voting blocked when status is CLOSED
- Proper error handling for invalid inputs

## Technologies Used
- Core Java
- Java Collections
- File Handling using Scanner
- Console-based user interface

## How to Run the Project
1. Clone the repository: git clone https://github.com/santoshhinduja-15/core-java-online-voting-system.git
2. Navigate to the Project Directory: cd core-java-online-voting-system
3. Compile the Project: javac *.java
4. Run the Application: java Main
5. Admin Credentials
  - Username: admin
  - Password: 1234

## Key Learnings
- Practical use of Core Java OOP concepts
- File-based data persistence without databases
- Role-based access control (Admin vs Voter)
- Input validation and error handling
- Real-world logical flow implementation

## Future Enhancements
- Password encryption for admin login
- Voter registration through admin UI
- Password encryption for admin login
- Database integration
- GUI or Web-based interface

## Screenshots
1. Admin Login
<img width="942" height="224" alt="image" src="https://github.com/user-attachments/assets/bbb03f21-8d89-454d-a587-ef4748a5a91f" />

2. Admin Menu
<img width="307" height="234" alt="image" src="https://github.com/user-attachments/assets/d0e9bc80-a69e-483f-bc03-5f8022e4f6aa" />

3. Add Candidate
<img width="463" height="363" alt="image" src="https://github.com/user-attachments/assets/c1dac527-5d69-4784-a57e-8eb4e39b11b6" />

4. Add Voter



