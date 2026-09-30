# MyFinance API

API REST para gerenciamento de finanças pessoais, desenvolvida com Java e Spring Boot.

Este projeto está sendo desenvolvido como parte do meu processo de aprendizado e aperfeiçoamento em desenvolvimento Backend Java.

## Tecnologias

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven
* Postman
* Git e GitHub

## O que já foi desenvolvido

* Estrutura inicial do projeto Spring Boot
* Conexão com MySQL
* Entidade `Usuario`
* Repository com Spring Data JPA
* Camada de Service
* DTO para cadastro de usuário
* API REST de usuários
* Cadastro de usuários
* Listagem de usuários
* Busca de usuário por ID

## Endpoints atuais

### Criar usuário

`POST /api/usuarios`

Exemplo:

```json
{
  "nome": "João",
  "email": "joao@email.com"
}
```

### Listar usuários

`GET /api/usuarios`

### Buscar usuário por ID

`GET /api/usuarios/{id}`

Exemplo:

`GET /api/usuarios/1`

## Estrutura atual

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL
```

## Próximos passos

* Validação dos dados
* Tratamento de exceções
* CRUD completo de usuários
* Cadastro de contas bancárias
* Cadastro de categorias
* Cadastro de transações
* Autenticação e autorização
* JWT
* Testes automatizados
* Documentação com Swagger/OpenAPI

## Objetivo

Evoluir o projeto gradualmente, aplicando conceitos de desenvolvimento Backend Java e Spring Boot na prática.
