

## Cyber-Management-System

<img src= "https://visitor-badge.laobi.icu/badge?page_id=201851019-iiitv/Loan-Management-System-Using-MYSQL-and-Java-GUI " alt="visitor badge"/> |  ![GitHub last commit (branch)](https://img.shields.io/github/last-commit/201851019-iiitv/Loan-Management-System-Using-MYSQL-and-Java-GUI/master)


# This Project based Java GUI MySql database and Socket Programming
# RUN PROCESS:


# I recommend to use Eclipse Java IDE.

1.First You should connect your java ide with JDBC(Java Database Connectivity) 
Here the full reference of How to connect JDBC with MY SQL :
https://www.javatpoint.com/example-to-connect-to-the-mysql-database

2.you should create a database with name of "project" using MYSql
3. create a table "CMS " in project database.Below given Syntax of MYSql.
 -- -----------------------------------------------------------------
create table CMS(
 name varchar(40),
 mob varchar(40),
 addr varchar(40),
 gender varchar(40),
 dob varchar(40),
 primary key(name,mob)
 
 
);

-------------------------------------------------------------------------------
4. create a table "guest" in project database.Below given Syntax of MYSql.
 
create table guest(
 name varchar(40),
 mob varchar(40),
 primary key(name,mob)
);
-- -----------------------------------------------------------------
5. create a table "request" in project database.Below given Syntax of MYSql.
 
create table request(
 name varchar(40),
 mob varchar(40),
 table_number int,
 requirement varchar(50),
 primary key(name,mob)

);
-- -----------------------------------------------------------------


Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/project","root","ambesh");

 *where you change root with your username and ambesh with password of you MYSQL .
*In the code you should change this line of code with this

  By default username is already root.

 # you should run main.java file
OUTPUT :

   
   
   # 1  After run you get 4 buttons:
   
![4_buttons](https://user-images.githubusercontent.com/48892208/85872981-20e1f480-b7ee-11ea-863e-3c8336d6ff7e.png)

# if click   new Customer   first you  get registration form :
![regist](https://user-images.githubusercontent.com/48892208/85873588-f7759880-b7ee-11ea-9643-2f826f587ff3.png)

# after register you can login as exist customer  by using username and password can see all details of his and status of application also :
![login](https://user-images.githubusercontent.com/48892208/85874048-aa45f680-b7ef-11ea-8551-372e59cba96d.png)
![details](https://user-images.githubusercontent.com/48892208/85876473-648b2d00-b7f3-11ea-80df-31c780122c5f.png)


# admin(Bank manager) can login  ,then after admin have 3 option  and he can application status update as passed or rejected or otherwise no action show pending application :

![admin](https://user-images.githubusercontent.com/48892208/85874546-6c959d80-b7f0-11ea-9471-0a7212af45ea.png)
![buttonadmin](https://user-images.githubusercontent.com/48892208/85874550-6e5f6100-b7f0-11ea-8510-7fb430608202.png)

# if admin (Bank manager) choose  pending application then he can see all pending application :
![pending](https://user-images.githubusercontent.com/48892208/85875179-753aa380-b7f1-11ea-92d0-93d7f284a11c.png)
# if  admin (Bank manager) choose  passed application then he can see all passed application :
![passed](https://user-images.githubusercontent.com/48892208/85875172-7370e000-b7f1-11ea-920d-936c6e4f67dc.png)
# admin  (Bank manager) can also check a specific user by his name and dob and can changed the status :
 if status is already passed then admin haven't to change the status 
 if  status is pending he can change the status  to passed/rejected 
 if choose rejected then application deleted from database
 ![dob](https://user-images.githubusercontent.com/48892208/85875485-e5492980-b7f1-11ea-8f83-6c655eb38275.png)
![data](https://user-images.githubusercontent.com/48892208/85875493-e8441a00-b7f1-11ea-8b2f-a4c397f78fa8.png)

* admin (Bank manager) can see all borrower to hom much amount remaining to pay 

# if user login as exist customer and status is passed it have 3 option :

![3button](https://user-images.githubusercontent.com/48892208/85876193-fba3b500-b7f2-11ea-8295-731c58caa532.png)

a)pay the installement : if pay then is upadate is remaining balance and print remaining balance also on screen.
b)calculate the emi : he can caculate monthly emi using fill amount year and rate is already filled by bank manager.
c)see remaining balance 
 





