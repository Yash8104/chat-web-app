# Chat Web App

A real-time chat application built using Spring Boot, CSS, JavaScript, and HTML (for now). This project is structured into multiple services, each handling specific functionalities to ensure scalability and maintainability.

## Features

- **Real-Time Messaging**: Enables users to send and receive messages instantly.
- **Private Messaging**: Enables users to send and receive private messages with each other.
- **User Authentication**: Secure user authentication mechanisms to protect user data.
- **Microservices Architecture**: The application is divided into distinct services, each responsible for specific tasks.

## Project Structure

- **api-gateway**: Handles all incoming requests and routes them to the appropriate service.
- **chat-service**: Manages all chat-related functionalities, including message handling and storage.
- **profile-service**: Manages all the profile related functionalities and adds the functionality to set a profile pic and a display name.
- **eureka-server**: Service registry for managing microservices and their instances.
- **oauth-service**: Manages authentication and authorization using OAuth protocols.

## Technologies Used

- **Backend**: Java, Spring Boot, Spring Cloud, Eureka, MongoDB
- **Frontend**: HTML, CSS, JavaScript, BootStrap, ThymeLeaf
- **APIs**: RESTful services for communication between frontend and backend
- **Authentication**: OAuth 2 using Google for secure authentication
- **Service Discovery**: Eureka for registering and locating services
- **Containerization**: Docker for containerizing services
- **Orchestration**: Kubernetes for orchestration of services



## TO IMPLEMENT

- **React Frontend**: Develop a modern frontend using React for an improved user experience.

