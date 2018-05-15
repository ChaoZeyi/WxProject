CREATE TABLE area(
  area_id INT(11) NOT NULL AUTO_INCREMENT,
  area_name VARCHAR(255) NOT NULL ,
  priority INT(2) NOT NULL ,
  create_time DATETIME DEFAULT NULL ,
  last_edit_time DATETIME DEFAULT NULL ,
  PRIMARY KEY (area_id),
  UNIQUE KEY (area_name)
)ENGINE =InnoDB DEFAULT CHARSET = utf8;