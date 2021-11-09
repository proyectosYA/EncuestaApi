# Encuesta
Encuesta Api implementada bajo la arquitectura hexagonal
---------------
- Se utiliza como motor de base de datos mysql.
- Se agrega base de datos para que sea importada, en la tabla pregunta tiene 
  almacenadas las preguntas e info de prueba.



El api cuenta con dos servicios: 

- obtener preguntas: GET--> http://localhost:8083/v1/encuesta/preguntas

- guardarEncuesta: POST-->  http://localhost:8083/v1/encuesta/

  cuerpo peticion POST:

	{
    "respuestaPregunta1": "Respuesta pregunta1",
    "respuestaPregunta2": "Respuesta pregunta2",
    "respuestaPregunta3": "Respuesta pregunta3",
    "respuestaPregunta4": "Respuesta pregunta4",
    "respuestaPregunta5": [
        {
            "burrito": true,
            "hamburguesa": null,
            "pizzaPepperoni": null,
            "pizzaPollo": null
        }
    ]
}
