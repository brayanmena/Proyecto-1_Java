# Parameta-S.A.S
Implementar en Java un servicio Rest que reciba como parámetros los atributos del objeto empleado (que será descrito más adelante) al ser invocado mediante el método POST. El servicio deberá validar los formatos de las fechas y que los atributos no vengan vacíos, adicionalmente deberá validar que el empleado sea mayor de edad. Una vez se hayan superado estas validaciones se deberá almacenar la información en una base de datos mysql. El Servicio Web responderá con el objeto en estructura JSON, en el que se deberá adicionar la siguiente información: ● Tiempo de Vinculación a la compañía (años, meses ● Edad actual del empleado (años, meses y días)




TECNOLOGÍA Y PATRONES DE DISEÑO EMPLEADO.

.Patron de diseño -> Inyección de dependencia.


.Rest con el framework -> springbook


.Repositorios de git

.MySQL 

.POSTMAN

PLAN DE TRABAJO : El repositorio se realizó en 1 días y para ello se propuso dividir el proyecto en una serie de etapas que se detallarán a continuación :

ETAPA 1 : Plantear la lógica inicial de los problemas.

ETAPA 2 : Creacion de bases de datos .

ETAPA 3 : Plasmar la lógica en código(Api Rest) .

ETAPA 3 : Consumir Api Rest (CLIENTE)

ETAPA 4 : Versión final README.

ARCHIVOS IMPORTANTES El proyecto presenta los siguientes archivos para uso del usuario: README.md con descripción del repositorio, imagenes del mismo y organización.

NOMBRE DE BASES DE DATOS: empresa

CREATE TABLE `empleado` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_bin NOT NULL,
  `apellido` varchar(50) COLLATE utf8_bin NOT NULL,
  `tipo_de_documento` varchar(50) COLLATE utf8_bin NOT NULL,
  `numero_de_documento` varchar(50) COLLATE utf8_bin NOT NULL,
  `fecha_vencimiento` date NOT NULL,
  `fecha_de_vinculacion` date NOT NULL,
  `cargo` varchar(50) COLLATE utf8_bin NOT NULL,
  `salario` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


VALIDACIÓN 
![prueba  1](https://user-images.githubusercontent.com/89054795/150527585-5ddc98e8-d7c1-41ac-8e35-7b4bfc2f4b3b.png)

REGISTRO EN BASES DE DATOS

![prueba 3](https://user-images.githubusercontent.com/89054795/150527733-f28d5e82-165a-4e03-9d5b-2142e3c62c4b.png)

CALCULO DE EDAD Y VINCULACION
![prueba4](https://user-images.githubusercontent.com/89054795/150527948-fa3b01cd-3ee9-47c9-8bb6-6f01ee54c0bf.png)

