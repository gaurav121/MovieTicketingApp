

INSERT INTO USER (userid,active,password,username) VALUES (1,'1', '$2a$12$qB.L7buUPi2RJHZ9fYceQ.XdyEFxjAmiekH9AEkJvh1gLFPGEf9mW', 'Gaurav'); 
INSERT INTO USER (userid,active,password,username) VALUES (2,'1', '$2a$12$qB.L7buUPi2RJHZ9fYceQ.XdyEFxjAmiekH9AEkJvh1gLFPGEf9mW','admin',); 
INSERT INTO USER (userid,active,password,username) VALUES (3,'1', '$2a$12$qB.L7buUPi2RJHZ9fYceQ.XdyEFxjAmiekH9AEkJvh1gLFPGEf9mW', 'Mohit',); 

insert into movie(movieid,city,language,movie_length,moviename) values(1,'Delhi','Hindi',150,'Dilwale');
insert into movie(movieid,city,language,movie_length,moviename) values(2,'Delhi','Hindi',120,'Baaghi2');
insert into movie(movieid,city,language,movie_length,moviename) values(3,'Delhi','English',100,'Avengers');


insert into movie_cast(movie_movieid,moviecast) values(1,('Shahrukh,Kajol'));
insert into movie_cast(movie_movieid,moviecast) values(2,('Tiger,Disha'));
insert into movie_cast(movie_movieid,moviecast) values(3,('IronMan,Hulk'));


insert into movietheatre values(1,'Delhi','PVR Naraina');
insert into movietheatre values(2,'Shimla','PVR Shimla');
insert into movietheatre values(3,'Patna','PVR Patna');




INSERT INTO SCREEN  VALUES (1, 31, 50, 1); 
INSERT INTO SCREEN  VALUES (2, 1, 50, 2); 
INSERT INTO SCREEN  VALUES (3, 3, 50, 3); 

INSERT INTO Role VALUES (1,'ADMIN');
INSERT INTO Role VALUES (2,'EMPLOYEE');


INSERT INTO user_role VALUES ('1','1', '1');
INSERT INTO user_role VALUES ('2','1' ,'2');
INSERT INTO user_role VALUES ('3','2' ,'3');


select * from user;