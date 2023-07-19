create database ejemplocsv;

CREATE TABLE productos (
    id int NOT NULL ,
    nombre varchar(255) NOT NULL,
    descripcion varchar(255),
    precio double,
    fechaAlta datetime,
    PRIMARY KEY (id)
);