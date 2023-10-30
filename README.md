# Développement d'un Micro-Service

Ce Tp consiste à créer un micro service qui permet de gérer des comptes bancaires.

## Architecture:
![ms](./captures/architecture.jpg)


Travail à réaliser  :

1. Créer un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok

2. Créer l'entité JPA Compte
![ms](./captures/2.png)

3. Créer l'interface CompteRepository basée sur Spring Data
![ms](./captures/3.png)

4. Tester la couche DAO
#### Creation des comptes sur le fichier Aplication en utilisant le builder:
![ms](./captures/4.png)

#### Configuration de la DB sur le fichier properties:
![ms](./captures/5.png)

#### Resultat du test:
![ms](./captures/6.png)

5. Créer le Web service Restfull qui permet de gérer des comptes
![ms](./captures/7.png)

6. Tester le web micro-service en utilisant un client REST comme Postman
#### Liste des comptes
![ms](./captures/8.png)

#### Afficher un compte by l'id
![ms](./captures/9.png)

#### Modifier un compte avec Put
![ms](./captures/10.png)

7. Générer et tester le documentation Swagger de des API Rest du Web service
#### On ajoute la dependance "SpringDoc OpenAPI UI" dans pom.xml
![ms](./captures/11.png)

#### La documentation Swagger
![ms](./captures/12.png)
###### la docummentation sous forme Json : L'interface du WebService elle contient:les paths, input,outpu
![ms](./captures/13.png)

8. Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections
9. Créer les DTOs et Mappers
10. Créer la couche Service (métier) et du micro service
11. Créer un Web service GraphQL pour ce Micro-service

