DROP TABLEIF EXISTS employee
CREATE TABLE employee
             (
                          emp_id     integer NOT NULL auto_increment,
                          address    varchar(255),
                          age        varchar(255),
                          contact    varchar(255),
                          email      varchar(255),
                          first_name varchar(255),
                          gender     varchar(255),
                          last_name  varchar(255),
                          password   varchar(255),
                          user_name  varchar(255),
                          PRIMARY KEY (emp_id)
             );