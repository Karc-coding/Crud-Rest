drop database if exists libreapp;
create database if not exists libreapp;

use libreapp;

INSERT INTO `libreapp`.`tb_user` (`id_user`, `address_user`, `dni_user`, `email_user`, `lst_name_user`, `login_user`, `name_user`, `pass_user`)
	VALUES ('1', '30 Rue René Boulanger 75010 Paris', '15462819', 'willie.jennings@example.com', 'Hawkins', 'whitefish664', 'Soham', 'Fbhereicome'),
			('2', '3 rue Paul Bert 75011 Paris', '84751295', 'ehagenes@hermann.org', 'Warner', 'canarylarruped', 'Kyle', '58949baby'),
			('3', '5 Rue Sedaine 75011 Paris', '72022684', 'reece90@yahoo.com', 'Dyer', 'datebookbully', 'Arlene', 'JoManJII007'),
			('4', '15 rue des Couronnes 75020 Paris', '78481526', 'gulgowski.edgar@gmail.com', 'Benton', 'juncturedrench', 'Max', '58949baby'),
			('5', '200 Quai de Valmy 75010 Paris', '63857425', 'kshlerin.german@ledner.com', 'Hamilton', 'mantraolympics', 'Soham', '25252gg'),
			('6', '18 rue de Belleville 75020 Paris', '59482615', 'ybreitenberg@gmail.com', 'Banks', 'snashpurplish', 'Arlene', '6666dgg'),
			('7', '147 Boulevard Voltaire 75011 Paris', '45786598', 'tevin44@gmail.com', 'Washington', 'rheologymandarin', 'Colleen', 'Love2workinf');

select * from tb_user;