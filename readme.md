### Демонстрация использования Spring Security в частности аутентификации и авторизации

Взято осюда:
<ul>
<li><a href="https://sysout.ru/dobavlenie-spring-security-v-proekt-nastrojki-po-umolchaniyu/">https://sysout.ru/dobavlenie-spring-security-v-proekt-nastrojki-po-umolchaniyu/</a></li> 
<li><a href="https://sysout.ru/kak-nastroit-avtorizatsiyu-v-spring-security/">https://sysout.ru/kak-nastroit-avtorizatsiyu-v-spring-security/</a> </li> 
</ul>
<b>Дано:</b> три эндпоинта GET /, GET /user, GET /admin </br>
<b>Задача:</b> предоставить доступ для первого всем пользователям, 
второму только зарегистрированным пользователям с правом ROLE_USER и ROLE_ADMIN,
третьему только пользователям с правом ROLE_ADMIN.
Коротко: добавление стартера:</br>
spring-boot-starter-security</br>
приводит к тому что все эндпоинты закрываются дефолтной формой авторизации.
Далее в классе SecurityConfig настраивается авторизация
(какие эндпоинты доступны каким ролям) и аутентификация(логин и пароль для ролей - используется In-memory аутентификация, 
т.е. логины и пароли хранятся в оперативной памяти)

