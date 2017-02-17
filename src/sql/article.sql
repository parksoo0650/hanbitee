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

INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'hong', '홍길동', '그레이트월', '2017.02.16 대개봉', '2017-02-16',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'kim', '김유신', '이상 영락', '이상 영락과 가치를 칼이다', '2017-02-16',100);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'lee', '이순신', '품으며 ', '풀이 두손을 되려니와,', '2017-02-16',50);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'suro', '김수로', '만물', '가슴에 힘차게 충분히 있으랴? .', '2017-02-16',20);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'song', '송시열', '열매', '그들은 열매를 길지 기쁘다.', '2017-02-16',14);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'son', '손오공', '철환', '하였는가 끓는다', '2017-02-16',1);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL,'hongd', '홍두깨', '관현악', '그들에게 그러므로 구하지 설산에서 방지하는 사막이다', '2017-02-16',100);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'ahn', '안중근', '광야', '따뜻한 우리 광야에서 못할 눈에 때문이다.', '2017-02-16',50);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'ryu', '유셩룡', '열락.', '열락의 이 평화스러운 보배를 것이다. ', '2017-02-16',120);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'go', '고주몽', '무한한 인생', '끝까지 무한한 그들의 인생을 그들은 것이다. ', '2017-02-16',14);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'lim', '임창정', '영락', '돋고, 우리 그들의 얼마나 영락과 목숨이 따뜻한 보라. ', '2017-02-16',14);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'lim', '임창정', '심장을 위하여', '위하여 굳세게 과실이 없으면 심장의 많이 위하여서, ', '2017-02-16',14);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'lim', '임창정', '청춘의봄바람', '청춘의 봄바람이다.', '2017-02-16',14);
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'lim', '임창정', '역사를 희망', '희망의 낙원을 듣기만 광야에서 넣는 황금시대의 황금시대다. ', '2017-02-16',14);
--READ ALL
SELECT * FROM Article;
--READ SOME
SELECT * FROM Article WHERE id LIKE '%hong%';
--READ ONE
SELECT * FROM Article WHERE art_seq=1;
--UPDATE
UPDATE Article SET content = '자유게시판' WHERE id='hong';
UPDATE Article SET title = 'aaa',content = 'aaa' WHERE id='hong'
--DELETE
DELETE FROM Article WHERE hong = 'hong';
DELETE FROM Article WHERE id = 'hong' and art_seq='45'