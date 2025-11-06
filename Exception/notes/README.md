⚙️ Java Exception Handling — try, catch, throw, throws, finally

Exception handling in Java helps to detect and handle runtime errors so that the program does not crash suddenly.
It allows the program to continue running normally even after an error occurs.

🧩 1. try block

The try block contains risky code that might cause an exception.

It is used to test a block of code for errors.

Must be followed by either catch or finally.

Example :
If you are dividing two numbers, and the second number might be zero, that division code should be written inside a try block.

🧱 2. catch block

The catch block is used to handle the exception that occurs in the try block.

It catches the exception and prevents program termination.

You can have multiple catch blocks for different types of exceptions.

Example :
If an exception occurs while dividing numbers, the catch block will display a message like “Cannot divide by zero” instead of stopping the program.

🚨 3. throw keyword

The throw keyword is used to manually throw an exception inside a method or block.

It is followed by an object of an exception class (like ArithmeticException, NullPointerException, etc.).

Only one exception can be thrown at a time.

Example :
If a person’s age is less than 18, you can throw an exception manually saying “Not eligible to vote”.

📤 4. throws keyword

The throws keyword is used in a method declaration to indicate that the method might throw an exception.

It informs the caller that this method must be handled using a try-catch block.

Commonly used for checked exceptions like file handling or database errors.

Example :
If a method reads a file from your computer, it can declare throws IOException to indicate that the file might not exist and must be handled by the caller.

🧹 5. finally block

The finally block is used to execute important cleanup code, such as closing files, releasing memory, or disconnecting from a database.

It runs whether or not an exception occurs.

It executes even if the program ends due to an exception.

Example (in words):
After reading a file, the finally block ensures the file is closed properly, even if an error occurs while reading it.
