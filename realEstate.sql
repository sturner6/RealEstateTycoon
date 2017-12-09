CREATE DATABASE realEstate;
USE realEstate;
 CREATE TABLE Users (
    title ENUM('Mr', 'Mrs', 'Miss', 'Ms', 'Dr') NOT NULL,
    forename VARCHAR(20) NOT NULL,
    surname VARCHAR(20) NOT NULL,
    dateOfBirth DATE NOT NULL,
    email VARCHAR(30) NOT NULL,
    userID INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY
);

 CREATE TABLE UsersHistory (
    inGameDate DATE NOT NULL,
    money INT NOT NULL,
    experience INT NOT NULL,
    userID INT UNSIGNED NOT NULL PRIMARY KEY
);

 CREATE TABLE propertiesOwned (
    propertyType VARCHAR(20) NOT NULL,
    propertyName VARCHAR(20) NOT NULL,
    userID INT UNSIGNED NOT NULL,
    PRIMARY KEY (propertyType , propertyName , userID)
);

 CREATE TABLE properties (
    propertyType VARCHAR(20) NOT NULL PRIMARY KEY,
    price INT NOT NULL
);

 CREATE TABLE Treatments (
    treatmentName VARCHAR(20) PRIMARY KEY NOT NULL,
    cost FLOAT NOT NULL,
	lengthOfTreatment INT NOT NULL
);

 CREATE TABLE HealthCarePlans (
    healthCareName ENUM('NHS','MAINTENANCE','ORALHEALTH','DENTALREPAIR', 'NOPLAN') NOT NULL PRIMARY KEY,
    checkUps INT NOT NULL,
    hygieneVisits INT NOT NULL,
	  repairs INT NULL,
	  monthlyCost FLOAT NULL DEFAULT 0.0
);

 INSERT INTO HealthCarePlans
 VALUES
   ('NHS', 2, 2, 6, 0.0),
   ('MAINTENANCE', 2, 2, 0, 15.00),
   ('ORALHEALTH', 2, 4, 0, 21.00),
   ('DENTALREPAIR', 2, 2, 2, 36.00);
   
CREATE USER realuser IDENTIFIED BY 'realuserpw';

grant usage on *.* to realuser@localhost identified by 'realuserpw';
grant all privileges on realEstate.* to realuser@localhost;