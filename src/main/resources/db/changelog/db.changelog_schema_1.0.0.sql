CREATE SEQUENCE test_schema.testtableseq START WITH 1;

create table test_schema.test_table
(
    id integer NOT NULL DEFAULT nextval('test_schema.testtableseq'),
    name text,
    description text
);

insert into test_schema.test_table values (nextval('testtableseq'), 'name1', 'description1');
insert into test_schema.test_table values (nextval('testtableseq'), 'name2', 'description2');
insert into test_schema.test_table values (nextval('testtableseq'), 'name3', 'description3');