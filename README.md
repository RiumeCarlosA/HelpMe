# HelpMe
Sistema para prestação de serviço, suporte.

h1{Tecnologias utilizadas:} 

Docker, docker compose;
Java 11;
Maven;
Spring boot 2.3.12;
Spring security < 6;
JWT;
Padrão de projeto MVC;
JPA com Hibernate;
PostgresSQL com PgAdmin;
Database H2 para testes;

Motivação:

Aplicação voltada para atendimentos de suporte, com intuito de estudar novas tecnologias e desenvover uma aplicação RESTful do zero.

Preparação do ambiente para o projeto:

Precisará do maven, docker e docker compose. Depois de clonar o repositório, importe como maven project em seu ambiente de desenvolvimento, com o docker instalado execute os comandos: docker-compose -f docker-compose-helpme.yml up helpme_postgres_local e docker-compose -f docker-compose-helpme.yml up helpme_pgadmin para criar os containers. Logo após certifique-se do ip que o container "helpme_postgres_local" é o mesmo que está no arquivo "application-dev.properties". No PgAdmin adicione uma database passando o nome "general" como "local", em Conenection coloque o endereço "helpme_postgres_local" na porta 5432, Main database "helpme", usuário "postgres" e senha "123@mudar".
Com essas configurações o projeto estará funcionando tanto no ambiente de teste "h2" quanto no dev persistindo os dados no Postgres.
Para testar coloque o endereço "localhost:8080/login" no postman e passe os parâmetros como JSON:
{
    "email": "riumecarlos@gmail.com",
    "senha": "123@mudar"
}





