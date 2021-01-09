/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     08/01/2021 0:07:41                           */
/*==============================================================*/


drop table if exists CLIENTE;

drop table if exists CUENTA;

drop table if exists MOVIMIENTO;

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE
(
   INT_CLIECODIGO       int(11) AUTO_INCREMENT not null,
   VCH_CLIENOMBRE       varchar(50),
   VCH_CLIEAPELLIDO     varchar(50),
   VCH_CLIECEDULA       varchar(10),
   VCH_CLIEDIRECCION    varchar(100),
   VCH_CLIETELEFONO     varchar(20),
   VCH_CLIEEMAIL        varchar(100),
   primary key (INT_CLIECODIGO)
);

/*==============================================================*/
/* Table: CUENTA                                                */
/*==============================================================*/
create table CUENTA
(
   INT_CUENCODIGO       int(11) AUTO_INCREMENT not null,
   INT_CLIECODIGO       int not null,
   VCH_CUENNUMERO       varchar(10),
   VCH_CUENTIPO         varchar(64),
   DEC_CUENSALDO        decimal(12,2),
   DTT_CUENFECHACREACION date,
   primary key (INT_CUENCODIGO)
);

/*==============================================================*/
/* Table: MOVIMIENTO                                            */
/*==============================================================*/
create table MOVIMIENTO
(
   INT_MOVICODIGO       int(11) AUTO_INCREMENT not null,
   INT_CUENCODIGO       int not null,
   DTT_MOVIFECHA        date,
   VCH_MOVITIPO         char(64),
   DEC_MOVIVALOR        decimal(12,2),
   DEC_MOVISALDOFINAL   decimal(12,2),
   VCH_MOVICUENTORIG    varchar(10),
   VCH_MOVICUENTDEST    varchar(10),
   primary key (INT_MOVICODIGO)
);

alter table CUENTA add constraint FK_RELATIONSHIP_1 foreign key (INT_CLIECODIGO)
      references CLIENTE (INT_CLIECODIGO) on delete restrict on update restrict;

alter table MOVIMIENTO add constraint FK_RELATIONSHIP_2 foreign key (INT_CUENCODIGO)
      references CUENTA (INT_CUENCODIGO) on delete restrict on update restrict;

