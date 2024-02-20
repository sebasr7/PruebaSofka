

<div align="left">
<h1>Automatizacion flujo de compra exitosa en Swag Labs </h1>
</div>

## Objetivo de la Prueba

Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página
https://www.saucedemo.com/



## Información General 🔬

| N°  | Item              |        Detalle |
|:---:|:------------------|---------------:|
|  1  | Java              |        11.0.15 |
|  2  | Gradle            |            7.4 |
|  3  | Navegador         |  Microsoft Edge |
|  4  | Sistema Operativo | Windows 10 Pro |
|  5  | Rama principal    |         main |

## Pre requisitos para ejecutar 📋

- Java: versión 1.8 o superior (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Gradle versión 7.0 o superior (variables de entorno configuradas).
- Plugin de Cucumber para Java
- Gherkin Plugin

## Ejecutar pruebas 🔨

La herramienta de compilación de código y administrador de dependencias para este proyecto es **Gradle**, así que pare
ejecutar las pruebas use el siguiente comando en la raíz del proyecto.

``` shell 
gradle clean test aggregate -i
```

Si desea ejecutar algún Runner especifico puede usar el siguiente comando, para nuestra prueba seria así.

``` shell 
gradle clean test --tests "CompraExitosaRunner"
```

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

El comando proporcionado anteriormente para la ejecución de las pruebas, generará un informe de prueba de Serenity **index.html**
en el directorio **target/site/serenity**. Adicionalmente, puede encontrar evidencias generadas por Cucumber en la ruta **target/serenity-reports**, 
los archivos generados son:

- **rerun.txt**: Archivo de texto con la información de la línea donde falló el caso para su revisión.
- **serenity-html-report.html**: Reporte generado con el resultado de cada uno de los pasos del feature incluido en las
  pruebas.
- **serenity-summary.html**: Este reporte es un resumen gerencial sobre los resultados de la ejecución, si desea
  obtenerlo ejecute el siguiente comando después de la ejecución de las pruebas:
  ``` gradle reports```

## Construido con 🛠

La automatización fue desarrollada con:

- BDD - Estrategia de desarrollo de pruebas
- Screenplay - Patrón de diseño de pruebas
- Gradle - Administrador de dependencias del proyecto
- Selenium Web Driver - Herramienta para interaccionar con navegadores web
- Cucumber - Software que apoya el BDD
- Serenity BDD - Librería de código abierto para escribir pruebas de aceptación automatizadas
- Gherkin - Lenguaje DSL de lectura empresarial (lenguaje específico de dominio)

## Versionamiento 

Se usa Git para el control de versiones. 





## Copyright

Publicado bajo la Licencia MIT, ver el archivo [LICENSE](https://github.com/DiegoPinzon20/serenity-bdd-base-automation/blob/master/LICENSE).
