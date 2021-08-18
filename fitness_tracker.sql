
create table user(
user_id int primary key auto_increment,
appointment_id int,
user_name varchar(30) not null,
email varchar(50) not null,
mobile_number int not null,
password varchar(300) not null
);

create table appointment(
appointment_id int primary key auto_increment,
user_id int,
name_of_person varchar(50) not null,
address varchar(100) not null,
email varchar(50) not null,
trainee_preference varchar(10) not null,
physiotherapisy boolean not null,
package int not null,
no_of_weeks int not null,
amount double as (package*no_of_weeks),
foreign key (user_id) references user(user_id)
);

alter table user 
add foreign key (appointment_id) references appointment(appointment_id); 

alter table user 
drop mobile_number ;

alter table user 
add mobile_number long;


insert into appointment(name_of_person,address,email,trainee_preference,
physiotherapisy,package,no_of_weeks) values 
('hus','hbd','huh@gmail.com','male',false,500,4);

select * from appointment