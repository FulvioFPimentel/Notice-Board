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
INSERT INTO tb_session (session, meeting_id) VALUES ('DISCURSO PUBLICO', 2);
INSERT INTO tb_session (session, meeting_id) VALUES ('ESTUDO DA SENTINELA', 2);
INSERT INTO tb_session (session, meeting_id) VALUES ('TESOUROS DA PALAVRA DE DEUS', 3);
INSERT INTO tb_session (session, meeting_id) VALUES ('FAÇA SEU MELHOR NO MINISTÉRIO', 3);
INSERT INTO tb_session (session, meeting_id) VALUES ('NOSSA VIDA CRISTÃ', 3);
INSERT INTO tb_session (session, meeting_id) VALUES ('DISCURSO PUBLICO', 4);
INSERT INTO tb_session (session, meeting_id) VALUES ('ESTUDO DA SENTINELA', 4);
INSERT INTO tb_session (session, meeting_id) VALUES ('TESOUROS DA PALAVRA DE DEUS', 5);
INSERT INTO tb_session (session, meeting_id) VALUES ('FAÇA SEU MELHOR NO MINISTÉRIO', 5);
INSERT INTO tb_session (session, meeting_id) VALUES ('NOSSA VIDA CRISTÃ', 5);
INSERT INTO tb_session (session, meeting_id) VALUES ('DISCURSO PUBLICO', 6);
INSERT INTO tb_session (session, meeting_id) VALUES ('ESTUDO DA SENTINELA', 6);


INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 1);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 1);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 1);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 2);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 2);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 2);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 3);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 3);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 3);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('TENHA UMA BOA CONSCIÊNCIA NESTE MUNDO PECAMINOSO', 4);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Como podemos manter nossa lealdade', 5);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 6);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 6);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 6);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 7);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 7);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 7);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 8);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 8);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 8);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('TENHA UMA BOA CONSCIÊNCIA NESTE MUNDO PECAMINOSO', 9);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Como podemos manter nossa lealdade', 10);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Os últimos conselhos de Josué para a nação de Israel', 11);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Joias espirituais', 11);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Leitura da Bíblia', 11);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Primeira conversa', 12);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Revisita', 12);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico', 12);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Tome cuidado com as más companhias no trabalho', 13);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Encontre amigos onde menos espera', 13);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Estudo bíblico de congregação', 13);

INSERT INTO tb_subsession (sub_session, session_id) VALUES ('TENHA UMA BOA CONSCIÊNCIA NESTE MUNDO PECAMINOSO', 14);
INSERT INTO tb_subsession (sub_session, session_id) VALUES ('Como podemos manter nossa lealdade', 15);

INSERT INTO tb_designation (designation, person_id) VALUES ('Orador', 1);
INSERT INTO tb_participant (id, subsession_id) VALUES (1, 1);
INSERT INTO tb_designation (designation, person_id) VALUES ('Dirigente', 2);
INSERT INTO tb_participant (id, subsession_id) VALUES (2, 2);
INSERT INTO tb_designation (designation, person_id) VALUES ('Leitor', 3);
INSERT INTO tb_participant (id, subsession_id) VALUES (3, 3);
INSERT INTO tb_designation (designation, person_id) VALUES ('Participante Principal', 4);
INSERT INTO tb_participant (id, subsession_id) VALUES (4, 4);
INSERT INTO tb_designation (designation, person_id) VALUES ('Ajudante', 6);
INSERT INTO tb_participant (id, subsession_id) VALUES (5, 4);
INSERT INTO tb_designation (designation, person_id) VALUES ('Participante Principal', 11);
INSERT INTO tb_participant (id, subsession_id) VALUES (6, 5);
INSERT INTO tb_designation (designation, person_id) VALUES ('Ajudante', 5);
INSERT INTO tb_participant (id, subsession_id) VALUES (7, 5);
INSERT INTO tb_designation (designation, person_id) VALUES ('Participante Principal', 1);
INSERT INTO tb_participant (id, subsession_id) VALUES (8, 6);
INSERT INTO tb_designation (designation, person_id) VALUES ('Ajudante', 2);
INSERT INTO tb_participant (id, subsession_id) VALUES (9, 6);
INSERT INTO tb_designation (designation, person_id) VALUES ('Orador', 3);
INSERT INTO tb_participant (id, subsession_id) VALUES (10, 7);
INSERT INTO tb_designation (designation, person_id) VALUES ('Orador', 4);
INSERT INTO tb_participant (id, subsession_id) VALUES (11, 8);
INSERT INTO tb_designation (designation, person_id) VALUES ('Dirigente', 6);
INSERT INTO tb_participant (id, subsession_id) VALUES (12, 9);
INSERT INTO tb_designation (designation, person_id) VALUES ('Leitor', 11);
INSERT INTO tb_participant (id, subsession_id) VALUES (13, 9);

INSERT INTO tb_designation (designation, person_id) VALUES ('Orador', 5);
INSERT INTO tb_participant (id, subsession_id) VALUES (14, 10);
INSERT INTO tb_designation (designation, person_id) VALUES ('Dirigente', 1);
INSERT INTO tb_participant (id, subsession_id) VALUES (15, 11);
INSERT INTO tb_designation (designation, person_id) VALUES ('Leitor', 2);
INSERT INTO tb_participant (id, subsession_id) VALUES (16, 11);

INSERT INTO tb_designation (designation, person_id) VALUES ('Presidente', 2);
INSERT INTO tb_presidency (id, meeting_id) VALUES (17, 1);
INSERT INTO tb_designation (designation, person_id) VALUES ('Presidente', 1);
INSERT INTO tb_presidency (id, meeting_id) VALUES (18, 2);
INSERT INTO tb_designation (designation, person_id) VALUES ('Presidente', 4);
INSERT INTO tb_presidency (id, meeting_id) VALUES (19, 3);
INSERT INTO tb_designation (designation, person_id) VALUES ('Presidente', 3);
INSERT INTO tb_presidency (id, meeting_id) VALUES (20, 4);

INSERT INTO tb_designation (designation, person_id) VALUES ('Oração', 2);
INSERT INTO tb_prayer (id, moment) VALUES (21, 'Inicio');
INSERT INTO tb_designation (designation, person_id) VALUES ('Oração', 1);
INSERT INTO tb_prayer (id, moment) VALUES (22, 'Fim');
INSERT INTO tb_designation (designation, person_id) VALUES ('Oração', 4);
INSERT INTO tb_prayer (id, moment) VALUES (23, 'Inicio');
INSERT INTO tb_designation (designation, person_id) VALUES ('Oração', 3);
INSERT INTO tb_prayer (id, moment) VALUES (24, 'Fim');
INSERT INTO tb_designation (designation, person_id) VALUES ('Oração', 12);
INSERT INTO tb_prayer (id, moment) VALUES (25, 'Inicio');
INSERT INTO tb_designation (designation, person_id) VALUES ('Oração', 13);
INSERT INTO tb_prayer (id, moment) VALUES (26, 'Fim');
INSERT INTO tb_designation (designation, person_id) VALUES ('Oração', 12);
INSERT INTO tb_prayer (id, moment) VALUES (27, 'Inicio');
INSERT INTO tb_designation (designation, person_id) VALUES ('Oração', 12);
INSERT INTO tb_prayer (id, moment) VALUES (28, 'Fim');

INSERT INTO tb_meeting_prayer (meeting_id, prayer_id) VALUES (1, 21);
INSERT INTO tb_meeting_prayer (meeting_id, prayer_id) VALUES (1, 22);
INSERT INTO tb_meeting_prayer (meeting_id, prayer_id) VALUES (2, 23);
INSERT INTO tb_meeting_prayer (meeting_id, prayer_id) VALUES (2, 24);
INSERT INTO tb_meeting_prayer (meeting_id, prayer_id) VALUES (3, 25);
INSERT INTO tb_meeting_prayer (meeting_id, prayer_id) VALUES (3, 26);
INSERT INTO tb_meeting_prayer (meeting_id, prayer_id) VALUES (4, 27);
INSERT INTO tb_meeting_prayer (meeting_id, prayer_id) VALUES (4, 28);

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











