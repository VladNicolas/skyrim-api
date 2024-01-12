# Skyrim API

## Overview

Welcome to the Skyrim API, a Spring Boot application designed to provide structured access to information about weapons in the game Skyrim. The API offers functionalities to retrieve a complete list of weapons, filter weapons by type, perform searches based on specific keywords in weapon names, and more.

## Features

- Retrieve a comprehensive list of weapons in Skyrim.
- Filter weapons based on their type (e.g., swords, axes).
- Conduct searches for weapons containing specific keywords in their names.

## Technology Stack

- Spring Boot
- Java Persistence API (JPA)
- Follows the MVC design pattern for a modular and organized structure.

## Getting Started

To get started with the Skyrim API, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/skyrim-api.git`
2. Navigate to the project directory: `cd skyrim-api`
3. Run the application: `./mvnw spring-boot:run`
4. Access the API endpoints at `http://localhost:8080/weapon`

## Endpoints

### Get All Weapons
- **Endpoint:** `/weapon/all`
- **Method:** GET
- **Description:** Retrieve a list of all weapons in Skyrim.

### Get Weapons by Type
- **Endpoint:** `/weapon/type/{type}`
- **Method:** GET
- **Description:** Filter weapons based on their type (e.g., swords, axes).

### Search Weapons
- **Endpoint:** `/weapon/search/{keyword}`
- **Method:** GET
- **Description:** Search for weapons containing specific keywords in their names.

## How to Contribute

Contributions are welcome! If you'd like to contribute to the project, follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/new-feature`.
3. Commit your changes: `git commit -m 'Add new feature'`.
4. Push to the branch: `git push origin feature/new-feature`.
5. Open a pull request.

## Acknowledgments

- Inspired by the rich and expansive world of The Elder Scrolls V: Skyrim.
