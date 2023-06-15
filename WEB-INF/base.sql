

create table categorie_Bateau (
    ID_Categorie serial ,
    Categorie VARCHAR (25),
    Prix_Categorie INT,
    PRIMARY KEY (ID_Categorie, Categorie)
);

ALTER TABLE categorie_Bateau ADD CONSTRAINT pk_categorie UNIQUE (Categorie);

create table bateau 
(
    ID_Bateau serial primary key,
    Nom_Bateau varchar(50),
    Categorie VARCHAR (25),
    Pavillon INT,
<<<<<<< Updated upstream
    Profondeur INT,
    foreign key (Categorie) references categorie_bateau(Categorie)
=======
    Profondeur DECIMAL(10,2),
    foreign key (Categorie) references categorie_Bateau(Categorie)
>>>>>>> Stashed changes
);

create table prevision
(
    ID_Prevision INT primary key,
    ID_Bateau int,
    DateDebut Timestamp,
    DateFin Timestamp,
    foreign key(ID_Bateau) references bateau(ID_bateau)
);



create table quai (
    ID_Quai serial primary key,
    Profondeur DECIMAL(10,2)
);

ALTER TABLE prevision ADD CONSTRAINT uc_prevision UNIQUE (ID_Prevision);

create table proposition
(
    ID_Proposition serial primary key,
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





