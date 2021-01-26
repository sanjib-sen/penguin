-- Query 01:

SELECT courses.name, teachers.name
FROM courses
INNER JOIN teachers ON courses.teacher_id=teachers.id;

-- Query 02:

SELECT COUNT(*), teachers.name
FROM courses
GROUP BY teacher_id
INNER JOIN teachers ON courses.teacher_id=teachers.id;
ORDER BY COUNT(*) DESC


--Query 03:
SELECT COUNT(*), teachers.name
FROM courses
GROUP BY teacher_id
RIGHT JOIN teachers ON courses.teacher_id=teachers.id;
HAVING COUNT(teacher_id)=0