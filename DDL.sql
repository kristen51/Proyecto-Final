CREATE TABLE USUARIO(
cod integer PRIMARY KEY,
nombreUsuario varchar2(50) not null,
email varchar2(50) not null,
contraseña varchar2(50)not null,
nombreReal varchar2(50),
apellidos varchar2(50),
tipo varchar2(50) DEFAULT 'normal'
);


CREATE TABLE PRODUCTO(
cod integer PRIMARY KEY,
nombre varchar(50) unique,
precio float(2),
rutaFotos varchar2(100)
);

CREATE TABLE OPINION(
cod integer PRIMARY KEY,
descripcion varchar2(250),
puntuacion integer,
producto integer NOT NULL,
usuario integer NOT NULL,
CONSTRAINT FK_OPINION_USUARIO FOREIGN KEY(usuario) references USUARIO,
CONSTRAINT FK_OPINION_PRODUCTO FOREIGN KEY(producto) references PRODUCTO
);

ALTER TABLE OPINION ADD CONSTRAINT RANGO_PUNTUACION CHECK(puntuacion<=10 and puntuacion>=0);
ALTER TABLE USUARIO ADD CONSTRAINT TIPO_USUARIO CHECK(tipo ='normal' or tipo='admin' or tipo=null);
ALTER TABLE PRODUCTO ADD CONSTRAINT NADA_ES_GRATIS_EN_LA_VIDA CHECK(precio>0);

ALTER TABLE PRODUCTO
ADD (cantidad integer not null);

/*
DROP TABLE USUARIO;
DROP TABLE PRODUCTO;
DROP TABLE OPINION;*/