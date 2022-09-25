Create schema  administracion_innovategroup;

Use administracion_innovategroup;

CREATE TABLE residente (
	id INT NOT NULL,
    tipo_documento SMALLINT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50),
    dirección VARCHAR(100) NOT NULL,
    telefono INT NOT NULL,
    correo VARCHAR(100) NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    clave VARCHAR(20) NOT NULL,
    tipo_usuario SMALLINT NOT NULL,
	PRIMARY KEY (`id`)
);


CREATE TABLE consejoAdmon (
	id INT NOT NULL,
    tipo_documento SMALLINT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50),
    dirección VARCHAR(100) NOT NULL,
    telefono INT NOT NULL,
    correo VARCHAR(100) NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    clave VARCHAR(20) NOT NULL,
    tipo_usuario SMALLINT NOT NULL,
	PRIMARY KEY (`id`)
);


CREATE TABLE administrador_contador (
	id INT NOT NULL,
    tipo_documento SMALLINT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50),
    dirección VARCHAR(100) NOT NULL,
    telefono INT NOT NULL,
    correo VARCHAR(100) NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    clave VARCHAR(20) NOT NULL,
    tipo_usuario SMALLINT NOT NULL,
	PRIMARY KEY (`id`)
);


CREATE TABLE comprobante_pago_admon (
	id INT NOT NULL AUTO_INCREMENT,
    fecha DATE NOT NULL,
    id_usuario INT NOT NULL,
    subtotal VARCHAR(20) NOT NULL,
    torre_apto INT NOT NULL,
    otros_conceptos float NOT NULL,
    total_neto float NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `id_usuario_fk` FOREIGN KEY (`id_usuario`) REFERENCES `residente` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
);
