INSERT INTO COMMENTAIRE("TEXT") VALUES ('TROP BIEN !!!!'), ('Le pire livre que j ai jamais lu');

INSERT INTO CATEGORIE("NOM") VALUES ('ENFANT'),('ADO'),('ADULTE');

INSERT INTO LIVRE("TITRE", "DATE_OF_PUBLICATION") VALUES ('LES MISERABLES', '2020-01-01');

INSERT INTO MICHELINE("NOM", "AGE") VALUES ('Micheline', 54);

INSERT INTO AUTEUR("NOM", "DATE_OF_BIRTH") VALUES 
                    ('JEAN-PARPAING','1234-01-02'), ('JEAN-MICHEL','2012-01-02'), ('JEAN-PIERRE PERNAUD', '2020-01-02'),('BRUNO SCHULZ','1942-04-18'),('VICTOR HUGO','1885-05-22'),('ANTOINE DE SAINT-EXUPERY','1900-04-04'),('ALEXANDRE DUMAS','1802-10-29');

INSERT INTO LIVRE_AUTEUR("LIVRE_ID", "AUTEUR_ID") VALUES (1,1);