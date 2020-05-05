# springboot利用swagger构建api文档


<a name="overview"></a>
## 概览
简单优雅的restfun风格


### 版本信息
*版本* : 1.0


### 许可信息
*服务条款* : http://www.zimug.com


### URI scheme
*域名* : localhost:12346  
*基础路径* : /


### 标签

* article-controller : Article Controller
* user-controller : User Controller




<a name="paths"></a>
## 资源

<a name="article-controller_resource"></a>
### Article-controller
Article Controller


<a name="savearticleusingpost"></a>
#### 添加文章
```
POST /rest/article
```


##### 说明
添加新文章


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**article**  <br>*必填*|article|[ArticleVO](#articlevo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|成功|[AjaxResponse](#ajaxresponse)|
|**201**|Created|无内容|
|**400**|用户输入错误|[AjaxResponse](#ajaxresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|
|**500**|系统内部错误|[AjaxResponse](#ajaxresponse)|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/rest/article
```


###### 请求 body
```
json :
{
  "author" : "string",
  "content" : "string",
  "createTime" : "string",
  "readers" : [ {
    "age" : 0,
    "name" : "string"
  } ],
  "title" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```


###### 响应 400
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```


###### 响应 500
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```


<a name="getallusingget"></a>
#### getAll
```
GET /rest/article
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[AjaxResponse](#ajaxresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/rest/article
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```


<a name="getarticleusingget"></a>
#### getArticle
```
GET /rest/article/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[AjaxResponse](#ajaxresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/rest/article/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```


<a name="updatearticleusingput"></a>
#### updateArticle
```
PUT /rest/article/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|
|**Body**|**article**  <br>*必填*|article|[ArticleVO](#articlevo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[AjaxResponse](#ajaxresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/rest/article/0
```


###### 请求 body
```
json :
{
  "author" : "string",
  "content" : "string",
  "createTime" : "string",
  "readers" : [ {
    "age" : 0,
    "name" : "string"
  } ],
  "title" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```


<a name="deletearticleusingdelete"></a>
#### deleteArticle
```
DELETE /rest/article/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[AjaxResponse](#ajaxresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/rest/article/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```


<a name="user-controller_resource"></a>
### User-controller
User Controller


<a name="saveuserusingpost"></a>
#### saveUser
```
POST /rest/user
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**vo**  <br>*必填*|vo|[UserVO](#uservo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[AjaxResponse](#ajaxresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/rest/user
```


###### 请求 body
```
json :
{
  "age" : 0,
  "createTime" : "string",
  "email" : "string",
  "managerId" : 0,
  "name" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```


<a name="getuserusingget"></a>
#### getUser
```
GET /rest/user/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[AjaxResponse](#ajaxresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/rest/user/string
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```


<a name="deleteuserusingdelete"></a>
#### deleteUser
```
DELETE /rest/user/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[AjaxResponse](#ajaxresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/rest/user/string
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "isok" : false,
  "message" : "string"
}
```




<a name="definitions"></a>
## 定义

<a name="ajaxresponse"></a>
### AjaxResponse

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求响应状态码  <br>**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"object"`|object|
|**isok**  <br>*可选*|是否请求成功  <br>**样例** : `false`|boolean|
|**message**  <br>*可选*|**样例** : `"string"`|string|


<a name="articlevo"></a>
### ArticleVO

|名称|说明|类型|
|---|---|---|
|**author**  <br>*可选*|**样例** : `"string"`|string|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**readers**  <br>*可选*|**样例** : `[ "[readervo](#readervo)" ]`|< [ReaderVO](#readervo) > array|
|**title**  <br>*可选*|**样例** : `"string"`|string|


<a name="readervo"></a>
### ReaderVO

|名称|说明|类型|
|---|---|---|
|**age**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|


<a name="uservo"></a>
### UserVO

|名称|说明|类型|
|---|---|---|
|**age**  <br>*可选*|**样例** : `0`|integer (int32)|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**email**  <br>*可选*|**样例** : `"string"`|string|
|**managerId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**name**  <br>*可选*|**样例** : `"string"`|string|





