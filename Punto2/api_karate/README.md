

<div align="left">
<h1>Automatizacion de prueba para servicios REST  </h1>
</div>



## Objetivo de la Prueba

- Manejar correctamente Karate.
- Planeacion y Ejecuccion Exitosa de los escenarios.
- Generar informe "karate-report"
- Genera los features optimizados y utilización de variables
- Generar scenarios con consumo de json




## Información General 🔬

| N°  | Item              |        Detalle |
|:---:|:------------------|---------------:|
|  1  | Java              |        11.0.15 |
|  2  | Gradle            |            7.4 |
|  3  | Karate            |  1.2.0 RC4     |
|  4  | Sistema Operativo | Windows 10 Pro |
|  5  | Rama principal    |         main   |

## Pre requisitos para ejecutar 📋

- Java: versión 1.8 o superior (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Gradle versión 7.0 o superior (variables de entorno configuradas).
- Plugin karate 1.2.0 
- Gherkin Plugin

## Ejecutar pruebas 🔨

Una vez se descargue el repositorio en la ruta src/test/java se encuentran las carpetas
create.user
login.user
donde hay un archivo tipo .feature allí cada uno tiene dos escenarios que para ejecutar es pararse en el escenario a ejecutar, click derecho run#nombredelEscenario.



## Obtener el código

El código de la automatización está alojado en un repositorio de GitHub, para hacer uso de él puede clonarlo usando Git
o descargar el archivo zip del proyecto.

Git:

``` shell 
 git clone https://github.com/sebasr7/Sofka2.git
 cd serenity-bdd-base-automation
```

O
simplemente [descargar archivo zip]()
.

## Ver los informes 

Una vez se realice la ejecución de las pruebas, se generará un informe de prueba de Karate 
en el directorio **target\karate-reports**.



## Construido con 🛠

La automatización fue desarrollada con:

- BDD - Estrategia de desarrollo de pruebas
- Karate herramienta abierta de automatizacion de pruebas
- Gradle - Administrador de dependencias del proyecto
- Cucumber - Software que apoya el BDD
- Gherkin - Lenguaje DSL de lectura empresarial (lenguaje específico de dominio)

## Versionamiento 

Se usa Git para el control de versiones. 





