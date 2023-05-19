insert into user_table (first_name, last_name, email) values ('Denis', 'Ivanov', 'ivanov@mail.com');
insert into user_table (first_name, last_name, email) values ('Ivan', 'Petrov', 'petrov@mail.com');
insert into user_table (first_name, last_name, email) values ('Olga', 'Ivanova', 'ivanova@mail.com');
insert into user_table (first_name, last_name, email) values ('Katya', 'Sidorova', 'sidorova@mail.com');
insert into user_table (first_name, last_name, email) values ('Yulia', 'Shumova', 'shumova@mail.com');

insert into task (text, user_id, date) values ('test-test0-test', '1', '2020-10-01');
insert into task (text, user_id, date) values ('test-test1-test', '2', '2020-10-01');
insert into task (text, user_id, date) values ('test-test2-test', '4', '2020-10-01');
insert into task (text, user_id, date) values ('test-test3-test', '3', '2020-10-01');
insert into task (text, user_id, date) values ('test-test4-test', '5', '2020-10-01');

insert into role (role) values ('admin');
insert into role (role) values ('user');

insert into user_role (user_id, role_id) values ('1', '1');
insert into user_role (user_id, role_id) values ('2', '2');
insert into user_role (user_id, role_id) values ('3', '1');
insert into user_role (user_id, role_id) values ('4', '1');
insert into user_role (user_id, role_id) values ('5', '2');
insert into user_role (user_id, role_id) values ('5', '1');








