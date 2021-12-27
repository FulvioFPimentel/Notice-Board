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
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Fulvio Pimentel', '18-98813-5214', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Juninho Gato', '18-98813-5587', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (privilege) VALUES ('ROLE_USER');
INSERT INTO tb_role (privilege) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (privilege) VALUES ('ROLE_ADMIN');

INSERT INTO tb_person_role (person_id, role_id) VALUES (1, 2);
INSERT INTO tb_person_role (person_id, role_id) VALUES (2, 3);
INSERT INTO tb_person_role (person_id, role_id) VALUES (3, 3);
INSERT INTO tb_person_role (person_id, role_id) VALUES (4, 3);
INSERT INTO tb_person_role (person_id, role_id) VALUES (5, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (6, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (7, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (8, 1);

INSERT INTO tb_meeting (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-11-25');
INSERT INTO tb_meeting (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-11-30');
INSERT INTO tb_meeting (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-12-05');
INSERT INTO tb_meeting (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-12-10');
INSERT INTO tb_meeting (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-12-15');
INSERT INTO tb_meeting (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-12-20');

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

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 4);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 4);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 4);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 5);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 5);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 5);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 6);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 6);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 6);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 7);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 7);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 7);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 8);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 8);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 8);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 9);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 9);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 9);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 10);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 10);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 10);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 11);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 11);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 11);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 12);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 12);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 12);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 13);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 13);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 13);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 14);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 14);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 14);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 15);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 15);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 15);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 16);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 16);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 16);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 17);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 17);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 17);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 18);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 18);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 18);

INSERT INTO tb_designation (designation, subsession_id) VALUES ('Orador', 1);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Orador', 2);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Leitor', 3);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Participante Principal', 4);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Ajudante', 4);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Participante Principal', 5);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Ajudante', 5);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Participante Principal', 6);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Ajudante', 6);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Orador', 7);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Orador', 7);
INSERT INTO tb_designation (designation, subsession_id) VALUES ('Dirigente', 7);

INSERT INTO tb_designation_person (designation_id, person_id) VALUES (1, 1);
INSERT INTO tb_designation_person (designation_id, person_id) VALUES (2, 3);
INSERT INTO tb_designation_person (designation_id, person_id) VALUES (3, 12);
INSERT INTO tb_designation_person (designation_id, person_id) VALUES (4, 5);
INSERT INTO tb_designation_person (designation_id, person_id) VALUES (5, 8);
INSERT INTO tb_designation_person (designation_id, person_id) VALUES (6, 2);
INSERT INTO tb_designation_person (designation_id, person_id) VALUES (7, 3);
INSERT INTO tb_designation_person (designation_id, person_id) VALUES (8, 6);
INSERT INTO tb_designation_person (designation_id, person_id) VALUES (9, 13);

INSERT INTO tb_support (work, meeting_id) VALUES ('Indicador', 1);
INSERT INTO tb_support (work, meeting_id) VALUES ('Video', 1);
INSERT INTO tb_support (work, meeting_id) VALUES ('Audio', 1);
INSERT INTO tb_support (work, meeting_id) VALUES ('Camera', 1);
INSERT INTO tb_support (work, meeting_id) VALUES ('Volante', 1);
INSERT INTO tb_support (work, meeting_id) VALUES ('Indicador', 2);
INSERT INTO tb_support (work, meeting_id) VALUES ('Video', 2);
INSERT INTO tb_support (work, meeting_id) VALUES ('Audio', 2);
INSERT INTO tb_support (work, meeting_id) VALUES ('Camera', 2);
INSERT INTO tb_support (work, meeting_id) VALUES ('Volante', 2);
INSERT INTO tb_support (work, meeting_id) VALUES ('Indicador', 3);
INSERT INTO tb_support (work, meeting_id) VALUES ('Video', 3);
INSERT INTO tb_support (work, meeting_id) VALUES ('Audio', 3);
INSERT INTO tb_support (work, meeting_id) VALUES ('Camera', 3);
INSERT INTO tb_support (work, meeting_id) VALUES ('Volante', 3);

INSERT INTO tb_support_person (support_id, person_id) VALUES (1, 1);
INSERT INTO tb_support_person (support_id, person_id) VALUES (2, 12);
INSERT INTO tb_support_person (support_id, person_id) VALUES (3, 13);
INSERT INTO tb_support_person (support_id, person_id) VALUES (4, 3);
INSERT INTO tb_support_person (support_id, person_id) VALUES (5, 14);
INSERT INTO tb_support_person (support_id, person_id) VALUES (5, 2);
INSERT INTO tb_support_person (support_id, person_id) VALUES (6, 12);
INSERT INTO tb_support_person (support_id, person_id) VALUES (7, 1);
INSERT INTO tb_support_person (support_id, person_id) VALUES (8, 2);
INSERT INTO tb_support_person (support_id, person_id) VALUES (9, 14);
INSERT INTO tb_support_person (support_id, person_id) VALUES (10, 13);
INSERT INTO tb_support_person (support_id, person_id) VALUES (10, 6);
INSERT INTO tb_support_person (support_id, person_id) VALUES (11, 6);
INSERT INTO tb_support_person (support_id, person_id) VALUES (12, 13);
INSERT INTO tb_support_person (support_id, person_id) VALUES (13, 14);
INSERT INTO tb_support_person (support_id, person_id) VALUES (14, 2);
INSERT INTO tb_support_person (support_id, person_id) VALUES (15, 12);
INSERT INTO tb_support_person (support_id, person_id) VALUES (15, 3);

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











