| Operación | Método HTTP | Ruta | Entrada | Respuesta esperada | Código HTTP |
|---|---|---|---|---|---|
| Consultar todos los productos | GET | `/api/productos` | No requiere cuerpo | Colección JSON con todos los productos | `200 OK` |
| Consultar producto por ID | GET | `/api/productos/{id}` | ID en la URI | Producto solicitado en JSON | `200 OK` |
| Registrar producto | POST | `/api/productos` | Producto en JSON | Producto creado con ID generado | `201 Created` |
| Consultar producto inexistente | GET | `/api/productos/{id}` | ID inexistente en URI | Sin recurso | `404 Not Found` |

1. La ruta utiliza un sustantivo porque una URI REST identifica recursos. La acción se expresa con el método HTTP. Por eso se usa /api/productos y no /api/obtenerProductos.

2. /api/productos identifica la colección; /api/productos/{id} identifica un recurso individual.

3. El método HTTP expresa la intención: GET consulta y POST crea, aun usando la misma URI de colección.

4. La URI identifica el recurso, por ejemplo el ID. El JSON transporta los datos del recurso, como nombre, presentación, categoría y disponibilidad.

5. 200 OK = consulta correcta; 201 Created = creación; 404 Not Found = recurso inexistente.

-@SpringBootApplication configura e inicia la app

-SpringApplication.run crea el contexto de Spring y levanta el server

-Spring Web incorpora Jackson para transformar objs Java a JSON y JSON a objs Java