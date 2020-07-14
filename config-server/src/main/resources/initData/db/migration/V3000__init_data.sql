INSERT INTO employee values (1, 'Stefan', 'Perlic', '0638475688');
INSERT INTO employee values (2, 'Aleksandra', 'Levic', '0612225688',1);

INSERT INTO customer values (1, 'Marija', 'Markovic');
INSERT INTO customer values (2, 'Nikola', 'Nikolic');

insert into manufacturer values (1, 'Galenika');
insert into manufacturer values (2, 'Hemofarm');

insert into method_of_payment values (1, 'card');
insert into method_of_payment values (2, 'cash');

insert into product_type values (1, 'medicine');
insert into product_type values (2, 'other');
insert into product_type values (3, 'apparel');

insert into product values (1, 'brufen', 340, 1, 1);
insert into product values (2, 'andol', 200, 2, 2);

insert into receipt values (1,500,'1.5.2020',1,1,1);
insert into receipt values (2,200,'1.7.2020',1,2,2);

insert into supplier values (1, 'Lekovi Novi Sad');
insert into supplier values (2, 'Vega');

insert into supplies values (1,1,1);
insert into supplies values (2,2,2);

insert into receipt_product values (1,1,1);
insert into receipt_product values (2,2,2);