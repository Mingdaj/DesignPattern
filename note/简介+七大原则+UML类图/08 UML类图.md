<a name="PRzPz"></a>
### UML基本介绍
1. UML（Unified Modeling Language），统一建模语言。是一种用于软件系统设计、建模和文档化的标准化语言（软件分析和设计）；
2. 常见的UML图包括：
   1. 用例图
   2. 静态结构图：类图，对象图，包图，组件图，部署图
   3. 动态行为图：时序图，协作图，状态图，活动图
3. 常用建模工具：Rational Rose，[processon](https://processon.com)等
<a name="LLHeG"></a>
### UML类图

1. 用于描述系统中的类（对象）本身的组成和类（对象）之间的各种静态关系
2. 类之间的关系：依赖（使用），泛化（继承），实现，关联，聚合，组合

![](https://cdn.nlark.com/yuque/0/2024/jpeg/35841438/1710238871851-2a03bd0b-42b0-4ba9-b6cb-6b1898db6af1.jpeg)

类图简单举例：
```java
public class Student {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35841438/1710236953187-a604ecc1-64b6-44f3-8b5b-95617757e525.png#averageHue=%2322232b&clientId=u2ec77d2f-55c3-4&from=paste&height=308&id=u5e2e18a8&originHeight=308&originWidth=529&originalType=binary&ratio=1&rotation=0&showTitle=false&size=12990&status=done&style=none&taskId=ua2e1e348-07a7-478a-bafe-4110ae24179&title=&width=529)
<a name="TpZ5N"></a>
#### 类图——依赖（dependence）
只要是在类中用到了对方，那么他们之间就存在依赖关系。如果没有对方，连编译都通过不了
```java
public class PersonServiceBean {

    // 类的成员属性
    private PersonDao personDao;

    // 方法接收的参数类型
    public void save(Person person) {
    }

    // 方法的返回类型
    public IDCard getIDCard(Integer personid) {
        return null;
    }

    // 方法中使用到
    public void modify() {
        Department department = new Department();
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35841438/1710236846344-ff832ef2-8783-4bcc-aa76-bb697f26b647.png#averageHue=%23202029&clientId=u2ec77d2f-55c3-4&from=paste&height=416&id=u4de0f7b3&originHeight=416&originWidth=787&originalType=binary&ratio=1&rotation=0&showTitle=false&size=25897&status=done&style=none&taskId=ub9e1f337-11d4-4ef6-87e9-79a17fc59b0&title=&width=787)
<a name="IvDQB"></a>
#### 类图——泛化（Generalization）
泛化关系就是继承关系。是依赖关系的特例
```java
public abstract class DaoSupport {

    public void save(Object o){
        System.out.println("save");
    }
    public void delete(Object o){
        System.out.println("delete");
    }
}

class UserDao extends DaoSupport{
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35841438/1710485034633-60728279-c01f-4b95-8dd2-ec49e174b79d.png#averageHue=%231f1f28&clientId=ud7678c30-162c-4&from=paste&height=291&id=u0b39bedc&originHeight=291&originWidth=497&originalType=binary&ratio=1&rotation=0&showTitle=false&size=9141&status=done&style=none&taskId=u44ed9870-f5c0-4b19-9add-38fa82c8b2d&title=&width=497)<br />总结：

- 泛化关系就是继承关系
- 如果A类继承了B类，我们就说A和B存在泛化关系
<a name="dir06"></a>
#### 类图——实现（implementation）
实现关系就是A类实现B类。是依赖关系的特例
```java
public interface BaseService {
    void delete(Integer id);
}
```
```java
public class UserService implements BaseService {
    @Override
    public void delete(Integer id) {
        System.out.println("delete......");
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35841438/1710485684346-5e4e5360-d2a0-4d9c-9307-7273db0f7727.png#averageHue=%231f2029&clientId=ud7678c30-162c-4&from=paste&height=257&id=uf3d9aec7&originHeight=257&originWidth=455&originalType=binary&ratio=1&rotation=0&showTitle=false&size=8598&status=done&style=none&taskId=u6bb12746-ff4f-4aa0-ba55-8c88216e359&title=&width=455)
<a name="iUVAT"></a>
#### 类图——关联（Association）
关联关系就是类和类之间的联系，可以理解为拥有关系，一个类知道知道另一个类的属性和方法。是依赖关系的特例。在程序中被关联类B以类属性的形式出现在关联类A中，也可能是关联类A引用了一个类型为被关联类B的全局变量

- 具有导航性：双向关系或单向关系
- 具有多重性：如“1”表示有且仅有1个；“0...”表示0个或多个；“0，1”表示0个或者1个；“n...m”表示n到m个都可以；“m...*”表示至少m个
<a name="t6ciW"></a>
##### 单向一对一关系
```java
public class Person {
    private IDCard card;
}
class IDCard {}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35841438/1710486825952-715f364e-6519-4f50-b599-a1f6062f969a.png#averageHue=%231f1f28&clientId=ud7678c30-162c-4&from=paste&height=206&id=u91f6b961&originHeight=206&originWidth=349&originalType=binary&ratio=1&rotation=0&showTitle=false&size=5432&status=done&style=none&taskId=u9019c634-6045-4747-bf1b-b8623fb7aae&title=&width=349)
<a name="ZolT3"></a>
##### 双向一对一关系
```java
public class Person {
	private IDCard card;
}
public class IDCard {
	private Person person;
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35841438/1710486986243-166c5046-ce72-457e-82e4-aedc99f005df.png#averageHue=%231f2029&clientId=ud7678c30-162c-4&from=paste&height=263&id=u6b612bba&originHeight=263&originWidth=414&originalType=binary&ratio=1&rotation=0&showTitle=false&size=7813&status=done&style=none&taskId=u6f87cfdb-2ef1-4d04-9365-0c4a6aa1371&title=&width=414)
<a name="bMwu9"></a>
### 类图——聚合（Aggregation）
聚合关系就是整体和部分的关系，整体和部分可以分开。是关联关系的特例，所以具有导航性和多重性。程序中聚合和关联关系是一致的，只能从语义级别来区分
```java
public class Computer {
    private Mouse mouse;
    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
class Mouse {}
class Monitor {}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35841438/1710487502550-0369ad18-5175-4896-a8e5-0a1ef8b2257c.png#averageHue=%2321212a&clientId=ud7678c30-162c-4&from=paste&height=270&id=u13c7bfaf&originHeight=270&originWidth=513&originalType=binary&ratio=1&rotation=0&showTitle=false&size=13395&status=done&style=none&taskId=u517e9ee9-0f49-4dde-9729-d82afcdf0be&title=&width=513)
<a name="mhNiM"></a>
### 类图——组合（Composition）
组合关系也是整体与部分的关系，不过整体与部分不可分开。程序中组合和关联关系是一致的，只能从语义级别来区分<br />如果我们认为Mouse，Monitor和Computer是不可分离的，则升级为组合关系：
```java
public class Computer {
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();
}
class Mouse {}
class Monitor {}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35841438/1710487863589-f10486da-b0f9-4615-90c1-9270bdafb50f.png#averageHue=%231e1f28&clientId=ud7678c30-162c-4&from=paste&height=264&id=uc17732c0&originHeight=264&originWidth=535&originalType=binary&ratio=1&rotation=0&showTitle=false&size=11753&status=done&style=none&taskId=uac708b49-7005-4351-ad04-4e2b93fb07e&title=&width=535)
