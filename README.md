# PruebaValid
Prueba Técnica de VALID
Usando Java 8 Spring Stereotypes (Boot,JPA) Con Base de Datos H2

### packages de la aplicacion DEMO
    -configuration
    -controller
    -dto
    -entity
    -service
    -implements
    -repository

Patron de Arquitectura realizado Facade que facilita exponer interfaces para realizar los diferentes accesos a un repositorio.

Endpoints para el Funcionamiento:

Method GET que permite listar todas las personas de una Entidad:
http://localhost:8181/person/find-all-person

[
    {
        "id": 1,
        "name": "Leonardo",
        "lastName": "Tapias",
        "process": true
    },
    {
        "id": 2,
        "name": "Segundo",
        "lastName": "Aquiles",
        "process": false
    }
] 

Method POST que permite guardar una o mas personas: 
http://localhost:8181/person/save-person
body: 
[{
        "name": "Juan Martin",
        "lastName": "Torres",
        "process": false
    },
    
    {
        "name": "Estaba2n Tomas5",
        "lastName": "Torres",
        "process": false
    }
]

Method PUST que permite actualizar una persona: 
http://localhost:8181/person/update-person
{
    "id": 5,
    "name": "Juan Martin ACTUALIZAD",
    "lastName": "Torres",
    "process": true
}
    
Author: Ingeniero de Software Fernando Torres     
    





