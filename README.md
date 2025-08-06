ForumHub
Descrição do Projeto
O ForumHub é uma API RESTful para um fórum online. Ele permite que usuários criem tópicos e gerenciem suas postagens. A aplicação foi construída com Java 21 e Spring Boot, utilizando um banco de dados PostgreSQL para persistência e Flyway para controle de migrações. A documentação da API é gerada automaticamente com o Spring Doc (OpenAPI 3).

Tecnologias Utilizadas
Linguagem: Java 21

Framework: Spring Boot

Banco de Dados: PostgreSQL

ORM: Spring Data JPA

Migrações: Flyway

Documentação da API: Spring Doc (OpenAPI 3)

Funcionalidades
Tópicos: Criação, leitura, atualização e exclusão de tópicos.

Validação de Dados: Assegura que os dados de entrada estejam no formato correto.

Pré-requisitos
Para rodar este projeto localmente, você precisará ter instalado:

Java Development Kit (JDK) 21

Git

Maven ou Gradle

PostgreSQL

Como Rodar o Projeto
Clone o Repositório:

Bash

git clone https://github.com/PedroBarbosaLeal/ForumHub.git
cd ForumHub
Configurar o Banco de Dados:
Crie um banco de dados PostgreSQL chamado forumhub.

Em seguida, configure as credenciais no arquivo src/main/resources/application.properties (ou application.yml):

Properties

spring.datasource.url=jdbc:postgresql://localhost:5432/forumhub
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
Executar a Aplicação:
O Flyway fará as migrações do banco de dados automaticamente ao iniciar a aplicação. Para rodá-la, use o Maven:

Bash

./mvnw spring-boot:run
A API estará disponível em http://localhost:8080.

Documentação da API
A documentação da API é gerada automaticamente. Você pode acessá-la nos seguintes endpoints:

Swagger UI: http://localhost:8080/swagger-ui.html

OpenAPI JSON: http://localhost:8080/v3/api-docs
