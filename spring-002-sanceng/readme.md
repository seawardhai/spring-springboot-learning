command + option + 鼠标左键：追进去的是实现类(ctrl + alt + 鼠标左键)
command + 鼠标左键：追进去的是接口(ctrl + 鼠标左键)

# 三层架构的简单实现
* 实体类
  除了实体类，其他对象都可以由Spring创建
* dao层（数据访问层）
  
* 业务逻辑层（service）
  
* 界面层（controller）

## 1、各层之间的数据的访问，通过对象。
  1）在界面层有业务逻辑层的对象（通过创建业务逻辑层的对象，访问业务逻辑层的数据）
  2）在业务逻辑层有数据访问层的对象（通过创建数据访问层的对象，访问数据访问层的数据）
## 2、接口指向实现类