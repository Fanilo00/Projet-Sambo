create user sambo identified by sambo;
    grant dba to sambo;
    connect sambo/sambo;


create sequence seq_categorie start with 1 increment by 1 ;
create table categorie_Bateau (
    ID_Categorie int,
    Categorie VARCHAR (25),
    Prix_Categorie INT,
    PRIMARY KEY (ID_Categorie,Categorie)
);

insert into categorie_Bateau values(seq_categorie.nextVal,'Peche',2000);
insert into categorie_Bateau values(seq_categorie.nextVal,'Marchandises',3000);
insert into categorie_Bateau values(seq_categorie.nextVal,'Petrolier',25000);
insert into categorie_Bateau values(seq_categorie.nextVal,'Paquebot',1000);

ALTER TABLE categorie_Bateau ADD CONSTRAINT pk_categorie UNIQUE (Categorie);


create sequence seq_bateau start with 1 increment by 1 ;
create table bateau 
(
    ID_Bateau int primary key,
    Nom_Bateau varchar(50),
    Categorie VARCHAR (25),
    Pavillon INT,
    Profondeur DECIMAL(10,2),
    foreign key (Categorie) references categorie_Bateau(Categorie)
);

create sequence seq_prevision start with 1 increment by 1 ;
create table prevision
(
    ID_Prevision INT primary key,
    ID_Bateau int,
    DateDebut Timestamp,
    DateFin Timestamp,
    foreign key(ID_Bateau) references bateau(ID_bateau)
);

create sequence seq_quai start with 1 increment by 1 ;

create table quai (
    ID_Quai int primary key,
    Profondeur DECIMAL(10,2)
);



create sequence seq_proposition start with 1 increment by 1 ;

create table proposition
(
    ID_Proposition int primary key,
    ID_Prevision int,
    ID_Quai int,
    foreign key(ID_Prevision) references Prevision(ID_Prevision)
);






-- create table prestation (
--     ID_Prestation serial primary key,
--     ID_Quai INT,
--     ID_Bateau INT,
--     Remorquage INT,
--     Stationnement INT,
--     foreign key (ID_Quai) references quai(ID_Quai),
--     foreign key (ID_Bateau) references quai(ID_Bateau)

-- );
-- /*Remorquage = prix par quai*/



-- create table Pavillon (
--     ID_Pavillon serial primary key,
--     Pavillon VARCHAR (25),
--     Prix_Pavillon INT
-- );

-- create table Reparation 
-- (
--     ID_Reparation serial,
--     ID_Bateau INT,
--     Prix_par_duree_bateau INT
--     foreign key (ID_Bateau) references quai(ID_Bateau)
-- );

-- create or replace view proposition as select b.ID_Bateau,b.Categorie,b.Pavillon,





