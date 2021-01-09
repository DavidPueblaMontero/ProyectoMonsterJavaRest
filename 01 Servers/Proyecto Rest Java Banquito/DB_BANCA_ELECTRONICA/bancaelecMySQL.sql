/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     07/01/2021 23:10:32                          */
/*==============================================================*/


drop table if exists USUARIO;

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO
(
   INT_USUCODIGO        int(11) AUTO_INCREMENT not null,
   VCH_USUNOMBRE        varchar(50),
   VCH_USUAPELLIDO      varchar(50),
   VCH_USUCEDULA        varchar(10),
   VCH_USUDIRECCION     varchar(100),
   VCH_USUTELEFONO      varchar(20),
   VCH_USUEMAIL         varchar(100),
   VCH_USUUSUARIO       varchar(100),
   VCH_USUPASSWORD      varchar(100),
   primary key (INT_USUCODIGO)
);

