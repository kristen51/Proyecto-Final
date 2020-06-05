-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: driveFit
-- ------------------------------------------------------
-- Server version	8.0.11
--
--
--Borrado de todas las tablas


DROP TABLE FORMULARIO cascade constraint;
DROP TABLE OPINION cascade constraint;
DROP TABLE PRODUCTO cascade constraint;
DROP TABLE USUARIO cascade constraint;
CREATE TABLE USUARIO(cod integer PRIMARY KEY,nombreUsuario varchar(8) UNIQUE NOT NULL,email varchar(50) UNIQUE NOT NULL,contrasenya varchar(4) not null,nombreReal varchar(50),apellidos varchar(50),tipo varchar(50) DEFAULT 'normal');
CREATE TABLE PRODUCTO(cod integer PRIMARY KEY, nombre varchar(50) unique not null, precio decimal(8,2), rutaFotos varchar2(100) );
CREATE TABLE OPINION(cod integer PRIMARY KEY, descripcion varchar2(250), puntuacion integer, producto integer NOT NULL, usuario integer NOT NULL, CONSTRAINT FK_OPINION_USUARIO FOREIGN KEY(usuario) references USUARIO, CONSTRAINT FK_OPINION_PRODUCTO FOREIGN KEY(producto) references PRODUCTO );
CREATE TABLE FORMULARIO(cod integer PRIMARY KEY, nombre varchar2(50), apellidos varchar2(50), email varchar2(50), telefono number(9), comentario varchar2(250), usuario integer NOT NULL, CONSTRAINT FK_FORMULARIO_USUARIO FOREIGN KEY(usuario) REFERENCES USUARIO );
ALTER TABLE OPINION ADD CONSTRAINT RANGO_PUNTUACION CHECK(puntuacion<=10 and puntuacion>=0);
ALTER TABLE USUARIO ADD CONSTRAINT TIPO_USUARIO CHECK(tipo ='normal' or tipo='admin' or tipo=null);
ALTER TABLE PRODUCTO ADD CONSTRAINT NADA_ES_GRATIS_EN_LA_VIDA CHECK(precio>0);
ALTER TABLE PRODUCTO ADD (cantidad integer not null);

