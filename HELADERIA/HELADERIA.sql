
/*==============================================================*/
/* Table: CARACTERISTICA                                        */
/*==============================================================*/
create table CARACTERISTICA (
   ID_CARACTERISTICA    INT4                 not null,
   NOMBRE               VARCHAR(200)          not null,
   DESCRIPCION          VARCHAR(100)         not null,
   CANTIDAD             INT2                 not null,
   constraint PK_CARACTERISTICA primary key (ID_CARACTERISTICA)
);

/*==============================================================*/
/* Index: CARACTERISTICA_PK                                     */
/*==============================================================*/
create unique index CARACTERISTICA_PK on CARACTERISTICA (
ID_CARACTERISTICA
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE (
   ID_CLIENTE           INT4                 not null,
   NOMBRE               VARCHAR(20)          not null,
   APELLIDO             VARCHAR(20)          not null,
   DIRECCION            VARCHAR(50)          not null,
   CORREO               VARCHAR(15)          not null,
   TELEFONO             INT4                 not null,
   constraint PK_CLIENTE primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Index: CLIENTE_PK                                            */
/*==============================================================*/
create unique index CLIENTE_PK on CLIENTE (
ID_CLIENTE
);

/*==============================================================*/
/* Table: FACTURACION                                           */
/*==============================================================*/
create table FACTURACION (
   ID_FACTURACION       INT4                 not null,
   ID_VENTA             INT4                 null,
   ID_CLIENTE           INT4                 null,
   PRECIO               INT4                 not null,
   SUBTOTAL             INT4                 not null,
   SERVICIO             INT4                 not null,
   TOTAL                INT4                 not null,
   IVA                  INT4                 not null,
   constraint PK_FACTURACION primary key (ID_FACTURACION)
);

/*==============================================================*/
/* Index: FACTURACION_PK                                        */
/*==============================================================*/
create unique index FACTURACION_PK on FACTURACION (
ID_FACTURACION
);

/*==============================================================*/
/* Index: RELATIONSHIP_16_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_16_FK on FACTURACION (
ID_VENTA
);

/*==============================================================*/
/* Index: RELATIONSHIP_18_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_18_FK on FACTURACION (
ID_CLIENTE
);

/*==============================================================*/
/* Table: PRODUCTO                                            */
/*==============================================================*/
create table PRODUCTO (
   ID_PRODUCTO        INT4                 not null,
   ID_GESTION_BODEGA    INT4                 null,
   ID_CARACTERISTICA    INT4                 null,
   NOMBRE               VARCHAR(20)          not null,
   ESTADO               BOOL                 not null,
   CATEGORIA            INT2                 not null,
   DESCRIPCION          VARCHAR(200)          not null,
   constraint PK_PRODUCTO primary key (ID_PRODUCTO)
);

/*==============================================================*/
/* Index: PRODUCTO_PK                                */
/*==============================================================*/
create unique index PRODUCTO_PK on PRODUCTO (
ID_PRODUCTO
);

/*==============================================================*/
/* Index: RELATIONSHIP_10_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_10_FK on PRODUCTO (
ID_GESTION_BODEGA
);

/*==============================================================*/
/* Index: RELATIONSHIP_11_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_11_FK on PRODUCTO (
ID_CARACTERISTICA
);


/*==============================================================*/
/* Table: VENTA                                           */
/*==============================================================*/
create table VENTA (
   ID_VENTA             INT4                 not null,
   ID_PRODUCTO          INT4                 null,
   ID_CLIENTE           INT4                 null,
   CANTIDAD_VENTAS      INT2                 not null,
   FECHA_VENTAS         DATE                 not null,
   ESTADO               BOOL                 not null,
   PRECIO               INT4                 not null,
   constraint PK_VENTA primary key (ID_VENTA)
);

/*==============================================================*/
/* Index: VENTA_PK                                        */
/*==============================================================*/
create unique index VENTAS_PK on VENTA (
ID_VENTA
);

/*==============================================================*/
/* Index: RELATIONSHIP_12_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_12_FK on VENTA (
ID_PRODUCTO
);
/*==============================================================*/
/* Index: RELATIONSHIP_13_FK                                    */
/*==============================================================*/
create  index RELATIONSHIP_13_FK on VENTA (
ID_CLIENTE
);


/*==============================================================*/
/* Table: GESTION_BODEGA                                       */
/*==============================================================*/
create table GESTION_BODEGA (
   ID_GESTION_BODEGA     INT4                 not null,
   NOMBRE               VARCHAR(20)          not null,
   DESCRIPCION          VARCHAR(100)         null,
   CANTIDAD             INT2                 not null,
   ESTADO               BOOL                 null,
   constraint PK_GESTION_BODEGA primary key (ID_GESTION_BODEGA)
);

/*==============================================================*/
/* Index: GESTION_BODEGA_PK                                    */
/*==============================================================*/
create unique index GESTION_BODEGA_PK on GESTION_BODEGA  (
ID_GESTION_BODEGA  
);



alter table FACTURACION
   add constraint FK_FACTURAC_RELATIONS_VENTA foreign key (ID_VENTA)
      references VENTA (ID_VENTA)
      on delete restrict on update restrict;

alter table FACTURACION
   add constraint FK_FACTURAC_RELATIONS_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on delete restrict on update restrict;

alter table PRODUCTO
   add constraint FK_PRODUCT_RELATIONS_GEST_BO foreign key (ID_GESTION_BODEGA)
      references GESTION_BODEGA  (ID_GESTION_BODEGA)
      on delete restrict on update restrict;

alter table PRODUCTO
   add constraint FK_PRODUCT_RELATIONS_CARACTER foreign key (ID_CARACTERISTICA)
      references CARACTERISTICA  (ID_CARACTERISTICA)
      on delete restrict on update restrict;

alter table VENTA
   add constraint FK_VENTA_RELATIONS_PRODUCT foreign key (ID_PRODUCTO)
      references PRODUCTO  (ID_PRODUCTO)
      on delete restrict on update restrict;

alter table VENTA
   add constraint FK_VENTA_RELATIONS_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on delete restrict on update restrict;