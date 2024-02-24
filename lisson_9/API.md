openapi: 3.0.3
info:
  title: Заказ ресурсов в облаке
  version: 0.0.1
servers:
  - url: http://localhost:8080/api/v1
    description: Dev server
paths:
  /clouds:
    get:
      summary: Метод по получению ресурсов в облаке
      tags:
        - Clouds
      operationId: getAllClouds
      responses: 
        "200" : 
          description: Успешный ответ со списком ресурсов
          content:
            aplication/json:
              schema:
                $ref: "#/components/schemas/Cloud"
        "default" :
          description: Все остальное
          content: 
            aplication/json:
              schema:
                $ref: "#/components/schemas/Error"
    post:
      summary: Создать заказ на облако
      tags:
        - Clouds
      operationId: CreateCloud
      requestBody:
        content:
          aplication/json:
            schema: 
              $ref: "#/components/schemas/Cloud"
      responses: 
        "200" : 
          description: Успешный ответ со списком ресурсов
          content:
            aplication/json:
              schema:
                $ref: "#/components/schemas/Cloud"
        "default" :
          description: Все остальное
          content: 
            aplication/json:
              schema:
                $ref: "#/components/schemas/Error"  
  /clouds/{cloud_id}:
    delete:
      summary: Отмена заказа
      tags:
        - Clouds
      operationId: cancelCloudById
      parametrs:
        - name: cloud_id
          in: path
          reguired: true
          description: Id заказ облака
          schema:
            type: integer
          example: 123
      responses:
        "200" : 
          description: Успешная отмена заказа
          content:
            aplication/json: {}
        "default" :
          description: Все остальное
          content: 
            aplication/json:
              schema:
                $ref: "#/components/schemas/Error"
  /users:
    post:
      summary: Создать пользователя
      tags:
        - Users
      operationId: CeatePersonalArea
      requestBody:
        content:
          aplication/json:
            schema: 
              $ref: "#/components/schemas/User"
      responses: 
        "200" : 
          description: Пользователь успешно создан
          content:
            aplication/json:
              schema:
                $ref: "#/components/schemas/User"
        "500" : 
          description: Внутренняя ошибка сервера
  /users/{user_name}: 
    get:
      summary: получить пользователя
      tags:
        - Users
      operationId: getUserById
      parametrs:
        - name: user_name
          in: path
          reguired: true
          description: name пользователя
          schema:
            type: string
          example: masha
      responses: 
        "200" : 
          description: Пользователь найден
          content:
            aplication/json:
              schema:
                $ref: "#/components/schemas/User"
        "400" : 
          description: Пользователь не найден
  /users/{user_id}: 
    delete:
      summary: удалить пользователя
      tags:
        - Users
      operationId: removeUserById
      parametrs:
        - name: user_id
          in: path
          reguired: true
          description: Id пользователя
          schema:
            type: integer
          example: 10
      responses: 
        "200" : 
          description: Пользователь удален
          content:
            aplication/json:
              schema:
                $ref: "#/components/schemas/User"
        "400" : 
          description: Пользователь не найден  
        "500" : 
          description: Внутренняя ошибка сервера
components:
  schemas:
    Cloud:
      type: object
      properties:
        cloud_id:
          type: integer
          example: 1123
        ram:
          type: integer
          example: 16
        cpu: 
          type: integer
          example: 2
        ssd:
          type: integer
        os: 
          type: string
          example: linux
    Clouds:
      type: array
      items:
        $ref: "#/components/schemas/Cloud"
    Error:
      type: object
      properties:
        code_arror:
          type: integer
          example: 28
        code_message:
          type: string
          example: error
    User:
      type: object
      properties:
        user_id:
          type: integer
          example: 10
        name:
          type: string
          example: masha
        hash: 
          type: string
          example: masha_hash
        email:
          type: string
          example: masha@mail.ru
    Users:
      type: array
      items:
        $ref: "#/components/schemas/User"
        