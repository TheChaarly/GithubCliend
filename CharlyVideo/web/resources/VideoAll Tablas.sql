// Script de videoall
create database videoall
GO
use videoall
GO
create table estado(
    id_estado int primary key auto_increment,
    estado varchar(80))
    engine=innodb;
GO
create table usuario(
    id_usu int primary key auto_increment,
    nombre varchar(50),
    paterno varchar(50),
    materno varchar(50),
    Tipo_usuario int,
    Password varchar(50),
    Estatus char(1),
    foto longblob,
    alias varchar(30),
    calle varchar(30),
    colonia  varchar(30),
    telefono varchar(30),
    fecha_nac date,
    fecha date,
    estado int,
    foreign key (estado) references estado(id_estado))
    engine = innodb;
GO
create table GeneroAnime(
    id_generoA int primary key auto_increment,
    nombre varchar(50),
    descripcion blob)
    engine=innodb;
GO
create table Animes (
    id_anime int primary key auto_increment,
    titulo_ori varchar(50), 
    titulo_secu varchar(50),
    descripcion blob,
    Genero_one int,
    Genero_two int,
    Genero_three int,
    Fecha_lanza date,
    Fecha_Fin date,
    Poster Longblob,
    Estatus enum ("Finalizado", "Emision", "Estreno"),
    Clasificacion enum ("A", "B", "B15","C"),        
    Estado boolean ,    
    Idioma varchar(50),
    Subtitulos varchar(50),
    Cap_actual int(4),
    Cap_fin int(4), 
    foreign key (genero_one) references generoanime(id_generoA),
    foreign key (genero_two) references generoanime(id_generoA),
    foreign key (genero_three) references generoanime(id_generoA))
     engine=innodb;
GO
create table Cap_Anime (
        id_capanime int primary key auto_increment, 
        id_anime int,
        num_cap int,
        titulo varchar(50),        
        Descripcion blob,
        Duracion int(3),
        fecha_extre date,
        Ruta varchar(100),
        foreign key (id_anime) references Animes(id_anime))
        engine=innodb;
GO
create table GeneroSeries (
    id_generoS int primary key auto_increment,
    nombre varchar(50),
    descripcion blob)
    engine=innodb;
GO
create table series (
        id_series int primary key auto_increment, 
        titulo_orig varchar(50), 
        titulo_secu varchar(50), 
        Descripcion blob,
        Duracion int(3),
        Genero_one int,
        Genero_two int,
        Genero_three int,
        Fecha_lanza date,
        Fecha_Fin date,
        Ruta varchar(100),
        Poster Longblob,
        Clasificacion enum ("A", "B", "B15","C"),
        Estatus enum ("Finalizado", "Emision", "Estreno"),
        Estado boolean ,
        Idioma varchar(50),
        Subtitulos varchar(50),
        Cap_actual int(4),
        Cap_fin int(4), 
        foreign key (genero_one) references GeneroSeries(id_generoS),
        foreign key (genero_two) references GeneroSeries(id_generoS),
        foreign key (genero_three) references GeneroSeries(id_generoS))
        engine=innodb;
GO
create table cap_series (
        id_capserie int primary key auto_increment, 
        id_serie int,
        num_cap int,
        titulo varchar(50),        
        Descripcion blob,
        Duracion int(3),
        fecha_extre date,
        Ruta varchar(100),
        foreign key (id_serie) references series(id_series))
        engine=innodb;
GO
create table GeneroPeliculas (
    id_generoP int primary key auto_increment,
    nombre varchar(50),
    descripcion blob)
    engine=innodb;    
GO
create table peliculas (
        id_peliculas int primary key auto_increment, 
        titulo_orig varchar(50), 
        titulo_secu varchar(50), 
        Descripcion blob,
        Duracion int(3),
        Genero_one int,
        Genero_two int,
        Genero_three int,
        Fecha_lanza date,
        Fecha_Fin date,
        Ruta varchar(100),
        Poster Longblob,
        Clasificacion enum ("A", "B", "B15","C"),
        Estatus enum ("Finalizado", "Emision", "Estreno"),
        Estado boolean ,
        Idioma varchar(50),
        Subtitulos varchar(50),
        Cap_actual int(4),
        Cap_fin int(4), 
        foreign key (genero_one) references GeneroPeliculas(id_generoP),
        foreign key (genero_two) references GeneroPeliculas(id_generoP),
        foreign key (genero_three) references GeneroPeliculas(id_generoP))
        engine=innodb;


        