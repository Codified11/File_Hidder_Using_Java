# Welcome to the File Hider - Console-Based Application (Java + Maven + MySQL + OTP) project !

### A console-based File Hider application built using Java, Maven, and MySQL, featuring secure OTP-based user authentication. The application allows users to hide and unhide files from their local file system securely, with file metadata stored in a MySQL database and access protected using OTP verification. his tool interacts with the system's file attributes using built-in Java I/O libraries. The project is useful for basic file privacy and can be extended to support encryption in the future.

# Dependencies...
To create a console-based file hider application using Maven, the following dependencies in our pom.xml file:
#### <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
#### <!-- https://mvnrepository.com/artifact/com.sun.mail/javax.mail -->

# Tech Stack...
<ul>
  <li>Java – Core application logic</li>
  <li>Maven – Project and dependency management</li>
  <li>MySQL – Backend database to store user and file data</li>
  <li>JDBC – Database connectivity</li>
  <li>JavaMail API (optional) – For sending OTP via email</li>
</ul>

# Features...
<ul>
  <li>OTP-based Authentication - Users register and log in using an OTP (One-Time Password) sent to their registered email or phone. Ensures enhanced security before performing any file operation.</li>
  <li>User SignUp & Login </li>
  <li>File Hiding - Securely hides files by moving them to a hidden directory. Metadata stored in the database for recovery.</li>
  <li>File Unhiding - Authenticated users can view and restore hidden files to their original locations</li>
  <li>Console Interface - Menu-driven text UI for easy interaction.</li>
</ul>

# How It Works...
<br/>
![Screenshot 2025-05-05 200113](https://github.com/user-attachments/assets/a02d2bd4-e50d-484f-9f19-0ac9c796b077)
<br/>
If new user comes then first do SignUp, enter 2 and enter details...
<br/>
![Screenshot 2025-05-05 200527](https://github.com/user-attachments/assets/5c721d9f-3d31-4ea8-b7ca-3d0e6c498373)
<br/>
If you already SigUp then do Login, enter 1 and enter details...
<br/>
![Screenshot 2025-05-05 200317](https://github.com/user-attachments/assets/ad07d6b1-c109-4247-92a7-db456ec673bd)
<br/>
If you enter wrong otp then it shows Wrong Otp...
and if you want to exit the enter 0;
<br/>
![Screenshot 2025-05-05 202037](https://github.com/user-attachments/assets/88d87232-1e98-4246-aed3-873550fc497f)
<br/>
If you successfully login then it show some option...
<br/>
Enter 2  for hiding files of your local system by entering the correct files path...
<br/>
![Screenshot 2025-05-05 202237](https://github.com/user-attachments/assets/77d4877c-9fad-441c-a14e-784ceb430033)
<br/>
Files save in DataBase correctly...
<br/>
![Screenshot 2025-05-05 202054](https://github.com/user-attachments/assets/536d32e5-d956-4b3c-a966-dedc3860e7eb)
<br/>
Enter 1 to show all hidden files of that user...
<br/>
![Screenshot 2025-05-05 202109](https://github.com/user-attachments/assets/900face8-acc6-4716-ac0f-5abeba7a24ef)
<br/>
Enter 3 to unhide the files by entering your above show files Id...<br/>
and Enter 0 to exit the code exceution....

#  Database Schema...
* Use MySQL
* Open MySQL Command Line
  1. create database File_Hidder; (database name)
  2. use File_Hidder;
  3. create table users ( id int primary key auto_increment, name varchar(100), email varchar(100));
  4. create table data (id int primary key auto_increment, fileName varchar(100), path varchar(255), email varchar(100), bin_data blob);
  5. desc users;
  6. desc data;

![Screenshot 2025-05-05 195842](https://github.com/user-attachments/assets/3abdfdd3-a31f-4f7b-9aac-7e9a761f67d5)

#  Setup Instructions...

1. Clone the Repository
   * git clone https://github.com/your-username/file-hider-java.git
   * cd file-hider-java
2. Configure MySQL Database
   Create the database and tables using the SQL above.
3. Configure OTP Service
   In SendOTPService.java file, enter email and enter your app password.
4. Build and Run
   go to main.java file and run the code. 

# Enjoy Coding !!








