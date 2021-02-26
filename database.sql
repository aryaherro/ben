/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     26/02/2021 22:03:36                          */
/*==============================================================*/


/*==============================================================*/
/* Table: Customer                                              */
/*==============================================================*/
create table Customer
(
   idCustomer           int not null  comment '',
   nameCustomer         varchar(254)  comment '',
   address              varchar(254)  comment '',
   primary key (idCustomer)
);

/*==============================================================*/
/* Table: "Order"                                               */
/*==============================================================*/
create table "Order"
(
   idOrder              int not null  comment '',
   idCustomer           int not null  comment '',
   date                 datetime  comment '',
   status               varchar(254)  comment '',
   primary key (idOrder),
   constraint FK_ORDER_ASSOCIATI_CUSTOMER foreign key (idCustomer)
      references Customer (idCustomer) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Cash                                                  */
/*==============================================================*/
create table Cash
(
   idOrder              int not null  comment '',
   idCash               int not null  comment '',
   amount               float  comment '',
   cashTendered         float  comment '',
   primary key (idOrder, idCash),
   constraint FK_CASH_ASSOCIATI_ORDER foreign key (idOrder)
      references "Order" (idOrder) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: "Check"                                               */
/*==============================================================*/
create table "Check"
(
   idOrder              int not null  comment '',
   idCheck              int not null  comment '',
   amount               float  comment '',
   nameCheck            varchar(254)  comment '',
   bankID               varchar(254)  comment '',
   primary key (idOrder, idCheck),
   constraint FK_CHECK_ASSOCIATI_ORDER foreign key (idOrder)
      references "Order" (idOrder) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Credit                                                */
/*==============================================================*/
create table Credit
(
   idOrder              int not null  comment '',
   idCredit             int not null  comment '',
   amount               float  comment '',
   nameCredit           varchar(254)  comment '',
   type                 varchar(254)  comment '',
   expDate              datetime  comment '',
   primary key (idOrder, idCredit),
   constraint FK_CREDIT_ASSOCIATI_ORDER foreign key (idOrder)
      references "Order" (idOrder) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: OrderDetail                                           */
/*==============================================================*/
create table OrderDetail
(
   idOrderDetail        int not null  comment '',
   idOrder              int not null  comment '',
   quantity             int  comment '',
   taxStatus            varchar(254)  comment '',
   primary key (idOrderDetail),
   constraint FK_ORDERDET_ASSOCIATI_ORDER foreign key (idOrder)
      references "Order" (idOrder) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Item                                                  */
/*==============================================================*/
create table Item
(
   idItem               int not null  comment '',
   idOrderDetail        int  comment '',
   shippingWeight       int  comment '',
   description          varchar(254)  comment '',
   primary key (idItem),
   constraint FK_ITEM_ASSOCIATI_ORDERDET foreign key (idOrderDetail)
      references OrderDetail (idOrderDetail) on delete restrict on update restrict
);

