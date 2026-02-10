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
<img width="463" height="363" alt="image" src="https://github.com/user-attachments/assets/22cd93f1-ac04-407e-8787-4a4577d29626" />

4. Add Voter
<img width="411" height="378" alt="image" src="https://github.com/user-attachments/assets/a52cb2b7-a7ed-404e-b5b4-c990be7c5416" />

5. Voting Open/Close
<img width="309" height="319" alt="image" src="https://github.com/user-attachments/assets/cf7063c8-4f68-4f81-98c4-cc055555cf65" />
<img width="304" height="296" alt="image" src="https://github.com/user-attachments/assets/6d7b2757-3937-4cc4-8011-7b82c47031cd" />

6. Cast Vote
<img width="952" height="271" alt="image" src="https://github.com/user-attachments/assets/193f1c68-0671-4cf4-8c8b-c6f9ac596be3" />

7. View Results
<img width="956" height="635" alt="image" src="https://github.com/user-attachments/assets/54999df6-9e31-4d0c-a0bf-81cd3885e43e" />
