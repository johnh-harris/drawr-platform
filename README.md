# Drawr Platform

## Overview
Drawr Platform is a collaborative drawing application that allows users to create, share, and collaborate on drawings in real-time. The platform includes both a frontend (for the user interface) and a backend (for handling user interactions, authentication, and storage).

## Project Structure
The project is split into two main parts:

- **Backend**: The backend is built using Spring Boot and handles user management, authentication, and the drawing data. It connects to a MongoDB database for storing user and drawing information.
- **Frontend**: The frontend is a web application built using JavaScript (React or similar) that allows users to interact with the drawing tool, create drawings, and collaborate in real-time.

### Folder Structure:
```
drawr-platform/
├── backend/                # Spring Boot backend (contains all the application logic)
│   ├── src/                # Source code for the backend
│   ├── pom.xml             # Maven build file for backend dependencies
│   ├── .gitignore          # Git ignore for the backend
├── frontend/               # Frontend (React, etc.)
│   ├── public/             # Static files
│   ├── src/                # Source code for frontend
│   ├── package.json        # Node package file for frontend
│   └── .gitignore          # Git ignore for the frontend
├── README.md               # Project overview and setup instructions
├── LICENSE                 # Optional, license for the repo
└── .gitignore              # Global git ignore (for OS, IDE, and general files)
```

## Technologies Used
- **Backend**: Spring Boot, Java, MongoDB
- **Frontend**: JavaScript (React, etc.)
- **Real-time Collaboration**: WebSockets
- **Image Classification**: OpenCV (Planned for future integration)

## Getting Started

### Prerequisites
- Java 17 or higher for the backend
- Node.js and npm/yarn for the frontend
- MongoDB (or a cloud MongoDB service like Atlas)

### Setting Up the Backend
1. Clone the repository:
   ```bash
   git clone https://github.com/johnh-harris/drawr-platform.git
   ```

2. Navigate to the `backend/` directory:
   ```bash
   cd drawr-platform/backend
   ```

3. Build the backend with Maven:
   ```bash
   mvn clean install
   ```

4. Run the backend:
   ```bash
   mvn spring-boot:run
   ```

### Setting Up the Frontend
1. Navigate to the `frontend/` directory:
   ```bash
   cd drawr-platform/frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Run the frontend:
   ```bash
   npm start
   ```

### Access the Application
Once both the backend and frontend are running, you can access the application in your browser at `http://localhost:3000` (or another port specified by your setup).

## Contributing
Feel free to fork the repository and contribute by opening pull requests. Please ensure that your changes are well-documented and include tests if necessary.

### How to contribute:
1. Fork the repository.
2. Create a new branch.
3. Make your changes.
4. Open a pull request for review.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

