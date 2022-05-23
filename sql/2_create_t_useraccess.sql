CREATE TABLE T_USERACCESS(
                       codigo serial primary key,
                       dataAcesso varchar (40),
                       codigoUsuario integer ,
);

CREATE sequence USERACCESS
    increment 1
start 1;