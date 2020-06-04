-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: itv
-- ------------------------------------------------------
-- Server version	8.0.11
--
--
--Borrado de todas las tablas

drop table itv_terminados cascade constraint;
drop table itv_revisiones cascade constraint;
drop table itv_microbuses cascade constraint;
drop table itv_furgonetas cascade constraint;
drop table itv_colapendientes cascade constraint;
drop table itv_colainicialvehiculos cascade constraint;
drop table itv_coches cascade constraint;
drop table itv_transportespersonas cascade constraint;
drop table itv_camiones cascade constraint;
drop table itv_transportecarga cascade constraint;
drop table itv_vehiculos cascade constraint;
drop table itv_clientes cascade constraint;


CREATE TABLE itv_clientes(codigo number(11) NOT NULL, nombre varchar2(45) NOT NULL, telefono number(9) NOT NULL, tipo varchar2(1) check (tipo in ('V','S','N')) NOT NULL, numRevisiones number(11) NOT NULL, PRIMARY KEY (codigo));
CREATE TABLE itv_vehiculos (matricula varchar2(7) primary key, modelo varchar2(45) NOT NULL, potencia number(11) NOT NULL, cilindros number(11) NOT NULL, cliente number(11) NOT NULL, ingresos number(6,2) DEFAULT NULL, CONSTRAINT fk_vehiculo_cliente FOREIGN KEY (cliente) REFERENCES itv_clientes ON DELETE CASCADE); 
CREATE TABLE itv_transportecarga(matricula varchar2(7) NOT NULL, pma number(10,0) DEFAULT NULL, PRIMARY KEY (matricula), CONSTRAINT fk_tcarga_vehiculo FOREIGN KEY (matricula) REFERENCES itv_vehiculos  ON DELETE CASCADE);
CREATE TABLE itv_camiones(matricula varchar2(7) PRIMARY KEY, CONSTRAINT fk_camiones_tcarga FOREIGN KEY (matricula) REFERENCES itv_transportecarga ON DELETE CASCADE); 
CREATE TABLE itv_transportespersonas (matricula varchar2(7) primary key, numplazas number(11) NOT NULL, CONSTRAINT fk_tpers_vehiculo FOREIGN KEY (matricula) REFERENCES itv_vehiculos (matricula) ON DELETE CASCADE);
CREATE TABLE itv_coches(matricula varchar2(7) NOT NULL primary key,CONSTRAINT fk_coche_tpers FOREIGN KEY (matricula) REFERENCES itv_transportespersonas ON DELETE CASCADE); 
CREATE TABLE itv_colainicialvehiculos (matricula varchar2(7) PRIMARY KEY,CONSTRAINT fk_colaIni_vehiculos FOREIGN KEY (matricula) REFERENCES itv_vehiculos (matricula) ON DELETE CASCADE);
CREATE TABLE itv_colapendientes(matricula varchar2(7) PRIMARY KEY,CONSTRAINT fk_colap_vehiculos FOREIGN KEY (matricula) REFERENCES itv_vehiculos (matricula) ON DELETE CASCADE);
CREATE TABLE itv_furgonetas(matricula varchar2(7) PRIMARY KEY,CONSTRAINT fk_furgo_tcarga FOREIGN KEY (matricula) REFERENCES itv_transportecarga (matricula) ON DELETE CASCADE); 
CREATE TABLE itv_microbuses (matricula varchar2(7) NOT NULL,PRIMARY KEY (matricula),CONSTRAINT fk_micro_tpers FOREIGN KEY (matricula) REFERENCES itv_transportespersonas (matricula) ON DELETE CASCADE);
CREATE TABLE itv_revisiones (idBox number(11) NOT NULL,idFase number(11) NOT NULL,vehiculo varchar2(45) DEFAULT NULL,PRIMARY KEY (idBox,idFase),CONSTRAINT fk_revis_vehiculo FOREIGN KEY (vehiculo) REFERENCES itv_vehiculos (matricula) ON DELETE CASCADE );
CREATE TABLE itv_terminados (codigo number(11)primary key,vehiculo varchar2(7) DEFAULT NULL,CONSTRAINT fk_terminad_vehic FOREIGN KEY (vehiculo) REFERENCES itv_vehiculos (matricula) ON DELETE CASCADE);









