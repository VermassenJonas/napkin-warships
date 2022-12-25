insert into ship_type(name)	values ("Battleship")

insert into nation(id, name)	values (-99, "USA")
insert into nation(id, name)	values (-98, "UK")
insert into nation(id, name)	values (-97, "France")
insert into nation(id, name)	values (-96, "Japan")
insert into nation(id, name)	values (-95, "Germany")
insert into nation(id, name)	values (-94, "Italy")

insert into ship(id, nation_id, name, laid_down_date, ship_class, ship_type_name) values(-98,-99,	"Missouri",		DATE '1939-11-22', "Iowa", 		"Battleship")
insert into ship(id, nation_id, name, laid_down_date, ship_class, ship_type_name) values(-99,-99,	"Iowa", 			DATE '1938-11-22', "Iowa", 		"Battleship")
insert into ship(id, nation_id, name, laid_down_date, ship_class, ship_type_name) values(-97,-99,	"New Jersey", 	DATE '1939-05-22', "Iowa", 		"Battleship")

insert into gun(id, nation_id, caliber, barrel) values(-99,-99, "5 inch", "L/38" )
insert into gun(id, nation_id, caliber, barrel) values(-98,-98, "5 inch", "L/38" )
insert into gun(id, nation_id, caliber, barrel) values(-97,-97, "5 inch", "L/38" )
insert into gun(id, nation_id, caliber, barrel) values(-96,-96, "5 inch", "L/38" )