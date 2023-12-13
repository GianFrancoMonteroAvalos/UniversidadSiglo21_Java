Act. Integradora(Siglo 21) FUNDAMENTOS DE PROGRAMACIÓN

Englobe un método para validar los datos use estructuras de control y de
manejo de excepciones,
por ejemplo use while, para saber si cuando se registraban con el nombre y el
apellido estaba el campo vacío, lo debían ingresar correctamente con una
cadena de texto, y a su vez si el DNI, no tiene ocho dígitos se vuelve a
redirigir para completar el dni con sus dígitos asignados, luego tendrán que
poner su fecha de nacimiento en formato (dd/mm/yyyy) para que su registro
sea correcto. Y con cada acción de completar los campos lo puse en un try y
catch, que en el try por ejemplo en el campo de poner su Dni, se ponga en un
entero por el método Integer.parseInt y luego con el catch cree una excepción
con el formato del número si no es el que se pide.. y manda un mensaje que
“El DNI debe ser un número válido.”
Luego cree un HashSet para almacenar los datos de personas y que no se
pueda agregar una persona duplicada. Y deje un mensaje si la/s personas se
registraron correctamente o si ya estaba registrada.
Hice un método para mostrar las personas que con un for recorra los datos
almacenados del Set y los muestre..
Y para finalizar hice el main con un while y un switch para elegir los casos
para que en cada caso tenga acción de registrar a una nueva persona, mostrar
las personas registradas y salir.
Tuve algunos inconvenientes, a pesar de eso hay foros o librerías para
consultar y poder resolver las dudas ocasionadas mientras realizaba el
código.

Act. Integradora(Siglo 21) LENGUAJE ORIENTADO A OBJETOS (JAVA)

En la clase usuario implemente una notificación, un toString para cuando cargas al usuario lo devuelve, 
en la clase libro es algo parecido, en la clase biblioteca se inicia cargando libros, 
luego empieza a interaccionar con el usuario, para que se loguee, una vez ya registrado que ingrese con su nro de dni, 
luego le aparece un nuevo menú, que podrá agregar nuevos libros, eliminarlos, alquilar, 
va a poder ver todos los libros en la biblioteca.

Problemas que cargo son que me faltaron pulir varios detalles de filtros de busqueda de libros, 
estuve algo complicado con el tiempo, ya que estoy en la última instancia de un terciario, 
se me lío un poco pero yo creo que puedo mejorarlo, fue un desafío gratificante
