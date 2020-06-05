CREATE TABLE USUARIO(
cod integer PRIMARY KEY,
nombreUsuario varchar2(8) UNIQUE NOT NULL,
email varchar2(50) UNIQUE NOT NULL,
contrasenya varchar2(4)not null,
nombreReal varchar2(50),
apellidos varchar2(50),
tipo varchar2(50) DEFAULT 'normal'
);


CREATE TABLE PRODUCTO(
cod integer PRIMARY KEY,
nombre varchar(50) unique not null,
precio decimal(8,2),
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

CREATE TABLE FORMULARIO(
cod integer PRIMARY KEY,
nombre varchar2(50),
apellidos varchar2(50),
email varchar2(50),
telefono number(9),
comentario varchar2(250),
usuario integer NOT NULL,
CONSTRAINT FK_FORMULARIO_USUARIO FOREIGN KEY(usuario) REFERENCES USUARIO
);

ALTER TABLE OPINION ADD CONSTRAINT RANGO_PUNTUACION CHECK(puntuacion<=5 and puntuacion>=1);
ALTER TABLE USUARIO ADD CONSTRAINT TIPO_USUARIO CHECK(tipo ='normal' or tipo='admin' or tipo=null);
ALTER TABLE PRODUCTO ADD CONSTRAINT NADA_ES_GRATIS_EN_LA_VIDA CHECK(precio>0);

ALTER TABLE PRODUCTO
ADD (cantidad integer not null);

