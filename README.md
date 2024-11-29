# First Spring App

Este é um exemplo básico de aplicação **Spring Boot**, desenvolvido para fins de aprendizado e prática. Ele demonstra a estrutura de uma API REST simples, incluindo configuração, controllers, services e domain models.

---

## **Funcionalidades**
- Retorno de mensagens de "Hello World".
- Manipulação de requisições GET e POST.
- Utilização de profiles Spring Boot para configuração ambiente.

---

## **Requisitos**
- **Java 11 ou superior**
- **Maven** para gerenciamento de dependências.
- **MySQL** (ou outro banco de dados configurado).

---

## **Configuração**

### **Banco de Dados**
Certifique-se de que o banco de dados está configurado conforme o arquivo `application.properties`. 
Por padrão:
- URL: `mysql://localhost:3306/first_spring_app`
- Usuário: `root`
- Senha: `root`

### **Profiles**
O profile ativo pode ser configurado via a variável de ambiente `ACTIVE_PROFILE`:
- Padrão: `dev`

---

## **Instalação**
1. Clone este repositório:
   ```bash
   git clone https://github.com/dgkeven/first-spring-app.git
   ```
2. Compile o projeto:
   ```bash
   mvn clean install
   ```
3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

---

## **Endpoints**

### **GET /hello-world**
Retorna uma saudação personalizada.

#### **Exemplo de Resposta**
```json
"Hello World Keven"
```

---

### **POST /hello-world/{id}**
Recebe um **ID**, um **filtro** e um **corpo JSON** do tipo `User`.

#### **Parâmetros**
- `id` (Path Variable): Identificador da requisição.
- `filter` (Query Parameter): Filtro opcional. Valor padrão: `nenhum`.
- Corpo da requisição (JSON):
  ```json
  {
    "name": "Nome do Usuário",
    "email": "email@exemplo.com"
  }
  ```

#### **Exemplo de Resposta**
```json
"Hello World nenhum"
```

---

## **Estrutura do Projeto**

```plaintext
src/main/java
├── com.apprenticeship.first_spring_app
│   ├── configuration
│   │   └── HelloConfiguration.java       // Bean para mensagens de Hello World.
│   ├── controller
│   │   └── HelloWordController.java      // Controller principal.
│   ├── domain
│   │   └── User.java                     // Representação do modelo de usuário.
│   ├── services
│   │   └── HelloWorldServices.java       // Lógica de negócio para saudações.
│   └── FirstSpringAppApplication.java    // Classe principal (entry point).
└── resources
    ├── application.properties            // Configurações da aplicação.
    └── static                            // Recursos estáticos (caso existam).
```

---

## **Tecnologias Utilizadas**
- **Spring Boot**
- **Spring Web**
- **Lombok** para reduzir boilerplate.
- **MySQL** para persistência de dados.

---

## **Autor**
**Keven Mendes**  
Um desenvolvedor em aprendizado contínuo, explorando as funcionalidades do **Spring Boot** e melhores práticas de desenvolvimento.

---

![image](https://github.com/user-attachments/assets/50ab905f-9e4d-4a6b-b161-918ff5017d08)


