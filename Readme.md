# Spring Security API Authentication

Este projeto implementa autenticação e autorização de usuários em uma API Spring Boot utilizando Spring Security, JPA e BCrypt para criptografia de senhas.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- H2 Database (ou outro banco relacional configurável)
- BCrypt Password Encoder

## Funcionalidades
- Cadastro de usuários com diferentes roles (USERS e MANAGERS)
- Proteção de endpoints com permissões
- Autenticação via Basic Auth
- Armazenamento de credenciais com criptografia

## Configuração e Execução

### 1. Clonar o repositório
```bash
git clone https://github.com/seu-usuario/spring-security-api-auth.git
cd spring-security-api-auth
```

### 2. Configurar o banco de dados
O projeto está configurado para rodar com um banco de dados em memória (H2), mas pode ser alterado no arquivo `application.properties`.

### 3. Executar o projeto
Utilizando Maven:
```bash
mvn spring-boot:run
```
Ou com um IDE como IntelliJ ou Eclipse, rodando a classe principal.

### 4. Testando a API
Utilize um cliente HTTP como Postman, Insomnia ou cURL.

- **Endpoint de acesso geral:**
  ```bash
  curl -u user:user123 http://localhost:8080/users
  ```
  **Resposta esperada:** `Usuário autorizado`

- **Endpoint restrito a managers:**
  ```bash
  curl -u admin:master123 http://localhost:8080/managers
  ```
  **Resposta esperada:** `Manager autorizado`

## Estrutura do Projeto
```
src/
├── main/
│   ├── java/com/guilherme/spring_security/
│   │   ├── config/               # Configuração de segurança
│   │   ├── controller/           # Controllers da API
│   │   ├── model/                # Entidades do banco de dados
│   │   ├── repository/           # Repositórios JPA
│   │   ├── service/              # Serviços de autenticação
│   │   ├── init/                 # Inicialização do banco de dados
│   │   ├── SpringSecurityApplication.java  # Classe principal
│   ├── resources/
│   │   ├── application.properties  # Configuração do banco
```

## Melhorias Futuras
- Implementação de autenticação com JWT
- Cadastro dinâmico de usuários via API
- Integração com um banco de dados relacional

## Autor
Desenvolvido por **Guilherme Azevedo**

