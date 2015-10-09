DROP DATABASE IF EXISTS javas;

CREATE DATABASE javas
	CHARACTER SET utf8
	COLLATE utf8_general_ci;

USE javas;

CREATE TABLE tb_materias(
	m_id INT(4) NOT NULL AUTO_INCREMENT,
	m_nombre CHAR(50) NOT NULL,
	PRIMARY KEY(m_id)
);

CREATE TABLE tb_distractores(
	d_id INT(4) NOT NULL AUTO_INCREMENT,
	distractor CHAR(50) NOT NULL,
	/*m_id*/
	PRIMARY KEY(d_id)
);

CREATE TABLE tb_preguntas(
	p_id INT(4) NOT NULL AUTO_INCREMENT,
	enunciado CHAR(200) NOT NULL,
	respuesta CHAR(200) NOT NULL,
	nivel INT(1) NOT NULL,
	m_id INT(4) NOT NULL,
	PRIMARY KEY(p_id)
);

CREATE TABLE tb_usuarios(
	u_id INT(10) NOT NULL,
	u_nombre CHAR(200) NOT NULL,
	p_id int(4) NOT NULL,
	clave CHAR(20) NOT NULL,
	corre_e CHAR(100) NOT NULL,
	PRIMARY KEY(u_id)
)ENGINE = INNODB;

CREATE TABLE tb_perfiles(
	p_id INT(4) NOT NULL,
	p_nombre CHAR(100) NOT NULL,
	PRIMARY KEY(p_id)
)ENGINE = INNODB;


alter table tb_usuarios add foreign key (p_id) references tb_perfiles (p_id);

