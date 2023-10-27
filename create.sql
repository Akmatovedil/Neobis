CREATE TABLE if not exists basket
(
    id             SMALLINT NOT NULL PRIMARY KEY,
    client_id      SMALLINT
);

CREATE TABLE if not exists client
(
    id              SMALLINT PRIMARY KEY UNIQUE,
    name            VARCHAR(255),
    surname         VARCHAR(255)
);

CREATE TABLE product
(
    id              SMALLINT PRIMARY KEY UNIQUE,
    name            VARCHAR(255),
    price           INT
);

CREATE TABLE basket_product
(
    basket_id SMALLINT NOT NULL,
    product_id SMALLINT NOT NULL,
    PRIMARY KEY (basket_id, product_id)
);

ALTER TABLE if EXISTS basket_product
    ADD CONSTRAINT fk_basket_id FOREIGN KEY (product_id) REFERENCES product;
ALTER TABLE if EXISTS basket_product
    ADD CONSTRAINT fk_product_id FOREIGN KEY (basket_id) REFERENCES basket;
ALTER TABLE if EXISTS basket
    ADD CONSTRAINT fk_client_id FOREIGN KEY (client_id) REFERENCES basket;


