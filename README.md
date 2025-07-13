# REST-API-CLIENT

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: AMIRTHAA R

*INTERN ID*: CT04DG1601

*DOMAIN*: JAVA DEVELOPMENT

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

# DESCRIPTION ABOUT MY PROJECT 

The JokeFetcher program is a simple Java-based REST API client designed to fetch and display a random joke from an external web service. It demonstrates how to connect to a public API using core Java libraries without relying on external dependencies like JSON parsing libraries.

This application connects to the Official Joke API (https://official-joke-api.appspot.com/random_joke) using the HttpURLConnection class. It sends a GET request to the API endpoint to retrieve a JSON response containing a joke. The response typically includes two key fields: "setup" (the question or introduction) and "punchline" (the joke’s answer or punch).

After establishing the connection, the response is read line by line using a BufferedReader and stored in a StringBuilder. Instead of using JSON libraries (like org.json or Gson), the program parses the response manually by using String.split() to extract the joke content. This keeps the code simple and dependency-free but limits flexibility and error handling compared to real JSON parsing.

The program includes basic error handling. If any issue arises—such as connection failure or incorrect formatting—it catches the exception and displays a corresponding error message.

This example is ideal for beginners learning how to make API calls in Java, read server responses, and handle basic string parsing. It provides a clear introduction to REST client development using native Java features and is a good starting point for more advanced API integrations in the future.

# OUTPUT

<img width="435" height="87" alt="Image" src="https://github.com/user-attachments/assets/6e1c6b04-4f49-4374-bbcb-1a6c755b1ff6" />
