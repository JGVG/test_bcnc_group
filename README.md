# Prueba para BCNC Group - José Gabriel Vázquez Gil

El objetivo de la prueba es crear un API para mostrar todos los álbumes de fotos alojados en JSON Placeholder así como un detalle de las fotos de cada uno de los
álbumes.

# Ejecución
Para poder ejecutar la API usando la IDE IntelliJ es necesario ubicarse dentro de la clase 'TestBcncGroupApplication.kt', en ella se almacena el main de la API para su ejecución.

![image](https://github.com/JGVG/test_bcnc_group/assets/37996973/e08023da-e160-4407-bcc7-965b5be72e42)

![image](https://github.com/JGVG/test_bcnc_group/assets/37996973/5d6be1c5-ba17-40f6-8b51-67b26f00e8ae)


Es opcional tener instalado Postman, un software que tiene el proposito de falicitar el visionado respuestas de peticiones http -> https://www.postman.com/downloads/

pero también podemos usar nuestro navegador para el visualizado del json de respuesta.

![image](https://github.com/JGVG/test_bcnc_group/assets/37996973/66d2cd01-9fe3-452e-8e1a-2cd61a24323c)

La API actualmente dispone de dos peticiones
 - Recuperar los albunes -> http://localhost:8080/albums
 - Recuperar las fotos de un albun (Ej: el album con id 2) -> http://localhost:8080/albums/2/photos

La API dispone con Swagger OpenApi para una visualización más gráfica en formato web para ver los metodos que posee esta API

![image](https://github.com/JGVG/test_bcnc_group/assets/37996973/0f8f4d8d-aced-448e-9697-2a647a6e0915)

# Testing
Para poder usar los test unitarios, deberemos ingresar dentro de la IDE, IntelliJ en este caso, y abrir la clase 'AlbumControllerTests.kt' y al gual que para ejecutar el proyecto, ejecutaremos el test, que en este caso comprueba que para el albun 2 se devuelva bien nuestra lista de fotos.

![image](https://github.com/JGVG/test_bcnc_group/assets/37996973/27136957-5e49-4e11-81a8-bec037c78d81)

Aquí un ejemplo:

![image](https://github.com/JGVG/test_bcnc_group/assets/37996973/68b4a2f2-70cb-433f-bc30-16ce98a740c0)



