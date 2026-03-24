# Proyecto Pokémon

## Descripción del Proyecto

Este proyecto es una aplicación en Java que implementa un sistema de gestión de Pokémon basado en una estructura orientada a objetos. La aplicación permite visualizar información detallada sobre diferentes Pokémon, incluyendo sus estadísticas, tipos, habilidades y ataques.

El proyecto fue desarrollado como parte de la asignatura de Estructuras de Datos en un programa de Desarrollo de Aplicaciones Multiplataforma (DAM).

## Características Principales

- **Gestión de Pokémon**: Sistema para crear y gestionar datos de diferentes Pokémon
- **Interfaz Interactiva**: Menú de consola que permite:
  - Visualizar un Pokémon aleatorio
  - Buscar un Pokémon por su número de Pokédex
  - Listar todos los Pokémon disponibles
- **Modelo de Datos Completo**: Implementación de clases para representar:
  - Estadísticas de combate (HP, Ataque, Defensa, etc.)
  - Tipos de Pokémon
  - Habilidades
  - Ataques
  - Géneros
  - Línea evolutiva

## Estructura del Proyecto

```
pokemon/
├── src/
│   ├── main/java/org/palomafp/pokemon/
│   │   ├── App.java                 # Clase principal con el menú interactivo
│   │   ├── PokemonDAO.java          # Data Access Object para gestionar Pokémon
│   │   └── modelo/
│   │       ├── Pokemon.java         # Clase modelo del Pokémon
│   │       ├── Tipo.java            # Clase para tipos de Pokémon
│   │       ├── Habilidad.java       # Clase para habilidades
│   │       ├── Ataque.java          # Clase para ataques
│   │       ├── Estadisticas.java    # Clase para estadísticas de combate
│   │       ├── Genero.java          # Enumeración de géneros
│   │       └── Efecto.java          # Enumeración de efectos de ataques
│   └── test/java/...                # Clases de prueba
├── doc/
│   ├── README.md                    # Este archivo
│   └── diagramaClases.md            # Diagrama UML del proyecto
└── pom.xml                          # Configuración Maven

```

## Diagrama de Clases

El proyecto utiliza las siguientes relaciones de clases:

- **Pokemon** tiene una relación 1..N con **Tipo** (cada Pokémon puede tener de 1 a 2 tipos)
- **Pokemon** puede evolucionar a otros **Pokemon** (línea evolutiva)
- **Pokemon** tiene una relación 1..3 con **Habilidad**
- **Pokemon** tiene una relación 1..N con **Ataque**
- **Pokemon** tiene una composición 1..1 con **Estadisticas**
- **Ataque** tiene una relación con **Tipo**

Para más detalles, consulta el archivo [diagramaClases.md](diagramaClases.md).

## Tecnologías Utilizadas

- **Lenguaje**: Java 25
- **Gestor de Dependencias**: Maven
- **Framework de Testing**: JUnit Jupiter 5.11.0
- **IDE Recomendada**: Visual Studio Code o IntelliJ IDEA

## Requisitos

- Java 25 o superior
- Maven 3.6.0 o superior

## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone <repositorio-url>
   cd pokemon
   ```

2. **Compilar el proyecto**:
   ```bash
   mvn compile
   ```

3. **Ejecutar las pruebas**:
   ```bash
   mvn test
   ```

## Uso

Para ejecutar la aplicación, usa:

```bash
mvn exec:java -Dexec.mainClass="org.palomafp.pokemon.App"
```

O compila primero y luego ejecuta:

```bash
mvn clean compile
java -cp target/classes org.palomafp.pokemon.App
```

### Menú Principal

Una vez ejecutada la aplicación, se mostrará un menú con las siguientes opciones:

1. **Mostrar Pokémon aleatorio**: Obtiene un Pokémon al azar de la base de datos y muestra toda su información
2. **Mostrar Pokémon por número de Pokédex**: Busca un Pokémon específico por su número identificador
3. **Mostrar todos los Pokémon**: Lista todos los Pokémon disponibles en el sistema
4. **Salir**: Cierra la aplicación

## Clases Principales

### App.java
Clase principal que contiene el método `main()` y gestiona la interfaz interactiva con el usuario mediante un menú en la consola.

### PokemonDAO.java
Implementa el patrón DAO (Data Access Object) para la gestión de datos de Pokémon. Actualmente almacena los datos en memoria (ArrayList).

### Pokemon.java
Clase modelo que representa un Pokémon con atributos como:
- Número de Pokédex
- Nombre
- Estadísticas
- Género
- Tipos
- Habilidades
- Ataques
- Línea evolutiva

### Estadisticas.java
Representa las estadísticas de combate de un Pokémon:
- **HP**: Puntos de vida
- **Atk**: Ataque
- **Def**: Defensa
- **AtkSp**: Ataque especial
- **DefSp**: Defensa especial
- **Spe**: Velocidad

### Tipo.java
Representa los tipos de Pokémon (Fuego, Agua, Planta, Electrico, etc.) con sus propiedades asociadas.

### Habilidad.java
Representa las habilidades especiales que posee un Pokémon.

### Ataque.java
Representa los movimientos de ataque que puede ejecutar un Pokémon.

## Enumeraciones

- **Genero.java**: Define los géneros de un Pokémon (MACHO, HEMBRA, DESCONOCIDO)
- **Efecto.java**: Define los posibles efectos de los ataques

## Ejemplos de Pokémon Incluidos

El proyecto incluye ejemplos precargados de Pokémon como:
- **Shuckle** (Nº 213)
- **Voltorb** (Nº 100)
- **Rhydon** (Nº 112)

## Posibles Mejoras Futuras

- Implementar persistencia en base de datos (SQL)
- Agregar más Pokémon a la base de datos
- Implementar sistema de combate
- Crear interfaz gráfica (GUI)
- Agregar API REST para acceso remoto
- Mejorar validación de datos entrada del usuario

## Autor

Desarrollado como proyecto educativo para la asignatura de Estructuras de Datos.

## Licencia

Este proyecto es de uso educativo.

---

**Última actualización**: Marzo 2026
