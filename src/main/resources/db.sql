
INSERT INTO  ACCESSORIES  (id, DTYPE, BRAND, NAME,description, PRICE, SIZE)
VALUES (1,'Ram','Kingston', 'ram Kingston','ram ddr4', 1200, 8),
        (2,'Ram','samsung', 'ram samsung','ram ddr4 dir', 2000, 16);

INSERT INTO  ACCESSORIES  (id, DTYPE, BRAND, NAME,description, PRICE, capacity)
VALUES (3, 'Storage','Kinston', 'Kingston storage',"Kingston storage test ", 1000, 512),
        (4, 'Storage','hp', 'Storage2','storage hp for laptop', 1500, 1024);


INSERT INTO  ACCESSORIES  (id, DTYPE, BRAND, NAME,description, PRICE, MEMORY)
VALUES (5, 'Graphic','Gigabite', 'Gigabite PCI 3000','Gigabite PCI 3000', 1000, 16),
        (6, 'Graphic','Nvidia', 'Graphic nvidia','gaming super card', 2000, 32);

INSERT INTO  ACCESSORIES  (id, DTYPE, BRAND, NAME,description, PRICE, frequency)
VALUES (7, 'Processor','AMD', 'proc AMD 5000','proc AMD 5000', 2500, 2400),
        (8, 'Processor','Intel', 'Intel CORE I9','server processor', 3200, 3200);

INSERT INTO BRAND(ID, NAME)
VALUES(1, 'ASUS'),(2,'DELL'),(3,'LENOVO');

INSERT INTO COMPUTER (ID,DTYPE, NAME, DESCRIPTION, PRICE, GRAPHIC_ID, PROCESSOR_ID, RAM_ID, STORAGE_ID, ITEM_QUANTITY)
VALUES (1,'Computer','SUPER PS 3000', 'SUPER PUPER PS', 25000,6,8,1,3,1, 'mega PC for u');

INSERT INTO COMPUTER (ID,DTYPE, NAME, DESCRIPTION, PRICE, GRAPHIC_ID, PROCESSOR_ID, RAM_ID, STORAGE_ID, DIAGONAL, ITEM_QUANTITY, MATRIX_TYPE, BRAND_ID)
VALUES (2,'Laptop','hp pavilion z5', 'gaming laptop', 30000,6,8,1,3,15, 1, 'IPS',1)