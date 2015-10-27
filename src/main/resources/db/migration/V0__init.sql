create table room (id bigint not null, name varchar(255) not null);
create table device (id bigint not null, name varchar(255) not null, type varchar(255) not null, room_id bigint);