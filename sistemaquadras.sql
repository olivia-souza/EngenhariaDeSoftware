USE sistemaquadras;

CREATE TABLE usuarios(
	id_usuario int NOT NULL AUTO_INCREMENT,
	nome_usuario varchar(50) NOT NULL,
	email_usuario varchar(50) NOT NULL,
	senha_usuario varchar(15) NOT NULL,
	nivel_permissao_usuario varchar(2) NOT NULL,
	data_criacao date NOT NULL,
	PRIMARY KEY(id_usuario)
);

CREATE TABLE quadras(
	id_quadra int NOT NULL AUTO_INCREMENT,
	cobertura_quadra boolean NOT NULL,
	arquibancada_quadra boolean NOT NULL,
	banco_quadra boolean NOT NULL, 
	tipo_quadra varchar(20) NOT null,
	PRIMARY KEY(id_quadra)
);

CREATE TABLE clientes(
	id_cliente int NOT NULL AUTO_INCREMENT,
	nome_cliente varchar(50) NOT NULL,
	cpf_cliente varchar(15) NOT NULL,
	PRIMARY KEY(id_cliente)
);

CREATE TABLE reservas(
	id_reserva int NOT NULL AUTO_INCREMENT,
	data_inicio_reserva datetime NOT NULL,
    data_termino_reserva datetime NOT NULL,
    entrada_reserva datetime NOT NULL,
    saida_reserva datetime NOT NULL,
    reserva_id_quadra int NOT NULL,
    reserva_id_cliente int NOT NULL,
    PRIMARY KEY(id_reserva),
    FOREIGN KEY(reserva_id_quadra) REFERENCES quadras(id_quadra),
    FOREIGN KEY(reserva_id_cliente) REFERENCES clientes(id_cliente)
);

CREATE TABLE usuarios_reservas(
	id_usuario_reserva int NOT NULL AUTO_INCREMENT,
    usuario_id_usuario int NOT NULL,
    reserva_id_reserva int NOT NULL,
    PRIMARY KEY(id_usuario_reserva),
    FOREIGN KEY(usuario_id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY(reserva_id_reserva) REFERENCES reservas(id_reserva)
);

CREATE TABLE usuarios_quadras(
	id_usuario_quadra int NOT NULL AUTO_INCREMENT,
    quadra_id_quadra int NOT NULL,
    usuario_id_usuario int NOT NULL,
    PRIMARY KEY(id_usuario_quadra),
    FOREIGN KEY(quadra_id_quadra) REFERENCES quadras(id_quadra),
    FOREIGN KEY(usuario_id_usuario) REFERENCES usuarios(id_usuario)
);

select * from reservas

