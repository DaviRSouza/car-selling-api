# 🚗 Car Selling API

API REST para cadastro e listagem de automóveis, desenvolvida em Java com Spring Boot.

## ✨ Funcionalidades

*   **`POST /cadastroAutomoveis`**: Cadastra um novo automóvel.
*   **`GET /automoveis`**: Lista todos os automóveis cadastrados, ordenados por marca.

## 🛠️ Tecnologias
*   Java (21)
*   Spring Boot
*   Spring Web (REST)
*   Spring Data JPA
*   H2 Database (em memória)
*   Lombok
*   Maven

## 🚀 Como Executar

1.  **Clone:**
    ```bash
    git clone https://github.com/DaviRSouza/car-selling-api.git
    cd car-selling-api
    ```

2.  **Execute (Linux/macOS):**
    ```bash
    ./mvnw spring-boot:run
    ```
    **Ou (Windows):**
    ```bash
    mvnw.cmd spring-boot:run
    ```

A aplicação estará rodando em `http://localhost:8080`.

## 🌐 Endpoints

### 1. Cadastrar Automóvel
*   **URL:** `POST /cadastroAutomoveis`
*   **Corpo (JSON):**
    ```json
    {
        "marca": "Volkswagen",
        "modelo": "Gol",
        "valor": 50000.00
    }
    ```
*   **Resposta:** `201 CREATED`

### 2. Listar Automóveis
*   **URL:** `GET /automoveis`
*   **Resposta:** `200 OK` (JSON com a lista de carros)
