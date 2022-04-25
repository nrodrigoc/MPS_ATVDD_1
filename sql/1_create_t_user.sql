CREATE TABLE T_USER(
      codigo serial primary key,
      login varchar (40),
      senha varchar (40),
      tipo varchar (1)
);

CREATE sequence S_USER
    increment 1
start 1;