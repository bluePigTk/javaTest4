##	使用方法

1build.sh 用于构建jar包

2 start.sh 用于启动docker

3curl.sh用于测试接口

4stop.sh用于关闭docker

### ##	接口测试 

##	film接口 （在--data中写测试数据）

1.  film中插入数据

curl -X POST -H "Content-Type: application/json;charset=utf-8" --data '{ "title":"title", "description":"desc","language_id":1,"rental_duration":1,"rental_rate":1.1,"replacement_cost":12.1}' http://localhost:18080/film/create

2. film中根据分页条件查询film

curl -X GET -H "Content-Type: application/json;charset=utf-8" --data '{"pageSize":10,"paze":1, "sort":"film_id DESC"}' http://localhost:18080/film/

##	用户登录

curl -X POST -H "Content-Type: application/json;charset=utf-8" --data '{"name":"MARY",  "password":"SMITH"
}' http://localhost:18080/login

##	customer接口

1. put 

   ~~~
   curl -X PUT -H "Content-Type: application/json;charset=utf-8" --data '{
   "first_name":"jack",
   "last_name":"rose", 
   "email":"123@hand.com",
   "address":"47 MySakila Drive"
   }' http://localhost:18080/customer/create
   ~~~

 2. post

    ~~~
    curl -X POST -H "Content-Type: application/json;charset=utf-8" --data '{
    "customer_id":609,
    "first_name":"jacka",
    "last_name":"rose", 
    "email":"123@hand.com",
    "address":"47 MySakila Drive"
    }' http://localhost:18080/customer/update
    ~~~

    

 3. delete

~~~
curl -X DELETE http://localhost:18080/customer/delete/601
~~~

