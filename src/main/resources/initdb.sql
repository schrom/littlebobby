drop table if exists artikel
drop table if exists logindata
create table artikel (id bigint, name varchar, preis integer)
insert into artikel values (73144100, 'Schrauben verzinkt', 2)
insert into artikel values (73144101, 'Heimwerken leicht gemacht (Buch)', 19)
insert into artikel values (73144200, 'Schrauben 3/4 Zoll', 3)
insert into artikel values (73144201, 'Discount Schrauben', 1)
insert into artikel values (73144202, 'Bauanleitung Buchregal', 11)
insert into artikel values (73144300, 'Schraubendreher kreuz', 2)
insert into artikel values (73144301, 'Schraubendreher', 2)
insert into artikel values (73144401, 'Hammer', 4)
insert into artikel values (73144402, 'Gummihammer', 6)
insert into artikel values (73144403, 'Kleiner Hammer', 5)
insert into artikel values (73144500, 'Bauarbeiter-Helm', 9)
create table logindata (username varchar, email varchar, password varchar)
insert into logindata values ('admin', 'admin@littlebobby.shop', '$2a$04$M.hXoMvV3YoT42wCrTQtsuvKcy3cbS5ElaLZM48KTUvK.Gh2F29ga') -- nimda
insert into logindata values ('schrom', 'schrom@netpioneer.de', '$2a$04$d2ImSjqmEI0Kp0w3N38xkuuanmbvwRpEafqeHkRpYZnj03aByOLVe') -- banane
insert into logindata values ('gerda',  'gerda@t-online.de', '$2a$04$CB4IFzdzzOTiUqOVn1hp4OF7VqruvOF75phGgYyztcvIXwiNO0ECS') -- geheim
