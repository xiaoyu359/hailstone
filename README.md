# hailstone

> hailstone(冰雹) SavourDao 项目后端服务

## 环境准备

|名称   |参考版本  |备注  |
| -----| -----    |----- |
| jdk | &gt;=1.8 | 推荐1.8版本 |
| Mysql| &gt;=v5.7.0 |推荐5.7版本|
| Maven | &gt;= 3.0 ||
| IntelliJ IDEA  |最新版本|Java开发工具,推荐使用idea或eclipse|

## 开发部署

### 拉取代码

```
git clone https://github.com/SavourDao/hailstone.git

```

或者

```
mkdir hailstone
cd hailstone
git init
git remote add origin https://github.com/SavourDao/hailstone.git
git fetch
git pull origin mian

```


### 运行系统

- 导入到Eclipse，菜单 File -> Import，然后选择 Maven -> Existing Maven Projects，点击 Next> 按钮，选择工作目录，然后点击 Finish 按钮，即可成功导入。
Eclipse会自动加载Maven依赖包，初次加载会比较慢（根据自身网络情况而定）。如果开发工具为IDEA
，File -> Open，选择工作目录。

- 创建数据库cjd并导入数据脚本hailstone.sql

- 打开项目运行com.hailstone.HailstoneApplication.java，出现如下信息表示启动成功。

```  
Application is running! Access URLs:
Local: 		http://localhost:9090/
External: 	http://IP:9090/

``` 

- 打开浏览器，输入：(http://localhost:9090) （默认账户/密码 admin/admin123）
若能正确展示登录页面，并能成功登录，菜单及页面展示正常，则表明环境搭建成功

- 修改数据库连接，编辑resources/profile/dev目录下的application-druid.yml

```
# 数据源配置
spring:
    datasource:
        type: com.alibaba.druid.pool.DruidDataSource
        driverClassName: com.mysql.cj.jdbc.Driver
        druid:
            # 主库数据源
            master:
                url: jdbc:mysql://localhost:3306/hailstone?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8
                username: 数据库账号
                password: 数据库密码
                
```


