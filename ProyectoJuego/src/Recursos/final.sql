CREATE database JuegoDesarrollo;

USE juegoDesarrollo;

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
  fecha DATE NOT NULL,
  constraint pk_examen PRIMARY KEY (idExamen),
  constraint fk_examen_usuario FOREIGN KEY (usuario) REFERENCES usuario (idCodigo)
);

CREATE TABLE pregunta(
  idPregunta INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(250) NOT NULL,
  categoria INT NOT NULL,
  examen INT NOT NULL,
  constraint pk_pregunta PRIMARY KEY (idPregunta),
  constraint fk_pregunta_categoria FOREIGN KEY (categoria) REFERENCES categoria (idCategoria),
  constraint fk_pregunta_examen FOREIGN KEY (examen) REFERENCES examen (idExamen)
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
  nombre VARCHAR(45) NOT NULL,
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