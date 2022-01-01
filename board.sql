CREATE TABLE board_tbl(
bno NUMBER,
title VARCHAR2(60) NOT NULL,
content VARCHAR2(3000) NOT NULL,
id VARCHAR2(15) NOT NULL,
regdate DATE DEFAULT SYSDATE,
updatedate DATE DEFAULT SYSDATE,
viewcnt NUMBER DEFAULT 0,
con NUMBER DEFAULT 0,
CONSTRAINT pk_board_tbl_bno PRIMARY KEY(bno),
CONSTRAINT fk_board_tbl_id FOREIGN KEY(id) REFERENCES member_tbl(id) ON DELETE CASCADE
)

CREATE SEQUENCE seq_board_tbl_bno

insert into board_tbl (bno,title,content,id) values (seq_board_tbl_bno.NEXTVAL,'제목','내용','kim')

INSERT INTO member_tbl (id, pw, name, address) VALUES ('kim', '1111', 'kim', 'seoul')

