FROM registry.saas.hand-china.com/tools/mysql:5.6
VOLUME /var/lib/mysql
ENV AUTO_RUN_DIR /docker-entrypoint-initdb.d
ENV WORKPATH /mysql/init
COPY sakila* $WORKPATH/
RUN cp $WORKPATH/sakila.sh $AUTO_RUN_DIR/sakila.sh && chmod +x $AUTO_RUN_DIR/sakila.sh