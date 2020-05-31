# spring-boot-demo

## Récupérer le projet

* Ouvrir une CMD
* Se placer dans le répertoire voulu (cd)
* git clone https://github.com/Darky1948/spring-boot-demo.git
* intellij ou eclipse -> importer le projet en tant que "Maven Project"
* Mettre en place un env mysql.
* modifier l'application.properties en fonction de la conf.
* Lancer BookingDemoApplication 


## Pourquoi Spring Boot ?

* Il rend le développement d’applications prêtes pour la production de façon très facile et direct.
* Il a une approche packagée. Il s’appuie sur des conventions par conséquence il n’y a plus besoin de fichier de configuration xml ou de code de configuration dans la plupart des cas.
* Pas de WAR. Spring boot permet de créer des applications qui s’auto-hébergent et s’exécutent en tant qu’application JAR (embedded tomcat).


Il est vrai que les projets actuels avec lesquels nous travaillons nous constatons un écosystème Spring lourd, avec beaucoup de librairies, trop JEE. Spring boot a su apporter la simplicité d’origine de Spring et sans fichier XML.

Plus besoin de configuration xml pour les déclarations de beans, plus de web.xml, plus besoin non plus de serveur d’application.

Il permet aux développeurs de se concentrer sur le cœur de l’application et non plus tous les aspects « annexes » comme la configuration, les tests, la sécurité, le déploiement…

Grâce à l’annotation @EnableAutoConfiguration Spring va s’appuyer sur l’ensemble des dépendances de l’application pour configurer l’application.

Il est possible de personnaliser cette configuration par défaut. Par exemple, si l’on souhaite modifier le port http du serveur qui est par défaut est 8080, il suffit d’ajouter dans le fichiers properties : server.port=9090.
Cette nouvelle configuration sera prise en compte au prochain démarrage de l’application.

## REST ?

* Ce n’est pas un protocole mais un style architectural. Il permet de décrire comment un système peut partager son état avec d’autres systèmes.
* Les objets sont représentés avec des format commun :  XML, JSON.
* Le protocole le plus utilisé avec une architecture RESTfull c’est http.
* En générale, on utilise du REST pour créer des applications qui expose des API http.

## @Controller vs @RestController

### @Controller

Une méthode qui utilise cette annotation va indiquer au framework qu’il faut retouner au client un model et une vue

### @RestController

@RestController = @Controller + @ResponseBody

@Responbody signifie que l’objet qui sera retourné à partir d’une méthode utilisant cette annotation est le corps de la réponse http représentée soit au format XML ou JSON.

## Comment on implémente la persistence ?

* Annoter les entités avec :
	* @Entity
	* @Id
* Créer une « repository interface » qui hérite de « JpaRepository interface » (pour les bases de données de type relationnelles)
	* @Repository
	
	
# MySQL CheatSheet

~~~~sql
create database db_example; -- Creates the new database
~~~~
~~~~sql
create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
~~~
~~~~sql
grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
~~~

~~~~properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driverClassName=com.mysql.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.datasource.url=jdbc:mysql://localhost:3306/hotelbooking?autoReconnect=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=hotelbooking
spring.datasource.password=hotelbooking
~~~~

Indique sur quel ip et port le serveur tourne

~~~~sql
SELECT SUBSTRING_INDEX(USER(), '@', -1) AS ip,  @@hostname as hostname, @@port as port, DATABASE() as current_database;
~~~~

Pour connaître le time zone mysql

~~~~sql
select now();
~~~~

Définir la bdd courant :

~~~~sql
USE database_name;
~~~~

Voir l'ensemble des tables de la bdd :

~~~~sql
show tables;
~~~~

