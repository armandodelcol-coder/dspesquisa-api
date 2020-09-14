# DS-PESQUISA-API

Projeto da Semana Dev Superior, evento online gratuído fornecido por [DevSuperior](https://devsuperior.com.br/sds1c).

## Tecnologias utilizadas

- Java11
- SpringBoot
- H2
- Docker
- Docker-Compose
- Postgres
- PGadmin
- Heroku
- Codeship
- Insomnia

## Como acessar e utilizar os endpoints.

Eu utilizei o Software Insomnia para fazer as requisições.

### enpoint /GET Games

- url: `https://sds1-armando.herokuapp.com/games`
- method: GET
- tipo retorno: application/json
- exemplo de retorno:
```js
  [
    {
        "id": 1,
        "title": "The Witcher 3",
        "platform": "XBOX"
    }
  ]
```

### enpoint /GET Records

- url: `https://sds1-armando.herokuapp.com/records`
- method: GET
- tipo retorno: application/json
- Parametros na query:
  - min: (data no formato UTC, ex: 2020-07-01T00:00:00Z)
  - max: (data no formato UTC, ex: 2020-07-01T00:00:00Z)
  - page: (numero da pagina para paginação, ex: 0)
  - linesPerPage: (numero de registros por pagina, ex: 20)
  - orderBy: (referencia de campo para ordenação, ex: moment)
  - direction: (DESC ou ASC)
- exemplo de url com os query parametros: `https://sds1-armando.herokuapp.com/records?min=2020-07-01T00:00:00Z&max=2020-07-31T00:00:00Z&page=0&linesPerPage=20&orderBy=moment&direction=DESC`
- exemplo de retorno:
```js
  [
    {
        "id": 144,
        "moment": "2020-07-30T06:33:00Z",
        "name": "Rita",
        "age": 34,
        "gameTitle": "Dragon Age Inquisition",
        "gamePlatform": "XBOX",
        "genreName": "RPG"
    }
  ]
```

### enpoint /POST Records

- url: `https://sds1-armando.herokuapp.com/records`
- method: POST
- enviar um body com json nessa estrutura: 
```js
    {
        "name": "Armando",
        "age": 26,
        "gameId": 8
    }
```
- tipo retorno: application/json
- exemplo de retorno:
```js
  [
    {
        "id": 202,
        "moment": "2020-09-14T18:58:37.462746500Z",
        "name": "Armando",
        "age": 26,
        "gameTitle": "Overwatch",
        "gamePlatform": "PC",
        "genreName": "Shooter"
    }
  ]
```