# SalasFICA

Proyecto desarrollado en Java para consultar y orientar la ubicación de salas y espacios importantes dentro de la Facultad de Ingeniería y Ciencias de la Universidad de La Frontera.

## Requisitos

- IntelliJ IDEA
- JDK 17 o superior recomendado
- Git

Para verificar la versión de Java instalada, se puede ejecutar:

    java -version

## Cómo ejecutar el proyecto en IntelliJ IDEA

1. Clonar el repositorio:

    git clone https://github.com/jmanquel02-ai/SalasFica.git

2. Abrir IntelliJ IDEA.

3. Seleccionar la opción `Open`.

4. Buscar y abrir la carpeta raíz del proyecto:

    SalasFica

5. Verificar que la carpeta `src/main/java` esté marcada como `Sources Root`.

   Si no lo está:

    Click derecho en src/main/java > Mark Directory as > Sources Root

6. Abrir la clase principal ubicada en:

    src/main/java/Launcher/Main.java

7. Ejecutar el programa desde IntelliJ IDEA haciendo clic derecho sobre `Main.java` y seleccionando:

    Run 'Main.main()'

La clase principal del proyecto es:

    Launcher.Main

## Punto de inicio del programa

El programa inicia desde la clase `Main`, ubicada en el paquete `Launcher`.

Desde esta clase se inicializa el controlador principal y comienza la ejecución del sistema mediante:

    mapaController.iniciar();

## Estructura del proyecto

El proyecto está organizado en paquetes para separar responsabilidades:

    src/main/java
    │
    ├── Controlador
    ├── Datos
    ├── Launcher
    ├── Modelo
    └── Vista

## Posibles errores y soluciones en IntelliJ IDEA

### No aparece el botón verde para ejecutar

Verificar que `src/main/java` esté marcado como `Sources Root`.

    Click derecho en src/main/java > Mark Directory as > Sources Root

### Error: SDK no configurado

Configurar el JDK en IntelliJ IDEA:

    File > Project Structure > Project > SDK

Seleccionar Java 17 o superior.

### Error: no se encuentra la clase Main

Verificar que se esté ejecutando la clase correcta:

    Launcher.Main

El archivo principal debe estar ubicado en:

    src/main/java/Launcher/Main.java

### Error al abrir el proyecto

No se debe abrir directamente la carpeta `src`, sino la carpeta raíz del proyecto:

    SalasFica

## Estado del proyecto

El proyecto se encuentra en una versión funcional inicial, ejecutable desde IntelliJ IDEA mediante la clase `Launcher.Main`.

Actualmente, el sistema funciona por consola y organiza el código en paquetes separados según su responsabilidad.

## Integrantes

- Jonathan Manquel
- Bastián Escobar
- Vicente Flores
