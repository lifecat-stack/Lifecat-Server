# Lifecat Server

![java](https://img.shields.io/badge/language-java-red.svg)
![许可](https://img.shields.io/dub/l/vibe-d.svg) 
:cat: :smiley_cat: :kissing_cat:

> 这是lifecat项目的第三篇的后端，为前端服务提供RESTful风格的API接口服务,它基于maven多模块开发，使用Springboot+Mybatis的架构搭建，引入使用了如消息邮件、shiro安全框架等中间件服务，有良好的注释以及代码规范适合Springboot框架的学习

#### 可单独运行本项目访问接口，暂时未打通与前端的接口调用，可使用如postman等API测试框架进行API调用。

### 相关项目线上地址 (建议由浅入深的按顺序学习)

[lifecatweb的jsp+servlet项目](http://www.lifecat.club:8080/lifecatweb)

[lifecatweb的ssm后台管理系统项目](http://www.lifecat.club:8080/ssm)

[Vuejs+SpringBoot前后端分离重构lifecatweb(仅部署前端)](http://www.lifecat.club/lifecat)

[Vuejs+SpringBoot前后端分离重构后台管理系统(仅部署前端)](http://www.lifecat.club/admin)

## 项目部署
### 本地部署
``` bash
# Clone下载项目到本地
git clone https://github.com/kevinten10/https://github.com/kevinten10/springboot-lifecat

# 配置相关文件
进入lifecat-web/src/main/resources/application.yml配置数据库
    
# 配置数据库
已导出数据库SQL文件, (建议使用navicat)catdb.sql文件即可生成对应数据库以及DEMO数据

# 启动运行
启动类为lifecat-web/src/main/java/com/ten/LcWebApplication.java
```

## REST API接口文档示例

|RESTful API 示例|API 方法|API 说明|
|---|---|---
|http://localhost:8080/resource/all |GET |获取所有资源
|http://localhost:8080/resource/list/{id} |GET |根据id获取某类资源
|http://localhost:8080/resource/list/{entity} |GET |根据实体获取某类资源
|http://localhost:8080/resource/get/{id} |GET |根据id获取某个资源
|http://localhost:8080/resource/get/{entity} |GET |根据实体获取某个资源
|http://localhost:8080/resource |POST |上传资源
|http://localhost:8080/resource |PUT |更新资源
|http://localhost:8080/resource/{id} |DELETE |根据id删除资源

## 项目架构分析

|模块名|层次|说明|
|---|---|---
|lifecat-web | controller | 控制器
|lifecat-manager | manager | service调度器
|lifecat-service | service | 服务类
|lifecat-dao | dao | 数据访问层
|lifecat-entity | model | 实体类 包括do vo
|lifecat-common | util | 工具类 插件类 其他服务类

## 前端DEMO(未连通)

 ![show](Image/show1.png)
 
 ![show](Image/show2.png)
   
### lifecat相关项目
  [v1 jsp+servlet+mysql实现Javaweb](https://github.com/kevinten10/lifecatweb)    
  [v2 ssm框架实现Javaweb后台管理系统](https://github.com/kevinten10/SSM-lifecat)  
  [v3 前后端分离之SpringBoot实现Java后端开发](https://github.com/kevinten10/springboot-lifecat)  
  [v3 前后端分离之vue实现后台管理系统](https://github.com/kevinten10/Vue-Admin-lifecat)  
  [v3 前后端分离之vue实现仿ins效果web开发](https://github.com/kevinten10/Web-lifecat)  
  
  [ex wechat 微信移动端小程序开发](https://github.com/kevinten10/WeChat-lifecat)  
  [ex hadoop 分布式平台进行数据处理](https://github.com/kevinten10/Hadoop-lifecat)  
  [ex android 相应Android相册应用](https://github.com/kevinten10/Android-lifecat)  
  [ex python 机器学习进行图像智能处理](https://github.com/kevinten10/Python-lifecat)  
   
### LifeCat系列总览
  [LifeCat系列项目](https://github.com/kevinten10/LifeCat)  
  
  如果觉得有用，可以帮忙点个star，谢谢啦！
  
