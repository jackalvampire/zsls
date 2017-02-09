CREATE TABLE UNITS_{tableName} (
	ID NUMBER(30) PRIMARY KEY NOT NULL,
	SWIFTNUM VARCHAR2(50),
	PREUNIT NUMBER(30) DEFAULT -1 NOT NULL,
	JSONCONTENT CLOB NOT NULL,
	STATUS NUMBER(11) DEFAULT 0 NOT NULL,
	TASKNUM NUMBER(11) DEFAULT 0 NOT NULL,
	CREATETIME DATE DEFAULT SYSDATE NOT NULL
)