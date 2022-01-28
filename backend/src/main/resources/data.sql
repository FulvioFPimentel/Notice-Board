INSERT INTO tb_person (name, cell_phone, password) VALUES ('Leandro Brito','18-9854-7285', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Messias Pimentel', '18-9854-7451', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Rodrigo Silva', '18-9996-2564', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Evandro de Souza', '18-9558-6874', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Osvado Pereira', '18-9572-6325', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Jose militão', '18-9857-4123', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Julio Blecha', '18-5465-4855' ,'$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Fulvio Pimentel', '18-9848-7758', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Nair Pimentel', '18-4545-7845', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Maria Jose', '18-4556-7897' ,'$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Junior Gato', '18-7894-3154', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Poliane Gato', '18-9858-2587', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Emily de Souza', '18-9852-2547', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Valeria de Souza', '18-8977-8747', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Eva da Silva', '18-8978-2484', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (privilege) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (privilege) VALUES ('ROLE_ADMIN');

INSERT INTO tb_person_role (person_id, role_id) VALUES (1, 2);
INSERT INTO tb_person_role (person_id, role_id) VALUES (2, 2);
INSERT INTO tb_person_role (person_id, role_id) VALUES (3, 2);
INSERT INTO tb_person_role (person_id, role_id) VALUES (4, 2);
INSERT INTO tb_person_role (person_id, role_id) VALUES (5, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (6, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (7, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (8, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (9, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (10, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (11, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (12, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (13, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (14, 1);
INSERT INTO tb_person_role (person_id, role_id) VALUES (15, 1);

INSERT INTO tb_meeting (date) VALUES (TIMESTAMP WITH TIME ZONE '2022-01-30T19:30:00Z');
INSERT INTO tb_meeting (date) VALUES (TIMESTAMP WITH TIME ZONE '2022-02-07T19:00:00Z');

INSERT INTO tb_session (session) VALUES ('TESOUROS DA PALAVRA DE DEUS');
INSERT INTO tb_session (session) VALUES ('FAÇA SEU MELHOR NO MINISTERIO');
INSERT INTO tb_session (session) VALUES ('NOSSA VIDA CRISTÃ');

INSERT INTO tb_meeting_session (meeting_id, session_id) VALUES (1, 1);
INSERT INTO tb_meeting_session (meeting_id, session_id) VALUES (1, 2);
INSERT INTO tb_meeting_session (meeting_id, session_id) VALUES (1, 3);
INSERT INTO tb_meeting_session (meeting_id, session_id) VALUES (2, 1);
INSERT INTO tb_meeting_session (meeting_id, session_id) VALUES (2, 2);
INSERT INTO tb_meeting_session (meeting_id, session_id) VALUES (2, 3);

INSERT INTO tb_subsession (sub_session) VALUES ('Como voce quer ser conhecido?');
INSERT INTO tb_subsession (sub_session) VALUES ('Joias espirituais');
INSERT INTO tb_subsession (sub_session) VALUES ('Leitura da Biblia');
INSERT INTO tb_subsession (sub_session) VALUES ('Primeira conversa');
INSERT INTO tb_subsession (sub_session) VALUES ('Revisita');
INSERT INTO tb_subsession (sub_session) VALUES ('Discurso');
INSERT INTO tb_subsession (sub_session) VALUES ('Nunca se esqueça do Amor Leal de Jeová');
INSERT INTO tb_subsession (sub_session) VALUES ('Estudo biblico de congregação');
INSERT INTO tb_subsession (sub_session) VALUES ('Leitor');

INSERT INTO tb_meeting_subsession (meeting_id, subsession_id) VALUES (1, 1);
INSERT INTO tb_meeting_subsession (meeting_id, subsession_id) VALUES (1, 2);
INSERT INTO tb_meeting_subsession (meeting_id, subsession_id) VALUES (1, 3);
INSERT INTO tb_meeting_subsession (meeting_id, subsession_id) VALUES (1, 4);
INSERT INTO tb_meeting_subsession (meeting_id, subsession_id) VALUES (1, 5);
INSERT INTO tb_meeting_subsession (meeting_id, subsession_id) VALUES (1, 6);
INSERT INTO tb_meeting_subsession (meeting_id, subsession_id) VALUES (1, 7);
INSERT INTO tb_meeting_subsession (meeting_id, subsession_id) VALUES (1, 8);

INSERT INTO tb_session_subsession (session_id, subsession_id) VALUES (1, 1);
INSERT INTO tb_session_subsession (session_id, subsession_id) VALUES (1, 2);
INSERT INTO tb_session_subsession (session_id, subsession_id) VALUES (1, 3);
INSERT INTO tb_session_subsession (session_id, subsession_id) VALUES (2, 4);
INSERT INTO tb_session_subsession (session_id, subsession_id) VALUES (2, 5);
INSERT INTO tb_session_subsession (session_id, subsession_id) VALUES (2, 6);
INSERT INTO tb_session_subsession (session_id, subsession_id) VALUES (3, 7);
INSERT INTO tb_session_subsession (session_id, subsession_id) VALUES (3, 8);

INSERT INTO tb_canticle (number, title, meeting_id) VALUES (44, 'Oração de um servo aflito', 1);
INSERT INTO tb_canticle (number, title, meeting_id) VALUES (126, 'Sempre fortes, firmes e despertos', 1);
INSERT INTO tb_canticle (number, title, meeting_id) VALUES (89, 'Escute, obedeça e seja abençoado', 1);
INSERT INTO tb_canticle (number, title, meeting_id) VALUES (80, 'Provem e vejam que Jeová é bom', 2);
INSERT INTO tb_canticle (number, title, meeting_id) VALUES (115, 'A paciência de Deus é salvação', 2);
INSERT INTO tb_canticle (number, title, meeting_id) VALUES (6, 'Os céus declaram a glória de Deus', 2);

INSERT INTO tb_assignment (task, field) VALUES ('Discurso', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Leitura', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Principal', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Ajudante', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Presidente', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Dirigente', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Video', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Audio', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Indicador', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Microfone', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Leitor', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Comentários', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Oração', 'participação');

INSERT INTO tb_support (meeting_id) VALUES (1);
INSERT INTO tb_support (meeting_id) VALUES (2);

INSERT INTO tb_designation (assignment_id, person_id) VALUES (1, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (6, 2);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (2, 6);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (3, 9);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (4, 10);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (3, 11);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (4, 10);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (1, 12);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (1, 3);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (6, 4);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (7, 8);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (8, 9);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (13, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (13, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (13, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (13, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (11, 7);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (5, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (5, 2);

INSERT INTO tb_presidency (designation_id, meeting_id) VALUES (18, 1);
INSERT INTO tb_presidency (designation_id, meeting_id) VALUES (19, 2);

INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (1, 1);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (2, 2);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (3, 3);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (4, 4);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (4, 5);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (5, 6);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (5, 7);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (6, 8);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (6, 9);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (7, 12);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (8, 10);
INSERT INTO tb_subsession_designation (subsession_id, designation_id) VALUES (9, 17);

INSERT INTO tb_support_designation (support_id, designation_id) VALUES (1, 9);
INSERT INTO tb_support_designation (support_id, designation_id) VALUES (1, 10);
INSERT INTO tb_support_designation (support_id, designation_id) VALUES (1, 11);
INSERT INTO tb_support_designation (support_id, designation_id) VALUES (1, 12);

INSERT INTO tb_prayer (moment, meeting_id, designation_id) VALUES ('Inicio', 1, 13);
INSERT INTO tb_prayer (moment, meeting_id, designation_id) VALUES ('Fim', 1, 14);
INSERT INTO tb_prayer (moment, meeting_id, designation_id) VALUES ('Inicio', 2, 15);
INSERT INTO tb_prayer (moment, meeting_id, designation_id) VALUES ('Fim', 2, 16);


