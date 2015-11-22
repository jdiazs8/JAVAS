DROP DATABASE IF EXISTS javas;

CREATE DATABASE javas
	CHARACTER SET utf8
	COLLATE utf8_general_ci;

USE javas;

CREATE TABLE tb_distractores(
	d_id INT(4) NOT NULL AUTO_INCREMENT,
	d_nombre VARCHAR(70) NOT NULL,
	m_id INT(3) NOT NULL,
	n_id INT(1) NOT NULL,
	PRIMARY KEY(d_id)
)ENGINE = INNODB;

CREATE TABLE tb_perfiles(
	p_id INT(1) NOT NULL,
	p_nombre VARCHAR(20) NOT NULL,
	PRIMARY KEY(p_id)
)ENGINE = INNODB;

CREATE TABLE tb_registro_logueo(
	rl_id INT(4) NOT NULL AUTO_INCREMENT,
	rl_descripcion VARCHAR(50) NOT NULL,
	u_id INT(10) NOT NULL,
	PRIMARY KEY(rl_id)
)ENGINE = INNODB;

CREATE TABLE tb_materias(
	m_id INT(3) NOT NULL AUTO_INCREMENT,
	m_nombre VARCHAR(30) NOT NULL,
	PRIMARY KEY(m_id)
)ENGINE = INNODB;

CREATE TABLE tb_niveles(
	n_id INT(1) NOT NULL,
	n_nombre VARCHAR(15) NOT NULL,
	PRIMARY KEY(n_id)
)ENGINE = INNODB;

CREATE TABLE tb_preguntas(
	pr_id INT(4) NOT NULL AUTO_INCREMENT,
	pr_enunciado VARCHAR(200) NOT NULL,
	pr_respuesta VARCHAR(70) NOT NULL,
	n_id INT(1) NOT NULL,
	m_id INT(3) NOT NULL,
	tp_id INT(1) NOT NULL,
	PRIMARY KEY(pr_id)
)ENGINE = INNODB;

CREATE TABLE tb_tipo_pregunta(
	tp_id INT(1) NOT NULL,
	tp_nombre VARCHAR(50) NOT NULL,
	PRIMARY KEY(tp_id)
)ENGINE = INNODB;

CREATE TABLE tb_examenes(
	e_id INT(4) NOT NULL AUTO_INCREMENT,
	u_id INT(10) NOT NULL,
	pr_id0 INT(4),
	pr_id1 INT(4),
	pr_id2 INT(4),
	pr_id3 INT(4),
	pr_id4 INT(4),
	pr_id5 INT(4),
	pr_id6 INT(4),
	pr_id7 INT(4),
	pr_id8 INT(4),
	pr_id9 INT(4),
	PRIMARY KEY(e_id)
)ENGINE = INNODB;

CREATE TABLE tb_usuarios(
	u_id INT(10) NOT NULL,
	u_nombre VARCHAR(50) NOT NULL,
	u_clave VARCHAR(20) NOT NULL,
	u_correo_e VARCHAR(50) NOT NULL,
	p_id INT(1) NOT NULL,
	PRIMARY KEY(u_id)
)ENGINE = INNODB;

CREATE TABLE tb_preguntas_relaciones(
	prr_id INT(4) NOT NULL AUTO_INCREMENT,
	prr_enunciado VARCHAR(200) NOT NULL,
	prr_op1 VARCHAR(70),
	prr_op2 VARCHAR(70),
	prr_op3 VARCHAR(70),
	prr_op4 VARCHAR(70),
	prr_op5 VARCHAR(70),
	prr_r1 VARCHAR(70),
	prr_r2 VARCHAR(70),
	prr_r3 VARCHAR(70),
	prr_r4 VARCHAR(70),
	prr_r5 VARCHAR(70),
	n_id INT(1) NOT NULL,
	m_id INT(3) NOT NULL,
	tp_id INT(1) NOT NULL,
	PRIMARY KEY(prr_id)
)ENGINE = INNODB;

alter table tb_distractores add foreign key (m_id) references tb_materias (m_id);
alter table tb_preguntas add foreign key (m_id) references tb_materias (m_id);
alter table tb_preguntas add foreign key (n_id) references tb_niveles (n_id);
alter table tb_distractores add foreign key (n_id) references tb_niveles (n_id);
alter table tb_usuarios add foreign key (p_id) references tb_perfiles (p_id);
alter table tb_registro_logueo add foreign key (u_id) references tb_usuarios (u_id);
alter table tb_preguntas add foreign key (tp_id) references tb_tipo_pregunta (tp_id);
alter table tb_examenes add foreign key (u_id) references tb_usuarios (u_id);
alter table tb_preguntas_relaciones add foreign key (tp_id) references tb_tipo_pregunta (tp_id);
alter table tb_preguntas_relaciones add foreign key (n_id) references tb_niveles (n_id);
alter table tb_examenes add foreign key (pr_id0) references tb_preguntas (pr_id);
alter table tb_examenes add foreign key (pr_id0) references tb_preguntas_relaciones (prr_id);

INSERT INTO tb_perfiles (p_id, p_nombre) VALUES (1, 'Admin');
INSERT INTO tb_perfiles (p_id, p_nombre) VALUES (2, 'Profesor');

INSERT INTO tb_usuarios (u_id, u_nombre, u_clave, u_correo_e, p_id) VALUES (1, 'Administrador', 'admin123', 'administrador@examenes.com', 1);

INSERT INTO tb_tipo_pregunta (tp_id, tp_nombre) VALUES (1, 'Opción Múltiple');
INSERT INTO tb_tipo_pregunta (tp_id, tp_nombre) VALUES (2, 'Abierta');
INSERT INTO tb_tipo_pregunta (tp_id, tp_nombre) VALUES (3, 'Falso/Verdadero');
INSERT INTO tb_tipo_pregunta (tp_id, tp_nombre) VALUES (4, 'Relación');

INSERT INTO tb_niveles (n_id, n_nombre) VALUES (1, 'Facil');
INSERT INTO tb_niveles (n_id, n_nombre) VALUES (2, 'Medio');
INSERT INTO tb_niveles (n_id, n_nombre) VALUES (3, 'Interesante');

INSERT INTO tb_materias (m_nombre) VALUES ('Matemáticsas');
INSERT INTO tb_materias (m_nombre) VALUES ('Física');
INSERT INTO tb_materias (m_nombre) VALUES ('Español');
INSERT INTO tb_materias (m_nombre) VALUES ('Química');

select *from tb_perfiles;
select *from tb_usuarios;
select *from tb_tipo_pregunta;
select *from tb_niveles;
select *from tb_materias;
select *from tb_preguntas;

/*----------------Distractores----------------*/
DELIMITER $$
DROP PROCEDURE IF EXISTS insertarDistractor$$
CREATE PROCEDURE insertarDistractor(d_nombre VARCHAR(70),
											 m_id INT(3),
											 n_id INT(1))
BEGIN
    INSERT INTO distractores
    VALUES(d_nombre,m_id,n_id);
END
$$
 
DELIMITER $$
DROP PROCEDURE IF EXISTS modificarDistractor$$
CREATE PROCEDURE modificarDistractor(d_id INT(4),
							d_nombre VARCHAR(70),
									 m_id INT(3),
									 n_id INT(1))
BEGIN
	UPDATE tb_distractores
    SET tb_distractores.d_nombre  = d_nombre,
				  tb_distractores.m_id= m_id,
                  tb_distractores.n_is = n_id
    WHERE tb_distractores.d_id = d_id;
 
END
$$

DELIMITER $$
DROP PROCEDURE IF EXISTS borrarDistractor$$
CREATE PROCEDURE borrarDistractor(d_id INT(4))
BEGIN
    DELETE FROM tb_distractores
    WHERE tb_distractores.d_id = d_id;
END
$$

/*----------------Materias----------------*/
DELIMITER $$
DROP PROCEDURE IF EXISTS insertarMateria$$
CREATE PROCEDURE insertarMateria(m_nombre VARCHAR(30))
BEGIN
    INSERT INTO tb_materias
    VALUES(m_nombre);
END
$$
 
DELIMITER $$
DROP PROCEDURE IF EXISTS modificarMateria$$
CREATE PROCEDURE modificarMateria(m_id INT(3),
						 m_nombre VARCHAR(30))
BEGIN
	UPDATE tb_materias
    SET tb_materias.m_nombre  = m_nombre
    WHERE tb_materias.m_id = m_id;
 
END
$$

DELIMITER $$
DROP PROCEDURE IF EXISTS borrarMateria$$
CREATE PROCEDURE borrarMateria(m_id INT(4))
BEGIN
    DELETE FROM tb_materias
    WHERE tb_materias.m_id = m_id;
END
$$

/*----------------Preguntas----------------*/
DELIMITER $$
DROP PROCEDURE IF EXISTS insertarPregunta$$
CREATE PROCEDURE insertarPregunta(pr_enunciado VARCHAR(200),
								   pr_respuesta VARCHAR(70),
												n_id INT(1),
												m_id INT(3),
											   tp_id INT(1))
BEGIN
    INSERT INTO tb_preguntas VALUES(NULL,pr_enunciado,pr_respuesta,n_id,m_id,tp_id);
END
$$
 
DELIMITER $$
DROP PROCEDURE IF EXISTS modificarPregunta$$
CREATE PROCEDURE modificarPregunta(pr_id int(4),
					  pr_enunciado VARCHAR(200),
					   pr_respuesta VARCHAR(70),
									n_id INT(1),
									m_id INT(3),
								   tp_id INT(1))
BEGIN
	UPDATE tb_preguntas
    SET tb_preguntas.pr_enunciado  = pr_enunciado,
		tb_preguntas.pr_respuesta  = pr_respuesta,
						tb_preguntas.n_id  = n_id,
						tb_preguntas.m_id  = m_id,
					    tb_preguntas.tp_id = tp_id
WHERE tb_preguntas.pr_id = pr_id;
 
END
$$

DELIMITER $$
DROP PROCEDURE IF EXISTS borrarMateria$$
CREATE PROCEDURE borrarMateria(m_id INT(3))
BEGIN
    DELETE FROM tb_materias
    WHERE tb_materias.m_id = m_id;
END
$$

select *from tb_preguntas;
