--seq,id,name,title,content,regdate(2017-02-15),readCount--
--CREATE SEQUENCE
CREATE SEQUENCE art_seq
START WITH 5
INCREMENT BY 1
NOCACHE
NOCYCLE;

--CREATE TABLE Article
CREATE TABLE Article(
	art_seq DECIMAL PRIMARY KEY,
	id VARCHAR2(10),
	name VARCHAR2(10),
	title VARCHAR2(50),
	content VARCHAR2(100),
	regdate VARCHAR2(10),
	readCount DECIMAL
)
DROP TABLE Article;
SELECT * FROM MEMBER;
--INSERT
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'hong', '홍길동', '안녕', '안녕하세요? 홍길동 입니다.', '2017-02-15',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'kim', '김유신', 'aaa', '한빛병원 후기입니다.', '2017-02-15',100);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'lee', '이순신', '명량', '23전23승', '2017-02-15',50);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'suro', '김수로', '가야', '한빛 병원추천합니다.', '2017-02-15',20);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'song', '송시열', '운영자', '운영자입니다.', '2017-02-15',14);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'son', '손오공', '최고!', '한빛병원 정형외과', '2017-02-15',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL,'hongd', '홍두깨', 'bbb', '한빛병원 후기입니다.', '2017-02-15',100);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'ahn', '안중근', '병원', '최고의병원', '2017-02-15',50);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'ryu', '유셩룡', '공지입니다.', '내일부터 설 연휴간 병원 휴무입니다.', '2017-02-15',120);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'go', '고주몽', '병원추천', '병원 추천합니다.', '2017-02-15',14);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'lim', '임창정', '병원', '17대1', '2017-02-15',14);
--READ ALL
SELECT * FROM Article;
--READ SOME
SELECT * FROM Article WHERE id LIKE '%hong%';
--READ ONE
SELECT * FROM Article WHERE art_seq=1;
--UPDATE
UPDATE Article SET content = '자유게시판' WHERE id='hong';
--DELETE
DELETE FROM Article WHERE hong = 'hong';
DELETE FROM Article WHERE id = 'hong' and art_seq='45'