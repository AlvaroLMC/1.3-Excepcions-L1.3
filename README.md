# Capital Cities Quiz - Countries and Capitals

## 📄 Description

This project is a Java program that runs a quiz game about world capitals. The program reads a `countries.txt` file containing a list of countries and their capitals, and stores this information in a `HashMap`. Then, it prompts the user for their name and displays 10 random countries, one by one, asking the user to enter the corresponding capital.

For each correct answer, the user earns one point. After the 10 questions, the user's name and total score are saved in a file called `categories.txt`.

---

## 🛠️ Technologies Used

- Java (JDK 17 or higher)
- IntelliJ IDEA / Eclipse (optional, as development environments)
- File I/O (`java.io`)
- Collections (`HashMap`)
- Input and output handling (`Scanner`)

---

## ✅ Requirements

Before running this project, make sure you have the following:

- Java JDK 17 or higher installed
- An editor or development environment like IntelliJ IDEA, Eclipse, or VS Code
- A `countries.txt` file with the following format:
  
Albania Tirana
Andorra Andorra_la_Vella
Armenia Ereván ...


Each line must contain a country and its capital, separated by a comma.

---

## ⚙️ Installation

1. Clone this repository or copy the source code to your local environment.
2. Make sure the `countries.txt` file is in the same directory as the main `.java` file.
3. Open the project in your preferred editor.
4. Compile the main Java file.

---

## ▶️ Ejecución

1. Run the program with the following command:
   ```bash
    javac Main.java
2. Enter your name when prompted.
3. Answer the capital questions — you’ll have 10 chances.
4. At the end, your score will be displayed and your name and result will be saved in the categories.txt file.
