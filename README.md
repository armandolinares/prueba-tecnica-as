# prueba-tecnica-as
Prueba tecnica para https://afirma.solutions/

# Instrucciones claras sobre cómo compilar y ejecutar la aplicación:
- Version del JDK: 17
- Version de Maven: 3.9.1

## Descarga y configuracion del proyecto:

1. Descarga el proyecto de tu aplicación desde el repositorio o por el .ZIP adjunto
2. Abre una terminal y navega hasta el directorio raíz del proyecto
3. Compilación del proyecto:
	3.1 Ejecuta el siguiente comando para compilar el proyecto: mvn clean install
	
![image](https://github.com/armandolinares/prueba-tecnica-as/assets/105806910/51003c07-20e6-4d30-a110-354488b0d3f9)

## Ejecución de la aplicación:

4. Después de que la compilación sea exitosa, puedes ejecutar la aplicación con el siguiente comando: mvn spring-boot:run
5. Esto iniciará la aplicación Spring Boot y la ejecutará Tomcat (Puerto 8080)
6. Verás mensajes en la consola que indican que la aplicación se está iniciando

![image](https://github.com/armandolinares/prueba-tecnica-as/assets/105806910/3b8f4609-a2d2-4b89-92fe-8b55255c5d41)

## Acceso a la aplicación:

7. Una vez que la aplicación se haya iniciado correctamente, podrás acceder a ella a través de un navegador web o una herramienta de prueba de API

> Por defecto, la aplicación se ejecutará en http://localhost:8080

9. Abre tu navegador y visita esa URL para acceder a la aplicación, solo que para poder sacarle el mayor provecho tendremos que usar Postman o cualquier plataforma que nos ayude a testear API's


# Ejecucucion:

1. Obtener todos los usuarios

![image](https://github.com/armandolinares/prueba-tecnica-as/assets/105806910/25aa5e26-3f65-4abb-bd6a-f8c3e8238820)

2. Obtener un usuario espeficico

![image](https://github.com/armandolinares/prueba-tecnica-as/assets/105806910/255910bb-c96d-45d8-8883-2251287ffab5)

3. Crear un nuevo usuario

![image](https://github.com/armandolinares/prueba-tecnica-as/assets/105806910/bae3f1e6-b215-4bff-927b-8654878167cd)

4. Modificar un usuario existente

![image](https://github.com/armandolinares/prueba-tecnica-as/assets/105806910/7606ddcd-bb37-40c1-a739-9f87b50f3dea)

5. Borrar un usuario

![image](https://github.com/armandolinares/prueba-tecnica-as/assets/105806910/97f01afa-fb1f-4435-9150-e2d47bc460eb)

# Preguntas:
1) ¿Qué estrategia utilizaría para manejar errores en la capa de controladores
REST?

* R: Utilizar repsuestas HTTP adecuadas para cada error especifico, asi como implementar el uso de exepciones globales

2) ¿Cómo garantizaría la seguridad de la aplicación y sus datos?

* R: Es uno de los aspectos mas importantes en una aplicacion, por lo que el uso de la autenticacion nos es muy util para validar la identidad

3) ¿Qué es un endpoint de salud y cómo lo implementaría en este
microservicio?

* R: Es utilizado para verificar el estado y disponibilidad de la aplicaicon, en este caso podriamos implementar Actuator 
