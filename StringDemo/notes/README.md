📚 Java String Classes Notes

A quick reference guide for understanding StringBuffer, StringBuilder, and StringTokenizer in Java.
Perfect for beginners and revision before interviews or exams.

🧵 1. StringBuffer

Purpose: Create mutable (changeable) strings.
Thread-safety: ✅ Yes (synchronized) → slightly slower.
Default capacity: 16 + length of string.
Capacity formula: oldCapacity * 2 + 2.

🔹 Common Methods
append()     // add text at end
insert()     // insert text at specific position
delete()     // remove characters
reverse()    // reverse the string
capacity()   // returns total buffer capacity
length()     // returns number of characters

🔹 Example
StringBuffer sb = new StringBuffer("Java");
sb.append(" Rocks");
System.out.println(sb); // Java Rocks

⚡ 2. StringBuilder

Purpose: Same as StringBuffer (mutable strings).
Thread-safety: ❌ No (not synchronized) → faster.
Best for: Single-threaded programs.

🔹 Example
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Hello World

✂️ 3. StringTokenizer

Purpose: Split a string into tokens (parts).
Package: java.util
Delimiter: Character used to separate tokens (default: space).

🔹 Common Methods
hasMoreTokens()  // check if more tokens exist
nextToken()      // return next token

🔹 Example
String s = "Java,Python,C++";
StringTokenizer st = new StringTokenizer(s, ",");
while(st.hasMoreTokens()) {
    System.out.println(st.nextToken());
}


Output:
      Java
      Python
      C++

Speed	⏳ Slower	⚡ Faster	⚡ Fast for splitting
Package	java.lang	java.lang	java.util
Use case	Multi-threaded apps	Single-threaded apps	Split strings into tokens
