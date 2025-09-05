# 🎮 Tic Tac Toe – Spring Boot + HTML/CSS/JS

A classic **Tic Tac Toe game** built with a **Spring Boot backend** and a simple **HTML/CSS/JavaScript frontend**.  
The backend manages the game logic (turns, winner detection, reset), while the frontend provides the interactive UI.  

---

## 🚀 Features
- 🟢 **Spring Boot Backend**
  - REST APIs for moves and game reset
  - Winner detection handled on the server
- 🎨 **Frontend**
  - Responsive HTML/CSS game board
  - Interactive gameplay with JavaScript
  - Displays winner message dynamically
- 🔄 **Integration**
  - Frontend communicates with backend using Fetch API
  - Game state persisted on the server

---

## 🛠️ Tech Stack
- **Backend**: Java 21, Spring Boot (Web, DevTools)
- **Frontend**: HTML, CSS, JavaScript
- **Build Tool**: Gradle

---

## ⚡ API Endpoints
| Method | Endpoint     | Description                     | Example                 |
|--------|-------------|---------------------------------|-------------------------|
| `POST` | `/move`     | Make a move at given position   | `/move?position=4`      |
| `GET`  | `/reset`    | Reset the game to initial state | `/reset`                |

---

## ▶️ Run Locally

### 1. Clone Repository  
git clone https://github.com/Jai-Anand-JA/Tic_Tac_Toe.git
cd Tic_Tac_Toe

### 2. Build Gradle  
.\gradlew build  

### 3. Run Project  
.\gradlew bootRun  

### 4. Open localhost:8080/index.html  

---

## Author  
- Jai Anand


