CREATE TABLE users (
    id uuid NOT NULL PRIMARY KEY,
    name varchar(100) NOT NULL
);

INSERT INTO users (id, name)
VALUES
('d6153a70-234a-4af1-8c0f-a1681e0f2dca', 'Amy'),
('019d274f-8206-4540-bb58-6d036de7a96f', 'Jenny');