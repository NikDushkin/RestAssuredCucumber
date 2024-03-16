#language: ru
Функция: Вход пользователя

  Сценарий: Вход пользователя с валидными данными
  * Выполнить POST запрос api.login с валидными данными
  * Статус код ответа 200
  * Проверить тело ответа после входа с валидными данными

  Сценарий: Вход пользователя с пропущенным паролем
  * Выполнить POST запрос api.login без пароля
  * Статус код ответа 400
  * Проверить ошибку в ответе