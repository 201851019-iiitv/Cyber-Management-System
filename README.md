

# Cyber-Management-System

<img src= "https://visitor-badge.laobi.icu/badge?page_id=201851019-iiitv/Cyber-Management-System " alt="visitor badge"/> |  ![GitHub last commit (branch)](https://img.shields.io/github/last-commit/201851019-iiitv/Cyber-Management-System/master)

## This Project based Java GUI MySql database and Socket Programming
## RUN PROCESS:


## I recommend to use Eclipse Java IDE.

1.First You should connect your java ide with JDBC(Java Database Connectivity) 
Here the full reference of How to connect JDBC with MY SQL :
https://www.javatpoint.com/example-to-connect-to-the-mysql-database

2.you should create a database with name of "project" using MYSql. <br /> 

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
4. create a table "guest" in project database.Below given Syntax of MYSql.<br /> 
 
create table guest(
 name varchar(40),
 mob varchar(40),
 primary key(name,mob)
);
-- -----------------------------------------------------------------
5. create a table "request" in project database.Below given Syntax of MYSql.<br /> 
 
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

 *where you change root with your username and ambesh with password of you MYSQL .<br /> 
*In the code you should change this line of code with this<br /> 

  By default username is already root.

 ### you should run main.java file
OUTPUT :

   
   
   ### 1  After run you get 4 option:
   
![image](https://user-images.githubusercontent.com/48892208/98442386-4b43a700-212a-11eb-9870-a1db5a68c83b.png)


### if click Admin First You get Login Page then After SuccessFull Login You can See All List of Members,Guest ,And request List of Either Guests or Members of Coffee tea and many more (In project username="Admin" && password="admin" :
![image](https://user-images.githubusercontent.com/48892208/98442475-dae95580-212a-11eb-9284-5336ab5178f7.png)
![image](https://user-images.githubusercontent.com/48892208/98442489-f6ecf700-212a-11eb-9ae7-45cbf607a7c9.png)

### If Click on New  Member .You get a Registration Form .After Successfully Registration.Your data is saved in database and you see a message of Successflly Registerd.
![image](https://user-images.githubusercontent.com/48892208/98442629-ab871880-212b-11eb-8b18-97ed0cbc18b7.png)

### If You Already a Member then You click on "Login As Member". After Click First You should login using Name and Mobile Number(primary Key in database)then You get Three option (Chat with Others,request for a tea or coffee,Dowload Files from Server). 
![image](https://user-images.githubusercontent.com/48892208/98442764-c017e080-212c-11eb-96ed-14a790b1573f.png)
![image](https://user-images.githubusercontent.com/48892208/98442748-9494f600-212c-11eb-85a9-7d3daf63499f.png)
![image](https://user-images.githubusercontent.com/48892208/98442775-d4f47400-212c-11eb-9f1c-c24f3782ecfb.png)

### If Click on Chat with other  You should enter port number ,computerId and IP Address then  you connect Server .This is multiClient Server chat.
![image](https://user-images.githubusercontent.com/48892208/98442871-8eebe000-212d-11eb-803f-3d675772ac59.png)

### If click on request for cofee or tea then Admin get notified and also can see manual rquest list of coffee .In order list contains Your name ,mobile number,quantity,requirement thing

### If CLick on "Download Files from  Server" then you are able to download file of different different type from Server.

### If Click on Guest login .Then you first you enter the your name and mobile number and then you able to use all functionalities use by a  Member(No require to fill registration form ). you time and pay are different from  a Member.
![image](https://user-images.githubusercontent.com/48892208/98443105-3d445500-212f-11eb-8144-7959ba6e032f.png)




📝If Liked Give Star ⭐⭐⭐to repo📝

 Made with ❤️ .

