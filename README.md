| Operación | Método HTTP | Ruta | Entrada | Respuesta esperada | Código HTTP |
|---|---|---|---|---|---|
| Consultar todos los productos | GET | `/api/productos` | No requiere cuerpo | Colección JSON con todos los productos | `200 OK` |
| Consultar producto por ID | GET | `/api/productos/{id}` | ID en la URI | Producto solicitado en JSON | `200 OK` |
| Registrar producto | POST | `/api/productos` | Producto en JSON | Producto creado con ID generado | `201 Created` |
| Consultar producto inexistente | GET | `/api/productos/{id}` | ID inexistente en URI | Sin recurso | `404 Not Found` |