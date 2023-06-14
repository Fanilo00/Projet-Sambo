

create table bateau 
(
    ID_Bateau serial primary key,
    Categorie VARCHAR (25),
    Pavillon INT,
    foreign key (Categorie) references categorie_bateau(Categorie)
);

create table quai (
    ID_Quai serial primary key,
    Profondeur INT
);

create table prestation (
    ID_Prestation serial primary key,
    ID_Quai INT,
    ID_Bateau INT,
    Remorquage 
    foreign key (ID_Quai) references quai(ID_Quai),
    foreign key (ID_Bateau) references quai(ID_Bateau)

);

create table categorie_Bateau (
    ID_Categorie serial primary key,
    Categorie VARCHAR (25) primary key,
    Prix_Categorie INT
);

create table Pavillon (
    ID_Pavillon serial primary key,
    Pavillon VARCHAR (25),
    Prix_Pavillon INT
);

create table Stationnement (
    ID_Station serial primary key,
    ID_Quai INT,
    Prix_par_quai INT
    foreign key (ID_Quai) references quai(ID_Quai),
);

create table Remorquage 
(
    ID_Remorquage serial primary key,
    ID_Quai INT,
    Prix_par_quai INT
    foreign key (ID_Quai) references quai(ID_Quai),
);

create table Reparation 
(
    ID_Reparation serial,
    ID_Bateau INT,
    Prix_par_duree_bateau INT
    foreign key (ID_Bateau) references quai(ID_Bateau)
);

create table Prevision
(
    ID_Prevision serial primary key,
    ID_Bateau INT,

);
