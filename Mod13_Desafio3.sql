#3.1
SELECT * FROM LIBROS
WHERE PRECIO > (SELECT AVG(PRECIO) FROM LIBROS)
ORDER BY TITULO;

#3.2
SELECT * FROM LIBROS
WHERE CATEGORIA = 'NOVELAS' AND PRECIO > (SELECT MAX(PRECIO) FROM LIBROS WHERE CATEGORIA = 'ENSAYOS')
ORDER BY PRECIO DESC;

#3.3
SELECT * FROM EMPLEADOS 
WHERE PERMANENCIA = (SELECT MAX(PERMANENCIA) FROM EMPLEADOS);

#3.4
SELECT * FROM EMPLEADOS
WHERE PUESTO_ID = (SELECT MAX(PUESTO_ID) FROM EMPLEADOS);

#3.5
SELECT LIBRO_ID, TITULO, CATEGORIA, PRECIO_PUBLICO,
CASE
WHEN PRECIO_PUBLICO < 15 THEN 'ECONOMICO'
WHEN PRECIO_PUBLICO <=30 THEN 'REGULAR'
ELSE 'DELUXE'
END AS TIPO
FROM LIBROS
WHERE PRECIO_PUBLICO IS NOT NULL
ORDER BY TITULO;

#3.6
SELECT CONCAT(APELLIDO, ', ', NOMBRE) EMPLEADO FROM EMPLEADOS
WHERE PUESTO_ID = 9
UNION
SELECT CONCAT(APELLIDO, ', ', NOMBRE) FROM EMPLEADOS_ANTERIORES
WHERE PUESTO_ID = 9
ORDER BY EMPLEADO;

#3.7
SELECT V.LIBRO_ID, TITULO, PRECIO_PUBLICO, LOCAL_ID, FACTURA_NRO, CANTIDAD
FROM LIBROS L, VENTAS V
WHERE L.LIBRO_ID = V.LIBRO_ID
ORDER BY L.TITULO;

#3.8
SELECT V.LIBRO_ID, TITULO, PRECIO_PUBLICO, LOCAL_ID, FACTURA_NRO,
CANTIDAD, ROUND(PRECIO_PUBLICO * CANTIDAD, 2) AS TOTAL
FROM LIBROS L, VENTAS V
WHERE L.LIBRO_ID = V.LIBRO_ID
ORDER BY L.TITULO;

#3.9
SELECT L.TITULO FROM LIBROS L LEFT JOIN VENTAS V
ON L.LIBRO_ID = V.LIBRO_ID
WHERE FACTURA_NRO IS NULL
ORDER BY TITULO;