create table bateau (
    ID_Bateau serial ,
    Categorie VARCHAR (25),
    Pavillon INT
);

create table quai (
    ID_Quai serial,
    Profondeur INT
);

create table prestation (
    ID_Prestation serial,
    ID_Quai INT,
    ID_Bateau INT,
    Remorquage 
);

create table categorie_Bateau (
    ID_Categorie serial,
    Categorie VARCHAR (25),
    Prix_Categorie INT
);

create table Pavillon (
    ID_Pavillon serial,
    Pavillon VARCHAR (25),
    Prix_Pavillon INT
);

create table Stationnement (
    ID_Station serial,
    ID_Quai INT,
    Prix_par_quai INT
);

create table Remorquage (
    ID_Remorquage serial,
    ID_Bateau INT,
    Prix_par_bateau INT
);

create table Reparation (
    ID_Reparation serial,
    ID_Bateau INT,
    Prix_par_duree_bateau INT
);
