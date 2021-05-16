# sistemaCadastroAnuncio
Projeto feito com Java e JDBC 

Olá,

Primeiro gostaria de agradecer por essa nova oportunidade de está participando desse processo seletivo e gostaria de dizer que fiz as duas questoes da maneira que entende e com o nivel de conhecimento que possui no momento da realização. 

Banco de dados utilizado: postgresql
Nome do banco: cadastroAnuncio
SQL de criação {

CREATE DATABASE "cadastroAnuncio"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;
 }
 
 SQL de criação da tabela anuncio {
 
 CREATE TABLE public.anuncio
(
  id integer NOT NULL,
  nomeanuncio character varying,
  cliente character varying,
  datainicio character varying,
  datatermino character varying,
  investimentodia integer,
  maxcom integer,
  qpca integer,
  quantv integer,
  CONSTRAINT anuncio_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.anuncio
  OWNER TO postgres;
}

Para fazer o teste do projeto se iniciar pela criação do banco de dados passado acima e pela injeção de dados atraves do daoAnuncio e os testes são feitos no pacote src/test/java onde utilizo o JUnit para fazer esse procedimento.
