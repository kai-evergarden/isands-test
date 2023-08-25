# Тестовое задание от компании "Информационные системы и сервисы" на вакансию Java разработчик

## Цель задания
Цель задания заключается в разработке приложения - реестра фермеров с использованием CMS Liferay версии 6.2. Приложение должно иметь следующие функциональности:

### Реестр районов
- Основные атрибуты районов:
  - Название (обязательное поле)
  - Код района
  - Статус архивности (да/нет)
- Цель реестра:
  - Добавление новых записей
  - Вывод общей информации по району в виде таблицы
  - Выбор доступных действий по каждой записи:
    - Добавление района
    - Изменение записи района
    - Отправить в архив (архивные записи не выводятся в реестр)

### Реестр фермеров
- Основные атрибуты фермеров:
  - Название организации (обязательное поле, с возможностью фильтрации)
  - Организационно-правовая форма (ЮР, ИП, ФЛ)
  - ИНН (обязательное поле, с возможностью фильтрации)
  - КПП
  - ОГРН
  - Район регистрации (связь с районом, с возможностью фильтрации)
  - Районы посевных полей (множественный выбор, связь с районом)
  - Дата регистрации (с возможностью фильтрации)
  - Статус архивности (да/нет) (с возможностью фильтрации)
- Цель реестра:
  - Добавление записи фермера
  - Вывод общей информации о фермере в виде таблицы
  - Выбор доступных действий по каждой записи:
    - Добавление фермера
    - Изменение записи фермера
    - Отправить запись в архив/восстановить из архива

## Модули и директории
- service-builder: модуль Liferay типа service-builder. Содержит модели, сервисы и другие файлы и классы, необходимые для взаимодействия с базой данных.
- fermers: модуль Liferay типа mvc-portlet, отвечающий за отображение и взаимодействие с реестром фермеров.
- districts: модуль Liferay типа mvc-portlet, отвечающий за отображение и взаимодействие с реестром районов.
- language-property-hook: содержит слова для замены ключевых слов.

## Инструкция
### Реестр районов
- Для добавления района, нажмите кнопку "Add District" и введите все необходимые данные. Затем нажмите кнопку "Save".
- Для удаления, изменения или архивирования/разархивирования районов, нажмите на кнопку "Actions" на вкладке "Manage".
- Чтобы отобразить архивные районы, установите флажок "Show Archive" и затем нажмите кнопку "Apply Filters".

### Реестр фермеров
- Для добавления фермера, нажмите кнопку "Add Organization" и введите все необходимые данные. Затем нажмите кнопку "Save".
- Для удаления, изменения или архивирования/разархивирования фермеров, нажмите на кнопку "Actions" на вкладке "Manage".
- Чтобы применить фильтрацию, нажмите кнопку "Фильтр" и заполните необходимые поля.
- Чтобы сбросить фильтрацию, оставьте поля пустыми и нажмите кнопку "Allow Filters".




