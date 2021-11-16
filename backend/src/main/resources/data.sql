INSERT INTO tb_meeting (date, presidency) VALUES (TIMESTAMP WITH TIME ZONE '2021-11-25', 'Leandro Brito');
INSERT INTO tb_meeting (date, presidency) VALUES (TIMESTAMP WITH TIME ZONE '2021-11-30', 'Rodrigo Silva');

INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (25, 'Os filhos ungidos de Jeová', '1 Pedro 2:9', 1);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (79, 'Ensine-os a se manter firmes', 'Mateus 28:19-20', 1);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (75, 'Estou aqui!', 'Isaías 6:8', 1);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (105, 'Deus é amor', '1 João 4:7-8', 2);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (8, 'Jeová é um refúgio', 'Salmo 91', 2);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (83, 'De casa em casa', 'Atos 20:20', 2);

INSERT INTO tb_session (session, meeting_id) VALUES ('TESOUROS DA PALAVRA DE DEUS', 2);
INSERT INTO tb_session (session, meeting_id) VALUES ('FAÇA SEU MELHOR NO MINISTÉRIO', 2);
INSERT INTO tb_session (session, meeting_id) VALUES ('NOSSA VIDA CRISTÃ', 2);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 1);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 1);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 1);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 2);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 2);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 2);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 3);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 3);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 3);

INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Osvaldo','Servo Ministerial', '18-98814-2547', '123456');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Leandro Brito','Ancião', '18-98813-1487', '456789gp');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Rodrigo Silva','Ancião', '18-98813-1585', '456789rs');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Messias Pimentel','Ancião', '18-98813-8547', '456789mp');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Nair Pimentel','Pioneira', '18-98813-7412', '456789np');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Benedito Militão','Servo Ministerial', '18-98813-9658', '456789bm');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Maria Jose','Pioneira', '18-98813-2255', '456789mj');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Eva Calicito','Pioneira', '18-98813-5847', '456789ev');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Vilma Brito','Pioneira', '18-98813-1254', '456789vb');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Valeria Rocha','Pioneira', '18-98813-2547', '456789vr');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Poliane Gato','Pioneira', '18-98813-5841', '456789pg');
INSERT INTO tb_person (name, privilege, cell_phone, password) VALUES ('Julio Blecha','Pioneira', '18-98813-3321', '456789jb');

INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (1, 1);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (2, 6);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (3, 12);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (4, 7);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (4, 8);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (5, 11);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (5, 10);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (6, 5);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (6, 9);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (7, 3);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (8, 2);
INSERT INTO tb_subsession_person (subsession_id, person_id) VALUES (9, 4);

INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Inicio', 2, 1);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Fim', 3, 1);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Inicio', 1, 2);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Fim', 6, 2);





