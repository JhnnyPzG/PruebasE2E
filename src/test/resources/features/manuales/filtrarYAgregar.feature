# language: es
Característica: Filtrar por categoría y agregar al carrito

Escenario: Agregar un producto de la categoría "Electrodomésticos" al carrito
Dado que el usuario se encuentra en la página de inicio de Falabella
Cuando el usuario selecciona la categoría "Electrodomésticos" en la barra de navegación
Y selecciona el primer producto de la lista de resultados
Y agrega el producto al carrito de compras
Entonces el usuario debería ver el mensaje de confirmación de que el producto ha sido agregado al carrito
Y debería ver el producto en el carrito de compras