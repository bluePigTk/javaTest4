#!/bin/bash
echo "测试增加customer"
curl -X POST -H "Content-Type: application/json;charset=utf-8" --data '{}' http://localhost:18080/customer/create