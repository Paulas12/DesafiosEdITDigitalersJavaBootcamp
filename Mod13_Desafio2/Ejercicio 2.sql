#2.1
SELECT *, 'ANTERIOR' AS ESTADO FROM TOP_SPOTIFY
WHERE TITULO LIKE '%BREAK%'
UNION
SELECT *, 'ULTIMO' AS ESTADO FROM ULTIMOS_LANZAMIENTOS
WHERE TITULO LIKE '%BREAK%'
ORDER BY TITULO;