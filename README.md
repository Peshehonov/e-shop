# Проект 

### интернет-магазин MstMarket

![android-chrome-256x256.png](front-service%2Fsrc%2Fmain%2Fresources%2Fstatic%2Fandroid-chrome-256x256.png)

# Цель

Расширить возможности существующего проекта интернет-магазина новым функционалом  в зависимости от предпочтений заказчика на основе job-story и user-story. Интернет-магазин должен быть доступен в браузере через интернет.

Интернет-магазин предоставляет любому посетителю следующие возможности.
- Просматривать каталог товаров с возможностью фильтрации товаров по цене, названию и категории.
- Просматривать карточки товаров с подробным их описанием и изображением.
- Просматривать отзывы о товарах и среднюю оценку покупателей по каждому товару.
- Регистрироваться в качестве нового покупателя, если посетитель не вошёл в магазин.
- Входить в магазин в случае наличия личного кабинета.
- Пользоваться корзиной.
- Помещать товары в Избранное и удалять их оттуда.
- Выходить из магазина ранее вошедшему в магазин посетителю.

Интернет-магазин предоставляет менеджерам следующие возможности:
- Редактировать состав товаров и их свойства:
  - Редактировать карточку товара с подробным описанием его потребительских свойств.
  - Удалять товар из каталога.
  - Создавать новые карточки товаров с подробным описанием их потребительских свойств.
- Делать email-рассылки о возврате товаров в продажу после временного их отсутствия.
- Загружать и удалять изображения товаров.

Интернет-магазин предоставляет администраторам следующие возможности:
- Просматривать список пользователей магазина.
- Блокировать, разблокировать доступ конкретным пользователям к магазину.
- Удалять отзывы покупателей о товарах.

Интернет-магазин предоставляет супер админу следующие возможности:
- Назначать роли пользователям из следующего списка:
    - администратор,
    - менеджер.

Интернет-магазин предоставляет покупателям следующие возможности:
- Пользоваться личным кабинетом.
  - Просматривать и редактировать свои персональные данные:
    - Ф.И.О.,
    - адрес электронной почты. 
  - Изменять пароль.
  - Просматривать
    - своё имя пользователя (ник),
    - кем владелец личного кабинета является в магазине.
  - Загружать и просматривать свой аватар.
- Оставлять и редактировать свои отзывы.
- Создавать, просматривать и удалять свои заказы.
- Подписываться на уведомления о поступлении временно отсутствующих товаров в продажу.

Пользователь интернет-магазина может быть менеджером, администратором и покупателем одновременно. Супер админ обладает всеми правами менеджера, администратора и покупателя. Супер админ не может быть заблокирован.

----

### Пользовательские роли
- Покупатель,
- Менеджер,
- Администратор,
- Супер админ,
- Гость

Покупатель просматривает товары из каталога, добавляет их в корзину, оформляет и просматривает свои заказы, может подписаться на email-рассылку о возврате временно отсутствующего товара в продажу. Это зарегистрированный пользователь, прошедший процедуру аутентификации.
Менеджер добавляет новые товары, редактирует, удаляет из каталога существующие и делает рассылку о возврате товаров в продажу, подписавшимся на это пользователям.
Администратор занимается модерацией отзывов покупателей о товарах, блокирует пользователей, нарушающих правила интернет-магазина.
Супер админ назначает менеджеров и администраторов, чтобы они управляли магазином.
Гость просматривает товары из каталога, добавляет их в корзину, но не имеет возможности оформить заказ, потому что не зарегистрирован или не прошёл процедуру аутентификации.

----

# Технологии
В проекте используются следующие технологии:
* AngularJS
* Redis
* Lombok
* Java 17
* Spring Boot
* Spring Cloud Gateway
* Spring Web Service
* Spring WebFlux
* Spring Security
* Spring Data MongoDB
* Spring Data Redis
* Spring Data JPA
* JUnit
* Flyway Migration
* MongoDB
* Docker
* PostgreSQL
* Swagger
* Maven
* Java Mail Api

----

# Запуск приложения
* ### Запуск интернет-магазина в командной строке.

1. git clone https://github.com/DVPeshe/Scrum.git
2. cd Scrum
3. mvn clean install
4. docker-compose up -d
5. Открыть в браузере http://localhost:3000/market-front

* ### Запуск интернет-магазина в IntelliJ IDEA.

1. git clone https://github.com/DVPeshe/Scrum.git
2. Войти в проект с помощью IntelliJ IDEA.
3. Выполнить команды maven clean install в IntelliJ IDEA.
4. В IntelliJ IDEA в файле docker-compose.yml запустить postgres, redis, mongo и flyway.
5. В IntelliJ IDEA во вкладке Services установить для каждого микросервиса профиль dev.
6. Запустить все микросервисы из вкладки Services в IntelliJ IDEA.
7. Открыть в браузере http://localhost:3000/market-front

----

# Основные возможности проекта

* ### Регистрация
[Любой посетитель интернет-магазина, у которого нет личного кабинета, может зарегистрироваться, чтобы стать покупателем.](https://disk.yandex.ru/i/YnwG3oo4tG481A)
![регистрация](images/forREADME/registration.png)
* ### Личный кабинет
[Пользователь, вошедший в интернет-магазин, может просматривать и редактировать свои персональные данные.](https://disk.yandex.ru/i/hetb_c_pZU4KOA)
![личный кабинет](images/forREADME/personal-account.png)
* ### Уведомление подписавшихся пользователей о событиях интернет-магазина по электронной почте

Возможность подписки на событие появления товара в продаже после временного его отсутствия. 
После появления товара в продаже происходит массовая рассылка на электронную почту подписавшимся на это событие.
Подписаться может любой зарегистрированный пользователь интернет-магазина.

![подписка на рассылку](https://user-images.githubusercontent.com/75074559/234510398-d67f9172-344b-4f5e-8fcd-07014cd7bea5.png)
![подписка на рассылку 2](https://user-images.githubusercontent.com/75074559/234510454-5cc3806e-f107-4579-b452-63a68148fec1.png)

Инициирует рассылку менеджер в разделе редактирование продуктов.

![оповещение о поступлении](https://user-images.githubusercontent.com/75074559/234510742-9287bb3c-9f15-4908-bf5e-4dced523729c.png)
![инициирование рассылки](https://user-images.githubusercontent.com/75074559/234510773-fa03ac58-c4c0-40e5-8ca9-2c0709d736c3.png)

Подписавшийся пользователь получает электронное письмо с уведомлением о возврате товара в продажу на указанный им электронный адрес.

![получение электронного письма](https://user-images.githubusercontent.com/75074559/234512163-88ebe795-2f43-4b0b-bccc-c78a9508b7a7.png)

* ### Избранное

На странице каталога любой ползователь может добавить понравившийся товар в избранное

![каталог избранное](https://raw.githubusercontent.com/StrayAbandoned/readme-image/main/.github/images/favorite1.png)

На вкладке избранное пользователь может управлять своими товарами, находящимися в избранном: может добавлять их в корзину или удалить из избранного

![избранное](https://raw.githubusercontent.com/StrayAbandoned/readme-image/main/.github/images/favorite2.png)

* ### Отзывы

Любой авторизованный пользователь может оставлять отзывы к товарам на странице карточки товара. Также любой пользователь может просматривать отзывы и видеть среднюю оценку товара, рассчитаную на основании оценок пользователей

![отзывы](https://raw.githubusercontent.com/StrayAbandoned/readme-image/main/.github/images/comment1.png)

Пользователь с правами администратора может осуществоять модерацию отзывов и удалять те отзывы, которые содержат ненорматвную лексику или не соответствуют политике сайта

![удаление отзывов](https://raw.githubusercontent.com/StrayAbandoned/readme-image/main/.github/images/comment2.png)

* ### Изображения продуктов
Любой посетитель интернет-магазина видит у товара его изображение.

![карточка товара для покупателя или гостя](images/forREADME/img-work-1.png)

У администрирующих пользователей есть возможность загружать и удалять изображения товаров.

![карточка товара для администрирующего персонала](images/forREADME/img-work-2.png)

Загрузка изображения.

![карточка товара для администрирующего персонала](images/forREADME/img-work-3.png)

Удаление изображения.

![карточка товара для администрирующего персонала](images/forREADME/img-work-4.png)

* ### Управление пользователями
Пользователь с правами генерального директора может управлять ролями пользователя, с правами администратора - 
осуществять бан пользователей.

![панель управления пользователями](images/forREADME/users-panel.png)

При нажатии на "Назначить права пользователю" открывается меню с управлением доступом, где можно назначить
все роли кроме генерального директора. Роль покупателя назначается автоматически при регистрации и удаляется
при бане, но вручную забрать и дать ее нельзя.

![панель управления доступом](images/forREADME/access-panel.png)

* ### Управление продуктами
Пользователь с правами менеджера может осуществлять редактирование продуктов, создавать новые,
выставлять и скрывать их из магазина, а также оповещать пользователей, как описано выше.

![панель управления продуктами](images/forREADME/products-panel.png)

При нажатии на "Редактировать" появляется панель для редактирования продуктов, где можно изменить параметры
продукта.

![обновление продукта](images/forREADME/product-update.png)

При нажатии на "Создать новый продукт" появляется панель для создания новых продуктов.

![создание продукта](images/forREADME/product-create.png)

* ### Корзина
Любой пользователь может добавить понравившийся продукт в корзину

![каталог продуктов](images/forREADME/catalog.png)

Перейдя во вкладку "Корзина" можно регулирвоать количество и состав продуктов, а зарегистрировавшись
можно оформить заказ. При регистрации продукты из гостевой корзины автоматически переходят в корзину
авторизованного пользователя. Количество продуктов, которое можно внести в корзину, зависит от количества
доступных продуктов на складе.

![корзина](images/forREADME/cart.png)

* ### Мои заказы
Перейдя во вкладку "Мои заказы" можно увидеть все заказы учетной записи, сделанные ранее.

![заказы](images/forREADME/orders.png)










