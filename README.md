# ConcursoPreguntasRespuestas-SOFKAU
El presente es un reto en el que se  va a modelar un concurso de preguntas y respuestas, la intención es diseñar una solución que permita tener un banco de 
preguntas con diferentes opciones para una única respuesta, además cada pregunta debe estar en una categoría o un grupos de preguntas similares del mismo nivel, 
Por cada ronda se deberá asignar un premio a conseguir, las rondas del juego son nivel que van aumentando en la medida que el jugador gana premios. 
Dentro del reto se debe considerar lo siguiente: ● Manejo de clases u objetos a nivel de modelamiento. ● Persistencia de datos o guardado de históricos. 
● Manejos de listas o colecciones y ciclos de control adecuados ● Conocimiento de cualquier lenguaje de programación. ● Manejo de Git (versión de control). 

#Especificaciones tecnicas:
*El proyecto se realizó con ayuda del IDE Apache NetBeans 12.6.
*Sistema operativo Windows 10.
*Lenguaje de programacion JAVA versión 15.02 y herramienta de software MAVEN versión 15.
*Se utilizó Git Bash como la línea de comandos para trabajar con Git en Windows.
*Como repositorio remoto se utiliza para este proyecto GitHub.

#Cómo correr el programa. 
 *Para correr el programa se recomienda tener en cuenta cumplir con las especificaciones técnicas brindadas.
 *Descargar el repositorio remoto del enlace https://github.com/DidierJavier/ConcursoPreguntasRespuestas-SOFKAU
 *Asegurarse de haber descargado la carpeta <src>, que dentro de ella esté la carpeta <main>, dentro de esta la carpeta <java> y en esta última carpeta, tres
  carpetas que son los paquetes donde se alojan las clases.
 *Asegurarse de haber descargado la carpeta <target> y el archivo <pom.xml> que es donde se encuentran entre otros las dependencias requeridas para el proyecto.
 *Crear un nuevo proyecto preferiblemente en ApacheNetBeans y luego de crearlo, cambiar las carpetas del proyecto recién creado por las carpetas que se 
  descargaron.
 *Correr el programa desde la clase Prueba, que es donde se encuentra el método de entrada del programa (public static void main).

#Programacion:
*El proyecto consta de tres paquetes:
1. com.concurso.sofkau -> En este paquete se tienen todas las clases de las cuales se van a crear los objetos.
1.1. Clase Respuesta: Esta clase contiene los atributos <respuesta> y <caracter> de tipo String y el atributo Boolean <acierto>; lo anterior para obtener los objetos 
  tipo Respuesta requeridos para cada una de las preguntas. En <respuesta> se almacenan las opciones de respuesta que se le brindan al usuario. En <caracter> se almacena
  las diferentes opciones de eleccion que tiene el usuario (A, B, C o D) y en <acierto> se almacena el valor de verdad de cada opcion que tiene el usuario.
1.2. Clase Pregunta: Como su nombre lo indica, esta clase sirve para crear objetos tipo Pregunta. Contiene el atributo de tipo String <pregunta> para crear cada una de 
  las preguntas que se la van a hacer al usuario. El atributo de tipo ArrayList de nominado <posiblesRespuestas>, en el que se almacenan los objetos tipo Respuesta, ya 
  que cada una de las preguntas debe ir con sus posibles respuestas; así que por relación de agregación, se almacenan en el array las posibles respuestas de cada 
  pregunta. El atributo de tipo int <MAX_POSIBLES_RESPUESTAS> que se establece como constante con un valor de 4, que luego se emplea como condición para que por cada 
  pregunta, se almacen las 4 respuestas que requieren. Finalmente se cuenta con el atributo <contadorDeRespuestas>; Este atributo se emplea en el método 
  agregarRespuesta; la combinación de dicho atributo en este método, permite ir indexando cada una de las respuestas en ArrayList <posiblesRespuestas>.
1.3. Clase Categoria: Esta clase sirve para crear objetos tipo Categoria. Como cada categoría debe tener 5 preguntas, entonces se creó un atributo tipo <ArrayList>
  para almacenar las preguntas de acuerdo a la categoría y que se denomina <posiblesPreguntas>; por lo tanto la relación entre las categorías y las preguntas es de 
  agregación; como las preguntas agregadas tienen almacenadas las respuestas, entonces en al Array de <posiblesPreguntas>, están también los atributos de la clase
  Respuesta. El atributo <MAX_POSIBLE_PREGUNTAS> se emplea para que en el Array <posiblesPreguntas> se almacenen las 5 preguntas de cada categoría. El atributo 
  <contadorPreguntas> se emplea para realizar el conteo de cada una de las preguntas que se van agregando al ArrayList y luego comparar con <MAX_POSIBLE_PREGUNTAS> y 
  así no superar el límite de las preguntas a agregar en el Array. El atributo <idCategoria> sirve para mostrar mostrar al usuario en pantalla la categoría o ronda 
  de preguntas en la que se encuentra. Finalmente se tiene el atributo <contadorCategorias> para que cada vez que se cree un objeto tipo categoría aumente en uno su 
  valor y este valor se le asigne al atributo <idCategoria>.
  El método agregarPregunta se emplea para alamcenar en el ArrayList las preguntas de cada categoría.
  El método mostrarPreguntasPorCategoria funciona para que se muestre de forma aleatoria por medio de la clase Random alguna de las preguntas que corresponden
  a cada categoría.
1.4. Clase Usuario: Se emplea para crear objetos tipo Usuario y como atributos tiene el <nombre> y <puntos> con el fin de tener esta información disponible al
  momento de crear objetos de tipo Usuario.

2.0. Paquete ui -> Este paque contiene a la clase UIMenu.
 2.1. Clase UIMenu: Se emplea para interactuar con el usuario y consta de los siguientes métodos:
 *verMenu: Aquí se le da la bienvenida al usuario, se le explican las condiciones del juego y se le da la opción de empezar o salir. Si el usuario da una opción
  inválida se seguirá preguntando si desea continuar o salir hasta que de una opción válida. Si el usuario da la opción de salir, se finaliza el programa. Si el 
  usuario desea continuar, se envía al método <ingresarUsuario>.
 *ingresarUsuario: Aquí se le pide al usuario que ingrese su nombre, el cual debe contener mínimo 7 letras. Se sigue solicitando la información al usuario hasta
  que ingrese mínimo 7 letras; los espacios no son contados.
 *verificarEleccion: Una vez que el usuario ha ingresado su nombre correctamente, se entra al método continuar, en el cual se le muestran al usuario las preguntas
  con sus posibles respuestas; de allí se invoca el método continuar() el cual retorna un String con la opción de respuesta que el usuario ha seleccionado (A, B,
  C o D) y por medio de un switch case se asigna a una variable el valor entero de 0, 1, 2 ó 3 según el usuario haya respondido a la pregunta con la opción
  (A, B, C ó D) y con este entero se accede al ArrayList que contiene el valor de verdad del atributo <acierto> de la clase Pregunta y así se sabe si el usuario 
  acertó o se equivocó. En caso de que el usuario se haya equivocado, el usuario se queda sin puntos y el programa finaliza. En caso que el usuario haya acertado y
  no se encuentre en la ronda final se van adicionando los puntos y subiendo de categoría. En caso que el usuario llegue a la ronda final se suman todos los puntos,
  el usuario gana y el programa finaliza.
 *continuar: Este método se emplea cada vez que el usuario acierta la pregunta, así que en cada nueva ronda es invocado desde el método verificarElección(). Se le
  solicita al usuario que ingrese la letra de la respuesta que considera correcta (A, B, C ó D) u otra letra para salir. Si el usuario desea retirarse se queda con
  los puntos que logró obtener en las rondas posteriores y se finaliza el programa. Si el usuario quiere seguir, se valida en el método verificarEleccion() si la
  respuesta ha sido correcta.
 *salir: En este método se visualizan los puntos acumulados y se finaliza el juego.
    
3.0. Paquete test: Aquí se aloja la clase prueba.
  3.1. Clase Prueba: Aquí se crearon todos los objetos tipo Respuesta, Pregunta y Categoría. Además se llama al método verMenu para iniciar el programa.
   
#Instrucciones para el usuario.
    1. El juego del Concurso de Preguntas y Respuestas consiste en que hacer preguntas con una opción de respuesta (A, B, C ó D); cada pregunta tiene una única 
       respuesta verdadera. Se cuenta con 5 rondas de preguntas; por cada ronda aumenta el nivel de dificultad de las preguntas. En cada ronda sale una pregunta de
       forma aleatoria. Por cada respuesta acertada se ganan puntos; por una respuesta errada se pierden todos los puntos. Si se retira antes de contestar la pregunta
       el usuario queda con los puntos acumulados de rondas anteriores. En cada ronda acertada se obtienen los puntos acumulados por 10; o sea, 
       ronda 1 = 10 * 1 = 10 puntos, ronda 2 = ronda 1 * 10 = 10 * 10 = 100 puntos; ...; lo que quiere decir que la puntuación máxima es de 10.000 puntos.
       El usuario que responda las 5 preguntas correctamente gana.
    2. El juego inicia cuando el usuario corre el programa desde la clase Prueba. 
    3. Al correr el programa aparece en pantalla una breve explicación del juego. Luego se solicita dar la opción 1 para empezar a jugar o la opción 2 para salir.
    4. Si se da una opción diferente se seguirá preguntando si desea ingresar o salir. Si se da la opción 2, el juego finaliza y no se obtienen puntos. Si se da la
       opción 1, se solicita ingresar el nombre, el cual debe contener al menos 7 letras sin contar los espacios; si se ingresan menos letras se va a seguir solicitando
       ingresar el nombre. Cuando se ingresan al menos 7 letras se informa en pantalla que el usuario está en la categoria 1 y la pregunta de dicha categoría.
    5. Sale el mensaje "Digite la letra de la respuesta que considera correcta (A, B, C, D)", "Digite otra letra si desea retirarse".
    6. Si digita una letra diferente a A, B, C, o D, el programa finaliza y el usuario no obtiene ningún punto.
    7. Si a pesar de haber seleccionado una opción correcta (A, B, C, o D), la respuesta no es la correcta, no se obtiene ningún punto y el programa finaliza.
    8. Si se seleccionó una opción correcta y la respuesta es correcta se ganan los puntos de la categoría y se asciende a la categoría.
    9. Cada vez que se responde de forma acertada, se informa la categoría a la que asciende el usuario al igual que la pregunta de la categía respectiva y se
       repiten los pasos desde la opción 5.
    10. En todo caso, sea que el usuario gane, pierda o se retire, se informa al usuario los puntos que obtuvo y se finaliza el programa.
    
    
    
    
 
