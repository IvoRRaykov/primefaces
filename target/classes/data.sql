INSERT INTO cars (brand, year, color) VALUES
  ('Audi', 1992, 'Red'),
  ('Fiat', 2001, 'Red'),
  ('Mercedes', 1991, 'Brown'),
  ('Fiat', 1962, 'Black'),
  ('Renault', 1997, 'Brown'),
  ('Renault', 1967, 'Maroon'),
  ('Renault', 1986, 'Yellow'),
  ('BMW', 1970, 'Maroon'),
  ('Fiat', 1990, 'Silver'),
  ('Renault', 1972, 'Black');

INSERT INTO owners (lastName) VALUES
    ('Pesho'),('Misho'),('Kosyo');

INSERT INTO carOwners (carId, ownerId) VALUES
    (1,1), (1,2),(1,3),
    (2,1),(2,2);

INSERT INTO tyres (manufacturer) VALUES
('Mishelin'),('Goodyer');

INSERT INTO carTyres (carId, tyreId) VALUES
    (1,1),
    (2,1),(2,2),
    (3,1),
    (4,2),
    (5,2);

INSERT INTO users (enabled, password, role, username) VALUES
    (true, '$2a$10$YYf3ANYshH/43xAzxDoRC.4FLNF//uV1ne.h.xPIU6DGJ/C/GGi1.', 'ADMIN', 'ivoqwe');