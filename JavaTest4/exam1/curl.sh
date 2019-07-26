#!/bin/bash
echo  "测试增加customer"
R=$(curl -X PUT -H "Content-Type: application/json;charset=utf-8" --data '{"first_name":"jack","last_name":"rose",
"email":"123@hand.com","address":"47 MySakila Drive"}' http://localhost:18080/customer/create)
echo "用该id更新用户"
curl -X POST -H "Content-Type: application/json;charset=utf-8" --data '{"customer_id":'${R}',"first_name":"jsack","last_name":"rose","email":"123@hand.com","store_id":2,"active":1,"address":"47 MySakila Drive","address_id":1,"create_date":"2019-07-26T07:00:37.000+0000","last_update":"2019-07-26T08:25:02.000+0000"}
' http://localhost:18080/customer/update
echo "删除该用户"
curl -X DELETE http://localhost:18080/customer/delete/${R}
