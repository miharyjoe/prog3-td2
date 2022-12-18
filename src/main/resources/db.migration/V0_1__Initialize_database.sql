CREATE TABLE  if not exists team (
                      team_id serial,
                      name varchar not null ,
                      primary key(team_id)
);

CREATE TABLE  if not exists player (
                        player_id serial,
                        name varchar not null ,
                        number varchar,
                        team_id int not null ,
                        primary key(player_id),
                        constraint team_fk foreign key (team_id) references team(id)
);

CREATE TABLE  if not exists sponsor (
                         sponsor_id serial,
                         name varchar not null ,
                         primary key(sponsor_id)
);

CREATE TABLE  if not exists have (
                      team_id int,
                      sponsor_id int,
                      constraint team_fk foreign key (team_id) references team(team_id),
                      constraint sponsor_fk foreign key (sponsor_id) references sponsor(sponsor_id)
);

CREATE TABLE  if not exists play_against (
                              play_id serial,
                              datetime timestamp not null ,
                              stadium varchar not null ,
                              team1_id int not null unique ,
                              team2_id int not null unique ,
                              primary key (play_id),
                              constraint team1_fk foreign key (team1_id) references team(team_id),
                              constraint team2_fk foreign key (team2_id) references team(team_id)
);
