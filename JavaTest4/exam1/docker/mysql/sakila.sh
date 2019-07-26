#!/bin/bash
mysql -uroot -p${MYSQL_ROOT_PASSWORD} << EOF
source ${WORKPATH}/sakila-schema.sql
source ${WORKPATH}/sakila-data.sql