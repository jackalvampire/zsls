CREATE TABLE IF NOT EXISTS `TASKS_{tableName}` (
	`TASKID` VARCHAR(20) NOT NULL COLLATE 'utf8_bin',
	`STATUS` INT(11) NOT NULL DEFAULT '0',
	`UNITID` VARCHAR(24) NOT NULL ,
	`CNT` INT(11) NOT NULL DEFAULT '0',
	`INFO` VARCHAR(1024),
	UNIQUE INDEX `taskId` (`taskId`)
)
COLLATE='utf8_bin'
ENGINE=InnoDB;