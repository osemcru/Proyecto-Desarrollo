CREATE database juegodesarrollo;

USE juegodesarrollo;

CREATE TABLE tipoUsuario(
  idTipoUsuario INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(45) NOT NULL,
  constraint pk_tipoUsuario PRIMARY KEY (idTipoUsuario)
  );

CREATE TABLE usuario(
  nickname VARCHAR(45) NOT NULL,
  clave VARCHAR(45) NOT NULL,
  idCodigo INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  correo VARCHAR(45) NOT NULL,
  semestre INT NOT NULL,
  tipoUsuario INT NOT NULL,
  constraint un_usuario_idCodigo UNIQUE(idCodigo),
  constraint pk_usuario_nickname PRIMARY KEY (nickname),
  constraint fk_usuario_tipoUsuario foreign key (tipoUsuario) REFERENCES tipoUsuario (idTipoUsuario)
);

CREATE TABLE categoria(
  idCategoria INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  constraint un_categoria_nombre UNIQUE(nombre),
  constraint pk_categoria PRIMARY KEY (idCategoria)
);

CREATE TABLE administrador(
  nickname VARCHAR(45) NOT NULL,
  clave VARCHAR(45) NOT NULL,
  idCodigo INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  correo VARCHAR(45) NOT NULL,
  tipoUsuario INT NOT NULL,
  CONSTRAINT unique_administrador_idCedula UNIQUE(idCodigo),
  constraint pk_administrador_nickname PRIMARY KEY (nickname),
  constraint fk_administrador_tipoUsuario FOREIGN KEY (tipoUsuario) REFERENCES tipoUsuario (idTipoUsuario)
);

CREATE TABLE examen(
  idExamen INT NOT NULL AUTO_INCREMENT,
  participantes INT NOT NULL,
  usuario INT NOT NULL,
  constraint pk_examen PRIMARY KEY (idExamen),
  constraint fk_examen_usuario FOREIGN KEY (usuario) REFERENCES usuario (idCodigo)
);

CREATE TABLE pregunta(
  idPregunta INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(250) NOT NULL,
  categoria INT NOT NULL,
  tipoPregunta INT NOT NULL,
  constraint pk_pregunta PRIMARY KEY (idPregunta),
  constraint fk_pregunta_categoria FOREIGN KEY (categoria) REFERENCES categoria (idCategoria)
);

CREATE TABLE examenPregunta(
  idExamenPregunta INT NOT NULL AUTO_INCREMENT,
  examen INT NOT NULL,
  pregunta INT NOT NULL,
  constraint pk_examen PRIMARY KEY (idExamenPregunta),
  constraint fk_examen_examenPregunta FOREIGN KEY (examen) REFERENCES examen (idExamen),
  constraint fk_pregunta_examenPregunta FOREIGN KEY (pregunta) REFERENCES pregunta (idPregunta)
);

CREATE TABLE solucion(
  idSolucion INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  estado INT NOT NULL,
  pregunta INT NOT NULL,
  constraint pk_solucion_idSolucion PRIMARY KEY (idSolucion),
  constraint fk_solucion_pregunta FOREIGN KEY (pregunta) REFERENCES pregunta (idPregunta)
);

CREATE TABLE usuarioExamen (
    idUsuarioExamen INT NOT NULL AUTO_INCREMENT,
    usuario INT NOT NULL,
    examen INT NOT NULL,
    CONSTRAINT pk_usuarioExamen PRIMARY KEY (idUsuarioExamen),
    CONSTRAINT fk_usuarioExamen_usuario FOREIGN KEY (usuario) REFERENCES usuario (idCodigo),
    CONSTRAINT fk_usuarioExamen_examen FOREIGN KEY (examen) REFERENCES examen (idExamen)
);

CREATE TABLE auditoriaUsuario(
  idAuditoriaUsuario INT NOT NULL,
  porcentaje INT NOT NULL,
  usuario INT NOT NULL,
  Constraint pk_auditoriaUsuario PRIMARY KEY (idAuditoriaUsuario),
  Constraint fk_auditoriaUsuario_usuario FOREIGN KEY (usuario) REFERENCES usuario (idCodigo)
);

CREATE TABLE auditoriaExamen(
  idAuditoriaExamen INT NOT NULL,
  porcentaje INT NOT NULL,
  examen INT NOT NULL,
  Constraint pk_auditoriaExamen PRIMARY KEY (idAuditoriaExamen),
  Constraint fk_auditoriaExamen_examen FOREIGN KEY (examen) REFERENCES examen (idExamen)
);

CREATE TABLE auditoriaPregunta(
  idAuditoriaPregunta INT NOT NULL,
  porcentaje INT NOT NULL,
  pregunta INT NOT NULL,
  Constraint pk_auditoriaPregunta primary KEY (idAuditoriaPregunta),
  Constraint fk_auditoriaPregunta_pregunta FOREIGN KEY (pregunta) REFERENCES pregunta(idPregunta)
);

insert into tipoUsuario (descripcion) values ('Administrador');
insert into tipoUsuario (descripcion) values ('Usuario');

insert into administrador values ('admin','00000','1509','Main Yasuo','Cojo','gmail','1');

insert into categoria(nombre,idCategoria) values ('Linux','1');
insert into categoria(nombre,idCategoria) values ('Windows','2');
insert into categoria(nombre,idCategoria) values ('Redes','3');
insert into categoria(nombre,idCategoria) values ('SQL','4');
insert into categoria(nombre,idCategoria) values ('Principios de Ingenieria de Software','5');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('1','Para que sirve una llave foragnea?','4','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('1','Destacar un campo','0','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('2','Conectar con un campo de otra tabla','1','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('3','Convertir un campo inrepetible','0','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('4','Nada relevante','0','1');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('2','Entornos que maneja derivadas de ubuntu','1','2');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('5','Gnome','1','2');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('6','KDE','1','2');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('7','Cinnamon','0','2');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('8','Arch','0','2');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('3','Fundador de Microsoft','2','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('9','Steve Jobs','0','3');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('10','Linus Torvalds','0','3');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('11','Mark Zuckerberg','0','3');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('12','Bill Gates','1','3');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('4','Programa para diseñar diagramas de casos de uso','5','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('13','Everest','0','4');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('14','Balsamiq Mockups','0','4');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('15','StartUML','1','4');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('16','Toggl','0','4');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('5','Componente NO necesario para una conexion local','3','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('17','Cable UTP','0','5');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('18','Direccion IP','0','5');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('19','Internet','1','5');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('20','Tarjeta de red','0','5');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('6','Sistemas Linux NO basados en Ubuntu','1','2');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('21','Zorin OS','0','6');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('22','Antergos','1','6');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('23','Elementary OS','0','6');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('24','Manjaro','1','6');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('7','Hace parte de los principios de ingenieria de software','5','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('25','Pruebas unitarias','0','7');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('26','Bases de datos','0','7');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('27','Mockups','1','7');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('28','Estructuras de datos','0','7');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('8','Sistema operativo mas odiado por su inestabilidad','2','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('29','Windows Vista','1','8');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('30','Windows 10','0','8');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('31','Windows XP','0','8');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('32','Windows  2008','0','8');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('9','Como se le define a los valores dentro de las tablas?','4','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('33','Atributos','0','9');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('34','Datos','0','9');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('35','Campos','1','9');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('36','Columnas','0','9');

insert into pregunta(idPregunta,descripcion,categoria,tipoPregunta) values ('10','El entorno de escritorio Cinnamon proviene de','1','1');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('37','Ubuntu','0','10');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('38','Fedora','0','10');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('39','Red Hat','0','10');
insert into solucion(idSolucion,nombre,estado,pregunta) values ('40','Mint','1','10');