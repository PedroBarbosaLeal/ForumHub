CREATE TABLE topicos(
    Id SERIAL PRIMARY KEY,
    titulo VARCHAR(200) not null,
    mensagem varchar(1000) NOT NULL,
    data_criacao timestamp not null,
    estado_topico varchar(50) not null,
    autor varchar(100) not null,
    curso varchar(100) not null
);