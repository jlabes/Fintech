INSERT INTO USERS (ID, NAME, LAST_NAME, USER_CODE, BIRTHDAY, GENDER, EMAIL, PASSWORD) VALUES (1, 'Johnny', 'Labes', '553774', '1998-08-01', 'M', 'johnylabes@gmail.com', '123');

INSERT INTO INCOME (USER_ID, DESCRIPTION, DATE_INCOME, VALUE_INCOME) VALUES (1, 'Mercado', current_timestamp, 255.5);

INSERT INTO INCOME (USER_ID, DESCRIPTION, DATE_INCOME, VALUE_INCOME) VALUES (1, 'Gym', current_timestamp, 199.99);