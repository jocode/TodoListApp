## CRUD Todo List App - Full MVVM Beginner Guide

In this guide, I make a summary about the MVVM and differents layers in the project to have an skeleton to any project that you can build.

## What is MVVM?

- **UI**: This display all information and look and feel to the user.
- **Bussiness logic** This is the pure application logic, everything that you app need it to make a funcional work.
- **Data** In this application we managed the data sources to storage the information, in local database or in an API


## Definitions

- `Entity` Is the class or the table that contains the data that you want to save.
- `Dao` Data Access Object is the way that we interact with the data in ROOM.
- `suspend` It's a keyword from cororutines in kotlin, that allow suspend, stop the current function until get the result. Las funciones de suspensión tienen la capacidad de bloquear la ejecución de la corrutina mientras están haciendo su trabajo. Las funciones de suspensión solo pueden ejecutarse dentro de una corrutina o dentro de otra función de suspensión.
- `Dependency Injection`: Giving an object as instance variables

## Coroutines (Corrutinas)

Las **corrutinas** son como hilos, pero mejores. Te permiten escribir tu código asícrono de forma secuencial. Además, son mucho más eficientes. Varias corrutinas se pueden ejecutar utilizando el mismo hilo.

Las corrutinas se basan en la idea de las funciones de suspensión. Estas son funciones que pueden detener la ejecución de una corrutina en cualquier punto y luego devolverle el control una vez que el resultado esté listo y la función haya terminado de hacer su trabajo.

Por lo tanto, las corrutinas son básicamente un lugar seguro donde las funciones de suspensión (normalmente) no bloquean el hilo principal.
