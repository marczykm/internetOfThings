create table room (id bigint not null, name varchar(255) not null);
create table device (id bigint not null, name varchar(255) not null, room_id bigint);
--create table room_devices (room_id bigint not null, devices_id bigint not null);