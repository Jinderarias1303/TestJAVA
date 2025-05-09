use SolucionesEficientes;

INSERT INTO CLIENTE (NOMBRE,REPRESENTANTE,CORREO,TELEFONO,DIRECCION,SECTOR) VALUES
("TecnoGlobal","Laura Martínez","TacnoGlobal@gmail.com","3112582497","calle siempre viva esquina","Tecnologia"),
("Clinica Vital","Carlos Ruiz","clinicavital@gmail.com","3112582496","calle siempre viva esquina norte","Salud"),
("MercaGan","Sofia Ramirez","Mercagan@gamil.com","3112582498","calle siempre viva esquina sur","Comercio"),
("PolitecnicoInternacional","Juan Roncacio","PolitecnicoInternacional@gmail.com","3112582492","calle siempre viva esquina este","Educacion"),
("TelasDelNorte","Jaiver Carreño","TelasDelNorte@gmail.com","3152582497","calle real viva esquina","Manofactura");

INSERT INTO SERVICIO  (NOMBRE,DESCRIPCION,PRECIOPORHORA,CATEGORIA) VALUES
("Desarrollo de Software","software de mantenimiento",120000,"TI"),
("Limpieza Industrial","limpieza a tanques de agua",30000,"Limpieza");

INSERT INTO CONTRATO (ID_CLIENTE,ID_SERVICIO,FECHA_INICIO,FECHA_FIN,COSTO_TOTAL,ESTADO) VALUES
(1,1,"2014-05-06","2014-05-06",960000,"fINALIZADO");

INSERT INTO PROYECTO (ID_CLIENTE,NOMBRE,FECHA_INICIO,FECHA_FIN,ESTADO) VALUES
(1,"asuntos globalTec","2025-05-06","205-05-06","Completado");

INSERT INTO EMPLEADO (NOMBRE,CARGO,SALARIO,ESPECIALIDAD,ID_PROYECTO) VALUES
("Juan Perez","Analista de sistemas","2500000","TI",1);

INSERT INTO ASIGNACION (ID_EMPLEADO,ID_PROYECTO,HORAS_TRABAJADAS,FECHA_ASIGNACION) VALUES
(1,1,5,"2025-05-06");