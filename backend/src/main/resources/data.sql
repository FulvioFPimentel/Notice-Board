INSERT INTO tb_person (name, cell_phone, password) VALUES ('Leandro Brito','18-9854-7285', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Messias Pimentel','18-9854-7451','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_person (name, cell_phone, password) VALUES ('Rodrigo Silva', '18-9996-2564','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
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
INSERT INTO tb_role (privilege) VALUES ('ROLE_USER') ;

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

INSERT INTO tb_congregation (name, city) VALUES ('Central', 'Avanhandava');
INSERT INTO tb_congregation (name, city) VALUES ('Colina Verde', 'Penapolis');

INSERT INTO tb_meeting (title, date, congragation_id) VALUES ('1 SAMUEL 23-24', TIMESTAMP WITH TIME ZONE '2022-01-30T19:30:00Z', 1);
INSERT INTO tb_meeting (title, date, congragation_id) VALUES ('Discurso Publico', TIMESTAMP WITH TIME ZONE '2022-02-07T19:00:00Z', 1);

INSERT INTO tb_session (session) VALUES ('TESOUROS DA PALAVRA DE DEUS');
INSERT INTO tb_session (session) VALUES ('FAÇA SEU MELHOR NO MINISTERIO');
INSERT INTO tb_session (session) VALUES ('NOSSA VIDA CRISTÃ');

INSERT INTO tb_subsession (sub_session) VALUES ('Como voce quer ser conhecido?');
INSERT INTO tb_subsession (sub_session) VALUES ('Joias espirituais');
INSERT INTO tb_subsession (sub_session) VALUES ('Leitura da Biblia');
INSERT INTO tb_subsession (sub_session) VALUES ('Primeira conversa');
INSERT INTO tb_subsession (sub_session) VALUES ('Revisita');
INSERT INTO tb_subsession (sub_session) VALUES ('Discurso');
INSERT INTO tb_subsession (sub_session) VALUES ('Nunca se esqueça do Amor Leal de Jeová');
INSERT INTO tb_subsession (sub_session) VALUES ('Estudo biblico de congregação');
INSERT INTO tb_subsession (sub_session) VALUES ('Como as instruções da biblia nos ajudam hoje?');
INSERT INTO tb_subsession (sub_session) VALUES ('Segunda conversa');
INSERT INTO tb_subsession (sub_session) VALUES ('Estudo biblico');
INSERT INTO tb_subsession (sub_session) VALUES ('Como podemos encontrar forças para manter perceverar');
INSERT INTO tb_subsession (sub_session) VALUES ('Mantenha a fé');

INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (1 ,1 ,1 ,10 ,1);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (1 ,1 ,2 ,10 ,2);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (1 ,1 ,3 ,5 ,3);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (1 ,2 ,4 ,3 ,1);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (1 ,2 ,5 ,4 ,2);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (1 ,2 ,6 ,5 ,3);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (1 ,3 ,7 ,15 ,1);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (1 ,3 ,8 ,15 ,2);

INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (2 ,1 ,9 ,10 ,1);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (2 ,1 ,2 ,10 ,2);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (2 ,1 ,3 ,5 ,3);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (2 ,2 ,4 ,3 ,1);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (2 ,2 ,10 ,4 ,2);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (2 ,2 ,11 ,5 ,3);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (2 ,3 ,12 ,10 ,1);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (2 ,3 ,13 ,5 ,2);
INSERT INTO tb_segmentation (meeting_id, session_id, subsession_id, time, moment) VALUES (2 ,3 ,8 ,15 ,3);

INSERT INTO tb_canticle (number, title) VALUES (44, 'Oração de um servo aflito');
INSERT INTO tb_canticle (number, title) VALUES (126, 'Sempre fortes, firmes e despertos');
INSERT INTO tb_canticle (number, title) VALUES (89, 'Escute, obedeça e seja abençoado');
INSERT INTO tb_canticle (number, title) VALUES (80, 'Provem e vejam que Jeová é bom');
INSERT INTO tb_canticle (number, title) VALUES (115, 'A paciência de Deus é salvação');
INSERT INTO tb_canticle (number, title) VALUES (6, 'Os céus declaram a glória de Deus');

INSERT INTO tb_canticles_per_meetings (meeting_id, canticle_id, moment) VALUES (1, 1, 1);
INSERT INTO tb_canticles_per_meetings (meeting_id, canticle_id, moment) VALUES (1, 2, 2);
INSERT INTO tb_canticles_per_meetings (meeting_id, canticle_id, moment) VALUES (1, 3, 3);
INSERT INTO tb_canticles_per_meetings (meeting_id, canticle_id, moment) VALUES (2, 4, 1);
INSERT INTO tb_canticles_per_meetings (meeting_id, canticle_id, moment) VALUES (2, 5, 2);
INSERT INTO tb_canticles_per_meetings (meeting_id, canticle_id, moment) VALUES (2, 6, 3);

INSERT INTO tb_assignment (task, field) VALUES ('Discurso', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Leitura', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Principal', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Ajudante', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Presidente', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Dirigente', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Oração', 'participação');
INSERT INTO tb_assignment (task, field) VALUES ('Video', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Audio', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Indicador', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Microfone', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Leitor', 'Suporte');
INSERT INTO tb_assignment (task, field) VALUES ('Comentários', 'Suporte');

INSERT INTO tb_support (meeting_id) VALUES (1);

INSERT INTO tb_designation (assignment_id, person_id) VALUES (1, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (6, 2);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (2, 7);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (3, 9);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (4, 10);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (3, 11);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (1, 4);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (6, 3);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (13, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (8, 3);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (9, 4);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (10, 5);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (7, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (7, 2);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (7, 3);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (7, 4);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (11, 7);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (5, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (5, 2);

INSERT INTO tb_designation (assignment_id, person_id) VALUES (1, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (6, 2);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (2, 7);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (3, 9);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (4, 10);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (3, 11);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (1, 4);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (6, 3);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (13, 1);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (8, 3);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (5, 2);
INSERT INTO tb_designation (assignment_id, person_id) VALUES (5, 1);

INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (1 ,1 ,1, 1);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (2 ,1 ,1, 2);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (3 ,1 ,1, 3);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (4 ,1 ,2, 4);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (5 ,1 ,2, 4);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (6 ,1 ,2, 5);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (7 ,1 ,2, 5);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (8 ,1 ,2, 6);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (9 ,1 ,3, 7);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (10 ,1 ,3, 8);

INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (20 ,2 ,1, 9);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (21 ,2 ,1, 2);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (22 ,2 ,1, 3);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (23 ,2 ,2, 4);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (24 ,2 ,2, 4);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (25 ,2 ,2, 10);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (26 ,2 ,2, 10);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (27 ,2 ,2, 11);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (28 ,2 ,2, 11);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (29 ,2 ,3, 12);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (30 ,2 ,3, 13);
INSERT INTO tb_designation_subsession (designation_id, meeting_id, session_id, subsession_id) VALUES (31 ,2 ,3, 8);

INSERT INTO tb_presidency (designation_id, meeting_id) VALUES (18, 1);
INSERT INTO tb_presidency (designation_id, meeting_id) VALUES (19, 2);

INSERT INTO tb_support_designation (support_id, designation_id) VALUES (1, 9);
INSERT INTO tb_support_designation (support_id, designation_id) VALUES (1, 10);
INSERT INTO tb_support_designation (support_id, designation_id) VALUES (1, 11);
INSERT INTO tb_support_designation (support_id, designation_id) VALUES (1, 17);

INSERT INTO tb_prayer (moment, meeting_id, designation_id) VALUES (1, 1, 13);
INSERT INTO tb_prayer (moment, meeting_id, designation_id) VALUES (2, 1, 14);
INSERT INTO tb_prayer (moment, meeting_id, designation_id) VALUES (1, 2, 15);
INSERT INTO tb_prayer (moment, meeting_id, designation_id) VALUES (2, 2, 16);

INSERT INTO tb_news (date, title, news) VALUES (NOW(), 'Testemunhas de Jeová — Quem somos nós?', 'Mesmo vindo de centenas de grupos étnicos e falando centenas de idiomas, somos unidos pelos mesmos objetivos. Acima de tudo, queremos honrar a Jeová, o Deus da Bíblia e o Criador de todas as coisas. Fazemos o nosso melhor para imitar a Jesus Cristo e temos orgulho de ser chamados cristãos. Todos nós dedicamos tempo à obra de ensinar as pessoas sobre a Bíblia e o Reino de Deus. Visto que damos testemunho, ou falamos, sobre Jeová Deus e seu Reino, somos conhecidos como Testemunhas de Jeová.');
INSERT INTO tb_news (date, title, news) VALUES (NOW(), 'CONGREGAÇÃO: AVANHANDAVA', 'É com prazer que lhes escrevo sobre a próxima visita que farei a vossa Congregação, nas datas de 12 a 17 de abril de 2022. Para que esta venha a ser mais uma semana espiritualmente reanimadora para todos, como diz Romanos 1: 11-12 “para nos encorajarmos mutuamente”, sugiro que cada irmão na Congregação observe os seguinteslembretes como incentivo, Seria apreciável que cada irmão considerasse a possibilidade de serem pioneiros auxiliares durante o mês da visita. Lembrando que poderão optar pelo requisito de 30 horas. Aqueles que puderem fazer arranjos nesse sentido serão uma fonte de estímulo para a Congregação e para nós durante a semana da visita.');
INSERT INTO tb_news (date, title, news) VALUES (NOW(), 'Aumento da inflação no mundo inteiro — O que a Bíblia diz?', '“A economia mundial está novamente em perigo.” Foi isso o que o presidente do Grupo Banco Mundial disse num relatório de junho de 2022. Ele também mencionou: “Desta vez estamos enfrentando ao mesmo tempo alta na inflação e queda no crescimento [da economia].” Já o Fundo Monetário Internacional disse: “Os preços dos combustíveis e dos alimentos aumentaram rapidamente, atingindo com mais força as populações vulneráveis em países de baixa renda.” A Bíblia nos ajuda a entender por que estamos enfrentando problemas econômicos tão desafiadores, como podemos lidar com eles e mostra que existe uma solução definitiva para esses problemas.');

