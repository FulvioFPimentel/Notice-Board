INSERT INTO tb_person (name, cell_phone, password) VALUES ('Osvaldo', '18-98814-2547', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Leandro Brito', '18-98813-1487', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Rodrigo Silva', '18-98813-1585', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Messias Pimentel', '18-98813-8547', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Nair Pimentel', '18-98813-7412', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Benedito Militão', '18-98813-9658', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Maria Jose', '18-98813-2255', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Eva Calicito', '18-98813-5847', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Vilma Brito', '18-98813-1254', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Valeria Rocha', '18-98813-2547', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Poliane Gato', '18-98813-5841', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Julio Blecha', '18-98813-3321', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (privilege) VALUES ('ROLE_USER');
INSERT INTO tb_role (privilege) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (privilege) VALUES ('ROLE_ADMIN');

INSERT INTO tb_designation (designation) VALUES ("Orador");
INSERT INTO tb_designation (designation) VALUES ("Primeiro participante");
INSERT INTO tb_designation (designation) VALUES ("Ajudante");
INSERT INTO tb_designation (designation) VALUES ("Leitor");
INSERT INTO tb_designation (designation) VALUES ("Indicador");
INSERT INTO tb_designation (designation) VALUES ("Imagem");
INSERT INTO tb_designation (designation) VALUES ("Video");
INSERT INTO tb_designation (designation) VALUES ("Volante");

INSERT INTO tb_person_role (person_id, role_id) VALUES (1, 2);
INSERT INTO tb_person_role (person_id, role_id) VALUES (2, 3);
INSERT INTO tb_person_role (person_id, role_id) VALUES (3, 3);
INSERT INTO tb_person_role (person_id, role_id) VALUES (4, 3);
INSERT INTO tb_person_role (person_id, role_id) VALUES (5, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (6, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (7, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (8, 1);

INSERT INTO tb_meeting (date, presidency) VALUES (TIMESTAMP WITH TIME ZONE '2021-11-25', 'Leandro Brito');
INSERT INTO tb_meeting (date, presidency) VALUES (TIMESTAMP WITH TIME ZONE '2021-11-30', 'Rodrigo Silva');
INSERT INTO tb_meeting (date, presidency) VALUES (TIMESTAMP WITH TIME ZONE '2021-12-05', 'Messias Pimentel');
INSERT INTO tb_meeting (date, presidency) VALUES (TIMESTAMP WITH TIME ZONE '2021-12-10', 'Leandro Brito');
INSERT INTO tb_meeting (date, presidency) VALUES (TIMESTAMP WITH TIME ZONE '2021-12-15', 'Rodrigo Silva');
INSERT INTO tb_meeting (date, presidency) VALUES (TIMESTAMP WITH TIME ZONE '2021-12-20', 'Messias Pimentel');

INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (25, 'Os filhos ungidos de Jeová', '1 Pedro 2:9', 1);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (79, 'Ensine-os a se manter firmes', 'Mateus 28:19-20', 1);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (75, 'Estou aqui!', 'Isaías 6:8', 1);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (105, 'Deus é amor', '1 João 4:7-8', 2);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (8, 'Jeová é um refúgio', 'Salmo 91', 2);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (83, 'De casa em casa', 'Atos 20:20', 2);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (25, 'Os filhos ungidos de Jeová', '1 Pedro 2:9', 3);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (79, 'Ensine-os a se manter firmes', 'Mateus 28:19-20', 3);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (75, 'Estou aqui!', 'Isaías 6:8', 3);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (105, 'Deus é amor', '1 João 4:7-8', 4);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (8, 'Jeová é um refúgio', 'Salmo 91', 4);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (83, 'De casa em casa', 'Atos 20:20', 4);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (25, 'Os filhos ungidos de Jeová', '1 Pedro 2:9', 5);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (79, 'Ensine-os a se manter firmes', 'Mateus 28:19-20', 5);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (75, 'Estou aqui!', 'Isaías 6:8', 5);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (105, 'Deus é amor', '1 João 4:7-8', 6);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (8, 'Jeová é um refúgio', 'Salmo 91', 6);
INSERT INTO tb_canticle (number, title, text, meeting_id) VALUES (83, 'De casa em casa', 'Atos 20:20', 6);

INSERT INTO tb_session (session, meeting_id) VALUES ('TESOUROS DA PALAVRA DE DEUS', 1);
INSERT INTO tb_session (session, meeting_id) VALUES ('FAÇA SEU MELHOR NO MINISTÉRIO', 1);
INSERT INTO tb_session (session, meeting_id) VALUES ('NOSSA VIDA CRISTÃ', 1);
INSERT INTO tb_session (session, meeting_id) VALUES ('TESOUROS DA PALAVRA DE DEUS', 2);
INSERT INTO tb_session (session, meeting_id) VALUES ('FAÇA SEU MELHOR NO MINISTÉRIO', 2);
INSERT INTO tb_session (session, meeting_id) VALUES ('NOSSA VIDA CRISTÃ', 2);
INSERT INTO tb_session (session, meeting_id) VALUES ('TESOUROS DA PALAVRA DE DEUS', 3);
INSERT INTO tb_session (session, meeting_id) VALUES ('FAÇA SEU MELHOR NO MINISTÉRIO', 3);
INSERT INTO tb_session (session, meeting_id) VALUES ('NOSSA VIDA CRISTÃ', 3);
INSERT INTO tb_session (session, meeting_id) VALUES ('TESOUROS DA PALAVRA DE DEUS', 4);
INSERT INTO tb_session (session, meeting_id) VALUES ('FAÇA SEU MELHOR NO MINISTÉRIO', 4);
INSERT INTO tb_session (session, meeting_id) VALUES ('NOSSA VIDA CRISTÃ', 4);
INSERT INTO tb_session (session, meeting_id) VALUES ('TESOUROS DA PALAVRA DE DEUS', 5);
INSERT INTO tb_session (session, meeting_id) VALUES ('FAÇA SEU MELHOR NO MINISTÉRIO', 5);
INSERT INTO tb_session (session, meeting_id) VALUES ('NOSSA VIDA CRISTÃ', 5);
INSERT INTO tb_session (session, meeting_id) VALUES ('TESOUROS DA PALAVRA DE DEUS', 6);
INSERT INTO tb_session (session, meeting_id) VALUES ('FAÇA SEU MELHOR NO MINISTÉRIO', 6);
INSERT INTO tb_session (session, meeting_id) VALUES ('NOSSA VIDA CRISTÃ', 6);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 1);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 1);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 1);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 2);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 2);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 2);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 3);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 3);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 3);

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

INSERT INTO tb_designation (designation, meeting_id) VALUES ("Orador");
INSERT INTO tb_designation (designation, meeting_id) VALUES ("Primeiro participante");
INSERT INTO tb_designation (designation, meeting_id) VALUES ("Ajudante");
INSERT INTO tb_designation (designation, meeting_id) VALUES ("Leitor");
INSERT INTO tb_designation (designation, meeting_id) VALUES ("Indicador");
INSERT INTO tb_designation (designation, meeting_id) VALUES ("Imagem");
INSERT INTO tb_designation (designation, meeting_id) VALUES ("Video");
INSERT INTO tb_designation (designation, meeting_id) VALUES ("Volante");

INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Inicio', 2, 1);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Fim', 3, 1);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Inicio', 1, 2);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Fim', 6, 2);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Inicio', 2, 3);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Fim', 3, 3);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Inicio', 1, 4);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Fim', 6, 4);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Inicio', 2, 5);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Fim', 3, 5);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Inicio', 1, 6);
INSERT INTO tb_prayer (moment, person_id, meeting_id) VALUES ('Fim', 6, 6);











