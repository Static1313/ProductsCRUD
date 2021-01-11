# ProductsCRUD
Каталог продуктов

CRUD-приложение в виде каталога продуктов. Написано на Java с использованием Spring Framework и Tomcat.
Сборка - Maven.
Шаблонизатор - Thymeleaf.
Валидация форм с использованием Hibernate Validator.
Взаимодействие с базой данных - Spring JdbcTemplate.

Таблица Product состоит из 4 колон: 
'id' serial, - идентификатор в базе данных
'title' varchar, - Название продукта
'description' varchar, - Описание продукта
'price' numeric(10,2) - цена

Использованная база данных - PostgreSQL 10.

Для подключения другой БД необходимо изменить аргументы соединения в файле свойств "resources/db.properties".
