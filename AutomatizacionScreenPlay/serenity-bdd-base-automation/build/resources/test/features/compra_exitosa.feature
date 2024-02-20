# author: Sebastian Londono
# date: 19/02/2024
# language: es

Característica:  Como Analista de calidad quiero automatizar una prueba E2E de un flujo de compra en la página https://www.saucedemo.com/


  Escenario: Realizar una compra exitosa E2E

    Dado  pepito navega en la pagina saucedemo e ingresa con sus credenciales correctamente
    Cuando se realiza el proceso de una compra exitosa
    Entonces deberia ver el mensaje THANK YOU FOR YOUR ORDER