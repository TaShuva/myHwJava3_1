# Домашнее задание к занятию «Testability. Введение в ООП»

## Цель задания

1. Написать свои сервисные классы.

## Инструкция к заданию

1. Скачайте и установите профессиональный редактор кода [Intellij Idea Community Version](https://www.jetbrains.com/idea/download/).
1. Откройте IDEA и [создайте новый Java-проект](QA_Java_Idea_Create.md). Под каждую задачу следует создавать отдельный проект, если обратное не сказано в условии.
2. Создайте пустой репозиторий на GitHub и свяжите его с папкой вашего проекта, а не с какой-либо другой.
3. Правильно настройте репозиторий в плане `.gitignore`. Проигнорируйте папки `.idea` и `out` и `.iml`-файл — их в репозитории быть не должно.
4. Выполните в IDEA требуемую задачу согласно условию.
5. Проверьте соблюдение [правил форматирования кода](QA_Java_Idea_Format.md).
6.Закоммитьте и отправьте в репозиторий содержимое папки проекта.

------

## Задание 1 — обязательное

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы уже научились создавать классы и методы. Поэтому вам необходимо модернизировать [приложение для расчёта миль](./HW_PRIMITIVES.md). Напомним, мили начисляются как 1 миля за каждые 20 рублей в стоимости билета, дробные мили не допускаются.

Теперь сама логика расчёта будет находиться в специально выделенном классе сервиса, а в `Main` мы будем лишь создавать объект этого сервиса и вызывать его метод, передавая аргументами все необходимые данные для расчёта. Получив от вызова метода рассчитанный результат, мы выведем его на экран.

Создайте класс `BonusMilesService`: `File -> New -> Java Class`, вводите название и нажимаете `Enter`.

Определите в нём метод `calculate`, который:
* принимает на вход один параметр: цену билета, типа `int`;
* анализируя значение переданного параметра, возвращает рассчитанное количество миль.