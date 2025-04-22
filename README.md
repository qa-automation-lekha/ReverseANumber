---

# Reverse Number Program

## Description

**ReverseNumber** is a simple Java console application that takes an integer input from the user and displays its reverse. This is useful for learning basic number manipulation and understanding how to work with loops and arithmetic operations in Java.

## Features

- Prompts the user to enter an integer.
- Uses a `while` loop to reverse the digits of the number.
- Outputs the reversed number.

## How It Works

1. The user inputs an integer.
2. The program extracts each digit using modulo (`%`) and division (`/`) operations.
3. It builds the reversed number by multiplying the previous result by 10 and adding the current digit.
4. Finally, it prints the reversed number.

## Requirements

- Java 8 or higher

## How to Run

1. Save the file as `ReverseNumber.java`.
2. Open a terminal or command prompt and navigate to the file's directory.
3. Compile the code:
   ```bash
   javac ReverseNumber.java
   ```
4. Run the program:
   ```bash
   java ReverseNumber
   ```

## Example Output

```
Enter the number to reverse: 
12345
The reversed number is: 54321
```

## License

This project is licensed under the MIT License.

---
