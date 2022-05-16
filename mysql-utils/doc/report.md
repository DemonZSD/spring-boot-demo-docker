## Mysql-Utils

概述：

Mysql-Utils 是基于TDSQL开发的一款工具，融合了 Mysql-Inspect 和Mysql-Compare功能，旨在辅助和指导数据库、表结构和字段的设计工作。各个部门或者团队针对数据库、表等的设计均有一定的规范，本工具支持自定义规范的配置，并按照规范对开发人员设计的DDL语句执行结果进行校验，满足

- Mysql-Inspect 

  按照自定义设计规范，对数据库、表结构进行规范性校验，形成开发设计规范报告，根据设定的警告、错误性级别进行规范结果定级。

- Mysql-Compare
  
  提供多个数据库、表结构、索引等的比对功能，并支持数据库表结构文档的导出功能。

- Mysql-Analyze [未来规划]
  
  基于可视化服务，通过数据采集，提供TDSQL运行状态分析，包括系统变量查看，统计DML语句执行信息，预警设置等。针对当前数据库运行情况可识别慢查询语句，无效索引，冗余索引等。

### Mysql-Inspect 

#### 架构图

![mysql-inspect](./images/mysql-inspect.png)

基于配置的规范设计

```dotnetcli
mysql:
  ...
predicate:
  database:
    charset: 
      pre:
        level: warn
        rules:
          - utf8
          - utf8mb4
    engin:
      ...
  table:
    rowformat:
    ...
  column:
    flagLen: 
      ...
```

### Mysql-Compare

#### 架构图
![mysql-compare](./images/mysql-compare.png)
