# Chat Web App

A real-time chat application built using Spring Boot, CSS, JavaScript, and HTML (for now). This project is structured into multiple services, each handling specific functionalities to ensure scalability and maintainability.

## Features

- **Real-Time Messaging**: Enables users to send and receive messages instantly.
- **User Authentication**: Secure user authentication mechanisms to protect user data.
- **Microservices Architecture**: The application is divided into distinct services, each responsible for specific tasks.

## Project Structure

- **api-gateway**: Handles all incoming requests and routes them to the appropriate service.
- **chat-service**: Manages all chat-related functionalities, including message handling and storage.
- **eureka-server**: Service registry for managing microservices and their instances.
- **springOauth**: Manages authentication and authorization using OAuth protocols.

## Technologies Used

- **Backend**: Java, Spring Boot, Spring Cloud
- **Frontend**: HTML, CSS, JavaScript
- **APIs**: RESTful services for communication between frontend and backend
- **Authentication**: OAuth for secure authentication
- **Service Discovery**: Eureka for registering and locating services
- **Containerization**: Docker for containerizing services


## TO IMPLEMENT

- **User Authentication**: Enhance authentication with improved security measures.
- **Connection with Other Microservices**: Implement better communication and coordination between services.
- **React Frontend**: Develop a modern frontend using React for an improved user experience.
- **Database Integration**: Store messages, user data, and other relevant information using MongoDB.

