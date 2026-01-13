CREATE TABLE medicos (
                         id BIGINT NOT NULL AUTO_INCREMENT,
                         nombre VARCHAR(100) NOT NULL,
                         email VARCHAR(100) NOT NULL,
                         documento VARCHAR(20) NOT NULL,
                         especialidad VARCHAR(50) NOT NULL,

                         calle VARCHAR(100),
                         numero VARCHAR(20),
                         complemento VARCHAR(20),
                         barrio VARCHAR(100),
                         codigo_postal VARCHAR(10),
                         ciudad VARCHAR(100),
                         estado VARCHAR(50),

                         PRIMARY KEY (id)
);
