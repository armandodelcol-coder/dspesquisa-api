# Usando Postgres e PGAdmin no Docker

## Requisitos

- Docker
- Docker-Compose

Vericar se está tudo ok com: `docker --version` e `docker-compose --version`.

## Passos

1 - Criar um arquivo chamado "docker-compose.yml" na raiz do projeto com o seguinte código:

```
version: "3.8"

services:
  db:
    image: "postgres:12.2"
    expose:
      - 5432
    ports:
      - 5432:5432
    environment:
      - POSTGRES_PASSWORD=postgres
    volumes:
      - postgres:/var/lib/postgresql/data

  pgadmin:
    image: dpage/pgadmin4
    restart: always
    ports:
      - 8000:80
    volumes:
      - ./.docker/metabase-data:/metabase-data
    environment:
      PGADMIN_DEFAULT_EMAIL: admin@admin.com
      PGADMIN_DEFAULT_PASSWORD: secret
    depends_on:
      - db
    links:
      - db

volumes:
  postgres:
```

Ficar atento aos espaçamentos, tem que estar bem alinhado.

2 - Rodar o comando `docker-compose up` na raiz do projeto e aguardar o docker baixar as imagens.

3 - Verificar o endereço `http://localhost:8000` que é do PGAdmin.

Usuário e senha do PGADMIN foram definidos no arquivo docker-compose.yml como

- USER: admin@admin.com
- PASS: secret

4 - Criar um Server utilizando como host o nome do container que é **db** NÃO É localhost e a **senha é postgres**

5 - Seguir os mesmos passos da aula para criar a database e no arquivo application-dev.properties se atentar a conexão com o banco fica assim:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/dspesquisa
spring.datasource.username=postgres
spring.datasource.password=postgres
```