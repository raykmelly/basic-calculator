(Code hand written by Raymond Melly, README.md generate by claude)
# Basic Calculator

A command-line calculator written in Java. The user picks an operation from a menu, enters two numbers, and the program prints the result. I built it to practice reading user input with `Scanner` and controlling program flow with `if / else if / else`.

## Features

- Add, subtract, multiply, and divide two numbers
- Case-insensitive menu selection (`a` and `A` both work)
- Input handling for unrecognized menu choices

## Tech Stack

- **Language:** Java
- **Build tool:** Maven (`pom.xml`)
- **Input:** `java.util.Scanner`
- **IDE:** IntelliJ IDEA

## Getting Started

### Prerequisites

- JDK installed (use the version set in `pom.xml`)
- Maven (optional if you run it from an IDE)

### Run it

```bash
git clone https://github.com/raykmelly/basic-calculator.git
cd basic-calculator
mvn compile
```

Then run the main class in `src/main/java/com/pluralsight`, either from IntelliJ (right-click the class, then **Run**) or from the command line.

## Usage

1. Enter the first and second numbers when prompted.
2. Choose an operation:

| Key | Operation      |
|-----|----------------|
| A   | Add            |
| S   | Subtract       |
| M   | Multiply       |
| D   | Divide         |

3. The program displays the result. An invalid letter produces an error message and prompts again.

## What I Learned

### Reading input with `Scanner`

- **Creating a Scanner:** `Scanner scanner = new Scanner(System.in);` connects the program to keyboard input.
- **Choosing the right method:** `nextInt()` and `nextDouble()` read numbers, while `nextLine()` reads a full line of text.
- **Handling the leftover newline:** `nextInt()` and `nextDouble()` don't consume the Enter key press, so a following `nextLine()` can return an empty string. I learned to account for this when mixing number and text input.
- **Closing resources:** calling `scanner.close()` when finished is good practice.

### Comparing strings correctly

- Strings are compared with `.equals()` or `.equalsIgnoreCase()`, **not** `==`. The `==` operator checks whether two variables reference the same object, not whether the text matches.
- `equalsIgnoreCase()` lets the menu accept `A` or `a` without extra code.

### Control flow with `if / else if / else`

- Conditions are checked top to bottom, and only the first matching branch runs.
- The final `else` acts as a catch-all for invalid input.
- Syntax details matter: every `else if` needs its condition in parentheses before the opening brace.

### Edge cases in division

- Integer division drops the decimal (`7 / 2` is `3`), so values need to be cast to `double` for an accurate result.
- Dividing by zero must be checked before the operation runs.

## Project Structure

```
basic-calculator/
├── pom.xml
├── .gitignore
└── src/main/java/com/pluralsight/
    └── (Java source files)
```

## Future Improvements

- Loop the program so users can run multiple calculations without restarting
- Add input validation for non-numeric entries (`InputMismatchException`)
- Add more operations (modulus, exponents)
- Add unit tests with JUnit

## Author

**Raymond** ([@raykmelly](https://github.com/raykmelly))

Built while learning Java in Year Up's Application Development program.
