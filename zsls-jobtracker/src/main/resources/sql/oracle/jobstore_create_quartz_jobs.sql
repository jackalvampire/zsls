CREATE TABLE QUARTZ_JOBS (
	ID VARCHAR2(50) NOT NULL UNIQUE,
	STAT NUMBER(11) DEFAULT 0 NOT NULL,
	TRIGGER_JSON VARCHAR2(500) NOT NULL,
	JOB_FLOW CLOB NOT NULL,
	EXPRESSION VARCHAR2(200) NOT NULL,
	TRIGGER_TYPE NUMBER(11) NOT NULL,
	LAST_EXETIME DATE 
)