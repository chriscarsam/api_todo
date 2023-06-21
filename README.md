# API TODO
Creación de tareas - Spring 
## Tecnologías Utilizadas:

- [OpenJDK JDK 17](https://openjdk.org/projects/jdk/17/)
- [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/#section=linux)
- [MySQL](https://dev.mysql.com/downloads/mysql/)
- [Docker](https://hub.docker.com/)
- [Swagger](https://www.baeldung.com/spring-rest-openapi-documentation)
  
## &emsp; Implementación
Creación de una API REST en Spring, métodos implementados CRUD.
* Crear tarea
* Listar tareas
* Listar tareas por estado
* Actualizar tarea
* Eliminar tarea
Se utilizó Swagger para la documentación, no se implementó seguridad.
---

## &emsp; Endpoints


| Endpoint                      | Método      | Acceso         | Descripción               |
| ----------------------------- | ----------- | -------------- | ------------------------- |
| /tasks                        | GET         | Público        | Listar tareas             |
| /tasks/status/{status}        | GET         | Público        | Listar tareas por estado  |
| /tasks                        | POST        | Público        | Crear tarea               |
| /tasks/mark_as_finished/{id}  | PATCH       | Público        | Actualizar tarea          |
| /tasks/{id}                   | DELETE      | Público        | Eliminar tarea            |

### 🔹Listar tareas
```bash
[ GET ] http://localhost:8080/tasks
```
Response body
```json
[
  {
    "id": 1,
    "title": "TAREA 1",
    "description": "DETALLE TAREA 1",
    "createDate": "2023-06-09T11:43:55.710789",
    "eta": "2023-06-09T16:43:38.23",
    "finished": true,
    "taskStatus": "ON_TIME"
  },
  {
    "id": 2,
    "title": "string",
    "description": "string",
    "createDate": "2023-06-09T11:48:19.755561",
    "eta": "2023-06-09T16:45:02.927",
    "finished": false,
    "taskStatus": "ON_TIME"
  }
]
```
### 🔹Listar tareas por estado 
```bash
[ GET ] http://localhost:8080/tasks/status/{status} 
```	
Response body
```json
[
  {
    "id": 1,
    "title": "TAREA 1",
    "description": "DETALLE TAREA 1",
    "createDate": "2023-06-09T11:43:55.710789",
    "eta": "2023-06-09T16:43:38.23",
    "finished": true,
    "taskStatus": "ON_TIME"
  },
  {
    "id": 2,
    "title": "TAREA 2",
    "description": "DETALLE TAREA 2",
    "createDate": "2023-06-09T11:44:05.440272",
    "eta": "2023-06-09T16:43:38.23",
    "finished": false,
    "taskStatus": "ON_TIME"
  }
]
```

### 🔹Crear tarea 
```bash
[ POST ] http://localhost:8080/tasks
```
Request body
```json
{
  "title": "string",
  "description": "string",
  "eta": "2023-06-09T16:45:02.927Z"
}
```
### 🔹Actualizar tarea    
```bash
[ PATCH ] http://localhost:8080/tasks/mark_as_finished/{id}
```
```json
{
  "title": "string",
  "description": "string",
  "eta": "2023-06-09T16:45:02.927Z"
}
```
### 🔹Eliminar tarea 
```bash
[ GET ] http://localhost:8080/tasks/{id} 
```
![Screenshot from 2023-06-09 11-10-17](https://github.com/chriscarsam/api_toto/assets/28877424/88099fff-a875-447f-b058-0b719a053fe9)

### 📝 Commits realizados:
Link: https://github.com/chriscarsam/api_todo/commits/master

---

Basada en la implementacion de SACAViX Tech : https://www.youtube.com/watch?v=z_dLYcQqSHI
