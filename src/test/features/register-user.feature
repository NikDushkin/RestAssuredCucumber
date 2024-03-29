#language: ru
Функция: Регистрация пользователя

  Сценарий: Регистрация пользователя с валидными данными
    * Выполнить POST запрос api.register с валидными данными
    * Статус код ответа 200
    * Проверить тело ответa после регистрации

  Сценарий: Регистрация пользователя с пропущенным паролем
    * Выполнить POST запрос api.register без пароля
    * Статус код ответа 400
    * Проверить ошибку в ответе